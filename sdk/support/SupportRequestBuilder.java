package com.rixl.sdk.support;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.support.v1.V1RequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /support
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SupportRequestBuilder extends BaseRequestBuilder {
    /**
     * The v1 property
     * @return a {@link V1RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public V1RequestBuilder v1() {
        return new V1RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SupportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SupportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support", pathParameters);
    }
    /**
     * Instantiates a new {@link SupportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SupportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support", rawUrl);
    }
}
