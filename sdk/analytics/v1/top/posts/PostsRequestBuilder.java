package com.rixl.sdk.analytics.v1.top.posts;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.analyticsv1.TopPostsResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/top/posts
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PostsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PostsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PostsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/top/posts{?end*,feed_id*,limit*,start*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PostsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PostsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/top/posts{?end*,feed_id*,limit*,start*}", rawUrl);
    }
    /**
     * Returns the top posts over a date range
     * @return a {@link TopPostsResponse}
     */
    @jakarta.annotation.Nullable
    public TopPostsResponse get() {
        return get(null);
    }
    /**
     * Returns the top posts over a date range
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TopPostsResponse}
     */
    @jakarta.annotation.Nullable
    public TopPostsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, TopPostsResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns the top posts over a date range
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the top posts over a date range
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
     * @return a {@link PostsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PostsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PostsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns the top posts over a date range
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * End date (inclusive)
         */
        @jakarta.annotation.Nullable
        public String end;
        /**
         * Filter by feed
         */
        @jakarta.annotation.Nullable
        public String feedId;
        /**
         * Maximum number of results
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Start date (inclusive)
         */
        @jakarta.annotation.Nullable
        public String start;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("end", end);
            allQueryParams.put("feed_id", feedId);
            allQueryParams.put("limit", limit);
            allQueryParams.put("start", start);
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
