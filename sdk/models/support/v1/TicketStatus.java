package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TicketStatus implements ValuedEnum {
    TICKET_STATUS_UNSPECIFIED("TICKET_STATUS_UNSPECIFIED"),
    TICKET_STATUS_OPEN("TICKET_STATUS_OPEN"),
    TICKET_STATUS_PENDING("TICKET_STATUS_PENDING"),
    TICKET_STATUS_RESOLVED("TICKET_STATUS_RESOLVED"),
    TICKET_STATUS_CLOSED("TICKET_STATUS_CLOSED");
    public final String value;
    TicketStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TicketStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TICKET_STATUS_UNSPECIFIED": return TICKET_STATUS_UNSPECIFIED;
            case "TICKET_STATUS_OPEN": return TICKET_STATUS_OPEN;
            case "TICKET_STATUS_PENDING": return TICKET_STATUS_PENDING;
            case "TICKET_STATUS_RESOLVED": return TICKET_STATUS_RESOLVED;
            case "TICKET_STATUS_CLOSED": return TICKET_STATUS_CLOSED;
            default: return null;
        }
    }
}
