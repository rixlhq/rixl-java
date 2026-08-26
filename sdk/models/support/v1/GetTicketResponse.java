package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetTicketResponse implements Parsable {
    /**
     * The messages property
     */
    private java.util.List<TicketMessage> messages;
    /**
     * The ticket property
     */
    private Ticket ticket;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetTicketResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetTicketResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetTicketResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(TicketMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("ticket", (n) -> { this.setTicket(n.getObjectValue(Ticket::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the messages property value. The messages property
     * @return a {@link java.util.List<TicketMessage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TicketMessage> getMessages() {
        return this.messages;
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
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeObjectValue("ticket", this.getTicket());
    }
    /**
     * Sets the messages property value. The messages property
     * @param value Value to set for the messages property.
     */
    public void setMessages(@jakarta.annotation.Nullable final java.util.List<TicketMessage> value) {
        this.messages = value;
    }
    /**
     * Sets the ticket property value. The ticket property
     * @param value Value to set for the ticket property.
     */
    public void setTicket(@jakarta.annotation.Nullable final Ticket value) {
        this.ticket = value;
    }
}
