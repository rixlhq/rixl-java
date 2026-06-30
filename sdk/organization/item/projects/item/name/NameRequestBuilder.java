package com.rixl.sdk.organization.item.projects.item.name;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.projectsv1.Project;
import com.rixl.sdk.models.types.UpdateProjectNameRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization/{orgId}/projects/{projectId}/name
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NameRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link NameRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{orgId}/projects/{projectId}/name", pathParameters);
    }
    /**
     * Instantiates a new {@link NameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{orgId}/projects/{projectId}/name", rawUrl);
    }
    /**
     * Update the name of a specific project
     * @param body New project name
     * @return a {@link Project}
     */
    @jakarta.annotation.Nullable
    public Project patch(@jakarta.annotation.Nonnull final UpdateProjectNameRequest body) {
        return patch(body, null);
    }
    /**
     * Update the name of a specific project
     * @param body New project name
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Project}
     */
    @jakarta.annotation.Nullable
    public Project patch(@jakarta.annotation.Nonnull final UpdateProjectNameRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Project::createFromDiscriminatorValue);
    }
    /**
     * Update the name of a specific project
     * @param body New project name
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UpdateProjectNameRequest body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the name of a specific project
     * @param body New project name
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final UpdateProjectNameRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link NameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NameRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NameRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
