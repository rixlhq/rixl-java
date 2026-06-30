package com.rixl.sdk.auth.v1.memberships.item.username;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.authv1.UpdateOrgUsernameResponse;
import com.rixl.sdk.models.gateway.UpdateOrgUsernameBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{orgId}/username
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsernameRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UsernameRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsernameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/username", pathParameters);
    }
    /**
     * Instantiates a new {@link UsernameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsernameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/username", rawUrl);
    }
    /**
     * Updates the unique username handle of the specified organization.
     * @param body New username
     * @return a {@link UpdateOrgUsernameResponse}
     */
    @jakarta.annotation.Nullable
    public UpdateOrgUsernameResponse put(@jakarta.annotation.Nonnull final UpdateOrgUsernameBody body) {
        return put(body, null);
    }
    /**
     * Updates the unique username handle of the specified organization.
     * @param body New username
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UpdateOrgUsernameResponse}
     */
    @jakarta.annotation.Nullable
    public UpdateOrgUsernameResponse put(@jakarta.annotation.Nonnull final UpdateOrgUsernameBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UpdateOrgUsernameResponse::createFromDiscriminatorValue);
    }
    /**
     * Updates the unique username handle of the specified organization.
     * @param body New username
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateOrgUsernameBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Updates the unique username handle of the specified organization.
     * @param body New username
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateOrgUsernameBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UsernameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsernameRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UsernameRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
