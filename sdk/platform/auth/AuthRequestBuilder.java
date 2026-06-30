package com.rixl.sdk.platform.auth;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.platform.auth.refresh.RefreshRequestBuilder;
import com.rixl.sdk.platform.auth.token.TokenRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /platform/auth
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthRequestBuilder extends BaseRequestBuilder {
    /**
     * The refresh property
     * @return a {@link RefreshRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RefreshRequestBuilder refresh() {
        return new RefreshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The token property
     * @return a {@link TokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokenRequestBuilder token() {
        return new TokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AuthRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/auth", pathParameters);
    }
    /**
     * Instantiates a new {@link AuthRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/auth", rawUrl);
    }
}
