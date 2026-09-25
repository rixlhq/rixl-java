package com.rixl.sdk.billing.v1.plans;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.billing.v1.plans.item.WithPlanItemRequestBuilder;
import com.rixl.sdk.models.billing.v1.ListPlansResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/plans
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlansRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.billing.v1.plans.item collection
     * @param plan_id string.prefix = &quot;price_&quot;
     * @return a {@link WithPlanItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPlanItemRequestBuilder byPlan_id(@jakarta.annotation.Nonnull final String plan_id) {
        Objects.requireNonNull(plan_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("plan_id", plan_id);
        return new WithPlanItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PlansRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlansRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/plans{?currency*,free*,interval*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PlansRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlansRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/plans{?currency*,free*,interval*}", rawUrl);
    }
    /**
     * ListPlans
     * @return a {@link ListPlansResponse}
     */
    @jakarta.annotation.Nullable
    public ListPlansResponse get() {
        return get(null);
    }
    /**
     * ListPlans
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListPlansResponse}
     */
    @jakarta.annotation.Nullable
    public ListPlansResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListPlansResponse::createFromDiscriminatorValue);
    }
    /**
     * ListPlans
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListPlans
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PlansRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlansRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PlansRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListPlans
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String currency;
        @jakarta.annotation.Nullable
        public String free;
        @jakarta.annotation.Nullable
        public String interval;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("currency", currency);
            allQueryParams.put("free", free);
            allQueryParams.put("interval", interval);
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
}
