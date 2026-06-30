package com.rixl.sdk.projects.item.feeds.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.feedsv1.DeleteFeedResponse;
import com.rixl.sdk.models.feedsv1.Feed;
import com.rixl.sdk.models.types.UpdateFeedRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /projects/{projectId}/feeds/{feedId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithFeedItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithFeedItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithFeedItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/projects/{projectId}/feeds/{feedId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithFeedItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithFeedItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/projects/{projectId}/feeds/{feedId}", rawUrl);
    }
    /**
     * Deletes a feed in the active project.
     * @param body The request body
     * @return a {@link DeleteFeedResponse}
     */
    @jakarta.annotation.Nullable
    public DeleteFeedResponse delete(@jakarta.annotation.Nonnull final WithFeedDeleteRequestBody body) {
        return delete(body, null);
    }
    /**
     * Deletes a feed in the active project.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeleteFeedResponse}
     */
    @jakarta.annotation.Nullable
    public DeleteFeedResponse delete(@jakarta.annotation.Nonnull final WithFeedDeleteRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toDeleteRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DeleteFeedResponse::createFromDiscriminatorValue);
    }
    /**
     * Retrieves a feed by ID under the active project.
     * @param body The request body
     * @return a {@link Feed}
     */
    @jakarta.annotation.Nullable
    public Feed get(@jakarta.annotation.Nonnull final WithFeedGetRequestBody body) {
        return get(body, null);
    }
    /**
     * Retrieves a feed by ID under the active project.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Feed}
     */
    @jakarta.annotation.Nullable
    public Feed get(@jakarta.annotation.Nonnull final WithFeedGetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toGetRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Feed::createFromDiscriminatorValue);
    }
    /**
     * Updates an existing feed in the active project.
     * @param body Updated feed details
     * @return a {@link Feed}
     */
    @jakarta.annotation.Nullable
    public Feed put(@jakarta.annotation.Nonnull final UpdateFeedRequest body) {
        return put(body, null);
    }
    /**
     * Updates an existing feed in the active project.
     * @param body Updated feed details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Feed}
     */
    @jakarta.annotation.Nullable
    public Feed put(@jakarta.annotation.Nonnull final UpdateFeedRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Feed::createFromDiscriminatorValue);
    }
    /**
     * Deletes a feed in the active project.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nonnull final WithFeedDeleteRequestBody body) {
        return toDeleteRequestInformation(body, null);
    }
    /**
     * Deletes a feed in the active project.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nonnull final WithFeedDeleteRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Retrieves a feed by ID under the active project.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nonnull final WithFeedGetRequestBody body) {
        return toGetRequestInformation(body, null);
    }
    /**
     * Retrieves a feed by ID under the active project.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nonnull final WithFeedGetRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Updates an existing feed in the active project.
     * @param body Updated feed details
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateFeedRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Updates an existing feed in the active project.
     * @param body Updated feed details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateFeedRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithFeedItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFeedItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithFeedItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
