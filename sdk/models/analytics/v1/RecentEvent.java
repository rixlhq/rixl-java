package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecentEvent implements Parsable {
    /**
     * The contentId property
     */
    private String contentId;
    /**
     * The eventType property
     */
    private String eventType;
    /**
     * The timestamp property
     */
    private String timestamp;
    /**
     * The userId property
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecentEvent}
     */
    @jakarta.annotation.Nonnull
    public static RecentEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecentEvent();
    }
    /**
     * Gets the contentId property value. The contentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentId() {
        return this.contentId;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("contentId", (n) -> { this.setContentId(n.getStringValue()); });
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the timestamp property value. The timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentId", this.getContentId());
        writer.writeStringValue("eventType", this.getEventType());
        writer.writeStringValue("timestamp", this.getTimestamp());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the contentId property value. The contentId property
     * @param value Value to set for the contentId property.
     */
    public void setContentId(@jakarta.annotation.Nullable final String value) {
        this.contentId = value;
    }
    /**
     * Sets the eventType property value. The eventType property
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final String value) {
        this.eventType = value;
    }
    /**
     * Sets the timestamp property value. The timestamp property
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final String value) {
        this.timestamp = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
