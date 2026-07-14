package com.rixl.sdk.models.common.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubtitleFormat implements ValuedEnum {
    SUBTITLE_FORMAT_UNSPECIFIED("SUBTITLE_FORMAT_UNSPECIFIED"),
    SUBTITLE_FORMAT_SRT("SUBTITLE_FORMAT_SRT"),
    SUBTITLE_FORMAT_VTT("SUBTITLE_FORMAT_VTT");
    public final String value;
    SubtitleFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubtitleFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SUBTITLE_FORMAT_UNSPECIFIED": return SUBTITLE_FORMAT_UNSPECIFIED;
            case "SUBTITLE_FORMAT_SRT": return SUBTITLE_FORMAT_SRT;
            case "SUBTITLE_FORMAT_VTT": return SUBTITLE_FORMAT_VTT;
            default: return null;
        }
    }
}
