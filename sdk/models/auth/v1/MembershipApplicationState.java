package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MembershipApplicationState implements ValuedEnum {
    MEMBERSHIP_APPLICATION_STATE_UNSPECIFIED("MEMBERSHIP_APPLICATION_STATE_UNSPECIFIED"),
    MEMBERSHIP_APPLICATION_STATE_PENDING("MEMBERSHIP_APPLICATION_STATE_PENDING"),
    MEMBERSHIP_APPLICATION_STATE_APPROVED("MEMBERSHIP_APPLICATION_STATE_APPROVED"),
    MEMBERSHIP_APPLICATION_STATE_DECLINED("MEMBERSHIP_APPLICATION_STATE_DECLINED"),
    MEMBERSHIP_APPLICATION_STATE_CANCELLED("MEMBERSHIP_APPLICATION_STATE_CANCELLED");
    public final String value;
    MembershipApplicationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MembershipApplicationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MEMBERSHIP_APPLICATION_STATE_UNSPECIFIED": return MEMBERSHIP_APPLICATION_STATE_UNSPECIFIED;
            case "MEMBERSHIP_APPLICATION_STATE_PENDING": return MEMBERSHIP_APPLICATION_STATE_PENDING;
            case "MEMBERSHIP_APPLICATION_STATE_APPROVED": return MEMBERSHIP_APPLICATION_STATE_APPROVED;
            case "MEMBERSHIP_APPLICATION_STATE_DECLINED": return MEMBERSHIP_APPLICATION_STATE_DECLINED;
            case "MEMBERSHIP_APPLICATION_STATE_CANCELLED": return MEMBERSHIP_APPLICATION_STATE_CANCELLED;
            default: return null;
        }
    }
}
