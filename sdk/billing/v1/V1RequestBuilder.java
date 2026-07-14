package com.rixl.sdk.billing.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.billing.v1.address.AddressRequestBuilder;
import com.rixl.sdk.billing.v1.bandwidthusage.BandwidthUsageRequestBuilder;
import com.rixl.sdk.billing.v1.checkout.CheckoutRequestBuilder;
import com.rixl.sdk.billing.v1.contactsales.ContactSalesRequestBuilder;
import com.rixl.sdk.billing.v1.invoices.InvoicesRequestBuilder;
import com.rixl.sdk.billing.v1.paymentmethods.PaymentMethodsRequestBuilder;
import com.rixl.sdk.billing.v1.plans.PlansRequestBuilder;
import com.rixl.sdk.billing.v1.setupintent.SetupIntentRequestBuilder;
import com.rixl.sdk.billing.v1.storageusage.StorageUsageRequestBuilder;
import com.rixl.sdk.billing.v1.subscription.SubscriptionRequestBuilder;
import com.rixl.sdk.billing.v1.tax.TaxRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The address property
     * @return a {@link AddressRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddressRequestBuilder address() {
        return new AddressRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bandwidthUsage property
     * @return a {@link BandwidthUsageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BandwidthUsageRequestBuilder bandwidthUsage() {
        return new BandwidthUsageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The checkout property
     * @return a {@link CheckoutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckoutRequestBuilder checkout() {
        return new CheckoutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The contactSales property
     * @return a {@link ContactSalesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContactSalesRequestBuilder contactSales() {
        return new ContactSalesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The invoices property
     * @return a {@link InvoicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvoicesRequestBuilder invoices() {
        return new InvoicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The paymentMethods property
     * @return a {@link PaymentMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodsRequestBuilder paymentMethods() {
        return new PaymentMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The plans property
     * @return a {@link PlansRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlansRequestBuilder plans() {
        return new PlansRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The setupIntent property
     * @return a {@link SetupIntentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetupIntentRequestBuilder setupIntent() {
        return new SetupIntentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The storageUsage property
     * @return a {@link StorageUsageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StorageUsageRequestBuilder storageUsage() {
        return new StorageUsageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The subscription property
     * @return a {@link SubscriptionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionRequestBuilder subscription() {
        return new SubscriptionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tax property
     * @return a {@link TaxRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaxRequestBuilder tax() {
        return new TaxRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1", rawUrl);
    }
}
