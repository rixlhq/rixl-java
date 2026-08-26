package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateTicketResponse implements Parsable {
    /**
     * The ticket property
     */
    private Ticket ticket;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateTicketResponse}
     */
    @jakarta.annotation.Nonnull
    public static CreateTicketResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateTicketResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("ticket", (n) -> { this.setTicket(n.getObjectValue(Ticket::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ticket property value. The ticket property
     * @return a {@link Ticket}
     */
    @jakarta.annotation.Nullable
    public Ticket getTicket() {
        return this.ticket;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("ticket", this.getTicket());
    }
    /**
     * Sets the ticket property value. The ticket property
     * @param value Value to set for the ticket property.
     */
    public void setTicket(@jakarta.annotation.Nullable final Ticket value) {
        this.ticket = value;
    }
}
