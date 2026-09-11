package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentViewEventViewType implements ValuedEnum {
    Start("start"),
    Watch("watch"),
    End("end");
    public final String value;
    ContentViewEventViewType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentViewEventViewType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "start": return Start;
            case "watch": return Watch;
            case "end": return End;
            default: return null;
        }
    }
}
