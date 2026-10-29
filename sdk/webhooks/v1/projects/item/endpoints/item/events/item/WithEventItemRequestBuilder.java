package com.rixl.sdk.webhooks.v1.projects.item.endpoints.item.events.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.webhooks.v1.projects.item.endpoints.item.events.item.replay.ReplayRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /webhooks/v1/projects/{project_id}/endpoints/{endpoint_id}/events/{event_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithEventItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The replay property
     * @return a {@link ReplayRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReplayRequestBuilder replay() {
        return new ReplayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithEventItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEventItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/webhooks/v1/projects/{project_id}/endpoints/{endpoint_id}/events/{event_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithEventItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEventItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/webhooks/v1/projects/{project_id}/endpoints/{endpoint_id}/events/{event_id}", rawUrl);
    }
}
