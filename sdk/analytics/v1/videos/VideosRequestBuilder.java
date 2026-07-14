package com.rixl.sdk.analytics.v1.videos;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.analytics.v1.videos.item.WithVideoItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/videos
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideosRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.analytics.v1.videos.item collection
     * @param video_id Unique identifier of the item
     * @return a {@link WithVideoItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoItemRequestBuilder byVideo_id(@jakarta.annotation.Nonnull final String video_id) {
        Objects.requireNonNull(video_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("video_id", video_id);
        return new WithVideoItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VideosRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideosRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/videos", pathParameters);
    }
    /**
     * Instantiates a new {@link VideosRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideosRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/videos", rawUrl);
    }
}
