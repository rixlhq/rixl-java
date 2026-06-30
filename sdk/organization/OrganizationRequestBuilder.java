package com.rixl.sdk.organization;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.organization.item.WithOrgItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.organization.item collection
     * @param orgId Organization ID
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
     * Instantiates a new {@link OrganizationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization", pathParameters);
    }
    /**
     * Instantiates a new {@link OrganizationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization", rawUrl);
    }
}
