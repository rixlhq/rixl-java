package com.rixl.sdk.auth.v1.memberships.item.policies;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.memberships.item.policies.item.WithPolicyItemRequestBuilder;
import com.rixl.sdk.models.authv1.ListPoliciesResponse;
import com.rixl.sdk.models.authv1.Policy;
import com.rixl.sdk.models.gateway.PolicyBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{orgId}/policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.memberships.item.policies.item collection
     * @param policyId Policy ID
     * @return a {@link WithPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPolicyItemRequestBuilder byPolicyId(@jakarta.annotation.Nonnull final String policyId) {
        Objects.requireNonNull(policyId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("policyId", policyId);
        return new WithPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/policies", pathParameters);
    }
    /**
     * Instantiates a new {@link PoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/policies", rawUrl);
    }
    /**
     * Returns all authorization policies defined in the organization.
     * @return a {@link ListPoliciesResponse}
     */
    @jakarta.annotation.Nullable
    public ListPoliciesResponse get() {
        return get(null);
    }
    /**
     * Returns all authorization policies defined in the organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListPoliciesResponse}
     */
    @jakarta.annotation.Nullable
    public ListPoliciesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListPoliciesResponse::createFromDiscriminatorValue);
    }
    /**
     * Creates a new authorization policy in the organization with the given name, description, and permissions.
     * @param body Policy
     * @return a {@link Policy}
     */
    @jakarta.annotation.Nullable
    public Policy post(@jakarta.annotation.Nonnull final PolicyBody body) {
        return post(body, null);
    }
    /**
     * Creates a new authorization policy in the organization with the given name, description, and permissions.
     * @param body Policy
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Policy}
     */
    @jakarta.annotation.Nullable
    public Policy post(@jakarta.annotation.Nonnull final PolicyBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Policy::createFromDiscriminatorValue);
    }
    /**
     * Returns all authorization policies defined in the organization.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns all authorization policies defined in the organization.
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
     * Creates a new authorization policy in the organization with the given name, description, and permissions.
     * @param body Policy
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PolicyBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a new authorization policy in the organization with the given name, description, and permissions.
     * @param body Policy
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PolicyBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PoliciesRequestBuilder(rawUrl, requestAdapter);
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
