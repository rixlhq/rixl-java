package com.rixl.sdk.media.v1.projects.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.media.v1.projects.item.images.ImagesRequestBuilder;
import com.rixl.sdk.media.v1.projects.item.videos.VideosRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{projectId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The images property
     * @return a {@link ImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
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
     * Instantiates a new {@link WithProjectItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithProjectItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}", rawUrl);
    }
}
