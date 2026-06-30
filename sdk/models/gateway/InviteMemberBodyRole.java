package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InviteMemberBodyRole implements ValuedEnum {
    Admin("admin"),
    Member("member");
    public final String value;
    InviteMemberBodyRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InviteMemberBodyRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "admin": return Admin;
            case "member": return Member;
            default: return null;
        }
    }
}
