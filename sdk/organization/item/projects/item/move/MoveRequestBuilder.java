package com.rixl.sdk.organization.item.projects.item.move;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.projectsv1.Project;
import com.rixl.sdk.models.types.MoveProjectRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization/{orgId}/projects/{projectId}/move
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MoveRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MoveRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MoveRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{orgId}/projects/{projectId}/move", pathParameters);
    }
    /**
     * Instantiates a new {@link MoveRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MoveRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{orgId}/projects/{projectId}/move", rawUrl);
    }
    /**
     * Move a project from one organization to another (if user has access to both)
     * @param body Target organization ID
     * @return a {@link Project}
     */
    @jakarta.annotation.Nullable
    public Project post(@jakarta.annotation.Nonnull final MoveProjectRequest body) {
        return post(body, null);
    }
    /**
     * Move a project from one organization to another (if user has access to both)
     * @param body Target organization ID
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Project}
     */
    @jakarta.annotation.Nullable
    public Project post(@jakarta.annotation.Nonnull final MoveProjectRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Project::createFromDiscriminatorValue);
    }
    /**
     * Move a project from one organization to another (if user has access to both)
     * @param body Target organization ID
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MoveProjectRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Move a project from one organization to another (if user has access to both)
     * @param body Target organization ID
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MoveProjectRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MoveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MoveRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MoveRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
