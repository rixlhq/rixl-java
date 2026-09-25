package com.rixl.sdk.feeds.v1.projects.item.feeds;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.feeds.v1.projects.item.feeds.item.WithFeedItemRequestBuilder;
import com.rixl.sdk.models.feeds.v1.Feed;
import com.rixl.sdk.models.feeds.v1.ListFeedsResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /feeds/v1/projects/{project_id}/feeds
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.feeds.v1.projects.item.feeds.item collection
     * @param feed_id Unique identifier of the item
     * @return a {@link WithFeedItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFeedItemRequestBuilder byFeed_id(@jakarta.annotation.Nonnull final String feed_id) {
        Objects.requireNonNull(feed_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("feed_id", feed_id);
        return new WithFeedItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link FeedsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds/v1/projects/{project_id}/feeds{?pagination%2Elimit*,pagination%2Eoffset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link FeedsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds/v1/projects/{project_id}/feeds{?pagination%2Elimit*,pagination%2Eoffset*}", rawUrl);
    }
    /**
     * ListFeeds
     * @return a {@link ListFeedsResponse}
     */
    @jakarta.annotation.Nullable
    public ListFeedsResponse get() {
        return get(null);
    }
    /**
     * ListFeeds
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListFeedsResponse}
     */
    @jakarta.annotation.Nullable
    public ListFeedsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListFeedsResponse::createFromDiscriminatorValue);
    }
    /**
     * CreateFeed
     * @param body The request body
     * @return a {@link Feed}
     */
    @jakarta.annotation.Nullable
    public Feed post(@jakarta.annotation.Nonnull final FeedsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * CreateFeed
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Feed}
     */
    @jakarta.annotation.Nullable
    public Feed post(@jakarta.annotation.Nonnull final FeedsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Feed::createFromDiscriminatorValue);
    }
    /**
     * ListFeeds
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListFeeds
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
     * CreateFeed
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FeedsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * CreateFeed
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FeedsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link FeedsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FeedsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListFeeds
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
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("pagination%2Elimit", paginationLimit);
            allQueryParams.put("pagination%2Eoffset", paginationOffset);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
