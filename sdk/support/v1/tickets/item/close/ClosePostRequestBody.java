package com.rixl.sdk.support.v1.tickets.item.close;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClosePostRequestBody implements Parsable {
    /**
     * The ticket_id property
     */
    private String ticketId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClosePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ClosePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClosePostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("ticket_id", (n) -> { this.setTicketId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ticket_id property value. The ticket_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTicketId() {
        return this.ticketId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ticket_id", this.getTicketId());
    }
    /**
     * Sets the ticket_id property value. The ticket_id property
     * @param value Value to set for the ticket_id property.
     */
    public void setTicketId(@jakarta.annotation.Nullable final String value) {
        this.ticketId = value;
    }
}
