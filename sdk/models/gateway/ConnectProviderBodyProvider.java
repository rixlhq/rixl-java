package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConnectProviderBodyProvider implements ValuedEnum {
    Google("google"),
    Apple("apple"),
    Microsoft("microsoft"),
    TgAuthResult("tgAuthResult");
    public final String value;
    ConnectProviderBodyProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectProviderBodyProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "google": return Google;
            case "apple": return Apple;
            case "microsoft": return Microsoft;
            case "tgAuthResult": return TgAuthResult;
            default: return null;
        }
    }
}
