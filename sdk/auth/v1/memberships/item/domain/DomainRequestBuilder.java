package com.rixl.sdk.auth.v1.memberships.item.domain;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.memberships.item.domain.autojoin.AutoJoinRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.domain.verification.VerificationRequestBuilder;
import com.rixl.sdk.models.authv1.DomainResponse;
import com.rixl.sdk.models.gateway.CreateDomainBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{orgId}/domain
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainRequestBuilder extends BaseRequestBuilder {
    /**
     * The autoJoin property
     * @return a {@link AutoJoinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AutoJoinRequestBuilder autoJoin() {
        return new AutoJoinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verification property
     * @return a {@link VerificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerificationRequestBuilder verification() {
        return new VerificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DomainRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/domain", pathParameters);
    }
    /**
     * Instantiates a new {@link DomainRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/domain", rawUrl);
    }
    /**
     * Removes the custom domain from the organization and clears its verification.
     */
    public void delete() {
        delete(null);
    }
    /**
     * Removes the custom domain from the organization and clears its verification.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * Returns the current custom domain and its verification status for the organization.
     * @return a {@link DomainResponse}
     */
    @jakarta.annotation.Nullable
    public DomainResponse get() {
        return get(null);
    }
    /**
     * Returns the current custom domain and its verification status for the organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DomainResponse}
     */
    @jakarta.annotation.Nullable
    public DomainResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DomainResponse::createFromDiscriminatorValue);
    }
    /**
     * Registers a custom domain for the organization and issues verification details to prove ownership.
     * @param body Domain
     * @return a {@link DomainResponse}
     */
    @jakarta.annotation.Nullable
    public DomainResponse post(@jakarta.annotation.Nonnull final CreateDomainBody body) {
        return post(body, null);
    }
    /**
     * Registers a custom domain for the organization and issues verification details to prove ownership.
     * @param body Domain
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DomainResponse}
     */
    @jakarta.annotation.Nullable
    public DomainResponse post(@jakarta.annotation.Nonnull final CreateDomainBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DomainResponse::createFromDiscriminatorValue);
    }
    /**
     * Removes the custom domain from the organization and clears its verification.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Removes the custom domain from the organization and clears its verification.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns the current custom domain and its verification status for the organization.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the current custom domain and its verification status for the organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Registers a custom domain for the organization and issues verification details to prove ownership.
     * @param body Domain
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateDomainBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Registers a custom domain for the organization and issues verification details to prove ownership.
     * @param body Domain
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateDomainBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DomainRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DomainRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
