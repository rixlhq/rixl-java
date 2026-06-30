package com.rixl.sdk.auth.v1.users.current.emails;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.users.current.emails.change.ChangeRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.emails.status.StatusRequestBuilder;
import com.rixl.sdk.models.authv1.VerificationSentResponse;
import com.rixl.sdk.models.gateway.AddEmailBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/users/current/emails
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailsRequestBuilder extends BaseRequestBuilder {
    /**
     * The change property
     * @return a {@link ChangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChangeRequestBuilder change() {
        return new ChangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The status property
     * @return a {@link StatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatusRequestBuilder status() {
        return new StatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link EmailsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/emails", pathParameters);
    }
    /**
     * Instantiates a new {@link EmailsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/emails", rawUrl);
    }
    /**
     * Adds an email address to the authenticated account and sends a verificationcode to it. The address becomes active only once it has been verified via`POST /auth/v1/email/verify`. Subject to rate limiting per account.
     * @param body Email address to add
     * @return a {@link VerificationSentResponse}
     */
    @jakarta.annotation.Nullable
    public VerificationSentResponse post(@jakarta.annotation.Nonnull final AddEmailBody body) {
        return post(body, null);
    }
    /**
     * Adds an email address to the authenticated account and sends a verificationcode to it. The address becomes active only once it has been verified via`POST /auth/v1/email/verify`. Subject to rate limiting per account.
     * @param body Email address to add
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VerificationSentResponse}
     */
    @jakarta.annotation.Nullable
    public VerificationSentResponse post(@jakarta.annotation.Nonnull final AddEmailBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VerificationSentResponse::createFromDiscriminatorValue);
    }
    /**
     * Adds an email address to the authenticated account and sends a verificationcode to it. The address becomes active only once it has been verified via`POST /auth/v1/email/verify`. Subject to rate limiting per account.
     * @param body Email address to add
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddEmailBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Adds an email address to the authenticated account and sends a verificationcode to it. The address becomes active only once it has been verified via`POST /auth/v1/email/verify`. Subject to rate limiting per account.
     * @param body Email address to add
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddEmailBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link EmailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EmailsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
