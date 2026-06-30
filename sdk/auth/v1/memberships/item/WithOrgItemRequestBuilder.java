package com.rixl.sdk.auth.v1.memberships.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.memberships.item.active.ActiveRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.check.CheckRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.domain.DomainRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.info.InfoRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.leave.LeaveRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.members.MembersRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.membership.MembershipRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.name.NameRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.policies.PoliciesRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.username.UsernameRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{orgId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOrgItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The active property
     * @return a {@link ActiveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActiveRequestBuilder active() {
        return new ActiveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The check property
     * @return a {@link CheckRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckRequestBuilder check() {
        return new CheckRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The domain property
     * @return a {@link DomainRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainRequestBuilder domain() {
        return new DomainRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The info property
     * @return a {@link InfoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InfoRequestBuilder info() {
        return new InfoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The leave property
     * @return a {@link LeaveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeaveRequestBuilder leave() {
        return new LeaveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The members property
     * @return a {@link MembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The membership property
     * @return a {@link MembershipRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembershipRequestBuilder membership() {
        return new MembershipRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The name property
     * @return a {@link NameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NameRequestBuilder name() {
        return new NameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The policies property
     * @return a {@link PoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PoliciesRequestBuilder policies() {
        return new PoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The username property
     * @return a {@link UsernameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsernameRequestBuilder username() {
        return new UsernameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithOrgItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrgItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithOrgItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrgItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}", rawUrl);
    }
}
