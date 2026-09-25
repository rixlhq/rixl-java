package com.rixl.sdk.analytics.v1.dashboard;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.analytics.v1.dashboard.chartquery.ChartQueryRequestBuilder;
import com.rixl.sdk.analytics.v1.dashboard.datasets.DatasetsRequestBuilder;
import com.rixl.sdk.analytics.v1.dashboard.filteroptions.FilterOptionsRequestBuilder;
import com.rixl.sdk.analytics.v1.dashboard.scopetree.ScopeTreeRequestBuilder;
import com.rixl.sdk.models.analytics.v1.DashboardStatsResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/dashboard
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DashboardRequestBuilder extends BaseRequestBuilder {
    /**
     * The chartQuery property
     * @return a {@link ChartQueryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChartQueryRequestBuilder chartQuery() {
        return new ChartQueryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The datasets property
     * @return a {@link DatasetsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DatasetsRequestBuilder datasets() {
        return new DatasetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The filterOptions property
     * @return a {@link FilterOptionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilterOptionsRequestBuilder filterOptions() {
        return new FilterOptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The scopeTree property
     * @return a {@link ScopeTreeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScopeTreeRequestBuilder scopeTree() {
        return new ScopeTreeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DashboardRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DashboardRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/dashboard?time_end={time_end}&time_start={time_start}{&filter%2Ebrowsers*,filter%2Ecities*,filter%2Ecountries*,filter%2Edevices*,filter%2Elanguages*,filter%2Eos*,filter%2Eos_versions*,filter%2Eregions*,interval*}", pathParameters);
    }
    /**
     * Instantiates a new {@link DashboardRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DashboardRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/dashboard?time_end={time_end}&time_start={time_start}{&filter%2Ebrowsers*,filter%2Ecities*,filter%2Ecountries*,filter%2Edevices*,filter%2Elanguages*,filter%2Eos*,filter%2Eos_versions*,filter%2Eregions*,interval*}", rawUrl);
    }
    /**
     * GetDashboardStats
     * @return a {@link DashboardStatsResponse}
     */
    @jakarta.annotation.Nullable
    public DashboardStatsResponse get() {
        return get(null);
    }
    /**
     * GetDashboardStats
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DashboardStatsResponse}
     */
    @jakarta.annotation.Nullable
    public DashboardStatsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DashboardStatsResponse::createFromDiscriminatorValue);
    }
    /**
     * GetDashboardStats
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * GetDashboardStats
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
     * @return a {@link DashboardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DashboardRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DashboardRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * GetDashboardStats
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String[] filterBrowsers;
        @jakarta.annotation.Nullable
        public String[] filterCities;
        @jakarta.annotation.Nullable
        public String[] filterCountries;
        @jakarta.annotation.Nullable
        public String[] filterDevices;
        @jakarta.annotation.Nullable
        public String[] filterLanguages;
        @jakarta.annotation.Nullable
        public String[] filterOs;
        @jakarta.annotation.Nullable
        public String[] filterOsVersions;
        @jakarta.annotation.Nullable
        public String[] filterRegions;
        @jakarta.annotation.Nullable
        public String interval;
        @jakarta.annotation.Nullable
        public String timeEnd;
        @jakarta.annotation.Nullable
        public String timeStart;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("interval", interval);
            allQueryParams.put("time_end", timeEnd);
            allQueryParams.put("time_start", timeStart);
            allQueryParams.put("filter%2Ebrowsers", filterBrowsers);
            allQueryParams.put("filter%2Ecities", filterCities);
            allQueryParams.put("filter%2Ecountries", filterCountries);
            allQueryParams.put("filter%2Edevices", filterDevices);
            allQueryParams.put("filter%2Elanguages", filterLanguages);
            allQueryParams.put("filter%2Eos", filterOs);
            allQueryParams.put("filter%2Eos_versions", filterOsVersions);
            allQueryParams.put("filter%2Eregions", filterRegions);
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
