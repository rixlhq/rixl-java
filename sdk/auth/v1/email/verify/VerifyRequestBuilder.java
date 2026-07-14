package com.rixl.sdk.auth.v1.email.verify;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.email.verify.resend.ResendRequestBuilder;
import com.rixl.sdk.models.auth.v1.VerifyEmailRequest;
import com.rixl.sdk.models.auth.v1.VerifyEmailResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/email/verify
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifyRequestBuilder extends BaseRequestBuilder {
    /**
     * The resend property
     * @return a {@link ResendRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResendRequestBuilder resend() {
        return new ResendRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link VerifyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/email/verify", pathParameters);
    }
    /**
     * Instantiates a new {@link VerifyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/email/verify", rawUrl);
    }
    /**
     * VerifyEmail
     * @param body The request body
     * @return a {@link VerifyEmailResponse}
     */
    @jakarta.annotation.Nullable
    public VerifyEmailResponse post(@jakarta.annotation.Nonnull final VerifyEmailRequest body) {
        return post(body, null);
    }
    /**
     * VerifyEmail
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VerifyEmailResponse}
     */
    @jakarta.annotation.Nullable
    public VerifyEmailResponse post(@jakarta.annotation.Nonnull final VerifyEmailRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VerifyEmailResponse::createFromDiscriminatorValue);
    }
    /**
     * VerifyEmail
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VerifyEmailRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * VerifyEmail
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VerifyEmailRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link VerifyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VerifyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
