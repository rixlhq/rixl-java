package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventCount implements Parsable {
    /**
     * The count property
     */
    private UntypedNode count;
    /**
     * The eventType property
     */
    private String eventType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EventCount}
     */
    @jakarta.annotation.Nonnull
    public static EventCount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventCount();
    }
    /**
     * Gets the count property value. The count property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCount() {
        return this.count;
    }
    /**
     * Gets the eventType property value. The eventType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventType() {
        return this.eventType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("count", (n) -> { this.setCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("count", this.getCount());
        writer.writeStringValue("eventType", this.getEventType());
    }
    /**
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.count = value;
    }
    /**
     * Sets the eventType property value. The eventType property
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final String value) {
        this.eventType = value;
    }
}
