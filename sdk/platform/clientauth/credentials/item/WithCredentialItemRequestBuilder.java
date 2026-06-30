package com.rixl.sdk.platform.clientauth.credentials.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.platform.clientauth.credentials.item.revoke.RevokeRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /platform/clientauth/credentials/{credentialId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCredentialItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The revoke property
     * @return a {@link RevokeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RevokeRequestBuilder revoke() {
        return new RevokeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCredentialItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCredentialItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/clientauth/credentials/{credentialId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCredentialItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCredentialItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform/clientauth/credentials/{credentialId}", rawUrl);
    }
}
