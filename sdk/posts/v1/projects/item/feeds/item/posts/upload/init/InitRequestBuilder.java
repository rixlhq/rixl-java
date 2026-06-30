package com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.upload.init;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.gateway.InitUploadBody;
import com.rixl.sdk.models.postsv1.PostUploadInit;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /posts/v1/projects/{projectId}/feeds/{feedId}/posts/upload/init
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InitRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link InitRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InitRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/projects/{projectId}/feeds/{feedId}/posts/upload/init", pathParameters);
    }
    /**
     * Instantiates a new {@link InitRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InitRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/projects/{projectId}/feeds/{feedId}/posts/upload/init", rawUrl);
    }
    /**
     * Begin a media upload and create a draft post
     * @param body Upload initialization request
     * @return a {@link PostUploadInit}
     */
    @jakarta.annotation.Nullable
    public PostUploadInit post(@jakarta.annotation.Nonnull final InitUploadBody body) {
        return post(body, null);
    }
    /**
     * Begin a media upload and create a draft post
     * @param body Upload initialization request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PostUploadInit}
     */
    @jakarta.annotation.Nullable
    public PostUploadInit post(@jakarta.annotation.Nonnull final InitUploadBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PostUploadInit::createFromDiscriminatorValue);
    }
    /**
     * Begin a media upload and create a draft post
     * @param body Upload initialization request
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InitUploadBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Begin a media upload and create a draft post
     * @param body Upload initialization request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InitUploadBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link InitRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InitRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InitRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
