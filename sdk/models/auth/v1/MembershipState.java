package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MembershipState implements ValuedEnum {
    MEMBERSHIP_STATE_UNSPECIFIED("MEMBERSHIP_STATE_UNSPECIFIED"),
    MEMBERSHIP_STATE_PENDING("MEMBERSHIP_STATE_PENDING"),
    MEMBERSHIP_STATE_ACCEPTED("MEMBERSHIP_STATE_ACCEPTED"),
    MEMBERSHIP_STATE_DECLINED("MEMBERSHIP_STATE_DECLINED");
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
            case "MEMBERSHIP_STATE_PENDING": return MEMBERSHIP_STATE_PENDING;
            case "MEMBERSHIP_STATE_ACCEPTED": return MEMBERSHIP_STATE_ACCEPTED;
            case "MEMBERSHIP_STATE_DECLINED": return MEMBERSHIP_STATE_DECLINED;
            default: return null;
        }
    }
}
