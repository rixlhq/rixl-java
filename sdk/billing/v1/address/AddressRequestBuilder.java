package com.rixl.sdk.billing.v1.address;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.billingv1.BillingAddress;
import com.rixl.sdk.models.gateway.BillingAddressBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/address
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddressRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AddressRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddressRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/address", pathParameters);
    }
    /**
     * Instantiates a new {@link AddressRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddressRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/address", rawUrl);
    }
    /**
     * Returns the organization&apos;s billing address
     * @return a {@link BillingAddress}
     */
    @jakarta.annotation.Nullable
    public BillingAddress get() {
        return get(null);
    }
    /**
     * Returns the organization&apos;s billing address
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BillingAddress}
     */
    @jakarta.annotation.Nullable
    public BillingAddress get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingAddress::createFromDiscriminatorValue);
    }
    /**
     * Create or update the organization&apos;s billing address
     * @param body Billing address
     * @return a {@link BillingAddress}
     */
    @jakarta.annotation.Nullable
    public BillingAddress post(@jakarta.annotation.Nonnull final BillingAddressBody body) {
        return post(body, null);
    }
    /**
     * Create or update the organization&apos;s billing address
     * @param body Billing address
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BillingAddress}
     */
    @jakarta.annotation.Nullable
    public BillingAddress post(@jakarta.annotation.Nonnull final BillingAddressBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BillingAddress::createFromDiscriminatorValue);
    }
    /**
     * Returns the organization&apos;s billing address
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the organization&apos;s billing address
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
     * Create or update the organization&apos;s billing address
     * @param body Billing address
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BillingAddressBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create or update the organization&apos;s billing address
     * @param body Billing address
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BillingAddressBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AddressRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddressRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AddressRequestBuilder(rawUrl, requestAdapter);
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
