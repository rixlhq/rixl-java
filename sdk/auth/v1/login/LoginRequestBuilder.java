package com.rixl.sdk.auth.v1.login;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.authv1.LoginResponse;
import com.rixl.sdk.models.gateway.RegisterOrLoginBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/login
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoginRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link LoginRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LoginRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/login", pathParameters);
    }
    /**
     * Instantiates a new {@link LoginRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LoginRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/login", rawUrl);
    }
    /**
     * Authenticates a user by email and password and issues access and refresh tokens.
     * @param body Credentials
     * @return a {@link LoginResponse}
     */
    @jakarta.annotation.Nullable
    public LoginResponse post(@jakarta.annotation.Nonnull final RegisterOrLoginBody body) {
        return post(body, null);
    }
    /**
     * Authenticates a user by email and password and issues access and refresh tokens.
     * @param body Credentials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LoginResponse}
     */
    @jakarta.annotation.Nullable
    public LoginResponse post(@jakarta.annotation.Nonnull final RegisterOrLoginBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, LoginResponse::createFromDiscriminatorValue);
    }
    /**
     * Authenticates a user by email and password and issues access and refresh tokens.
     * @param body Credentials
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RegisterOrLoginBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Authenticates a user by email and password and issues access and refresh tokens.
     * @param body Credentials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RegisterOrLoginBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link LoginRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LoginRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LoginRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
