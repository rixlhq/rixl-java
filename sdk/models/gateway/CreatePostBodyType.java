package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreatePostBodyType implements ValuedEnum {
    Video("video"),
    Image("image");
    public final String value;
    CreatePostBodyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreatePostBodyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "video": return Video;
            case "image": return Image;
            default: return null;
        }
    }
}
