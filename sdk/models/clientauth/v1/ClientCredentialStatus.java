package com.rixl.sdk.models.clientauth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClientCredentialStatus implements ValuedEnum {
    CLIENT_CREDENTIAL_STATUS_UNSPECIFIED("CLIENT_CREDENTIAL_STATUS_UNSPECIFIED"),
    CLIENT_CREDENTIAL_STATUS_ACTIVE("CLIENT_CREDENTIAL_STATUS_ACTIVE"),
    CLIENT_CREDENTIAL_STATUS_REVOKED("CLIENT_CREDENTIAL_STATUS_REVOKED");
    public final String value;
    ClientCredentialStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClientCredentialStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CLIENT_CREDENTIAL_STATUS_UNSPECIFIED": return CLIENT_CREDENTIAL_STATUS_UNSPECIFIED;
            case "CLIENT_CREDENTIAL_STATUS_ACTIVE": return CLIENT_CREDENTIAL_STATUS_ACTIVE;
            case "CLIENT_CREDENTIAL_STATUS_REVOKED": return CLIENT_CREDENTIAL_STATUS_REVOKED;
            default: return null;
        }
    }
}
