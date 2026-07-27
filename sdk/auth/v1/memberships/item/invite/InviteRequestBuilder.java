package com.rixl.sdk.auth.v1.memberships.item.invite;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.memberships.item.invite.item.WithUserItemRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.item.invite.resend.ResendRequestBuilder;
import com.rixl.sdk.models.auth.v1.MembershipApplication;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{org_-id}/invite
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InviteRequestBuilder extends BaseRequestBuilder {
    /**
     * The resend property
     * @return a {@link ResendRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResendRequestBuilder resend() {
        return new ResendRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.memberships.item.invite.item collection
     * @param user_id Unique identifier of the item
     * @return a {@link WithUserItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithUserItemRequestBuilder byUser_id(@jakarta.annotation.Nonnull final String user_id) {
        Objects.requireNonNull(user_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user_id", user_id);
        return new WithUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InviteRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InviteRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{org_%2Did}/invite", pathParameters);
    }
    /**
     * Instantiates a new {@link InviteRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InviteRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{org_%2Did}/invite", rawUrl);
    }
    /**
     * InviteMember
     * @param body The request body
     * @return a {@link MembershipApplication}
     */
    @jakarta.annotation.Nullable
    public MembershipApplication post(@jakarta.annotation.Nonnull final InvitePostRequestBody body) {
        return post(body, null);
    }
    /**
     * InviteMember
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MembershipApplication}
     */
    @jakarta.annotation.Nullable
    public MembershipApplication post(@jakarta.annotation.Nonnull final InvitePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, MembershipApplication::createFromDiscriminatorValue);
    }
    /**
     * InviteMember
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InvitePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * InviteMember
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InvitePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link InviteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InviteRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InviteRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
