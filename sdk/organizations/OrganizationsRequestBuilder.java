package com.rixl.sdk.organizations;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.organizations.item.WithOrgItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.organizations.item collection
     * @param org_id Unique identifier of the item
     * @return a {@link WithOrgItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithOrgItemRequestBuilder byOrg_id(@jakarta.annotation.Nonnull final String org_id) {
        Objects.requireNonNull(org_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("org_id", org_id);
        return new WithOrgItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link OrganizationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations", pathParameters);
    }
    /**
     * Instantiates a new {@link OrganizationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations", rawUrl);
    }
}
