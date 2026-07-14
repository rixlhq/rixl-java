package com.rixl.sdk.internal.images;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.internal.images.markfailed.MarkFailedRequestBuilder;
import com.rixl.sdk.internal.images.markprocessed.MarkProcessedRequestBuilder;
import com.rixl.sdk.internal.images.take.TakeRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /internal/images
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImagesRequestBuilder extends BaseRequestBuilder {
    /**
     * The markFailed property
     * @return a {@link MarkFailedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkFailedRequestBuilder markFailed() {
        return new MarkFailedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The markProcessed property
     * @return a {@link MarkProcessedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkProcessedRequestBuilder markProcessed() {
        return new MarkProcessedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The take property
     * @return a {@link TakeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TakeRequestBuilder take() {
        return new TakeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ImagesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/internal/images", pathParameters);
    }
    /**
     * Instantiates a new {@link ImagesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/internal/images", rawUrl);
    }
}
