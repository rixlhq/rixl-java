package com.rixl.sdk.models.analyticsv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecentEvent implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The content_id property
     */
    private String contentId;
    /**
     * The event_type property
     */
    private String eventType;
    /**
     * The timestamp property
     */
    private String timestamp;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Instantiates a new {@link RecentEvent} and sets the default values.
     */
    public RecentEvent() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the content_id property value. The content_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Gets the event_type property value. The event_type property
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
        deserializerMap.put("content_id", (n) -> { this.setContentId(n.getStringValue()); });
        deserializerMap.put("event_type", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
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
     * Gets the user_id property value. The user_id property
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
        writer.writeStringValue("content_id", this.getContentId());
        writer.writeStringValue("event_type", this.getEventType());
        writer.writeStringValue("timestamp", this.getTimestamp());
        writer.writeStringValue("user_id", this.getUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the content_id property value. The content_id property
     * @param value Value to set for the content_id property.
     */
    public void setContentId(@jakarta.annotation.Nullable final String value) {
        this.contentId = value;
    }
    /**
     * Sets the event_type property value. The event_type property
     * @param value Value to set for the event_type property.
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
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
