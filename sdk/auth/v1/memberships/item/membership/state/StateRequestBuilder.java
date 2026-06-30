package com.rixl.sdk.auth.v1.memberships.item.membership.state;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.authv1.MembershipMutation;
import com.rixl.sdk.models.gateway.MembershipStateBody;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/memberships/{orgId}/membership/state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link StateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/membership/state", pathParameters);
    }
    /**
     * Instantiates a new {@link StateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/memberships/{orgId}/membership/state", rawUrl);
    }
    /**
     * Accepts or declines the authenticated user&apos;s pending invitation to the organization. Used from inside the dashboard; the public token flow is /auth/v1/invitations/{token}/accept|decline.
     * @param body New membership state
     * @return a {@link MembershipMutation}
     */
    @jakarta.annotation.Nullable
    public MembershipMutation put(@jakarta.annotation.Nonnull final MembershipStateBody body) {
        return put(body, null);
    }
    /**
     * Accepts or declines the authenticated user&apos;s pending invitation to the organization. Used from inside the dashboard; the public token flow is /auth/v1/invitations/{token}/accept|decline.
     * @param body New membership state
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MembershipMutation}
     */
    @jakarta.annotation.Nullable
    public MembershipMutation put(@jakarta.annotation.Nonnull final MembershipStateBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, MembershipMutation::createFromDiscriminatorValue);
    }
    /**
     * Accepts or declines the authenticated user&apos;s pending invitation to the organization. Used from inside the dashboard; the public token flow is /auth/v1/invitations/{token}/accept|decline.
     * @param body New membership state
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final MembershipStateBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Accepts or declines the authenticated user&apos;s pending invitation to the organization. Used from inside the dashboard; the public token flow is /auth/v1/invitations/{token}/accept|decline.
     * @param body New membership state
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final MembershipStateBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link StateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
