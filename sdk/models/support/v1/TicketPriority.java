package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TicketPriority implements ValuedEnum {
    TICKET_PRIORITY_UNSPECIFIED("TICKET_PRIORITY_UNSPECIFIED"),
    TICKET_PRIORITY_LOW("TICKET_PRIORITY_LOW"),
    TICKET_PRIORITY_NORMAL("TICKET_PRIORITY_NORMAL"),
    TICKET_PRIORITY_HIGH("TICKET_PRIORITY_HIGH"),
    TICKET_PRIORITY_URGENT("TICKET_PRIORITY_URGENT");
    public final String value;
    TicketPriority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TicketPriority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TICKET_PRIORITY_UNSPECIFIED": return TICKET_PRIORITY_UNSPECIFIED;
            case "TICKET_PRIORITY_LOW": return TICKET_PRIORITY_LOW;
            case "TICKET_PRIORITY_NORMAL": return TICKET_PRIORITY_NORMAL;
            case "TICKET_PRIORITY_HIGH": return TICKET_PRIORITY_HIGH;
            case "TICKET_PRIORITY_URGENT": return TICKET_PRIORITY_URGENT;
            default: return null;
        }
    }
}
