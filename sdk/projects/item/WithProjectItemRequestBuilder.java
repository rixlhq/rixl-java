package com.rixl.sdk.projects.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.projects.item.feeds.FeedsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /projects/{projectId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The feeds property
     * @return a {@link FeedsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedsRequestBuilder feeds() {
        return new FeedsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithProjectItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/projects/{projectId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithProjectItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/projects/{projectId}", rawUrl);
    }
}
