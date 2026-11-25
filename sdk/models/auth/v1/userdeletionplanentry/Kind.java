package com.rixl.sdk.models.auth.v1.userdeletionplanentry;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Kind implements ValuedEnum {
    KIND_UNSPECIFIED("KIND_UNSPECIFIED"),
    KIND_DELETE_ORGANIZATION("KIND_DELETE_ORGANIZATION"),
    KIND_LEAVE_ORGANIZATION("KIND_LEAVE_ORGANIZATION"),
    KIND_SOLE_OWNER_BLOCKER("KIND_SOLE_OWNER_BLOCKER"),
    KIND_INTERNAL_ORG_BLOCKER("KIND_INTERNAL_ORG_BLOCKER"),
    KIND_PERSONAL_ORG_MEMBER("KIND_PERSONAL_ORG_MEMBER");
    public final String value;
    Kind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Kind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "KIND_UNSPECIFIED": return KIND_UNSPECIFIED;
            case "KIND_DELETE_ORGANIZATION": return KIND_DELETE_ORGANIZATION;
            case "KIND_LEAVE_ORGANIZATION": return KIND_LEAVE_ORGANIZATION;
            case "KIND_SOLE_OWNER_BLOCKER": return KIND_SOLE_OWNER_BLOCKER;
            case "KIND_INTERNAL_ORG_BLOCKER": return KIND_INTERNAL_ORG_BLOCKER;
            case "KIND_PERSONAL_ORG_MEMBER": return KIND_PERSONAL_ORG_MEMBER;
            default: return null;
        }
    }
}
