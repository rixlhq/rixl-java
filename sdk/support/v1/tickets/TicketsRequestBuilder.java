package com.rixl.sdk.support.v1.tickets;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.support.v1.CreateTicketRequest;
import com.rixl.sdk.models.support.v1.CreateTicketResponse;
import com.rixl.sdk.models.support.v1.ListTicketsResponse;
import com.rixl.sdk.models.support.v1.TicketStatus;
import com.rixl.sdk.support.v1.tickets.item.WithTicketItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /support/v1/tickets
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TicketsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.support.v1.tickets.item collection
     * @param ticket_id Unique identifier of the item
     * @return a {@link WithTicketItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTicketItemRequestBuilder byTicket_id(@jakarta.annotation.Nonnull final String ticket_id) {
        Objects.requireNonNull(ticket_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ticket_id", ticket_id);
        return new WithTicketItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link TicketsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TicketsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/tickets{?pagination%2Elimit*,pagination%2Eoffset*,status*}", pathParameters);
    }
    /**
     * Instantiates a new {@link TicketsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TicketsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/tickets{?pagination%2Elimit*,pagination%2Eoffset*,status*}", rawUrl);
    }
    /**
     * ListTickets
     * @return a {@link ListTicketsResponse}
     */
    @jakarta.annotation.Nullable
    public ListTicketsResponse get() {
        return get(null);
    }
    /**
     * ListTickets
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListTicketsResponse}
     */
    @jakarta.annotation.Nullable
    public ListTicketsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListTicketsResponse::createFromDiscriminatorValue);
    }
    /**
     * CreateTicket
     * @param body The request body
     * @return a {@link CreateTicketResponse}
     */
    @jakarta.annotation.Nullable
    public CreateTicketResponse post(@jakarta.annotation.Nonnull final CreateTicketRequest body) {
        return post(body, null);
    }
    /**
     * CreateTicket
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateTicketResponse}
     */
    @jakarta.annotation.Nullable
    public CreateTicketResponse post(@jakarta.annotation.Nonnull final CreateTicketRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateTicketResponse::createFromDiscriminatorValue);
    }
    /**
     * ListTickets
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListTickets
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * CreateTicket
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateTicketRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * CreateTicket
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateTicketRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link TicketsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TicketsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TicketsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListTickets
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Maximum number of items to return.
         */
        @jakarta.annotation.Nullable
        public Integer paginationLimit;
        /**
         * Number of items to skip before collecting the result set.
         */
        @jakarta.annotation.Nullable
        public Integer paginationOffset;
        @jakarta.annotation.Nullable
        public TicketStatus status;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("status", status);
            allQueryParams.put("pagination%2Elimit", paginationLimit);
            allQueryParams.put("pagination%2Eoffset", paginationOffset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
