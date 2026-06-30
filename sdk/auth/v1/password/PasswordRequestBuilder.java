package com.rixl.sdk.auth.v1.password;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.password.reset.ResetRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/password
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasswordRequestBuilder extends BaseRequestBuilder {
    /**
     * The reset property
     * @return a {@link ResetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetRequestBuilder reset() {
        return new ResetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PasswordRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasswordRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/password", pathParameters);
    }
    /**
     * Instantiates a new {@link PasswordRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PasswordRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/password", rawUrl);
    }
}
