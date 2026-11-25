package com.rixl.sdk.auth.v1.organizations.item.invitations;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.organizations.item.invitations.item.WithInvitationItemRequestBuilder;
import com.rixl.sdk.models.auth.v1.Invitation;
import com.rixl.sdk.models.auth.v1.InvitationState;
import com.rixl.sdk.models.auth.v1.ListOrganizationInvitationsResponse;
import com.rixl.sdk.models.google.rpc.Status;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/organizations/{org_id}/invitations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.organizations.item.invitations.item collection
     * @param invitation_id Unique identifier of the item
     * @return a {@link WithInvitationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithInvitationItemRequestBuilder byInvitation_id(@jakarta.annotation.Nonnull final String invitation_id) {
        Objects.requireNonNull(invitation_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invitation_id", invitation_id);
        return new WithInvitationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InvitationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/organizations/{org_id}/invitations{?page_size*,page_token*,state*}", pathParameters);
    }
    /**
     * Instantiates a new {@link InvitationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/organizations/{org_id}/invitations{?page_size*,page_token*,state*}", rawUrl);
    }
    /**
     * ListOrganizationInvitations
     * @return a {@link ListOrganizationInvitationsResponse}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ListOrganizationInvitationsResponse get() {
        return get(null);
    }
    /**
     * ListOrganizationInvitations
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListOrganizationInvitationsResponse}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ListOrganizationInvitationsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", Status::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ListOrganizationInvitationsResponse::createFromDiscriminatorValue);
    }
    /**
     * CreateInvitation
     * @param body The request body
     * @return a {@link Invitation}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Invitation post(@jakarta.annotation.Nonnull final InvitationsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * CreateInvitation
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Invitation}
     * @throws Status When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Invitation post(@jakarta.annotation.Nonnull final InvitationsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", Status::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Invitation::createFromDiscriminatorValue);
    }
    /**
     * ListOrganizationInvitations
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListOrganizationInvitations
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * CreateInvitation
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InvitationsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * CreateInvitation
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InvitationsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link InvitationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InvitationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListOrganizationInvitations
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Integer pageSize;
        @jakarta.annotation.Nullable
        public String pageToken;
        /**
         * Defaults to pending.
         */
        @jakarta.annotation.Nullable
        public InvitationState state;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("state", state);
            allQueryParams.put("page_size", pageSize);
            allQueryParams.put("page_token", pageToken);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
