package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MembershipState implements ValuedEnum {
    MEMBERSHIP_STATE_UNSPECIFIED("MEMBERSHIP_STATE_UNSPECIFIED"),
    MEMBERSHIP_STATE_ACTIVE("MEMBERSHIP_STATE_ACTIVE"),
    MEMBERSHIP_STATE_SUSPENDED("MEMBERSHIP_STATE_SUSPENDED");
    public final String value;
    MembershipState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MembershipState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MEMBERSHIP_STATE_UNSPECIFIED": return MEMBERSHIP_STATE_UNSPECIFIED;
            case "MEMBERSHIP_STATE_ACTIVE": return MEMBERSHIP_STATE_ACTIVE;
            case "MEMBERSHIP_STATE_SUSPENDED": return MEMBERSHIP_STATE_SUSPENDED;
            default: return null;
        }
    }
}
