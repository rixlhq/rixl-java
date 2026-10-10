package com.rixl.sdk.auth.v1.memberships.item.members.item.reactivate;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.auth.v1.MembershipMutation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{org_-id}/members/{member_-id}/reactivate
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReactivateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ReactivateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReactivateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{org_%2Did}/members/{member_%2Did}/reactivate{?user%2Eactor_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ReactivateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReactivateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{org_%2Did}/members/{member_%2Did}/reactivate{?user%2Eactor_id*}", rawUrl);
    }
    /**
     * ReactivateMember
     * @return a {@link MembershipMutation}
     */
    @jakarta.annotation.Nullable
    public MembershipMutation patch() {
        return patch(null);
    }
    /**
     * ReactivateMember
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MembershipMutation}
     */
    @jakarta.annotation.Nullable
    public MembershipMutation patch(@jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPatchRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, MembershipMutation::createFromDiscriminatorValue);
    }
    /**
     * ReactivateMember
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation() {
        return toPatchRequestInformation(null);
    }
    /**
     * ReactivateMember
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReactivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReactivateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReactivateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ReactivateMember
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String userActorId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("user%2Eactor_id", userActorId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PatchQueryParameters queryParameters = new PatchQueryParameters();
    }
}
