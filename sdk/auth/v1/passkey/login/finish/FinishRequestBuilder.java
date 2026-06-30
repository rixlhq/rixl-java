package com.rixl.sdk.auth.v1.passkey.login.finish;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.authv1.TokenResponse;
import com.rixl.sdk.models.gateway.PasskeyLoginFinishBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/passkey/login/finish
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FinishRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link FinishRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FinishRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/passkey/login/finish", pathParameters);
    }
    /**
     * Instantiates a new {@link FinishRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FinishRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/passkey/login/finish", rawUrl);
    }
    /**
     * Completes a passkey login by verifying the signed WebAuthn credential against the session and returning authentication tokens.
     * @param body session_id and WebAuthn credential
     * @return a {@link TokenResponse}
     */
    @jakarta.annotation.Nullable
    public TokenResponse post(@jakarta.annotation.Nonnull final PasskeyLoginFinishBody body) {
        return post(body, null);
    }
    /**
     * Completes a passkey login by verifying the signed WebAuthn credential against the session and returning authentication tokens.
     * @param body session_id and WebAuthn credential
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TokenResponse}
     */
    @jakarta.annotation.Nullable
    public TokenResponse post(@jakarta.annotation.Nonnull final PasskeyLoginFinishBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, TokenResponse::createFromDiscriminatorValue);
    }
    /**
     * Completes a passkey login by verifying the signed WebAuthn credential against the session and returning authentication tokens.
     * @param body session_id and WebAuthn credential
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PasskeyLoginFinishBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Completes a passkey login by verifying the signed WebAuthn credential against the session and returning authentication tokens.
     * @param body session_id and WebAuthn credential
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PasskeyLoginFinishBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link FinishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FinishRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FinishRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
