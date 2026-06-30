package com.rixl.sdk.platform.apikeys;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.apikeysv1.CreateApiKeyResponse;
import com.rixl.sdk.models.apikeysv1.ListApiKeysResponse;
import com.rixl.sdk.models.types.CreateAPIKeyRequest;
import com.rixl.sdk.platform.apikeys.item.WithKeyItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /platform/api-keys
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiKeysRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.platform.apiKeys.item collection
     * @param keyId API key ID
     * @return a {@link WithKeyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithKeyItemRequestBuilder byKeyId(@jakarta.annotation.Nonnull final String keyId) {
        Objects.requireNonNull(keyId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("keyId", keyId);
        return new WithKeyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ApiKeysRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiKeysRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/api-keys{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ApiKeysRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiKeysRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/api-keys{?limit*,offset*}", rawUrl);
    }
    /**
     * Get all API keys for a specific organization
     * @return a {@link ListApiKeysResponse}
     */
    @jakarta.annotation.Nullable
    public ListApiKeysResponse get() {
        return get(null);
    }
    /**
     * Get all API keys for a specific organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListApiKeysResponse}
     */
    @jakarta.annotation.Nullable
    public ListApiKeysResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListApiKeysResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new API key for a project in the authenticated organization
     * @param body API key creation request
     * @return a {@link CreateApiKeyResponse}
     */
    @jakarta.annotation.Nullable
    public CreateApiKeyResponse post(@jakarta.annotation.Nonnull final CreateAPIKeyRequest body) {
        return post(body, null);
    }
    /**
     * Create a new API key for a project in the authenticated organization
     * @param body API key creation request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateApiKeyResponse}
     */
    @jakarta.annotation.Nullable
    public CreateApiKeyResponse post(@jakarta.annotation.Nonnull final CreateAPIKeyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateApiKeyResponse::createFromDiscriminatorValue);
    }
    /**
     * Get all API keys for a specific organization
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get all API keys for a specific organization
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
     * Create a new API key for a project in the authenticated organization
     * @param body API key creation request
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAPIKeyRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new API key for a project in the authenticated organization
     * @param body API key creation request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAPIKeyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ApiKeysRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApiKeysRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ApiKeysRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get all API keys for a specific organization
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Pagination limit
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Pagination offset
         */
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
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
