package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationState implements ValuedEnum {
    ORGANIZATION_STATE_UNSPECIFIED("ORGANIZATION_STATE_UNSPECIFIED"),
    ORGANIZATION_STATE_ACTIVE("ORGANIZATION_STATE_ACTIVE"),
    ORGANIZATION_STATE_DELETED("ORGANIZATION_STATE_DELETED"),
    ORGANIZATION_STATE_PURGING("ORGANIZATION_STATE_PURGING");
    public final String value;
    OrganizationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ORGANIZATION_STATE_UNSPECIFIED": return ORGANIZATION_STATE_UNSPECIFIED;
            case "ORGANIZATION_STATE_ACTIVE": return ORGANIZATION_STATE_ACTIVE;
            case "ORGANIZATION_STATE_DELETED": return ORGANIZATION_STATE_DELETED;
            case "ORGANIZATION_STATE_PURGING": return ORGANIZATION_STATE_PURGING;
            default: return null;
        }
    }
}
