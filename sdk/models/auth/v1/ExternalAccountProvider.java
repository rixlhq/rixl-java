package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExternalAccountProvider implements ValuedEnum {
    EXTERNAL_ACCOUNT_PROVIDER_UNSPECIFIED("EXTERNAL_ACCOUNT_PROVIDER_UNSPECIFIED"),
    EXTERNAL_ACCOUNT_PROVIDER_GOOGLE("EXTERNAL_ACCOUNT_PROVIDER_GOOGLE"),
    EXTERNAL_ACCOUNT_PROVIDER_APPLE("EXTERNAL_ACCOUNT_PROVIDER_APPLE"),
    EXTERNAL_ACCOUNT_PROVIDER_MICROSOFT("EXTERNAL_ACCOUNT_PROVIDER_MICROSOFT"),
    EXTERNAL_ACCOUNT_PROVIDER_FACEBOOK("EXTERNAL_ACCOUNT_PROVIDER_FACEBOOK"),
    EXTERNAL_ACCOUNT_PROVIDER_TELEGRAM("EXTERNAL_ACCOUNT_PROVIDER_TELEGRAM");
    public final String value;
    ExternalAccountProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExternalAccountProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EXTERNAL_ACCOUNT_PROVIDER_UNSPECIFIED": return EXTERNAL_ACCOUNT_PROVIDER_UNSPECIFIED;
            case "EXTERNAL_ACCOUNT_PROVIDER_GOOGLE": return EXTERNAL_ACCOUNT_PROVIDER_GOOGLE;
            case "EXTERNAL_ACCOUNT_PROVIDER_APPLE": return EXTERNAL_ACCOUNT_PROVIDER_APPLE;
            case "EXTERNAL_ACCOUNT_PROVIDER_MICROSOFT": return EXTERNAL_ACCOUNT_PROVIDER_MICROSOFT;
            case "EXTERNAL_ACCOUNT_PROVIDER_FACEBOOK": return EXTERNAL_ACCOUNT_PROVIDER_FACEBOOK;
            case "EXTERNAL_ACCOUNT_PROVIDER_TELEGRAM": return EXTERNAL_ACCOUNT_PROVIDER_TELEGRAM;
            default: return null;
        }
    }
}
