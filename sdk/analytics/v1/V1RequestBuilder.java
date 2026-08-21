package com.rixl.sdk.analytics.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.analytics.v1.dashboard.DashboardRequestBuilder;
import com.rixl.sdk.analytics.v1.dashboards.DashboardsRequestBuilder;
import com.rixl.sdk.analytics.v1.events.EventsRequestBuilder;
import com.rixl.sdk.analytics.v1.feeds.FeedsRequestBuilder;
import com.rixl.sdk.analytics.v1.funnels.FunnelsRequestBuilder;
import com.rixl.sdk.analytics.v1.images.ImagesRequestBuilder;
import com.rixl.sdk.analytics.v1.posts.PostsRequestBuilder;
import com.rixl.sdk.analytics.v1.realtime.RealtimeRequestBuilder;
import com.rixl.sdk.analytics.v1.retention.RetentionRequestBuilder;
import com.rixl.sdk.analytics.v1.top.TopRequestBuilder;
import com.rixl.sdk.analytics.v1.videos.VideosRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The dashboard property
     * @return a {@link DashboardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DashboardRequestBuilder dashboard() {
        return new DashboardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dashboards property
     * @return a {@link DashboardsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DashboardsRequestBuilder dashboards() {
        return new DashboardsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The events property
     * @return a {@link EventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The feeds property
     * @return a {@link FeedsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedsRequestBuilder feeds() {
        return new FeedsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The funnels property
     * @return a {@link FunnelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FunnelsRequestBuilder funnels() {
        return new FunnelsRequestBuilder(pathParameters, requestAdapter);
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
     * The realtime property
     * @return a {@link RealtimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RealtimeRequestBuilder realtime() {
        return new RealtimeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The retention property
     * @return a {@link RetentionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetentionRequestBuilder retention() {
        return new RetentionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The top property
     * @return a {@link TopRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TopRequestBuilder top() {
        return new TopRequestBuilder(pathParameters, requestAdapter);
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
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1", rawUrl);
    }
}
