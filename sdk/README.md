# RIXL Java SDK

The official Java client for the [RIXL](https://rixl.com) API.

## Installation

Add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>com.rixl.sdk</groupId>
    <artifactId>rixl-java</artifactId>
    <version>0.1.0</version>
</dependency>
```

## Quick Start

```java
import com.rixl.sdk.RixlClient;
import com.microsoft.kiota.authentication.ApiKeyAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;

var auth = new ApiKeyAuthenticationProvider("YOUR_API_KEY", "X-API-Key", ApiKeyAuthenticationProvider.KeyLocation.Header);
var adapter = new OkHttpRequestAdapter(auth);
var client = new RixlClient(adapter);

var image = client.images().byImageId("PS5IMKoFLm").get();
System.out.println(image.getId());
```
