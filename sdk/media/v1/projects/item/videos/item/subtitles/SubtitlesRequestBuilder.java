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
import com.rixl.sdk.models.google.protobuf.Empty;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{project_id}/videos/{video_id}/subtitles
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
     * @param subtitle_id Unique identifier of the item
     * @return a {@link WithSubtitleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSubtitleItemRequestBuilder bySubtitle_id(@jakarta.annotation.Nonnull final String subtitle_id) {
        Objects.requireNonNull(subtitle_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subtitle_id", subtitle_id);
        return new WithSubtitleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SubtitlesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubtitlesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{project_id}/videos/{video_id}/subtitles", pathParameters);
    }
    /**
     * Instantiates a new {@link SubtitlesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubtitlesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{project_id}/videos/{video_id}/subtitles", rawUrl);
    }
    /**
     * DeleteAllSubtitles
     * @return a {@link Empty}
     */
    @jakarta.annotation.Nullable
    public Empty delete() {
        return delete(null);
    }
    /**
     * DeleteAllSubtitles
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Empty}
     */
    @jakarta.annotation.Nullable
    public Empty delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Empty::createFromDiscriminatorValue);
    }
    /**
     * DeleteAllSubtitles
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * DeleteAllSubtitles
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
}
