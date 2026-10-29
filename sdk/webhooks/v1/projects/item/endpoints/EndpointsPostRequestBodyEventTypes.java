package com.rixl.sdk.webhooks.v1.projects.item.endpoints;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EndpointsPostRequestBodyEventTypes implements ValuedEnum {
    ImageReady("image.ready"),
    ImageFailed("image.failed");
    public final String value;
    EndpointsPostRequestBodyEventTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EndpointsPostRequestBodyEventTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "image.ready": return ImageReady;
            case "image.failed": return ImageFailed;
            default: return null;
        }
    }
}
