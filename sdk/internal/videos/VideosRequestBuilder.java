package com.rixl.sdk.internal.videos;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.internal.videos.markfailed.MarkFailedRequestBuilder;
import com.rixl.sdk.internal.videos.markprocessed.MarkProcessedRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /internal/videos
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideosRequestBuilder extends BaseRequestBuilder {
    /**
     * The markFailed property
     * @return a {@link MarkFailedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkFailedRequestBuilder markFailed() {
        return new MarkFailedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The markProcessed property
     * @return a {@link MarkProcessedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkProcessedRequestBuilder markProcessed() {
        return new MarkProcessedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link VideosRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideosRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/internal/videos", pathParameters);
    }
    /**
     * Instantiates a new {@link VideosRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideosRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/internal/videos", rawUrl);
    }
}
