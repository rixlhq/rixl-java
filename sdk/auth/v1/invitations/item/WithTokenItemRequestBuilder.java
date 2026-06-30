package com.rixl.sdk.auth.v1.invitations.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.invitations.item.accept.AcceptRequestBuilder;
import com.rixl.sdk.auth.v1.invitations.item.decline.DeclineRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/invitations/{token}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithTokenItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The accept property
     * @return a {@link AcceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptRequestBuilder accept() {
        return new AcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The decline property
     * @return a {@link DeclineRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeclineRequestBuilder decline() {
        return new DeclineRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithTokenItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTokenItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/invitations/{token}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithTokenItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithTokenItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/invitations/{token}", rawUrl);
    }
}
