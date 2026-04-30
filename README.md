# RIXL Java SDK

The RIXL Java SDK provides a strongly-typed, object-oriented interface for the RIXL API, making it easy to build high-performance applications on the JVM.

## Modules

The SDK is organized into service-specific modules:

- **feeds**: `io.rixl.sdk.feeds` — Manage community and user feeds.
- **videos**: `io.rixl.sdk.videos` — Handle video uploads and processing.
- **images**: `io.rixl.sdk.images` — Image processing and asset management.

## Installation

### Maven

Add the following coordinates to your `pom.xml`:

```xml
<dependency>
    <groupId>io.rixl.sdk</groupId>
    <artifactId>rixl-java-videos</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```gradle
implementation 'io.rixl.sdk:rixl-java-videos:1.0.0'
```

## Quick Start

```java
import io.rixl.sdk.feeds.api.FeedsApi;

FeedsApi api = new FeedsApi();
// api.getFeed();
```

## Support

For issues or feature requests, please open an issue in the GitHub repository.
