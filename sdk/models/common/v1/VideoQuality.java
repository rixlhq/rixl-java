package com.rixl.sdk.models.common.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VideoQuality implements ValuedEnum {
    VIDEO_QUALITY_UNSPECIFIED("VIDEO_QUALITY_UNSPECIFIED"),
    VIDEO_QUALITY_BASIC("VIDEO_QUALITY_BASIC"),
    VIDEO_QUALITY_SHORTS("VIDEO_QUALITY_SHORTS"),
    VIDEO_QUALITY_PRO("VIDEO_QUALITY_PRO");
    public final String value;
    VideoQuality(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VideoQuality forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "VIDEO_QUALITY_UNSPECIFIED": return VIDEO_QUALITY_UNSPECIFIED;
            case "VIDEO_QUALITY_BASIC": return VIDEO_QUALITY_BASIC;
            case "VIDEO_QUALITY_SHORTS": return VIDEO_QUALITY_SHORTS;
            case "VIDEO_QUALITY_PRO": return VIDEO_QUALITY_PRO;
            default: return null;
        }
    }
}
