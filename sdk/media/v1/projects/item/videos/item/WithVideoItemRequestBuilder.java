package com.rixl.sdk.media.v1.projects.item.videos.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.media.v1.projects.item.videos.item.audiotracks.AudioTracksRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.chapters.ChaptersRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.subtitles.SubtitlesRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.thumbnail.ThumbnailRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.upload.UploadRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.visibility.VisibilityRequestBuilder;
import com.rixl.sdk.models.videosv1.DeleteResult;
import com.rixl.sdk.models.videosv1.GetVideoResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{projectId}/videos/{videoId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithVideoItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The audioTracks property
     * @return a {@link AudioTracksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AudioTracksRequestBuilder audioTracks() {
        return new AudioTracksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The chapters property
     * @return a {@link ChaptersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChaptersRequestBuilder chapters() {
        return new ChaptersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The subtitles property
     * @return a {@link SubtitlesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubtitlesRequestBuilder subtitles() {
        return new SubtitlesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The thumbnail property
     * @return a {@link ThumbnailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThumbnailRequestBuilder thumbnail() {
        return new ThumbnailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The upload property
     * @return a {@link UploadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadRequestBuilder upload() {
        return new UploadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The visibility property
     * @return a {@link VisibilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VisibilityRequestBuilder visibility() {
        return new VisibilityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}", rawUrl);
    }
    /**
     * Deletes a video from a project.
     * @return a {@link DeleteResult}
     */
    @jakarta.annotation.Nullable
    public DeleteResult delete() {
        return delete(null);
    }
    /**
     * Deletes a video from a project.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeleteResult}
     */
    @jakarta.annotation.Nullable
    public DeleteResult delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DeleteResult::createFromDiscriminatorValue);
    }
    /**
     * Returns a single video within a project, including private media. Requires project access.
     * @return a {@link GetVideoResponse}
     */
    @jakarta.annotation.Nullable
    public GetVideoResponse get() {
        return get(null);
    }
    /**
     * Returns a single video within a project, including private media. Requires project access.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetVideoResponse}
     */
    @jakarta.annotation.Nullable
    public GetVideoResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetVideoResponse::createFromDiscriminatorValue);
    }
    /**
     * Deletes a video from a project.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a video from a project.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a single video within a project, including private media. Requires project access.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a single video within a project, including private media. Requires project access.
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
     * @return a {@link WithVideoItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithVideoItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
