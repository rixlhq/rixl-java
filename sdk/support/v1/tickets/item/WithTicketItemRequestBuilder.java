package com.rixl.sdk.support.v1.tickets.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.support.v1.GetTicketResponse;
import com.rixl.sdk.support.v1.tickets.item.close.CloseRequestBuilder;
import com.rixl.sdk.support.v1.tickets.item.messages.MessagesRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /support/v1/tickets/{ticket_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTicketItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The close property
     * @return a {@link CloseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloseRequestBuilder close() {
        return new CloseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The messages property
     * @return a {@link MessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithTicketItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTicketItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/tickets/{ticket_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithTicketItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTicketItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/tickets/{ticket_id}", rawUrl);
    }
    /**
     * GetTicket
     * @return a {@link GetTicketResponse}
     */
    @jakarta.annotation.Nullable
    public GetTicketResponse get() {
        return get(null);
    }
    /**
     * GetTicket
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetTicketResponse}
     */
    @jakarta.annotation.Nullable
    public GetTicketResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetTicketResponse::createFromDiscriminatorValue);
    }
    /**
     * GetTicket
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * GetTicket
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithTicketItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTicketItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithTicketItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
