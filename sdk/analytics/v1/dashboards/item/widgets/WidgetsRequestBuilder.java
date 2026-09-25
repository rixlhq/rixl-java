package com.rixl.sdk.analytics.v1.dashboards.item.widgets;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.analytics.v1.Widget;
import com.rixl.sdk.models.analytics.v1.WidgetInput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/dashboards/{dashboard_-id}/widgets
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WidgetsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WidgetsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WidgetsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/dashboards/{dashboard_%2Did}/widgets?expected_revision={expected_revision}", pathParameters);
    }
    /**
     * Instantiates a new {@link WidgetsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WidgetsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/dashboards/{dashboard_%2Did}/widgets?expected_revision={expected_revision}", rawUrl);
    }
    /**
     * CreateWidget
     * @param body The request body
     * @return a {@link Widget}
     */
    @jakarta.annotation.Nullable
    public Widget post(@jakarta.annotation.Nonnull final WidgetInput body) {
        return post(body, null);
    }
    /**
     * CreateWidget
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Widget}
     */
    @jakarta.annotation.Nullable
    public Widget post(@jakarta.annotation.Nonnull final WidgetInput body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Widget::createFromDiscriminatorValue);
    }
    /**
     * CreateWidget
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WidgetInput body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * CreateWidget
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WidgetInput body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WidgetsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WidgetsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WidgetsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * CreateWidget
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Integer expectedRevision;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("expected_revision", expectedRevision);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PostQueryParameters queryParameters = new PostQueryParameters();
    }
}
