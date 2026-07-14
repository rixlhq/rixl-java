package com.rixl.sdk.auth.v1.users.current;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.users.current.emails.EmailsRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.name.NameRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.passkeys.PasskeysRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.totp.TotpRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.username.UsernameRequestBuilder;
import com.rixl.sdk.models.auth.v1.GetUserResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/users/current
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CurrentRequestBuilder extends BaseRequestBuilder {
    /**
     * The emails property
     * @return a {@link EmailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailsRequestBuilder emails() {
        return new EmailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The name property
     * @return a {@link NameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NameRequestBuilder name() {
        return new NameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The passkeys property
     * @return a {@link PasskeysRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PasskeysRequestBuilder passkeys() {
        return new PasskeysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The totp property
     * @return a {@link TotpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TotpRequestBuilder totp() {
        return new TotpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The username property
     * @return a {@link UsernameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsernameRequestBuilder username() {
        return new UsernameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CurrentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CurrentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current{?userId*}", pathParameters);
    }
    /**
     * Instantiates a new {@link CurrentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CurrentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current{?userId*}", rawUrl);
    }
    /**
     * GetUser
     * @return a {@link GetUserResponse}
     */
    @jakarta.annotation.Nullable
    public GetUserResponse get() {
        return get(null);
    }
    /**
     * GetUser
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetUserResponse}
     */
    @jakarta.annotation.Nullable
    public GetUserResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetUserResponse::createFromDiscriminatorValue);
    }
    /**
     * GetUser
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * GetUser
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
     * @return a {@link CurrentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CurrentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CurrentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * GetUser
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
            allQueryParams.put("userId", userId);
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
