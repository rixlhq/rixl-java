package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MembershipStateBodyState implements ValuedEnum {
    Accepted("accepted"),
    Declined("declined");
    public final String value;
    MembershipStateBodyState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MembershipStateBodyState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accepted": return Accepted;
            case "declined": return Declined;
            default: return null;
        }
    }
}
