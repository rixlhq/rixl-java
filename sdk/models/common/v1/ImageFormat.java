package com.rixl.sdk.models.common.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ImageFormat implements ValuedEnum {
    IMAGE_FORMAT_UNSPECIFIED("IMAGE_FORMAT_UNSPECIFIED"),
    IMAGE_FORMAT_JPG("IMAGE_FORMAT_JPG"),
    IMAGE_FORMAT_PNG("IMAGE_FORMAT_PNG"),
    IMAGE_FORMAT_WEBP("IMAGE_FORMAT_WEBP"),
    IMAGE_FORMAT_GIF("IMAGE_FORMAT_GIF");
    public final String value;
    ImageFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ImageFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "IMAGE_FORMAT_UNSPECIFIED": return IMAGE_FORMAT_UNSPECIFIED;
            case "IMAGE_FORMAT_JPG": return IMAGE_FORMAT_JPG;
            case "IMAGE_FORMAT_PNG": return IMAGE_FORMAT_PNG;
            case "IMAGE_FORMAT_WEBP": return IMAGE_FORMAT_WEBP;
            case "IMAGE_FORMAT_GIF": return IMAGE_FORMAT_GIF;
            default: return null;
        }
    }
}
