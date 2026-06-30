package com.rixl.sdk.auth.v1.providers;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.providers.connect.ConnectRequestBuilder;
import com.rixl.sdk.auth.v1.providers.item.WithProviderItemRequestBuilder;
import com.rixl.sdk.models.authv1.ListProvidersResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/providers
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvidersRequestBuilder extends BaseRequestBuilder {
    /**
     * The connect property
     * @return a {@link ConnectRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConnectRequestBuilder connect() {
        return new ConnectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.providers.item collection
     * @param provider Provider name
     * @return a {@link WithProviderItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithProviderItemRequestBuilder byProvider(@jakarta.annotation.Nonnull final String provider) {
        Objects.requireNonNull(provider);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("provider", provider);
        return new WithProviderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ProvidersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvidersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/providers", pathParameters);
    }
    /**
     * Instantiates a new {@link ProvidersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvidersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/providers", rawUrl);
    }
    /**
     * Returns the list of social providers connected to the authenticated user&apos;s account.
     * @return a {@link ListProvidersResponse}
     */
    @jakarta.annotation.Nullable
    public ListProvidersResponse get() {
        return get(null);
    }
    /**
     * Returns the list of social providers connected to the authenticated user&apos;s account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListProvidersResponse}
     */
    @jakarta.annotation.Nullable
    public ListProvidersResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListProvidersResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns the list of social providers connected to the authenticated user&apos;s account.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the list of social providers connected to the authenticated user&apos;s account.
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
     * @return a {@link ProvidersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvidersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProvidersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
