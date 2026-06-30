package com.rixl.sdk.platform.clientauth.credentials;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.clientauthv1.CreateClientCredentialResponse;
import com.rixl.sdk.models.clientauthv1.ListClientCredentialsResponse;
import com.rixl.sdk.models.types.CreateClientCredentialRequest;
import com.rixl.sdk.platform.clientauth.credentials.item.WithCredentialItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /platform/clientauth/credentials
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CredentialsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.platform.clientauth.credentials.item collection
     * @param credentialId Client credential ID
     * @return a {@link WithCredentialItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCredentialItemRequestBuilder byCredentialId(@jakarta.annotation.Nonnull final String credentialId) {
        Objects.requireNonNull(credentialId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("credentialId", credentialId);
        return new WithCredentialItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CredentialsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CredentialsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/clientauth/credentials{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link CredentialsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CredentialsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/clientauth/credentials{?limit*,offset*}", rawUrl);
    }
    /**
     * List client credentials for the specified organization
     * @return a {@link ListClientCredentialsResponse}
     */
    @jakarta.annotation.Nullable
    public ListClientCredentialsResponse get() {
        return get(null);
    }
    /**
     * List client credentials for the specified organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListClientCredentialsResponse}
     */
    @jakarta.annotation.Nullable
    public ListClientCredentialsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListClientCredentialsResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new client credential for the authenticated organization
     * @param body Client credential creation request
     * @return a {@link CreateClientCredentialResponse}
     */
    @jakarta.annotation.Nullable
    public CreateClientCredentialResponse post(@jakarta.annotation.Nonnull final CreateClientCredentialRequest body) {
        return post(body, null);
    }
    /**
     * Create a new client credential for the authenticated organization
     * @param body Client credential creation request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateClientCredentialResponse}
     */
    @jakarta.annotation.Nullable
    public CreateClientCredentialResponse post(@jakarta.annotation.Nonnull final CreateClientCredentialRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateClientCredentialResponse::createFromDiscriminatorValue);
    }
    /**
     * List client credentials for the specified organization
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List client credentials for the specified organization
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
     * Create a new client credential for the authenticated organization
     * @param body Client credential creation request
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateClientCredentialRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new client credential for the authenticated organization
     * @param body Client credential creation request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateClientCredentialRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CredentialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CredentialsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CredentialsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List client credentials for the specified organization
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
