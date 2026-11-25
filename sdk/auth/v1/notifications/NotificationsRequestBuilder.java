package com.rixl.sdk.auth.v1.notifications;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.notifications.item.OrgItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/notifications
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.notifications.item collection
     * @param org_Id Unique identifier of the item
     * @return a {@link OrgItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrgItemRequestBuilder byOrg_Id(@jakarta.annotation.Nonnull final String org_Id) {
        Objects.requireNonNull(org_Id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("org_%2Did", org_Id);
        return new OrgItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link NotificationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/notifications", pathParameters);
    }
    /**
     * Instantiates a new {@link NotificationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/notifications", rawUrl);
    }
}
