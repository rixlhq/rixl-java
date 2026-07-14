package com.rixl.sdk.billing.v1.tax;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.billing.v1.tax.calculate.CalculateRequestBuilder;
import com.rixl.sdk.billing.v1.tax.calculategeneric.CalculateGenericRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/tax
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaxRequestBuilder extends BaseRequestBuilder {
    /**
     * The calculate property
     * @return a {@link CalculateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalculateRequestBuilder calculate() {
        return new CalculateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The calculateGeneric property
     * @return a {@link CalculateGenericRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalculateGenericRequestBuilder calculateGeneric() {
        return new CalculateGenericRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TaxRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaxRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/tax", pathParameters);
    }
    /**
     * Instantiates a new {@link TaxRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaxRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/tax", rawUrl);
    }
}
