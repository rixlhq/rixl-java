package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PolicyIdentityType implements ValuedEnum {
    POLICY_IDENTITY_TYPE_UNSPECIFIED("POLICY_IDENTITY_TYPE_UNSPECIFIED"),
    POLICY_IDENTITY_TYPE_USER("POLICY_IDENTITY_TYPE_USER"),
    POLICY_IDENTITY_TYPE_API_KEY("POLICY_IDENTITY_TYPE_API_KEY"),
    POLICY_IDENTITY_TYPE_CLIENTAUTH_CREDENTIAL("POLICY_IDENTITY_TYPE_CLIENTAUTH_CREDENTIAL");
    public final String value;
    PolicyIdentityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PolicyIdentityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "POLICY_IDENTITY_TYPE_UNSPECIFIED": return POLICY_IDENTITY_TYPE_UNSPECIFIED;
            case "POLICY_IDENTITY_TYPE_USER": return POLICY_IDENTITY_TYPE_USER;
            case "POLICY_IDENTITY_TYPE_API_KEY": return POLICY_IDENTITY_TYPE_API_KEY;
            case "POLICY_IDENTITY_TYPE_CLIENTAUTH_CREDENTIAL": return POLICY_IDENTITY_TYPE_CLIENTAUTH_CREDENTIAL;
            default: return null;
        }
    }
}
