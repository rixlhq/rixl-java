package com.rixl.sdk.platform;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.platform.auth.AuthRequestBuilder;
import com.rixl.sdk.platform.clientauth.ClientauthRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /platform
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlatformRequestBuilder extends BaseRequestBuilder {
    /**
     * The auth property
     * @return a {@link AuthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthRequestBuilder auth() {
        return new AuthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The clientauth property
     * @return a {@link ClientauthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClientauthRequestBuilder clientauth() {
        return new ClientauthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PlatformRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlatformRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform", pathParameters);
    }
    /**
     * Instantiates a new {@link PlatformRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlatformRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform", rawUrl);
    }
}
