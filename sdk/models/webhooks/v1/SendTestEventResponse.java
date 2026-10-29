package com.rixl.sdk.models.webhooks.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendTestEventResponse implements Parsable {
    /**
     * The event_id property
     */
    private String eventId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendTestEventResponse}
     */
    @jakarta.annotation.Nonnull
    public static SendTestEventResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendTestEventResponse();
    }
    /**
     * Gets the event_id property value. The event_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventId() {
        return this.eventId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("event_id", (n) -> { this.setEventId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("event_id", this.getEventId());
    }
    /**
     * Sets the event_id property value. The event_id property
     * @param value Value to set for the event_id property.
     */
    public void setEventId(@jakarta.annotation.Nullable final String value) {
        this.eventId = value;
    }
}
