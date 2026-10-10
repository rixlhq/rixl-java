package com.rixl.sdk.billing.v1.paymentmethods;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.billing.v1.paymentmethods.frompaymentintent.FromPaymentIntentRequestBuilder;
import com.rixl.sdk.billing.v1.paymentmethods.fromsetupintent.FromSetupIntentRequestBuilder;
import com.rixl.sdk.billing.v1.paymentmethods.item.WithPaymentMethodItemRequestBuilder;
import com.rixl.sdk.models.billing.v1.ListPaymentMethodsResponse;
import com.rixl.sdk.models.billing.v1.PaymentMethodDetails;
import com.rixl.sdk.models.billing.v1.UpsertPaymentMethodRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/payment-methods
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethodsRequestBuilder extends BaseRequestBuilder {
    /**
     * The fromPaymentIntent property
     * @return a {@link FromPaymentIntentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FromPaymentIntentRequestBuilder fromPaymentIntent() {
        return new FromPaymentIntentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The fromSetupIntent property
     * @return a {@link FromSetupIntentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FromSetupIntentRequestBuilder fromSetupIntent() {
        return new FromSetupIntentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.rixl.sdk.billing.v1.paymentMethods.item collection
     * @param payment_method_id Unique identifier of the item
     * @return a {@link WithPaymentMethodItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPaymentMethodItemRequestBuilder byPayment_method_id(@jakarta.annotation.Nonnull final String payment_method_id) {
        Objects.requireNonNull(payment_method_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("payment_method_id", payment_method_id);
        return new WithPaymentMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PaymentMethodsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/payment-methods{?org_id*,refresh*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PaymentMethodsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/payment-methods{?org_id*,refresh*}", rawUrl);
    }
    /**
     * ListPaymentMethods
     * @return a {@link ListPaymentMethodsResponse}
     */
    @jakarta.annotation.Nullable
    public ListPaymentMethodsResponse get() {
        return get(null);
    }
    /**
     * ListPaymentMethods
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListPaymentMethodsResponse}
     */
    @jakarta.annotation.Nullable
    public ListPaymentMethodsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListPaymentMethodsResponse::createFromDiscriminatorValue);
    }
    /**
     * UpsertPaymentMethod
     * @param body The request body
     * @return a {@link PaymentMethodDetails}
     */
    @jakarta.annotation.Nullable
    public PaymentMethodDetails put(@jakarta.annotation.Nonnull final UpsertPaymentMethodRequest body) {
        return put(body, null);
    }
    /**
     * UpsertPaymentMethod
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PaymentMethodDetails}
     */
    @jakarta.annotation.Nullable
    public PaymentMethodDetails put(@jakarta.annotation.Nonnull final UpsertPaymentMethodRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PaymentMethodDetails::createFromDiscriminatorValue);
    }
    /**
     * ListPaymentMethods
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListPaymentMethods
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
     * UpsertPaymentMethod
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpsertPaymentMethodRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * UpsertPaymentMethod
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpsertPaymentMethodRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PaymentMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PaymentMethodsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListPaymentMethods
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String orgId;
        @jakarta.annotation.Nullable
        public Boolean refresh;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("org_id", orgId);
            allQueryParams.put("refresh", refresh);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
