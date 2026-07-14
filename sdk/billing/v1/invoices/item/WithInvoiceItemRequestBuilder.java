package com.rixl.sdk.billing.v1.invoices.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.billing.v1.invoices.item.status.StatusRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/invoices/{invoice_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithInvoiceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The status property
     * @return a {@link StatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatusRequestBuilder status() {
        return new StatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithInvoiceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInvoiceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/invoices/{invoice_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithInvoiceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInvoiceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/invoices/{invoice_id}", rawUrl);
    }
}
