package com.rixl.sdk.media.v1.projects.item.videos.item.visibility;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.gateway.UpdateVisibilityBody;
import com.rixl.sdk.models.videosv1.GetVideoResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{projectId}/videos/{videoId}/visibility
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VisibilityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link VisibilityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VisibilityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/visibility", pathParameters);
    }
    /**
     * Instantiates a new {@link VisibilityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VisibilityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/visibility", rawUrl);
    }
    /**
     * Updates a video&apos;s visibility (public, unlisted, or private). Requires project access.
     * @param body Visibility
     * @return a {@link GetVideoResponse}
     */
    @jakarta.annotation.Nullable
    public GetVideoResponse put(@jakarta.annotation.Nonnull final UpdateVisibilityBody body) {
        return put(body, null);
    }
    /**
     * Updates a video&apos;s visibility (public, unlisted, or private). Requires project access.
     * @param body Visibility
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetVideoResponse}
     */
    @jakarta.annotation.Nullable
    public GetVideoResponse put(@jakarta.annotation.Nonnull final UpdateVisibilityBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetVideoResponse::createFromDiscriminatorValue);
    }
    /**
     * Updates a video&apos;s visibility (public, unlisted, or private). Requires project access.
     * @param body Visibility
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateVisibilityBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Updates a video&apos;s visibility (public, unlisted, or private). Requires project access.
     * @param body Visibility
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateVisibilityBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link VisibilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VisibilityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VisibilityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
