package com.rixl.sdk.auth.v1.email;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.email.verify.VerifyRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/email
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailRequestBuilder extends BaseRequestBuilder {
    /**
     * The verify property
     * @return a {@link VerifyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifyRequestBuilder verify() {
        return new VerifyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link EmailRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/email", pathParameters);
    }
    /**
     * Instantiates a new {@link EmailRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/email", rawUrl);
    }
}
