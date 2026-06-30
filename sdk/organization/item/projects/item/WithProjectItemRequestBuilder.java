package com.rixl.sdk.organization.item.projects.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.projectsv1.Project;
import com.rixl.sdk.organization.item.projects.item.customdomain.CustomDomainRequestBuilder;
import com.rixl.sdk.organization.item.projects.item.move.MoveRequestBuilder;
import com.rixl.sdk.organization.item.projects.item.name.NameRequestBuilder;
import com.rixl.sdk.organization.item.projects.item.videoquality.VideoQualityRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organization/{orgId}/projects/{projectId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProjectItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The customDomain property
     * @return a {@link CustomDomainRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomDomainRequestBuilder customDomain() {
        return new CustomDomainRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The move property
     * @return a {@link MoveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MoveRequestBuilder move() {
        return new MoveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The name property
     * @return a {@link NameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NameRequestBuilder name() {
        return new NameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The videoQuality property
     * @return a {@link VideoQualityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoQualityRequestBuilder videoQuality() {
        return new VideoQualityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithProjectItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{orgId}/projects/{projectId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithProjectItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProjectItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{orgId}/projects/{projectId}", rawUrl);
    }
    /**
     * Soft delete a project (marks it as deleted)
     * @return a {@link Project}
     */
    @jakarta.annotation.Nullable
    public Project delete() {
        return delete(null);
    }
    /**
     * Soft delete a project (marks it as deleted)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Project}
     */
    @jakarta.annotation.Nullable
    public Project delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Project::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a specific project under an organization
     * @return a {@link Project}
     */
    @jakarta.annotation.Nullable
    public Project get() {
        return get(null);
    }
    /**
     * Retrieve a specific project under an organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Project}
     */
    @jakarta.annotation.Nullable
    public Project get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Project::createFromDiscriminatorValue);
    }
    /**
     * Soft delete a project (marks it as deleted)
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Soft delete a project (marks it as deleted)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve a specific project under an organization
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a specific project under an organization
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithProjectItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithProjectItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithProjectItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
