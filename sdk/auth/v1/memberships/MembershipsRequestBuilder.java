package com.rixl.sdk.auth.v1.memberships;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.memberships.active.ActiveRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.OrgItemRequestBuilder;
import com.rixl.sdk.models.auth.v1.ListMembershipsResponse;
import com.rixl.sdk.models.auth.v1.MembershipState;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembershipsRequestBuilder extends BaseRequestBuilder {
    /**
     * The active property
     * @return a {@link ActiveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActiveRequestBuilder active() {
        return new ActiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.memberships.item collection
     * @param org_Id Unique identifier of the item
     * @return a {@link OrgItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrgItemRequestBuilder byOrg_Id(@jakarta.annotation.Nonnull final String org_Id) {
        Objects.requireNonNull(org_Id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("org_%2Did", org_Id);
        return new OrgItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MembershipsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembershipsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships{?limit*,offset*,state*,user%2EuserId*}", pathParameters);
    }
    /**
     * Instantiates a new {@link MembershipsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembershipsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships{?limit*,offset*,state*,user%2EuserId*}", rawUrl);
    }
    /**
     * ListMemberships
     * @return a {@link ListMembershipsResponse}
     */
    @jakarta.annotation.Nullable
    public ListMembershipsResponse get() {
        return get(null);
    }
    /**
     * ListMemberships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListMembershipsResponse}
     */
    @jakarta.annotation.Nullable
    public ListMembershipsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListMembershipsResponse::createFromDiscriminatorValue);
    }
    /**
     * ListMemberships
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListMemberships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MembershipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembershipsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MembershipsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListMemberships
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Integer limit;
        @jakarta.annotation.Nullable
        public Integer offset;
        @jakarta.annotation.Nullable
        public MembershipState state;
        @jakarta.annotation.Nullable
        public String userUserId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("state", state);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("user%2EuserId", userUserId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
