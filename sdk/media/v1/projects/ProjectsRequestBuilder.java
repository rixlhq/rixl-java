package com.rixl.sdk.media.v1.projects;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.media.v1.projects.item.WithProjectItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProjectsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.media.v1.projects.item collection
     * @param projectId Project ID
     * @return a {@link WithProjectItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithProjectItemRequestBuilder byProjectId(@jakarta.annotation.Nonnull final String projectId) {
        Objects.requireNonNull(projectId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("projectId", projectId);
        return new WithProjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ProjectsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProjectsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects", pathParameters);
    }
    /**
     * Instantiates a new {@link ProjectsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProjectsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects", rawUrl);
    }
}
