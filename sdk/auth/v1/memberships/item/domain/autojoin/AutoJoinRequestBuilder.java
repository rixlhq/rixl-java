package com.rixl.sdk.auth.v1.memberships.item.domain.autojoin;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.authv1.AutoJoinSetting;
import com.rixl.sdk.models.gateway.AutoJoinBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{orgId}/domain/auto-join
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutoJoinRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AutoJoinRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AutoJoinRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/domain/auto-join", pathParameters);
    }
    /**
     * Instantiates a new {@link AutoJoinRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AutoJoinRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/domain/auto-join", rawUrl);
    }
    /**
     * Returns whether users with a matching verified domain email are automatically added to the organization.
     * @return a {@link AutoJoinSetting}
     */
    @jakarta.annotation.Nullable
    public AutoJoinSetting get() {
        return get(null);
    }
    /**
     * Returns whether users with a matching verified domain email are automatically added to the organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AutoJoinSetting}
     */
    @jakarta.annotation.Nullable
    public AutoJoinSetting get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AutoJoinSetting::createFromDiscriminatorValue);
    }
    /**
     * Enables or disables automatically adding users with a matching verified domain email to the organization.
     * @param body Auto-join enabled
     * @return a {@link AutoJoinSetting}
     */
    @jakarta.annotation.Nullable
    public AutoJoinSetting put(@jakarta.annotation.Nonnull final AutoJoinBody body) {
        return put(body, null);
    }
    /**
     * Enables or disables automatically adding users with a matching verified domain email to the organization.
     * @param body Auto-join enabled
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AutoJoinSetting}
     */
    @jakarta.annotation.Nullable
    public AutoJoinSetting put(@jakarta.annotation.Nonnull final AutoJoinBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AutoJoinSetting::createFromDiscriminatorValue);
    }
    /**
     * Returns whether users with a matching verified domain email are automatically added to the organization.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns whether users with a matching verified domain email are automatically added to the organization.
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
     * Enables or disables automatically adding users with a matching verified domain email to the organization.
     * @param body Auto-join enabled
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AutoJoinBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Enables or disables automatically adding users with a matching verified domain email to the organization.
     * @param body Auto-join enabled
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final AutoJoinBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AutoJoinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AutoJoinRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AutoJoinRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
