package com.rixl.sdk.auth.v1.memberships.item.membership;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.memberships.item.membership.state.StateRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{orgId}/membership
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembershipRequestBuilder extends BaseRequestBuilder {
    /**
     * The state property
     * @return a {@link StateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StateRequestBuilder state() {
        return new StateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MembershipRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembershipRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/membership", pathParameters);
    }
    /**
     * Instantiates a new {@link MembershipRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembershipRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/membership", rawUrl);
    }
}
