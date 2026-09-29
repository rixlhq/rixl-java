package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentViewEventPage implements ValuedEnum {
    Profile("profile"),
    Feed("feed"),
    Standalone("standalone");
    public final String value;
    ContentViewEventPage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentViewEventPage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "profile": return Profile;
            case "feed": return Feed;
            case "standalone": return Standalone;
            default: return null;
        }
    }
}
