package com.rixl.sdk.support.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.support.v1.categories.CategoriesRequestBuilder;
import com.rixl.sdk.support.v1.chat.ChatRequestBuilder;
import com.rixl.sdk.support.v1.tickets.TicketsRequestBuilder;
import com.rixl.sdk.support.v1.topics.TopicsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /support/v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The categories property
     * @return a {@link CategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The chat property
     * @return a {@link ChatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChatRequestBuilder chat() {
        return new ChatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tickets property
     * @return a {@link TicketsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TicketsRequestBuilder tickets() {
        return new TicketsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The topics property
     * @return a {@link TopicsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TopicsRequestBuilder topics() {
        return new TopicsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1", rawUrl);
    }
}
