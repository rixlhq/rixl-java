package com.rixl.sdk.analytics.v1.posts;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.analytics.v1.posts.item.WithPostItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/posts
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PostsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.analytics.v1.posts.item collection
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
        super(requestAdapter, "{+baseurl}/analytics/v1/posts", pathParameters);
    }
    /**
     * Instantiates a new {@link PostsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PostsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/posts", rawUrl);
    }
}
