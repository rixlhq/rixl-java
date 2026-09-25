package com.rixl.sdk.organizations.item.apikeys.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.apikeys.v1.CreateApiKeyResponse;
import com.rixl.sdk.models.apikeys.v1.ListApiKeysResponse;
import com.rixl.sdk.organizations.item.apikeys.v1.item.WithKeyItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations/{org_id}/api-keys/v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.organizations.item.apiKeys.v1.item collection
     * @param key_id Unique identifier of the item
     * @return a {@link WithKeyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithKeyItemRequestBuilder byKey_id(@jakarta.annotation.Nonnull final String key_id) {
        Objects.requireNonNull(key_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("key_id", key_id);
        return new WithKeyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{org_id}/api-keys/v1{?pagination%2Elimit*,pagination%2Eoffset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{org_id}/api-keys/v1{?pagination%2Elimit*,pagination%2Eoffset*}", rawUrl);
    }
    /**
     * ListApiKeys
     * @return a {@link ListApiKeysResponse}
     */
    @jakarta.annotation.Nullable
    public ListApiKeysResponse get() {
        return get(null);
    }
    /**
     * ListApiKeys
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListApiKeysResponse}
     */
    @jakarta.annotation.Nullable
    public ListApiKeysResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListApiKeysResponse::createFromDiscriminatorValue);
    }
    /**
     * CreateApiKey
     * @param body The request body
     * @return a {@link CreateApiKeyResponse}
     */
    @jakarta.annotation.Nullable
    public CreateApiKeyResponse post(@jakarta.annotation.Nonnull final V1PostRequestBody body) {
        return post(body, null);
    }
    /**
     * CreateApiKey
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateApiKeyResponse}
     */
    @jakarta.annotation.Nullable
    public CreateApiKeyResponse post(@jakarta.annotation.Nonnull final V1PostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateApiKeyResponse::createFromDiscriminatorValue);
    }
    /**
     * ListApiKeys
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListApiKeys
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
     * CreateApiKey
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final V1PostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * CreateApiKey
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final V1PostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link V1RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public V1RequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new V1RequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListApiKeys
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Maximum number of items to return.
         */
        @jakarta.annotation.Nullable
        public Integer paginationLimit;
        /**
         * Number of items to skip before collecting the result set.
         */
        @jakarta.annotation.Nullable
        public Integer paginationOffset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("pagination%2Elimit", paginationLimit);
            allQueryParams.put("pagination%2Eoffset", paginationOffset);
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
