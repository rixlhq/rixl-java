package com.rixl.sdk.analytics.v1.top;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.analytics.v1.top.feeds.FeedsRequestBuilder;
import com.rixl.sdk.analytics.v1.top.images.ImagesRequestBuilder;
import com.rixl.sdk.analytics.v1.top.posts.PostsRequestBuilder;
import com.rixl.sdk.analytics.v1.top.videos.VideosRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/top
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TopRequestBuilder extends BaseRequestBuilder {
    /**
     * The feeds property
     * @return a {@link FeedsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedsRequestBuilder feeds() {
        return new FeedsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The images property
     * @return a {@link ImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The posts property
     * @return a {@link PostsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PostsRequestBuilder posts() {
        return new PostsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The videos property
     * @return a {@link VideosRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideosRequestBuilder videos() {
        return new VideosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TopRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TopRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/top", pathParameters);
    }
    /**
     * Instantiates a new {@link TopRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TopRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/top", rawUrl);
    }
}
