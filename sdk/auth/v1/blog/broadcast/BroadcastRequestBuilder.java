package com.rixl.sdk.auth.v1.blog.broadcast;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.authv1.SendBlogBroadcastResponse;
import com.rixl.sdk.models.gateway.SendBlogBroadcastBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/blog/broadcast
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BroadcastRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BroadcastRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BroadcastRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/blog/broadcast", pathParameters);
    }
    /**
     * Instantiates a new {@link BroadcastRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BroadcastRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/blog/broadcast", rawUrl);
    }
    /**
     * Triggers a blog newsletter broadcast to all subscribers. Internal endpoint guarded by the service API key (X-Api-Key); called by the blog-publishing pipeline.
     * @param body Broadcast payload
     * @return a {@link SendBlogBroadcastResponse}
     */
    @jakarta.annotation.Nullable
    public SendBlogBroadcastResponse post(@jakarta.annotation.Nonnull final SendBlogBroadcastBody body) {
        return post(body, null);
    }
    /**
     * Triggers a blog newsletter broadcast to all subscribers. Internal endpoint guarded by the service API key (X-Api-Key); called by the blog-publishing pipeline.
     * @param body Broadcast payload
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SendBlogBroadcastResponse}
     */
    @jakarta.annotation.Nullable
    public SendBlogBroadcastResponse post(@jakarta.annotation.Nonnull final SendBlogBroadcastBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SendBlogBroadcastResponse::createFromDiscriminatorValue);
    }
    /**
     * Triggers a blog newsletter broadcast to all subscribers. Internal endpoint guarded by the service API key (X-Api-Key); called by the blog-publishing pipeline.
     * @param body Broadcast payload
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SendBlogBroadcastBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Triggers a blog newsletter broadcast to all subscribers. Internal endpoint guarded by the service API key (X-Api-Key); called by the blog-publishing pipeline.
     * @param body Broadcast payload
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SendBlogBroadcastBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link BroadcastRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BroadcastRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BroadcastRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
