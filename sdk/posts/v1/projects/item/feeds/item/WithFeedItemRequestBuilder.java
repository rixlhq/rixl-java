package com.rixl.sdk.posts.v1.projects.item.feeds.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.PostsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /posts/v1/projects/{project_id}/feeds/{feed_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithFeedItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The posts property
     * @return a {@link PostsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PostsRequestBuilder posts() {
        return new PostsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithFeedItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithFeedItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/projects/{project_id}/feeds/{feed_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithFeedItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithFeedItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/projects/{project_id}/feeds/{feed_id}", rawUrl);
    }
}
