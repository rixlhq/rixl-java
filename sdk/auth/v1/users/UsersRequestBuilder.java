package com.rixl.sdk.auth.v1.users;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.users.current.CurrentRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/users
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsersRequestBuilder extends BaseRequestBuilder {
    /**
     * The current property
     * @return a {@link CurrentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CurrentRequestBuilder current() {
        return new CurrentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link UsersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users", pathParameters);
    }
    /**
     * Instantiates a new {@link UsersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users", rawUrl);
    }
}
