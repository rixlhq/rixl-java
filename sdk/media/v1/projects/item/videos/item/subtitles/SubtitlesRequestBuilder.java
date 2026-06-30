package com.rixl.sdk.media.v1.projects.item.videos.item.subtitles;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.media.v1.projects.item.videos.item.subtitles.item.WithSubtitleItemRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.subtitles.language.LanguageRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.subtitles.upload.UploadRequestBuilder;
import com.rixl.sdk.models.videosv1.DeleteResult;
import com.rixl.sdk.models.videosv1.ListSubtitlesResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{projectId}/videos/{videoId}/subtitles
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubtitlesRequestBuilder extends BaseRequestBuilder {
    /**
     * The language property
     * @return a {@link LanguageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LanguageRequestBuilder language() {
        return new LanguageRequestBuilder(pathParameters, requestAdapter);
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
     * Gets an item from the com.rixl.sdk.media.v1.projects.item.videos.item.subtitles.item collection
     * @param subtitleId Subtitle ID
     * @return a {@link WithSubtitleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSubtitleItemRequestBuilder bySubtitleId(@jakarta.annotation.Nonnull final String subtitleId) {
        Objects.requireNonNull(subtitleId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subtitleId", subtitleId);
        return new WithSubtitleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SubtitlesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubtitlesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/subtitles", pathParameters);
    }
    /**
     * Instantiates a new {@link SubtitlesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubtitlesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/subtitles", rawUrl);
    }
    /**
     * Deletes all subtitles for a video.
     * @return a {@link DeleteResult}
     */
    @jakarta.annotation.Nullable
    public DeleteResult delete() {
        return delete(null);
    }
    /**
     * Deletes all subtitles for a video.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeleteResult}
     */
    @jakarta.annotation.Nullable
    public DeleteResult delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DeleteResult::createFromDiscriminatorValue);
    }
    /**
     * Returns a video&apos;s subtitles within a project, including for private media. Requires project access.
     * @return a {@link ListSubtitlesResponse}
     */
    @jakarta.annotation.Nullable
    public ListSubtitlesResponse get() {
        return get(null);
    }
    /**
     * Returns a video&apos;s subtitles within a project, including for private media. Requires project access.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListSubtitlesResponse}
     */
    @jakarta.annotation.Nullable
    public ListSubtitlesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListSubtitlesResponse::createFromDiscriminatorValue);
    }
    /**
     * Deletes all subtitles for a video.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes all subtitles for a video.
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
     * Returns a video&apos;s subtitles within a project, including for private media. Requires project access.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a video&apos;s subtitles within a project, including for private media. Requires project access.
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
     * @return a {@link SubtitlesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubtitlesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubtitlesRequestBuilder(rawUrl, requestAdapter);
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
