package com.rixl.sdk.auth.v1.policies;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.policies.permissions.PermissionsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * The permissions property
     * @return a {@link PermissionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/policies", pathParameters);
    }
    /**
     * Instantiates a new {@link PoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/policies", rawUrl);
    }
}
