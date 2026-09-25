package com.rixl.sdk.analytics.v1.dashboards.widgets.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.analytics.v1.DeleteWidgetResponse;
import com.rixl.sdk.models.analytics.v1.Widget;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /analytics/v1/dashboards/widgets/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WidgetsItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WidgetsItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WidgetsItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/dashboards/widgets/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WidgetsItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WidgetsItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/analytics/v1/dashboards/widgets/{id}", rawUrl);
    }
    /**
     * DeleteWidget
     * @return a {@link DeleteWidgetResponse}
     */
    @jakarta.annotation.Nullable
    public DeleteWidgetResponse delete() {
        return delete(null);
    }
    /**
     * DeleteWidget
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeleteWidgetResponse}
     */
    @jakarta.annotation.Nullable
    public DeleteWidgetResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DeleteWidgetResponse::createFromDiscriminatorValue);
    }
    /**
     * UpdateWidget
     * @param body The request body
     * @return a {@link Widget}
     */
    @jakarta.annotation.Nullable
    public Widget patch(@jakarta.annotation.Nonnull final WidgetsPatchRequestBody body) {
        return patch(body, null);
    }
    /**
     * UpdateWidget
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Widget}
     */
    @jakarta.annotation.Nullable
    public Widget patch(@jakarta.annotation.Nonnull final WidgetsPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Widget::createFromDiscriminatorValue);
    }
    /**
     * DeleteWidget
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * DeleteWidget
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/analytics/v1/dashboards/widgets/{id}?expected_revision={expected_revision}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * UpdateWidget
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WidgetsPatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * UpdateWidget
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WidgetsPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WidgetsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WidgetsItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WidgetsItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * DeleteWidget
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteQueryParameters implements QueryParameters {
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
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public DeleteQueryParameters queryParameters = new DeleteQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
