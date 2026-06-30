package com.rixl.sdk.media.v1.images;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.media.v1.images.item.WithImageItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/images
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImagesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.media.v1.images.item collection
     * @param imageId Image ID
     * @return a {@link WithImageItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithImageItemRequestBuilder byImageId(@jakarta.annotation.Nonnull final String imageId) {
        Objects.requireNonNull(imageId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("imageId", imageId);
        return new WithImageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ImagesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/images", pathParameters);
    }
    /**
     * Instantiates a new {@link ImagesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/images", rawUrl);
    }
}
