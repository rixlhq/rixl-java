package com.rixl.sdk.media.v1.projects.item.videos.item.audiotracks;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.media.v1.projects.item.videos.item.audiotracks.item.WithTrackItemRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.audiotracks.language.LanguageRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.item.audiotracks.upload.UploadRequestBuilder;
import com.rixl.sdk.models.google.protobuf.Empty;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{project_id}/videos/{video_id}/audio-tracks
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AudioTracksRequestBuilder extends BaseRequestBuilder {
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
     * Gets an item from the com.rixl.sdk.media.v1.projects.item.videos.item.audioTracks.item collection
     * @param track_id Unique identifier of the item
     * @return a {@link WithTrackItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTrackItemRequestBuilder byTrack_id(@jakarta.annotation.Nonnull final String track_id) {
        Objects.requireNonNull(track_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("track_id", track_id);
        return new WithTrackItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AudioTracksRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudioTracksRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{project_id}/videos/{video_id}/audio-tracks", pathParameters);
    }
    /**
     * Instantiates a new {@link AudioTracksRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudioTracksRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{project_id}/videos/{video_id}/audio-tracks", rawUrl);
    }
    /**
     * DeleteAllAudioTracks
     * @return a {@link Empty}
     */
    @jakarta.annotation.Nullable
    public Empty delete() {
        return delete(null);
    }
    /**
     * DeleteAllAudioTracks
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Empty}
     */
    @jakarta.annotation.Nullable
    public Empty delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Empty::createFromDiscriminatorValue);
    }
    /**
     * DeleteAllAudioTracks
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * DeleteAllAudioTracks
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AudioTracksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AudioTracksRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AudioTracksRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
}
