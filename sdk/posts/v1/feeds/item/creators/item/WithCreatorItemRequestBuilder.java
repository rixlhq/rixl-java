package com.rixl.sdk.posts.v1.feeds.item.creators.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.posts.v1.ListPostsResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /posts/v1/feeds/{feed_id}/creators/{creator_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCreatorItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithCreatorItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCreatorItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/feeds/{feed_id}/creators/{creator_id}{?pagination%2Elimit*,pagination%2Eoffset*,project_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCreatorItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCreatorItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/feeds/{feed_id}/creators/{creator_id}{?pagination%2Elimit*,pagination%2Eoffset*,project_id*}", rawUrl);
    }
    /**
     * ListPosts
     * @return a {@link ListPostsResponse}
     */
    @jakarta.annotation.Nullable
    public ListPostsResponse get() {
        return get(null);
    }
    /**
     * ListPosts
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListPostsResponse}
     */
    @jakarta.annotation.Nullable
    public ListPostsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListPostsResponse::createFromDiscriminatorValue);
    }
    /**
     * ListPosts
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListPosts
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
     * @return a {@link WithCreatorItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCreatorItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCreatorItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListPosts
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Maximum number of items to return.
         */
        @jakarta.annotation.Nullable
        public Integer paginationLimit;
        /**
         * Number of items to skip before collecting the result set.
         */
        @jakarta.annotation.Nullable
        public Integer paginationOffset;
        @jakarta.annotation.Nullable
        public String projectId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("pagination%2Elimit", paginationLimit);
            allQueryParams.put("pagination%2Eoffset", paginationOffset);
            allQueryParams.put("project_id", projectId);
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
