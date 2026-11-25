package com.rixl.sdk.auth.v1.organizations.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.organizations.item.auditevents.AuditEventsRequestBuilder;
import com.rixl.sdk.auth.v1.organizations.item.avatar.AvatarRequestBuilder;
import com.rixl.sdk.auth.v1.organizations.item.converttoteam.ConvertToTeamRequestBuilder;
import com.rixl.sdk.auth.v1.organizations.item.domain.DomainRequestBuilder;
import com.rixl.sdk.auth.v1.organizations.item.invitations.InvitationsRequestBuilder;
import com.rixl.sdk.auth.v1.organizations.item.members.MembersRequestBuilder;
import com.rixl.sdk.auth.v1.organizations.item.policies.PoliciesRequestBuilder;
import com.rixl.sdk.auth.v1.organizations.item.transferownership.TransferOwnershipRequestBuilder;
import com.rixl.sdk.models.auth.v1.Organization;
import com.rixl.sdk.models.google.rpc.Status;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/organizations/{org_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOrgItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The auditEvents property
     * @return a {@link AuditEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuditEventsRequestBuilder auditEvents() {
        return new AuditEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The avatar property
     * @return a {@link AvatarRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AvatarRequestBuilder avatar() {
        return new AvatarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The convertToTeam property
     * @return a {@link ConvertToTeamRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConvertToTeamRequestBuilder convertToTeam() {
        return new ConvertToTeamRequestBuilder(pathParameters, requestAdapter);
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
     * The invitations property
     * @return a {@link InvitationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
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
     * The policies property
     * @return a {@link PoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PoliciesRequestBuilder policies() {
        return new PoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The transferOwnership property
     * @return a {@link TransferOwnershipRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransferOwnershipRequestBuilder transferOwnership() {
        return new TransferOwnershipRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithOrgItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrgItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/organizations/{org_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithOrgItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrgItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/organizations/{org_id}", rawUrl);
    }
    /**
     * GetOrganization
     * @return a {@link Organization}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Organization get() {
        return get(null);
    }
    /**
     * GetOrganization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Organization}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Organization get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", Status::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Organization::createFromDiscriminatorValue);
    }
    /**
     * UpdateOrganization
     * @param body The request body
     * @return a {@link Organization}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Organization patch(@jakarta.annotation.Nonnull final WithOrgPatchRequestBody body) {
        return patch(body, null);
    }
    /**
     * UpdateOrganization
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Organization}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Organization patch(@jakarta.annotation.Nonnull final WithOrgPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", Status::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Organization::createFromDiscriminatorValue);
    }
    /**
     * GetOrganization
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * GetOrganization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * UpdateOrganization
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithOrgPatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * UpdateOrganization
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithOrgPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithOrgItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithOrgItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithOrgItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
