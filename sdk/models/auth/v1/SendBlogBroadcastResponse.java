package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendBlogBroadcastResponse implements Parsable {
    /**
     * The broadcast_id property
     */
    private String broadcastId;
    /**
     * The scheduled_at property
     */
    private OffsetDateTime scheduledAt;
    /**
     * The sent_at property
     */
    private OffsetDateTime sentAt;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendBlogBroadcastResponse}
     */
    @jakarta.annotation.Nonnull
    public static SendBlogBroadcastResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendBlogBroadcastResponse();
    }
    /**
     * Gets the broadcast_id property value. The broadcast_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBroadcastId() {
        return this.broadcastId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("broadcast_id", (n) -> { this.setBroadcastId(n.getStringValue()); });
        deserializerMap.put("scheduled_at", (n) -> { this.setScheduledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sent_at", (n) -> { this.setSentAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scheduled_at property value. The scheduled_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledAt() {
        return this.scheduledAt;
    }
    /**
     * Gets the sent_at property value. The sent_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSentAt() {
        return this.sentAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("broadcast_id", this.getBroadcastId());
        writer.writeOffsetDateTimeValue("scheduled_at", this.getScheduledAt());
        writer.writeOffsetDateTimeValue("sent_at", this.getSentAt());
    }
    /**
     * Sets the broadcast_id property value. The broadcast_id property
     * @param value Value to set for the broadcast_id property.
     */
    public void setBroadcastId(@jakarta.annotation.Nullable final String value) {
        this.broadcastId = value;
    }
    /**
     * Sets the scheduled_at property value. The scheduled_at property
     * @param value Value to set for the scheduled_at property.
     */
    public void setScheduledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledAt = value;
    }
    /**
     * Sets the sent_at property value. The sent_at property
     * @param value Value to set for the sent_at property.
     */
    public void setSentAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.sentAt = value;
    }
}
