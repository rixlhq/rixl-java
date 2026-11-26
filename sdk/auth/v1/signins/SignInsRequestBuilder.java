package com.rixl.sdk.auth.v1.signins;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.auth.v1.signins.item.WithSignInItemRequestBuilder;
import com.rixl.sdk.auth.v1.signins.revokeothers.RevokeOthersRequestBuilder;
import com.rixl.sdk.models.auth.v1.ListSignInsResponse;
import com.rixl.sdk.models.Error;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/sign-ins
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignInsRequestBuilder extends BaseRequestBuilder {
    /**
     * The revokeOthers property
     * @return a {@link RevokeOthersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RevokeOthersRequestBuilder revokeOthers() {
        return new RevokeOthersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.rixl.sdk.auth.v1.signIns.item collection
     * @param sign_in_id Unique identifier of the item
     * @return a {@link WithSignInItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSignInItemRequestBuilder bySign_in_id(@jakarta.annotation.Nonnull final String sign_in_id) {
        Objects.requireNonNull(sign_in_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sign_in_id", sign_in_id);
        return new WithSignInItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SignInsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SignInsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/sign-ins", pathParameters);
    }
    /**
     * Instantiates a new {@link SignInsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SignInsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/sign-ins", rawUrl);
    }
    /**
     * Lists the caller&apos;s sign-ins, most recently used first.
     * @return a {@link ListSignInsResponse}
     * @throws Error When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ListSignInsResponse get() {
        return get(null);
    }
    /**
     * Lists the caller&apos;s sign-ins, most recently used first.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListSignInsResponse}
     * @throws Error When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ListSignInsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ListSignInsResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists the caller&apos;s sign-ins, most recently used first.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists the caller&apos;s sign-ins, most recently used first.
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
     * @return a {@link SignInsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignInsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SignInsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
