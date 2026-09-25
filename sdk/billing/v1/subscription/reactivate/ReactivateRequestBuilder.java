package com.rixl.sdk.billing.v1.subscription.reactivate;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.google.protobuf.Empty;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/subscription/reactivate
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReactivateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ReactivateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReactivateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/subscription/reactivate{?org_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ReactivateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReactivateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/subscription/reactivate{?org_id*}", rawUrl);
    }
    /**
     * ReactivateSubscription
     * @return a {@link Empty}
     */
    @jakarta.annotation.Nullable
    public Empty post() {
        return post(null);
    }
    /**
     * ReactivateSubscription
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Empty}
     */
    @jakarta.annotation.Nullable
    public Empty post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Empty::createFromDiscriminatorValue);
    }
    /**
     * ReactivateSubscription
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * ReactivateSubscription
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReactivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReactivateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReactivateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ReactivateSubscription
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String orgId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("org_id", orgId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PostQueryParameters queryParameters = new PostQueryParameters();
    }
}
