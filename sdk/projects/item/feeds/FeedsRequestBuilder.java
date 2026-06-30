package com.rixl.sdk.projects.item.feeds;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.feedsv1.Feed;
import com.rixl.sdk.models.feedsv1.ListFeedsResponse;
import com.rixl.sdk.models.types.CreateFeedRequest;
import com.rixl.sdk.projects.item.feeds.item.WithFeedItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /projects/{projectId}/feeds
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.projects.item.feeds.item collection
     * @param feedId Feed ID
     * @return a {@link WithFeedItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFeedItemRequestBuilder byFeedId(@jakarta.annotation.Nonnull final String feedId) {
        Objects.requireNonNull(feedId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("feedId", feedId);
        return new WithFeedItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link FeedsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/projects/{projectId}/feeds{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link FeedsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/projects/{projectId}/feeds{?limit*,offset*}", rawUrl);
    }
    /**
     * Lists all feeds for the active project with pagination.
     * @param body The request body
     * @return a {@link ListFeedsResponse}
     */
    @jakarta.annotation.Nullable
    public ListFeedsResponse get(@jakarta.annotation.Nonnull final FeedsGetRequestBody body) {
        return get(body, null);
    }
    /**
     * Lists all feeds for the active project with pagination.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListFeedsResponse}
     */
    @jakarta.annotation.Nullable
    public ListFeedsResponse get(@jakarta.annotation.Nonnull final FeedsGetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toGetRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListFeedsResponse::createFromDiscriminatorValue);
    }
    /**
     * Creates a new feed under the active project.
     * @param body Feed details
     * @return a {@link Feed}
     */
    @jakarta.annotation.Nullable
    public Feed post(@jakarta.annotation.Nonnull final CreateFeedRequest body) {
        return post(body, null);
    }
    /**
     * Creates a new feed under the active project.
     * @param body Feed details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Feed}
     */
    @jakarta.annotation.Nullable
    public Feed post(@jakarta.annotation.Nonnull final CreateFeedRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Feed::createFromDiscriminatorValue);
    }
    /**
     * Lists all feeds for the active project with pagination.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nonnull final FeedsGetRequestBody body) {
        return toGetRequestInformation(body, null);
    }
    /**
     * Lists all feeds for the active project with pagination.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nonnull final FeedsGetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Creates a new feed under the active project.
     * @param body Feed details
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateFeedRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a new feed under the active project.
     * @param body Feed details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateFeedRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * Lists all feeds for the active project with pagination.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Limit
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Offset
         */
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
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
