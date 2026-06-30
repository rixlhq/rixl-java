package com.rixl.sdk.auth.v1.memberships;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.memberships.active.ActiveRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.WithOrgItemRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.pending.PendingRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembershipsRequestBuilder extends BaseRequestBuilder {
    /**
     * The active property
     * @return a {@link ActiveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActiveRequestBuilder active() {
        return new ActiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The pending property
     * @return a {@link PendingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PendingRequestBuilder pending() {
        return new PendingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.memberships.item collection
     * @param orgId Membership/organization ID
     * @return a {@link WithOrgItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithOrgItemRequestBuilder byOrgId(@jakarta.annotation.Nonnull final String orgId) {
        Objects.requireNonNull(orgId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("orgId", orgId);
        return new WithOrgItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MembershipsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembershipsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships", pathParameters);
    }
    /**
     * Instantiates a new {@link MembershipsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembershipsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships", rawUrl);
    }
}
