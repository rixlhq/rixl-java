package com.rixl.sdk.billing.v1.subscription;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.billing.v1.subscription.cancel.CancelRequestBuilder;
import com.rixl.sdk.billing.v1.subscription.history.HistoryRequestBuilder;
import com.rixl.sdk.billing.v1.subscription.reactivate.ReactivateRequestBuilder;
import com.rixl.sdk.billing.v1.subscription.upgrade.UpgradeRequestBuilder;
import com.rixl.sdk.models.billing.v1.CreateSubscriptionRequest;
import com.rixl.sdk.models.billing.v1.CreateSubscriptionResponse;
import com.rixl.sdk.models.billing.v1.Subscription;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/subscription
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscriptionRequestBuilder extends BaseRequestBuilder {
    /**
     * The cancel property
     * @return a {@link CancelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The history property
     * @return a {@link HistoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HistoryRequestBuilder history() {
        return new HistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The reactivate property
     * @return a {@link ReactivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReactivateRequestBuilder reactivate() {
        return new ReactivateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The upgrade property
     * @return a {@link UpgradeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpgradeRequestBuilder upgrade() {
        return new UpgradeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SubscriptionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubscriptionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/subscription{?orgId*}", pathParameters);
    }
    /**
     * Instantiates a new {@link SubscriptionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubscriptionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/subscription{?orgId*}", rawUrl);
    }
    /**
     * GetSubscription
     * @return a {@link Subscription}
     */
    @jakarta.annotation.Nullable
    public Subscription get() {
        return get(null);
    }
    /**
     * GetSubscription
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Subscription}
     */
    @jakarta.annotation.Nullable
    public Subscription get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Subscription::createFromDiscriminatorValue);
    }
    /**
     * CreateSubscription
     * @param body The request body
     * @return a {@link CreateSubscriptionResponse}
     */
    @jakarta.annotation.Nullable
    public CreateSubscriptionResponse post(@jakarta.annotation.Nonnull final CreateSubscriptionRequest body) {
        return post(body, null);
    }
    /**
     * CreateSubscription
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateSubscriptionResponse}
     */
    @jakarta.annotation.Nullable
    public CreateSubscriptionResponse post(@jakarta.annotation.Nonnull final CreateSubscriptionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateSubscriptionResponse::createFromDiscriminatorValue);
    }
    /**
     * GetSubscription
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * GetSubscription
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * CreateSubscription
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateSubscriptionRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * CreateSubscription
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateSubscriptionRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SubscriptionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubscriptionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * GetSubscription
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String orgId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("orgId", orgId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
