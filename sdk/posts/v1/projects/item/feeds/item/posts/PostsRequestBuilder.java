package com.rixl.sdk.posts.v1.projects.item.feeds.item.posts;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.gateway.CreatePostBody;
import com.rixl.sdk.models.postsv1.ListPostsResponse;
import com.rixl.sdk.models.postsv1.Post;
import com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.creators.CreatorsRequestBuilder;
import com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.item.WithPostItemRequestBuilder;
import com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.upload.UploadRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /posts/v1/projects/{projectId}/feeds/{feedId}/posts
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PostsRequestBuilder extends BaseRequestBuilder {
    /**
     * The creators property
     * @return a {@link CreatorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatorsRequestBuilder creators() {
        return new CreatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The upload property
     * @return a {@link UploadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadRequestBuilder upload() {
        return new UploadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.item collection
     * @param postId Post ID
     * @return a {@link WithPostItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPostItemRequestBuilder byPostId(@jakarta.annotation.Nonnull final String postId) {
        Objects.requireNonNull(postId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("postId", postId);
        return new WithPostItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PostsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PostsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/projects/{projectId}/feeds/{feedId}/posts{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PostsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PostsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/projects/{projectId}/feeds/{feedId}/posts{?limit*,offset*}", rawUrl);
    }
    /**
     * List posts in a feed
     * @return a {@link ListPostsResponse}
     */
    @jakarta.annotation.Nullable
    public ListPostsResponse get() {
        return get(null);
    }
    /**
     * List posts in a feed
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListPostsResponse}
     */
    @jakarta.annotation.Nullable
    public ListPostsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListPostsResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new post in a feed
     * @param body Post to create
     * @return a {@link Post}
     */
    @jakarta.annotation.Nullable
    public Post post(@jakarta.annotation.Nonnull final CreatePostBody body) {
        return post(body, null);
    }
    /**
     * Create a new post in a feed
     * @param body Post to create
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Post}
     */
    @jakarta.annotation.Nullable
    public Post post(@jakarta.annotation.Nonnull final CreatePostBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Post::createFromDiscriminatorValue);
    }
    /**
     * List posts in a feed
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List posts in a feed
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
     * Create a new post in a feed
     * @param body Post to create
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreatePostBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new post in a feed
     * @param body Post to create
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreatePostBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PostsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PostsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PostsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List posts in a feed
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Page size
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Page offset
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
