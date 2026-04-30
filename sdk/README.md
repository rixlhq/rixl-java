# rixl-java

Java client for the [RIXL](https://rixl.com) API.

Published to GitHub Packages. Requires Java 17+.

## Install

GitHub Packages requires authentication for downloads even from public repos. You'll need a personal access token with `read:packages` scope (https://github.com/settings/tokens).

Add the server entry to `~/.m2/settings.xml`:

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

### Maven

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
    <version>0.2.4</version>
  </dependency>
</dependencies>
```

### Gradle

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
    implementation("com.rixl.sdk:rixl-java:0.2.4")
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

Default base URL: `https://api.rixl.com`. Override with `adapter.setBaseUrl(...)`.

## Authentication

API key:

```java
import com.microsoft.kiota.authentication.ApiKeyAuthenticationProvider;
import com.microsoft.kiota.authentication.KeyLocation;

var auth = new ApiKeyAuthenticationProvider(
    "YOUR_RIXL_API_KEY", "X-API-Key", KeyLocation.Header);
```

Bearer token: implement `AccessTokenProvider`, pass to `new BaseBearerTokenAuthenticationProvider(tokenProvider)`.

## Feeds

```java
var posts = client.feeds().byFeedId("FD4y3QB38S").get();
posts.getData().forEach(p -> System.out.println(p.getId()));
```

## Images

```java
var page = client.images().get();
var image = client.images().byImageId("PS5IMKoFLm").get();
client.images().byImageId("PS5IMKoFLm").delete();
```

Upload (init → PUT bytes → complete):

```java
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

var http = HttpClient.newHttpClient();
var put = HttpRequest.newBuilder(URI.create(initRes.getPresignedUrl()))
    .header("Content-Type", "image/jpeg")
    .PUT(HttpRequest.BodyPublishers.ofByteArray(imageBytes))
    .build();
http.send(put, HttpResponse.BodyHandlers.discarding());

var completeReq = new CompleteRequest();
completeReq.setImageId(initRes.getImageId());
completeReq.setAttachedToVideo(false);
var image = client.images().upload().complete().post(completeReq);
```

## Videos

```java
var videos = client.videos().get();
var video = client.videos().byVideoId("VI9VXQxWXQ").get();
var tracks = client.videos().byVideoId("VI9VXQxWXQ").subtitles().get();
```

Upload returns presigned URLs for both the video and a poster image:

```java
import com.rixl.sdk.models.VideoUploadInitRequest;
import com.rixl.sdk.models.github_com_rixlhq_api_internal_videos_handler_upload.CompleteRequest;

var initReq = new VideoUploadInitRequest();
initReq.setFileName("clip.mp4");
initReq.setImageFormat("jpeg");
var initRes = client.videos().upload().init().post(initReq);
// PUT bytes to initRes.getVideoPresignedUrl() and initRes.getPosterPresignedUrl()

var completeReq = new CompleteRequest();
completeReq.setVideoId(initRes.getVideoId());
var done = client.videos().upload().complete().post(completeReq);
```

## Pagination

```java
int limit = 50, offset = 0;
while (true) {
    var page = client.images().get(config -> {
        config.queryParameters.limit = limit;
        config.queryParameters.offset = offset;
    });
    if (offset + page.getData().size() >= page.getPagination().getTotal()) break;
    offset += limit;
}
```

## Errors

```java
import com.rixl.sdk.models.github_com_rixlhq_api_internal_errors.ErrorResponse;

try {
    var image = client.images().byImageId("PS5IMKoFLm").get();
} catch (ErrorResponse e) {
    System.err.printf("HTTP %d: %s%n", e.getCode(), e.getError());
    throw e;
}
```

## Issues

[github.com/rixlhq/rixl-java/issues](https://github.com/rixlhq/rixl-java/issues)
