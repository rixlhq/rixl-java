package com.rixl.sdk.posts.v1.feeds;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.posts.v1.feeds.item.WithFeedItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /posts/v1/feeds
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.posts.v1.feeds.item collection
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
        super(requestAdapter, "{+baseurl}/posts/v1/feeds", pathParameters);
    }
    /**
     * Instantiates a new {@link FeedsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/feeds", rawUrl);
    }
}
