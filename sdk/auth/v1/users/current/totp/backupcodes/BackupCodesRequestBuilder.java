package com.rixl.sdk.auth.v1.users.current.totp.backupcodes;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.users.current.totp.backupcodes.regenerate.RegenerateRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/users/current/totp/backup-codes
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BackupCodesRequestBuilder extends BaseRequestBuilder {
    /**
     * The regenerate property
     * @return a {@link RegenerateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegenerateRequestBuilder regenerate() {
        return new RegenerateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BackupCodesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BackupCodesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/totp/backup-codes", pathParameters);
    }
    /**
     * Instantiates a new {@link BackupCodesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BackupCodesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/totp/backup-codes", rawUrl);
    }
}
