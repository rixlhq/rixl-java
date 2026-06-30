package com.rixl.sdk.media.v1.projects.item.videos;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.media.v1.projects.item.videos.item.WithVideoItemRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.upload.UploadRequestBuilder;
import com.rixl.sdk.models.videosv1.ListVideosResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{projectId}/videos
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideosRequestBuilder extends BaseRequestBuilder {
    /**
     * The upload property
     * @return a {@link UploadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadRequestBuilder upload() {
        return new UploadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.rixl.sdk.media.v1.projects.item.videos.item collection
     * @param videoId Video ID
     * @return a {@link WithVideoItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoItemRequestBuilder byVideoId(@jakarta.annotation.Nonnull final String videoId) {
        Objects.requireNonNull(videoId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("videoId", videoId);
        return new WithVideoItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VideosRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideosRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos", pathParameters);
    }
    /**
     * Instantiates a new {@link VideosRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideosRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos", rawUrl);
    }
    /**
     * Returns the videos belonging to a project.
     * @return a {@link ListVideosResponse}
     */
    @jakarta.annotation.Nullable
    public ListVideosResponse get() {
        return get(null);
    }
    /**
     * Returns the videos belonging to a project.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListVideosResponse}
     */
    @jakarta.annotation.Nullable
    public ListVideosResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListVideosResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns the videos belonging to a project.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the videos belonging to a project.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link VideosRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideosRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VideosRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
