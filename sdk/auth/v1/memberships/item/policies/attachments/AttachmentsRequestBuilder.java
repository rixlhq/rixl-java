package com.rixl.sdk.auth.v1.memberships.item.policies.attachments;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.memberships.item.policies.attachments.item.WithAttachmentItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{org_-id}/policies/attachments
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttachmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.memberships.item.policies.attachments.item collection
     * @param attachment_id Unique identifier of the item
     * @return a {@link WithAttachmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAttachmentItemRequestBuilder byAttachment_id(@jakarta.annotation.Nonnull final String attachment_id) {
        Objects.requireNonNull(attachment_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attachment_id", attachment_id);
        return new WithAttachmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AttachmentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{org_%2Did}/policies/attachments", pathParameters);
    }
    /**
     * Instantiates a new {@link AttachmentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{org_%2Did}/policies/attachments", rawUrl);
    }
}
