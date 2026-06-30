package com.rixl.sdk;

import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import com.rixl.sdk.analytics.AnalyticsRequestBuilder;
import com.rixl.sdk.auth.AuthRequestBuilder;
import com.rixl.sdk.billing.BillingRequestBuilder;
import com.rixl.sdk.media.MediaRequestBuilder;
import com.rixl.sdk.organization.OrganizationRequestBuilder;
import com.rixl.sdk.platform.PlatformRequestBuilder;
import com.rixl.sdk.posts.PostsRequestBuilder;
import com.rixl.sdk.projects.ProjectsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RixlClient extends BaseRequestBuilder {
    /**
     * The analytics property
     * @return a {@link AnalyticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The auth property
     * @return a {@link AuthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthRequestBuilder auth() {
        return new AuthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The billing property
     * @return a {@link BillingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BillingRequestBuilder billing() {
        return new BillingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The media property
     * @return a {@link MediaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MediaRequestBuilder media() {
        return new MediaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The organization property
     * @return a {@link OrganizationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The platform property
     * @return a {@link PlatformRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlatformRequestBuilder platform() {
        return new PlatformRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The posts property
     * @return a {@link PostsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PostsRequestBuilder posts() {
        return new PostsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The projects property
     * @return a {@link ProjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProjectsRequestBuilder projects() {
        return new ProjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link RixlClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RixlClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://raw.githubusercontent.com");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
