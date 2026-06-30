package com.rixl.sdk.auth.v1.passkey.login;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.passkey.login.begin.BeginRequestBuilder;
import com.rixl.sdk.auth.v1.passkey.login.finish.FinishRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/passkey/login
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoginRequestBuilder extends BaseRequestBuilder {
    /**
     * The begin property
     * @return a {@link BeginRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BeginRequestBuilder begin() {
        return new BeginRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The finish property
     * @return a {@link FinishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FinishRequestBuilder finish() {
        return new FinishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link LoginRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LoginRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/passkey/login", pathParameters);
    }
    /**
     * Instantiates a new {@link LoginRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LoginRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/passkey/login", rawUrl);
    }
}
