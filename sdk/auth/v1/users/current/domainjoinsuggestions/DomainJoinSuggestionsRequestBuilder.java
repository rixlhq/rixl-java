package com.rixl.sdk.auth.v1.users.current.domainjoinsuggestions;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.users.current.domainjoinsuggestions.join.JoinRequestBuilder;
import com.rixl.sdk.models.auth.v1.ListDomainJoinSuggestionsResponse;
import com.rixl.sdk.models.Error;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/users/current/domain-join-suggestions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainJoinSuggestionsRequestBuilder extends BaseRequestBuilder {
    /**
     * The join property
     * @return a {@link JoinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public JoinRequestBuilder join() {
        return new JoinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DomainJoinSuggestionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainJoinSuggestionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/domain-join-suggestions{?page_size*,page_token*}", pathParameters);
    }
    /**
     * Instantiates a new {@link DomainJoinSuggestionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainJoinSuggestionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/domain-join-suggestions{?page_size*,page_token*}", rawUrl);
    }
    /**
     * ListDomainJoinSuggestions
     * @return a {@link ListDomainJoinSuggestionsResponse}
     * @throws Error When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ListDomainJoinSuggestionsResponse get() {
        return get(null);
    }
    /**
     * ListDomainJoinSuggestions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListDomainJoinSuggestionsResponse}
     * @throws Error When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ListDomainJoinSuggestionsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ListDomainJoinSuggestionsResponse::createFromDiscriminatorValue);
    }
    /**
     * ListDomainJoinSuggestions
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListDomainJoinSuggestions
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
     * @return a {@link DomainJoinSuggestionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainJoinSuggestionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DomainJoinSuggestionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListDomainJoinSuggestions
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Integer pageSize;
        @jakarta.annotation.Nullable
        public String pageToken;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("page_size", pageSize);
            allQueryParams.put("page_token", pageToken);
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
