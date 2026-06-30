package com.rixl.sdk.organization.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.organization.item.projects.ProjectsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization/{orgId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOrgItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The projects property
     * @return a {@link ProjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithOrgItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrgItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{orgId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithOrgItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOrgItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{orgId}", rawUrl);
    }
}
