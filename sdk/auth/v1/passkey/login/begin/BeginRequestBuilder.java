package com.rixl.sdk.auth.v1.passkey.login.begin;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.auth.v1.PasskeyBeginResponse;
import com.rixl.sdk.models.auth.v1.PasskeyLoginBeginRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/passkey/login/begin
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BeginRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BeginRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BeginRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/passkey/login/begin", pathParameters);
    }
    /**
     * Instantiates a new {@link BeginRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BeginRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/passkey/login/begin", rawUrl);
    }
    /**
     * PasskeyLoginBegin
     * @param body options and credential carry the WebAuthn ceremony payloads verbatim as JSON (the browser credential API consumes them as-is), so they are opaque bytes.
     * @return a {@link PasskeyBeginResponse}
     */
    @jakarta.annotation.Nullable
    public PasskeyBeginResponse post(@jakarta.annotation.Nonnull final PasskeyLoginBeginRequest body) {
        return post(body, null);
    }
    /**
     * PasskeyLoginBegin
     * @param body options and credential carry the WebAuthn ceremony payloads verbatim as JSON (the browser credential API consumes them as-is), so they are opaque bytes.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PasskeyBeginResponse}
     */
    @jakarta.annotation.Nullable
    public PasskeyBeginResponse post(@jakarta.annotation.Nonnull final PasskeyLoginBeginRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PasskeyBeginResponse::createFromDiscriminatorValue);
    }
    /**
     * PasskeyLoginBegin
     * @param body options and credential carry the WebAuthn ceremony payloads verbatim as JSON (the browser credential API consumes them as-is), so they are opaque bytes.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PasskeyLoginBeginRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * PasskeyLoginBegin
     * @param body options and credential carry the WebAuthn ceremony payloads verbatim as JSON (the browser credential API consumes them as-is), so they are opaque bytes.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PasskeyLoginBeginRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BeginRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BeginRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BeginRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
