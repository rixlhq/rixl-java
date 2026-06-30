package com.rixl.sdk.auth.v1.memberships.item.policies.item.attachments;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.memberships.item.policies.item.attachments.item.WithAttachmentItemRequestBuilder;
import com.rixl.sdk.models.authv1.ListAttachmentsResponse;
import com.rixl.sdk.models.authv1.PolicyAttachment;
import com.rixl.sdk.models.gateway.AttachPolicyBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{orgId}/policies/{policyId}/attachments
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttachmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.memberships.item.policies.item.attachments.item collection
     * @param attachmentId Attachment ID
     * @return a {@link WithAttachmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAttachmentItemRequestBuilder byAttachmentId(@jakarta.annotation.Nonnull final String attachmentId) {
        Objects.requireNonNull(attachmentId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attachmentId", attachmentId);
        return new WithAttachmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AttachmentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/policies/{policyId}/attachments", pathParameters);
    }
    /**
     * Instantiates a new {@link AttachmentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/policies/{policyId}/attachments", rawUrl);
    }
    /**
     * Returns all identities that the given policy is attached to within the organization.
     * @return a {@link ListAttachmentsResponse}
     */
    @jakarta.annotation.Nullable
    public ListAttachmentsResponse get() {
        return get(null);
    }
    /**
     * Returns all identities that the given policy is attached to within the organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListAttachmentsResponse}
     */
    @jakarta.annotation.Nullable
    public ListAttachmentsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListAttachmentsResponse::createFromDiscriminatorValue);
    }
    /**
     * Attaches the given policy to an identity so the policy&apos;s permissions apply to that identity.
     * @param body Identity
     * @return a {@link PolicyAttachment}
     */
    @jakarta.annotation.Nullable
    public PolicyAttachment post(@jakarta.annotation.Nonnull final AttachPolicyBody body) {
        return post(body, null);
    }
    /**
     * Attaches the given policy to an identity so the policy&apos;s permissions apply to that identity.
     * @param body Identity
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PolicyAttachment}
     */
    @jakarta.annotation.Nullable
    public PolicyAttachment post(@jakarta.annotation.Nonnull final AttachPolicyBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PolicyAttachment::createFromDiscriminatorValue);
    }
    /**
     * Returns all identities that the given policy is attached to within the organization.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns all identities that the given policy is attached to within the organization.
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
     * Attaches the given policy to an identity so the policy&apos;s permissions apply to that identity.
     * @param body Identity
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AttachPolicyBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Attaches the given policy to an identity so the policy&apos;s permissions apply to that identity.
     * @param body Identity
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AttachPolicyBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AttachmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AttachmentsRequestBuilder(rawUrl, requestAdapter);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
