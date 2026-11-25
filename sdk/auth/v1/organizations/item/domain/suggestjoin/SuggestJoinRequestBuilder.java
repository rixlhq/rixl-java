package com.rixl.sdk.auth.v1.organizations.item.domain.suggestjoin;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.auth.v1.SuggestJoinSetting;
import com.rixl.sdk.models.google.rpc.Status;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/organizations/{org_id}/domain/suggest-join
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuggestJoinRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SuggestJoinRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuggestJoinRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/organizations/{org_id}/domain/suggest-join{?user_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link SuggestJoinRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuggestJoinRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/organizations/{org_id}/domain/suggest-join{?user_id*}", rawUrl);
    }
    /**
     * GetDomainSuggestJoin
     * @return a {@link SuggestJoinSetting}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SuggestJoinSetting get() {
        return get(null);
    }
    /**
     * GetDomainSuggestJoin
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SuggestJoinSetting}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SuggestJoinSetting get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", Status::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SuggestJoinSetting::createFromDiscriminatorValue);
    }
    /**
     * SetDomainSuggestJoin
     * @param body The request body
     * @return a {@link SuggestJoinSetting}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SuggestJoinSetting put(@jakarta.annotation.Nonnull final SuggestJoinPutRequestBody body) {
        return put(body, null);
    }
    /**
     * SetDomainSuggestJoin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SuggestJoinSetting}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SuggestJoinSetting put(@jakarta.annotation.Nonnull final SuggestJoinPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", Status::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SuggestJoinSetting::createFromDiscriminatorValue);
    }
    /**
     * GetDomainSuggestJoin
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * GetDomainSuggestJoin
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
     * SetDomainSuggestJoin
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final SuggestJoinPutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * SetDomainSuggestJoin
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final SuggestJoinPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SuggestJoinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestJoinRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SuggestJoinRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * GetDomainSuggestJoin
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String userId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("user_id", userId);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
