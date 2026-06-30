package com.rixl.sdk.media.v1.projects.item.videos.item.chapters;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.media.v1.projects.item.videos.item.chapters.item.WithStartTimeSecItemRequestBuilder;
import com.rixl.sdk.models.gateway.UpdateChaptersBody;
import com.rixl.sdk.models.videosv1.VideoChapters;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{projectId}/videos/{videoId}/chapters
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChaptersRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.media.v1.projects.item.videos.item.chapters.item collection
     * @param startTimeSec Chapter start time (seconds)
     * @return a {@link WithStartTimeSecItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithStartTimeSecItemRequestBuilder byStartTimeSec(@jakarta.annotation.Nonnull final Integer startTimeSec) {
        Objects.requireNonNull(startTimeSec);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("startTimeSec", startTimeSec);
        return new WithStartTimeSecItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ChaptersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChaptersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/chapters", pathParameters);
    }
    /**
     * Instantiates a new {@link ChaptersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChaptersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/chapters", rawUrl);
    }
    /**
     * Removes every chapter from a video.
     * @return a {@link VideoChapters}
     */
    @jakarta.annotation.Nullable
    public VideoChapters delete() {
        return delete(null);
    }
    /**
     * Removes every chapter from a video.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VideoChapters}
     */
    @jakarta.annotation.Nullable
    public VideoChapters delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VideoChapters::createFromDiscriminatorValue);
    }
    /**
     * Returns the chapters of a video.
     * @return a {@link VideoChapters}
     */
    @jakarta.annotation.Nullable
    public VideoChapters get() {
        return get(null);
    }
    /**
     * Returns the chapters of a video.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VideoChapters}
     */
    @jakarta.annotation.Nullable
    public VideoChapters get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VideoChapters::createFromDiscriminatorValue);
    }
    /**
     * Replaces the chapters of a video.
     * @param body Chapters to set
     * @return a {@link VideoChapters}
     */
    @jakarta.annotation.Nullable
    public VideoChapters put(@jakarta.annotation.Nonnull final UpdateChaptersBody body) {
        return put(body, null);
    }
    /**
     * Replaces the chapters of a video.
     * @param body Chapters to set
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VideoChapters}
     */
    @jakarta.annotation.Nullable
    public VideoChapters put(@jakarta.annotation.Nonnull final UpdateChaptersBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, VideoChapters::createFromDiscriminatorValue);
    }
    /**
     * Removes every chapter from a video.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Removes every chapter from a video.
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
     * Returns the chapters of a video.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the chapters of a video.
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
     * Replaces the chapters of a video.
     * @param body Chapters to set
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateChaptersBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Replaces the chapters of a video.
     * @param body Chapters to set
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateChaptersBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ChaptersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChaptersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChaptersRequestBuilder(rawUrl, requestAdapter);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
