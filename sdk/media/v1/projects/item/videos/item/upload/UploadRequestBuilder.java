package com.rixl.sdk.media.v1.projects.item.videos.item.upload;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.media.v1.projects.item.videos.item.upload.complete.CompleteRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{projectId}/videos/{videoId}/upload
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadRequestBuilder extends BaseRequestBuilder {
    /**
     * The complete property
     * @return a {@link CompleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CompleteRequestBuilder complete() {
        return new CompleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link UploadRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/upload", pathParameters);
    }
    /**
     * Instantiates a new {@link UploadRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/upload", rawUrl);
    }
}
