package com.rixl.sdk.auth.v1.blog;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.blog.subscribe.SubscribeRequestBuilder;
import com.rixl.sdk.auth.v1.blog.subscription.SubscriptionRequestBuilder;
import com.rixl.sdk.auth.v1.blog.unsubscribe.UnsubscribeRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/blog
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlogRequestBuilder extends BaseRequestBuilder {
    /**
     * The subscribe property
     * @return a {@link SubscribeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscribeRequestBuilder subscribe() {
        return new SubscribeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The subscription property
     * @return a {@link SubscriptionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionRequestBuilder subscription() {
        return new SubscriptionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The unsubscribe property
     * @return a {@link UnsubscribeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnsubscribeRequestBuilder unsubscribe() {
        return new UnsubscribeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BlogRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BlogRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/blog", pathParameters);
    }
    /**
     * Instantiates a new {@link BlogRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BlogRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/blog", rawUrl);
    }
}
