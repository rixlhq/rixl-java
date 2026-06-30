package com.rixl.sdk.billing;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.billing.v1.V1RequestBuilder;
import com.rixl.sdk.billing.webhooks.WebhooksRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingRequestBuilder extends BaseRequestBuilder {
    /**
     * The v1 property
     * @return a {@link V1RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public V1RequestBuilder v1() {
        return new V1RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The webhooks property
     * @return a {@link WebhooksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WebhooksRequestBuilder webhooks() {
        return new WebhooksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BillingRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BillingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing", pathParameters);
    }
    /**
     * Instantiates a new {@link BillingRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BillingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing", rawUrl);
    }
}
