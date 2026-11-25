package com.rixl.sdk.auth.v1.notifications.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.notifications.item.preferences.PreferencesRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/notifications/{org_-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrgItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The preferences property
     * @return a {@link PreferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PreferencesRequestBuilder preferences() {
        return new PreferencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OrgItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrgItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/notifications/{org_%2Did}", pathParameters);
    }
    /**
     * Instantiates a new {@link OrgItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrgItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/notifications/{org_%2Did}", rawUrl);
    }
}
