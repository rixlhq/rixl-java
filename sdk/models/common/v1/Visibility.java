package com.rixl.sdk.models.common.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Visibility implements ValuedEnum {
    VISIBILITY_UNSPECIFIED("VISIBILITY_UNSPECIFIED"),
    VISIBILITY_PUBLIC("VISIBILITY_PUBLIC"),
    VISIBILITY_UNLISTED("VISIBILITY_UNLISTED"),
    VISIBILITY_PRIVATE("VISIBILITY_PRIVATE");
    public final String value;
    Visibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Visibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "VISIBILITY_UNSPECIFIED": return VISIBILITY_UNSPECIFIED;
            case "VISIBILITY_PUBLIC": return VISIBILITY_PUBLIC;
            case "VISIBILITY_UNLISTED": return VISIBILITY_UNLISTED;
            case "VISIBILITY_PRIVATE": return VISIBILITY_PRIVATE;
            default: return null;
        }
    }
}
