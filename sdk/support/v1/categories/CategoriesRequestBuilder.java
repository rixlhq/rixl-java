package com.rixl.sdk.support.v1.categories;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.support.v1.ListCategoriesResponse;
import com.rixl.sdk.support.v1.categories.item.WithCategoryItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /support/v1/categories
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoriesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.support.v1.categories.item collection
     * @param category_id Unique identifier of the item
     * @return a {@link WithCategoryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCategoryItemRequestBuilder byCategory_id(@jakarta.annotation.Nonnull final String category_id) {
        Objects.requireNonNull(category_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("category_id", category_id);
        return new WithCategoryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CategoriesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CategoriesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/categories", pathParameters);
    }
    /**
     * Instantiates a new {@link CategoriesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CategoriesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/categories", rawUrl);
    }
    /**
     * ListCategories
     * @return a {@link ListCategoriesResponse}
     */
    @jakarta.annotation.Nullable
    public ListCategoriesResponse get() {
        return get(null);
    }
    /**
     * ListCategories
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListCategoriesResponse}
     */
    @jakarta.annotation.Nullable
    public ListCategoriesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListCategoriesResponse::createFromDiscriminatorValue);
    }
    /**
     * ListCategories
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListCategories
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
     * @return a {@link CategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CategoriesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CategoriesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
