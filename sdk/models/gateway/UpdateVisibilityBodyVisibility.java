package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UpdateVisibilityBodyVisibility implements ValuedEnum {
    Public("public"),
    Unlisted("unlisted"),
    Private("private");
    public final String value;
    UpdateVisibilityBodyVisibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UpdateVisibilityBodyVisibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "public": return Public;
            case "unlisted": return Unlisted;
            case "private": return Private;
            default: return null;
        }
    }
}
