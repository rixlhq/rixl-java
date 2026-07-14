package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MembershipRole implements ValuedEnum {
    MEMBERSHIP_ROLE_UNSPECIFIED("MEMBERSHIP_ROLE_UNSPECIFIED"),
    MEMBERSHIP_ROLE_OWNER("MEMBERSHIP_ROLE_OWNER"),
    MEMBERSHIP_ROLE_ADMIN("MEMBERSHIP_ROLE_ADMIN"),
    MEMBERSHIP_ROLE_MEMBER("MEMBERSHIP_ROLE_MEMBER");
    public final String value;
    MembershipRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MembershipRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MEMBERSHIP_ROLE_UNSPECIFIED": return MEMBERSHIP_ROLE_UNSPECIFIED;
            case "MEMBERSHIP_ROLE_OWNER": return MEMBERSHIP_ROLE_OWNER;
            case "MEMBERSHIP_ROLE_ADMIN": return MEMBERSHIP_ROLE_ADMIN;
            case "MEMBERSHIP_ROLE_MEMBER": return MEMBERSHIP_ROLE_MEMBER;
            default: return null;
        }
    }
}
