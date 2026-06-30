package com.rixl.sdk.platform.clientauth;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.platform.clientauth.credentials.CredentialsRequestBuilder;
import com.rixl.sdk.platform.clientauth.token.TokenRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /platform/clientauth
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClientauthRequestBuilder extends BaseRequestBuilder {
    /**
     * The credentials property
     * @return a {@link CredentialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CredentialsRequestBuilder credentials() {
        return new CredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The token property
     * @return a {@link TokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokenRequestBuilder token() {
        return new TokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ClientauthRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClientauthRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/clientauth", pathParameters);
    }
    /**
     * Instantiates a new {@link ClientauthRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClientauthRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/clientauth", rawUrl);
    }
}
