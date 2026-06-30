package com.rixl.sdk.auth.v1.users.current.passkeys.register;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.users.current.passkeys.register.begin.BeginRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.passkeys.register.finish.FinishRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/users/current/passkeys/register
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegisterRequestBuilder extends BaseRequestBuilder {
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
     * Instantiates a new {@link RegisterRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RegisterRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/passkeys/register", pathParameters);
    }
    /**
     * Instantiates a new {@link RegisterRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RegisterRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/passkeys/register", rawUrl);
    }
}
