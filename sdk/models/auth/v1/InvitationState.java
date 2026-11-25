package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InvitationState implements ValuedEnum {
    INVITATION_STATE_UNSPECIFIED("INVITATION_STATE_UNSPECIFIED"),
    INVITATION_STATE_PENDING("INVITATION_STATE_PENDING"),
    INVITATION_STATE_ACCEPTED("INVITATION_STATE_ACCEPTED"),
    INVITATION_STATE_DECLINED("INVITATION_STATE_DECLINED"),
    INVITATION_STATE_REVOKED("INVITATION_STATE_REVOKED"),
    INVITATION_STATE_EXPIRED("INVITATION_STATE_EXPIRED");
    public final String value;
    InvitationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InvitationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVITATION_STATE_UNSPECIFIED": return INVITATION_STATE_UNSPECIFIED;
            case "INVITATION_STATE_PENDING": return INVITATION_STATE_PENDING;
            case "INVITATION_STATE_ACCEPTED": return INVITATION_STATE_ACCEPTED;
            case "INVITATION_STATE_DECLINED": return INVITATION_STATE_DECLINED;
            case "INVITATION_STATE_REVOKED": return INVITATION_STATE_REVOKED;
            case "INVITATION_STATE_EXPIRED": return INVITATION_STATE_EXPIRED;
            default: return null;
        }
    }
}
