package com.rixl.sdk.auth.v1.passkey;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.passkey.login.LoginRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/passkey
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasskeyRequestBuilder extends BaseRequestBuilder {
    /**
     * The login property
     * @return a {@link LoginRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LoginRequestBuilder login() {
        return new LoginRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PasskeyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasskeyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/passkey", pathParameters);
    }
    /**
     * Instantiates a new {@link PasskeyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasskeyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/passkey", rawUrl);
    }
}
