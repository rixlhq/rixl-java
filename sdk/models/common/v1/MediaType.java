package com.rixl.sdk.models.common.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MediaType implements ValuedEnum {
    MEDIA_TYPE_UNSPECIFIED("MEDIA_TYPE_UNSPECIFIED"),
    MEDIA_TYPE_IMAGE("MEDIA_TYPE_IMAGE"),
    MEDIA_TYPE_VIDEO("MEDIA_TYPE_VIDEO");
    public final String value;
    MediaType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MediaType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MEDIA_TYPE_UNSPECIFIED": return MEDIA_TYPE_UNSPECIFIED;
            case "MEDIA_TYPE_IMAGE": return MEDIA_TYPE_IMAGE;
            case "MEDIA_TYPE_VIDEO": return MEDIA_TYPE_VIDEO;
            default: return null;
        }
    }
}
