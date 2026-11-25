package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NotificationCategory implements ValuedEnum {
    NOTIFICATION_CATEGORY_UNSPECIFIED("NOTIFICATION_CATEGORY_UNSPECIFIED"),
    NOTIFICATION_CATEGORY_USAGE("NOTIFICATION_CATEGORY_USAGE"),
    NOTIFICATION_CATEGORY_PAYMENT("NOTIFICATION_CATEGORY_PAYMENT");
    public final String value;
    NotificationCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NotificationCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NOTIFICATION_CATEGORY_UNSPECIFIED": return NOTIFICATION_CATEGORY_UNSPECIFIED;
            case "NOTIFICATION_CATEGORY_USAGE": return NOTIFICATION_CATEGORY_USAGE;
            case "NOTIFICATION_CATEGORY_PAYMENT": return NOTIFICATION_CATEGORY_PAYMENT;
            default: return null;
        }
    }
}
