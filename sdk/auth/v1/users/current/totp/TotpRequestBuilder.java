package com.rixl.sdk.auth.v1.users.current.totp;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.users.current.totp.backupcodes.BackupCodesRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.totp.delete.DeleteRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.totp.setup.SetupRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.totp.status.StatusRequestBuilder;
import com.rixl.sdk.auth.v1.users.current.totp.verify.VerifyRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1/users/current/totp
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TotpRequestBuilder extends BaseRequestBuilder {
    /**
     * The backupCodes property
     * @return a {@link BackupCodesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BackupCodesRequestBuilder backupCodes() {
        return new BackupCodesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The deletePath property
     * @return a {@link DeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteRequestBuilder deletePath() {
        return new DeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The setup property
     * @return a {@link SetupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetupRequestBuilder setup() {
        return new SetupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The status property
     * @return a {@link StatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatusRequestBuilder status() {
        return new StatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verify property
     * @return a {@link VerifyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifyRequestBuilder verify() {
        return new VerifyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TotpRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TotpRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/totp", pathParameters);
    }
    /**
     * Instantiates a new {@link TotpRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TotpRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1/users/current/totp", rawUrl);
    }
}
