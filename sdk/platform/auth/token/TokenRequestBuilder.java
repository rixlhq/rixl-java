package com.rixl.sdk.platform.auth.token;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.types.ExchangeRequest;
import com.rixl.sdk.models.types.TokenResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /platform/auth/token
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TokenRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link TokenRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokenRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/auth/token", pathParameters);
    }
    /**
     * Instantiates a new {@link TokenRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokenRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/auth/token", rawUrl);
    }
    /**
     * Trades an API key (`&lt;keyId&gt;_&lt;secret&gt;`) for a short-lived platform access token plus a refresh token.
     * @param body API key exchange request
     * @return a {@link TokenResponse}
     */
    @jakarta.annotation.Nullable
    public TokenResponse post(@jakarta.annotation.Nonnull final ExchangeRequest body) {
        return post(body, null);
    }
    /**
     * Trades an API key (`&lt;keyId&gt;_&lt;secret&gt;`) for a short-lived platform access token plus a refresh token.
     * @param body API key exchange request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TokenResponse}
     */
    @jakarta.annotation.Nullable
    public TokenResponse post(@jakarta.annotation.Nonnull final ExchangeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, TokenResponse::createFromDiscriminatorValue);
    }
    /**
     * Trades an API key (`&lt;keyId&gt;_&lt;secret&gt;`) for a short-lived platform access token plus a refresh token.
     * @param body API key exchange request
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ExchangeRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Trades an API key (`&lt;keyId&gt;_&lt;secret&gt;`) for a short-lived platform access token plus a refresh token.
     * @param body API key exchange request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ExchangeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link TokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokenRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TokenRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
