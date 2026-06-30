package com.rixl.sdk.billing.v1.paymentmethods;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.billing.v1.paymentmethods.frompaymentintent.FromPaymentIntentRequestBuilder;
import com.rixl.sdk.billing.v1.paymentmethods.fromsetupintent.FromSetupIntentRequestBuilder;
import com.rixl.sdk.billing.v1.paymentmethods.item.WithPaymentMethodItemRequestBuilder;
import com.rixl.sdk.models.billingv1.ListPaymentMethodsResponse;
import com.rixl.sdk.models.billingv1.PaymentMethodDetails;
import com.rixl.sdk.models.gateway.UpsertPaymentMethodBody;
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
     * @param paymentMethodId Payment method ID
     * @return a {@link WithPaymentMethodItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPaymentMethodItemRequestBuilder byPaymentMethodId(@jakarta.annotation.Nonnull final String paymentMethodId) {
        Objects.requireNonNull(paymentMethodId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("paymentMethodId", paymentMethodId);
        return new WithPaymentMethodItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PaymentMethodsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/payment-methods", pathParameters);
    }
    /**
     * Instantiates a new {@link PaymentMethodsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/payment-methods", rawUrl);
    }
    /**
     * Returns the organization&apos;s payment methods.
     * @return a {@link ListPaymentMethodsResponse}
     */
    @jakarta.annotation.Nullable
    public ListPaymentMethodsResponse get() {
        return get(null);
    }
    /**
     * Returns the organization&apos;s payment methods.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListPaymentMethodsResponse}
     */
    @jakarta.annotation.Nullable
    public ListPaymentMethodsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListPaymentMethodsResponse::createFromDiscriminatorValue);
    }
    /**
     * Attach a payment method to the organization
     * @param body Payment method request
     * @return a {@link PaymentMethodDetails}
     */
    @jakarta.annotation.Nullable
    public PaymentMethodDetails post(@jakarta.annotation.Nonnull final UpsertPaymentMethodBody body) {
        return post(body, null);
    }
    /**
     * Attach a payment method to the organization
     * @param body Payment method request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PaymentMethodDetails}
     */
    @jakarta.annotation.Nullable
    public PaymentMethodDetails post(@jakarta.annotation.Nonnull final UpsertPaymentMethodBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PaymentMethodDetails::createFromDiscriminatorValue);
    }
    /**
     * Returns the organization&apos;s payment methods.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the organization&apos;s payment methods.
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
     * Attach a payment method to the organization
     * @param body Payment method request
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpsertPaymentMethodBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Attach a payment method to the organization
     * @param body Payment method request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpsertPaymentMethodBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PaymentMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PaymentMethodsRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
