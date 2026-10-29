package com.rixl.sdk.webhooks.v1.projects.item.endpoints.item.events;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.webhooks.v1.projects.item.endpoints.item.events.item.WithEventItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /webhooks/v1/projects/{project_id}/endpoints/{endpoint_id}/events
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.webhooks.v1.projects.item.endpoints.item.events.item collection
     * @param event_id The event_id path parameter.
     * @return a {@link WithEventItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEventItemRequestBuilder byEvent_id(@jakarta.annotation.Nonnull final String event_id) {
        Objects.requireNonNull(event_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event_id", event_id);
        return new WithEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link EventsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/webhooks/v1/projects/{project_id}/endpoints/{endpoint_id}/events", pathParameters);
    }
    /**
     * Instantiates a new {@link EventsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/webhooks/v1/projects/{project_id}/endpoints/{endpoint_id}/events", rawUrl);
    }
}
