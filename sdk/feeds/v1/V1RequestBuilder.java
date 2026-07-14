package com.rixl.sdk.feeds.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.feeds.v1.projects.ProjectsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /feeds/v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The projects property
     * @return a {@link ProjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds/v1", rawUrl);
    }
}
