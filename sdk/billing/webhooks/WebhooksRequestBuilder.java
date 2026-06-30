package com.rixl.sdk.billing.webhooks;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.billing.webhooks.stripe.StripeRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/webhooks
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebhooksRequestBuilder extends BaseRequestBuilder {
    /**
     * The stripe property
     * @return a {@link StripeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StripeRequestBuilder stripe() {
        return new StripeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WebhooksRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WebhooksRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/webhooks", pathParameters);
    }
    /**
     * Instantiates a new {@link WebhooksRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WebhooksRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/webhooks", rawUrl);
    }
}
