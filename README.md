# Rixl Java SDK

The official Java client for the [Rixl](https://rixl.com) API.

Rixl handles the media side of your product — uploading and delivering images
and videos, organising them into feeds and posts, and reporting on how people
engage with them. It also covers the account layer around that: users and
organisations, sign-in, subscriptions and invoices. This SDK gives you all of it
from Java, as a fluent request builder per path and a class for every request
and response body.

Requires Java 17 or later.

## Installation

Maven:

```xml
<dependency>
  <groupId>com.rixl</groupId>
  <artifactId>sdk</artifactId>
  <version>1.1.0</version>
</dependency>
```

Gradle:

```gradle
implementation("com.rixl:sdk:1.1.0")
```

That pulls in the Kiota runtime the generated code is built on — the
abstractions, the OkHttp transport and the JSON, form, text and multipart
serializers.

## Getting started

You build a client out of two pieces: something that authenticates requests, and
a request adapter that sends them. Then you point the adapter at the API:

```java
import com.microsoft.kiota.authentication.ApiKeyAuthenticationProvider;
import com.microsoft.kiota.authentication.ApiKeyLocation;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import com.rixl.sdk.RixlClient;

public class Example {
    public static void main(String[] args) {
        var auth = new ApiKeyAuthenticationProvider(
                System.getenv("RIXL_API_KEY"), "X-API-Key", ApiKeyLocation.HEADER);

        var adapter = new OkHttpRequestAdapter(auth);
        adapter.setBaseUrl("https://api.rixl.com");

        var client = new RixlClient(adapter);

        var page = client.media().v1().projects()
                .byProject_id(System.getenv("RIXL_PROJECT_ID"))
                .images()
                .get();

        page.getImages().forEach(image -> System.out.println(image.getId()));
    }
}
```

The adapter has no base URL of its own, so `setBaseUrl` is not optional — call
it before you make a request, and point it somewhere else when you are testing
against another environment.

Calls are synchronous: each one returns the parsed response, or throws.

## Authentication

There are two ways to identify yourself, and they answer different questions.

### API keys — your backend calling as itself

An API key represents your organisation. Use it for work your own systems do:
importing a catalogue, running a nightly report, reconciling invoices. Keep it
out of source control and read it from the environment:

```java
var auth = new ApiKeyAuthenticationProvider(
        System.getenv("RIXL_API_KEY"), "X-API-Key", ApiKeyLocation.HEADER);
```

The key travels as the `X-API-Key` header. Anyone holding it can do anything
your organisation can, so it belongs on a server — never in a browser, a mobile
app, or anything you ship to users.

### Client credentials — acting on behalf of one of your users

If you are building on top of Rixl and your own users each need their own slice
of it, use client credentials. You exchange a client ID and secret for a
short-lived token scoped to a single end user, so one customer can never read
another's media.

Create the credential with an API-key client. The secret comes back once:

```java
import com.rixl.sdk.models.clientauth.v1.CreateClientCredentialRequest;

var request = new CreateClientCredentialRequest();
request.setName("Production backend");
request.setOrgId(orgId);

var created = client.platform().clientauth().v1().credentials().post(request);
System.out.println(created.getCredential().getClientId());
System.out.println(created.getClientSecret());
```

Then mint a token per user. `subject` is your own identifier for that person —
whatever your database calls them:

```java
import com.rixl.sdk.models.clientauth.v1.MintClientTokenRequest;

var mint = new MintClientTokenRequest();
mint.setClientId(System.getenv("RIXL_CLIENT_ID"));
mint.setClientSecret(System.getenv("RIXL_CLIENT_SECRET"));
mint.setSubject(user.getId());
mint.setProjectId(System.getenv("RIXL_PROJECT_ID"));
mint.setTtlMinutes(15);

var token = client.platform().clientauth().v1().token().post(mint);
```

Tokens last at most 15 minutes and there is no refresh token — when one expires
you mint another. Nothing in the SDK does that for you, so wrap the mint call in
an `AccessTokenProvider` and let the bearer provider ask for a token whenever it
needs one:

```java
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;

var bearer = new BaseBearerTokenAuthenticationProvider(tokenProvider);
var userAdapter = new OkHttpRequestAdapter(bearer);
userAdapter.setBaseUrl("https://api.rixl.com");
var userClient = new RixlClient(userAdapter);
```

`AccessTokenProvider` has two methods. `getAuthorizationToken(URI, Map)` is
where you return `getAccessToken()` from a mint call and cache it until
`getExpiresAt()`, and `getAllowedHostsValidator()` can return
`new AllowedHostsValidator()` to allow every host. Tokens go out as
`Authorization: Bearer`.

Credentials are managed through the same builder you created them with:
`credentials().get()` lists them and
`credentials().byCredential_id(id).revoke().post()` kills one. Revoking stops
new tokens immediately; ones already issued die within 15 minutes.

### Public endpoints

Some reads need no credentials at all — fetching a public image or video,
reading a public feed, listing supported languages, and the sign-in flows under
`/auth/v1`. Point an anonymous provider at those:

```java
import com.microsoft.kiota.authentication.AnonymousAuthenticationProvider;

var adapter = new OkHttpRequestAdapter(new AnonymousAuthenticationProvider());
adapter.setBaseUrl("https://api.rixl.com");
var client = new RixlClient(adapter);

var image = client.media().v1().images().byImage_id(imageId).get();
var languages = client.media().v1().languages().get();
var feed = client.posts().v1().feeds().byFeed_id(feedId).get();
```

Mind the difference between the two image paths: `media().v1().images()` is the
public read, while `media().v1().projects().byProject_id(id).images()` is the
authenticated collection you list, upload to and delete from.

## What you can do

Every area of the API is a method on the client, and the path you type mirrors
the URL.

**Media** — `client.media().v1()`. `images()` and `videos()` for public reads,
and `projects().byProject_id(id)` for everything else: listing, uploading,
deleting, visibility, plus `audioTracks()`, `chapters()` and `subtitles()` on a
video. `languages()` lists what you can localise into.

**Content** — `client.posts().v1()` for posts and feeds,
`client.feeds().v1().projects().byProject_id(id).feeds()` for feed
configuration, and `client.organizations().byOrg_id(id).projects()` for the
projects everything else hangs off. That is why so many calls take a project ID.

**Analytics** — `client.analytics().v1()`: `dashboard()`, `events()`, `posts()`,
`videos()`, `feeds()`, `funnels()`, `retention()`, `realtime()`, `top()`. Track
events and read back engagement, playback and live activity.

**Billing** — `client.billing().v1()`: `plans()`, `subscription()`,
`invoices()`, `paymentMethods()`, `checkout()`, `storageUsage()`,
`bandwidthUsage()`, `tax()`, `address()`.

**Accounts** — `client.auth().v1()`: `register()`, `login()`, `token()`,
`users()`, `passkey()`, `password()`, `providers()`, `memberships()`,
`policies()`, `email()`, `blog()`. Sign-in flows including passkeys and TOTP,
organisation membership and roles, and transactional email.

**Platform** — `client.platform()` for `auth().v1()` and `clientauth().v1()`,
and `client.organizations().byOrg_id(id).apiKeys()` for API keys.

`client.internal()` is storage-callback plumbing that Rixl calls itself. You
should not need it.

## Working with resources

Builders compose the same way everywhere, so once you have used one you have
used all of them. Reads and deletes:

```java
var images = client.media().v1().projects().byProject_id(projectId).images();

var page = images.get();
images.byImage_id(imageId).delete();
```

Calls that send data take a generated body class with setters:

```java
import com.rixl.sdk.media.v1.projects.item.images.upload.UploadPostRequestBody;

var body = new UploadPostRequestBody();
body.setName("photo.jpg");
body.setProjectId(projectId);

var upload = images.upload().post(body);
```

Everything is nullable. A field you never set is left out of the request rather
than sent empty, and a field the API omits comes back as `null` — check before
you dereference.

## Uploading files

Uploads happen in two steps. You ask Rixl for a URL, then send the bytes
straight to storage — they never pass through the API, so large files stay fast:

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

var upload = client.media().v1().projects().byProject_id(projectId)
        .images().upload().post(body);

var put = HttpRequest.newBuilder(URI.create(upload.getUploadUrl()))
        .header("Content-Type", "image/jpeg")
        .PUT(HttpRequest.BodyPublishers.ofFile(Path.of("photo.jpg")))
        .build();

HttpClient.newHttpClient().send(put, HttpResponse.BodyHandlers.discarding());
```

Videos work the same way through `videos().upload()`, except the response gives
you two URLs — `getVideoUploadUrl()` for the file and `getPosterUploadUrl()` for
its poster image.

There is no "finish" call to make. Storage tells Rixl when the object lands and
the image or video becomes available on its own.

## Pagination

List calls take a limit and an offset, set through the request configuration:

```java
int limit = 50;
int offset = 0;

while (true) {
    final int currentOffset = offset;
    var page = images.get(config -> {
        config.queryParameters.paginationLimit = limit;
        config.queryParameters.paginationOffset = currentOffset;
    });

    if (page.getImages() == null || page.getImages().isEmpty()) {
        break;
    }
    page.getImages().forEach(image -> System.out.println(image.getId()));

    offset += limit;
}
```

Nothing pages for you — ask for the next offset yourself. Responses also carry
`getTotal()`, but it deserialises as an untyped node rather than a number, so
stopping on a short page is the simpler test.

## Handling errors

Anything that is not a 2xx is thrown as `com.microsoft.kiota.ApiException`,
which carries the status code and the response headers:

```java
import com.microsoft.kiota.ApiException;

try {
    var image = client.media().v1().images().byImage_id(imageId).get();
} catch (ApiException e) {
    System.err.println("rixl returned " + e.getResponseStatusCode());
    throw e;
}
```

What the codes mean:

| Status | What happened | What to do |
| --- | --- | --- |
| 400 | The request was malformed or failed validation | Fix the request; retrying will not help |
| 401 | The key or token is missing, expired or invalid | Check the credential |
| 403 | The credential is valid but not allowed to do this | Check what it is permitted to do |
| 404 | No such resource, or it belongs to another organisation | Check the ID and the project |
| 429 | You are going too fast | Back off and retry |
| 5xx | Something broke on our side | Retry with backoff |

Connection failures and timeouts surface as ordinary `IOException`s from OkHttp,
not as `ApiException`.

## Timeouts

Requests go out through whatever OkHttp client you hand the adapter, so timeouts
stay yours to control:

```java
import java.time.Duration;
import okhttp3.OkHttpClient;

var http = new OkHttpClient.Builder()
        .callTimeout(Duration.ofSeconds(30))
        .build();

var adapter = new OkHttpRequestAdapter(auth, null, null, http);
adapter.setBaseUrl("https://api.rixl.com");
```

The same hook is where an interceptor goes if you want tracing headers on every
outbound request.

## Versioning

This package follows [SemVer](https://semver.org/spec/v2.0.0.html). New API
resources arrive in minor releases; renamed or removed operations only in major
ones. If an upgrade breaks you unexpectedly, please open an issue — we would
rather hear about it.

## Support

Bugs and feature requests:
[github.com/rixlhq/rixl-java/issues](https://github.com/rixlhq/rixl-java/issues).
