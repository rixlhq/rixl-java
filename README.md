# RIXL Java SDK

The official Java client for the [RIXL](https://rixl.com) API.

[![GitHub release](https://img.shields.io/github/v/release/rixlhq/rixl-java.svg)](https://github.com/rixlhq/rixl-java/releases)

[Installation](#installation) • [Quick start](#quick-start) • [Authentication](#authentication) • [Resources](#resources) • [Pagination](#pagination) • [Errors](#errors)

## Features

- Typed fluent API generated from the RIXL OpenAPI spec
- Built on the Microsoft Kiota client core; works on Java 17+
- Pre-mapped error responses for 400, 401, 403, 404, and 500
- Pluggable `RequestAdapter` and authentication providers
- Support for JSON, form, multipart, and plain-text payloads

## Requirements

- Java 17+
- A RIXL API key

## Installation

The SDK is published to **GitHub Packages**. GitHub requires authentication
to download Maven artifacts even for public repositories — your build needs
a token with `read:packages` scope.

### 1. Authenticate Maven against GitHub Packages

Add to your `~/.m2/settings.xml`:

```xml
<settings>
  <servers>
    <server>
      <id>github-rixlhq</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_GITHUB_TOKEN</password>
    </server>
  </servers>
</settings>
```

(Generate a personal access token with `read:packages` at
https://github.com/settings/tokens.)

### 2. Add the repository and dependency

#### Maven

```xml
<repositories>
  <repository>
    <id>github-rixlhq</id>
    <url>https://maven.pkg.github.com/rixlhq/rixl-java</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.rixl.sdk</groupId>
    <artifactId>rixl-java</artifactId>
    <version>0.2.2</version>
  </dependency>
</dependencies>
```

#### Gradle

```gradle
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/rixlhq/rixl-java")
        credentials {
            username = providers.gradleProperty("gpr.user").getOrElse(System.getenv("GITHUB_ACTOR"))
            password = providers.gradleProperty("gpr.token").getOrElse(System.getenv("GITHUB_TOKEN"))
        }
    }
}

dependencies {
    implementation("com.rixl.sdk:rixl-java:0.2.2")
}
```

## Quick start

```java
import com.rixl.sdk.RixlClient;
import com.microsoft.kiota.authentication.ApiKeyAuthenticationProvider;
import com.microsoft.kiota.authentication.KeyLocation;
import com.microsoft.kiota.http.OkHttpRequestAdapter;

var auth = new ApiKeyAuthenticationProvider(
    "YOUR_RIXL_API_KEY", "X-API-Key", KeyLocation.Header);
var adapter = new OkHttpRequestAdapter(auth);
var client = new RixlClient(adapter);

var image = client.images().byImageId("PS5IMKoFLm").get();
System.out.println(image.getId() + " " + image.getWidth() + "x" + image.getHeight());
```

Base URL defaults to `https://api.rixl.com`. Override with `adapter.setBaseUrl("...")`.

## Authentication

```java
import com.microsoft.kiota.authentication.ApiKeyAuthenticationProvider;
import com.microsoft.kiota.authentication.KeyLocation;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;

// API key in a header
var auth = new ApiKeyAuthenticationProvider(
    "YOUR_RIXL_API_KEY", "X-API-Key", KeyLocation.Header);

// Bearer token — implement AccessTokenProvider, then:
// var auth = new BaseBearerTokenAuthenticationProvider(tokenProvider);
```

## Resources

### Feeds

```java
var posts = client.feeds().byFeedId("FD4y3QB38S").get();
posts.getData().forEach(p -> System.out.println(p.getId()));
```

### Images

```java
// List
var page = client.images().get();

// Get
var image = client.images().byImageId("PS5IMKoFLm").get();

// Delete
client.images().byImageId("PS5IMKoFLm").delete();

// Upload (init → PUT bytes to presigned URL → complete)
import com.rixl.sdk.models.internal_images_handler.UploadInitRequest;
import com.rixl.sdk.models.internal_images_handler.CompleteRequest;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

var initReq = new UploadInitRequest();
initReq.setName("photo.jpg");
initReq.setFormat("jpeg");
var initRes = client.images().upload().init().post(initReq);

// Upload the raw bytes to the presigned URL with java.net.http.
var http = HttpClient.newHttpClient();
var put = HttpRequest.newBuilder(URI.create(initRes.getPresignedUrl()))
    .header("Content-Type", "image/jpeg")
    .PUT(HttpRequest.BodyPublishers.ofByteArray(imageBytes))
    .build();
http.send(put, HttpResponse.BodyHandlers.discarding());

// Finalize.
var completeReq = new CompleteRequest();
completeReq.setImageId(initRes.getImageId());
completeReq.setAttachedToVideo(false);
var image = client.images().upload().complete().post(completeReq);
```

### Videos

```java
// List
var videos = client.videos().get();

// Get
var video = client.videos().byVideoId("VI9VXQxWXQ").get();

// Subtitle tracks
var tracks = client.videos().byVideoId("VI9VXQxWXQ").subtitles().get();

// Upload (init returns presigned URLs for both the video and a poster image)
import com.rixl.sdk.models.VideoUploadInitRequest;
import com.rixl.sdk.models.github_com_rixlhq_api_internal_videos_handler_upload.CompleteRequest;

var initReq = new VideoUploadInitRequest();
initReq.setFileName("clip.mp4");
initReq.setImageFormat("jpeg");
var initRes = client.videos().upload().init().post(initReq);
// PUT video bytes  → initRes.getVideoPresignedUrl()
// PUT poster bytes → initRes.getPosterPresignedUrl()

var completeReq = new CompleteRequest();
completeReq.setVideoId(initRes.getVideoId());
var done = client.videos().upload().complete().post(completeReq);
```

## Pagination

List endpoints accept `limit`, `offset`, `sort`, and `order`:

```java
import com.rixl.sdk.images.ImagesRequestBuilder;

int limit = 50, offset = 0;
while (true) {
    var page = client.images().get(config -> {
        config.queryParameters.limit = limit;
        config.queryParameters.offset = offset;
    });
    page.getData().forEach(img -> {
        // ...
    });
    if (offset + page.getData().size() >= page.getPagination().getTotal()) {
        break;
    }
    offset += limit;
}
```

## Errors

API errors (400, 401, 403, 404, 500) are thrown as `ErrorResponse`:

```java
import com.rixl.sdk.models.github_com_rixlhq_api_internal_errors.ErrorResponse;

try {
    var image = client.images().byImageId("PS5IMKoFLm").get();
} catch (ErrorResponse e) {
    System.err.printf("HTTP %d: %s%n", e.getCode(), e.getError());
    throw e;
}
```

## Models

Generated types live under `com.rixl.sdk.models.*`:

| Package | Contents |
|---------|----------|
| `models` | `Image`, `Video`, `Post`, `File` |
| `models.pagination` | `PaginatedResponseImage`, `PaginatedResponseVideo`, `PaginatedResponsePost` |
| `models.internal_images_handler` | Upload request and response payloads for images |
| `models.github_com_rixlhq_api_internal_videos_handler_upload` | Upload request and response payloads for videos |
| `models.internal_videos_handler_subtitles` | Subtitle PUT payloads |
| `models.github_com_rixlhq_api_internal_errors` | `ErrorResponse` |

## Examples

Self-contained demos live in [`examples/`](./examples). Each file imports the SDK and runs one task — copy any of them into your own project as a starting point.

| Path | What it shows |
|---|---|
| `auth/` | both auth flows in one file — picks API key or client JWT from env |
| `basic/images/` | list images, fetch one by `IMAGE_ID` |
| `basic/videos/` | list videos, fetch one by `VIDEO_ID` |
| `basic/feeds/` | read a feed — needs `RIXL_FEED_ID` |
| `basic/posts/` | read one post — needs `RIXL_FEED_ID` and `RIXL_POST_ID` |
| `advanced/images/` | full image upload (init → PUT → complete) |
| `advanced/videos/` | full video upload (video + poster) |

Credentials come from the RIXL dashboard (API key, or Client Auth → Create credential).

## Support

Open an issue at [github.com/rixlhq/rixl-java](https://github.com/rixlhq/rixl-java/issues).
