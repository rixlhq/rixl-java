package com.rixl.sdk.auth.v1.invitations;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.invitations.accept.AcceptRequestBuilder;
import com.rixl.sdk.auth.v1.invitations.decline.DeclineRequestBuilder;
import com.rixl.sdk.auth.v1.invitations.lookup.LookupRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/invitations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitationsRequestBuilder extends BaseRequestBuilder {
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
     * The lookup property
     * @return a {@link LookupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LookupRequestBuilder lookup() {
        return new LookupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link InvitationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/invitations", pathParameters);
    }
    /**
     * Instantiates a new {@link InvitationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/invitations", rawUrl);
    }
}
