package com.rixl.sdk.analytics.v1.posts.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.analytics.v1.posts.item.stats.StatsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/posts/{post_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPostItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The stats property
     * @return a {@link StatsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatsRequestBuilder stats() {
        return new StatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithPostItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPostItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/posts/{post_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPostItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPostItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/posts/{post_id}", rawUrl);
    }
}
