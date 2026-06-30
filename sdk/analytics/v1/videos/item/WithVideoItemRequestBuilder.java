package com.rixl.sdk.analytics.v1.videos.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.analytics.v1.videos.item.heatmap.HeatmapRequestBuilder;
import com.rixl.sdk.analytics.v1.videos.item.hotsegments.HotSegmentsRequestBuilder;
import com.rixl.sdk.analytics.v1.videos.item.stats.StatsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/videos/{videoId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithVideoItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The heatmap property
     * @return a {@link HeatmapRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HeatmapRequestBuilder heatmap() {
        return new HeatmapRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The hotSegments property
     * @return a {@link HotSegmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HotSegmentsRequestBuilder hotSegments() {
        return new HotSegmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The stats property
     * @return a {@link StatsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatsRequestBuilder stats() {
        return new StatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/videos/{videoId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/videos/{videoId}", rawUrl);
    }
}
