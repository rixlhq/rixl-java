package com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.upload.complete;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.gateway.CompleteUploadBody;
import com.rixl.sdk.models.postsv1.Post;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /posts/v1/projects/{projectId}/feeds/{feedId}/posts/upload/complete
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompleteRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CompleteRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CompleteRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/projects/{projectId}/feeds/{feedId}/posts/upload/complete", pathParameters);
    }
    /**
     * Instantiates a new {@link CompleteRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CompleteRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/projects/{projectId}/feeds/{feedId}/posts/upload/complete", rawUrl);
    }
    /**
     * Finalize a media upload and publish the post
     * @param body Upload completion request
     * @return a {@link Post}
     */
    @jakarta.annotation.Nullable
    public Post post(@jakarta.annotation.Nonnull final CompleteUploadBody body) {
        return post(body, null);
    }
    /**
     * Finalize a media upload and publish the post
     * @param body Upload completion request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Post}
     */
    @jakarta.annotation.Nullable
    public Post post(@jakarta.annotation.Nonnull final CompleteUploadBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Post::createFromDiscriminatorValue);
    }
    /**
     * Finalize a media upload and publish the post
     * @param body Upload completion request
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CompleteUploadBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Finalize a media upload and publish the post
     * @param body Upload completion request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CompleteUploadBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CompleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CompleteRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CompleteRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
