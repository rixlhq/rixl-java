package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthMethod implements ValuedEnum {
    AUTH_METHOD_UNSPECIFIED("AUTH_METHOD_UNSPECIFIED"),
    AUTH_METHOD_PASSKEY("AUTH_METHOD_PASSKEY"),
    AUTH_METHOD_TOTP("AUTH_METHOD_TOTP");
    public final String value;
    AuthMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AUTH_METHOD_UNSPECIFIED": return AUTH_METHOD_UNSPECIFIED;
            case "AUTH_METHOD_PASSKEY": return AUTH_METHOD_PASSKEY;
            case "AUTH_METHOD_TOTP": return AUTH_METHOD_TOTP;
            default: return null;
        }
    }
}
