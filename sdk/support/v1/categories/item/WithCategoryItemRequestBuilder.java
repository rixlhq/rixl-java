package com.rixl.sdk.support.v1.categories.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.support.v1.categories.item.topics.TopicsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /support/v1/categories/{category_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCategoryItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The topics property
     * @return a {@link TopicsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TopicsRequestBuilder topics() {
        return new TopicsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCategoryItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCategoryItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/categories/{category_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCategoryItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCategoryItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/categories/{category_id}", rawUrl);
    }
}
