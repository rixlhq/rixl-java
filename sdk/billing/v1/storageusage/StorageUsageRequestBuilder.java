package com.rixl.sdk.billing.v1.storageusage;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.billing.v1.storageusage.history.HistoryRequestBuilder;
import com.rixl.sdk.billing.v1.storageusage.refresh.RefreshRequestBuilder;
import com.rixl.sdk.models.billingv1.StorageUsage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/storage-usage
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StorageUsageRequestBuilder extends BaseRequestBuilder {
    /**
     * The history property
     * @return a {@link HistoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HistoryRequestBuilder history() {
        return new HistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The refresh property
     * @return a {@link RefreshRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RefreshRequestBuilder refresh() {
        return new RefreshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link StorageUsageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StorageUsageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/storage-usage", pathParameters);
    }
    /**
     * Instantiates a new {@link StorageUsageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StorageUsageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/storage-usage", rawUrl);
    }
    /**
     * Returns the organization&apos;s storage usage.
     * @return a {@link StorageUsage}
     */
    @jakarta.annotation.Nullable
    public StorageUsage get() {
        return get(null);
    }
    /**
     * Returns the organization&apos;s storage usage.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StorageUsage}
     */
    @jakarta.annotation.Nullable
    public StorageUsage get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, StorageUsage::createFromDiscriminatorValue);
    }
    /**
     * Returns the organization&apos;s storage usage.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the organization&apos;s storage usage.
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
     * @return a {@link StorageUsageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StorageUsageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StorageUsageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
