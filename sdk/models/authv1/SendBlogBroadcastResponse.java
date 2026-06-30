package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendBlogBroadcastResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The broadcast_id property
     */
    private String broadcastId;
    /**
     * The scheduled_at property
     */
    private String scheduledAt;
    /**
     * The sent_at property
     */
    private String sentAt;
    /**
     * Instantiates a new {@link SendBlogBroadcastResponse} and sets the default values.
     */
    public SendBlogBroadcastResponse() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
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
        deserializerMap.put("scheduled_at", (n) -> { this.setScheduledAt(n.getStringValue()); });
        deserializerMap.put("sent_at", (n) -> { this.setSentAt(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scheduled_at property value. The scheduled_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduledAt() {
        return this.scheduledAt;
    }
    /**
     * Gets the sent_at property value. The sent_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSentAt() {
        return this.sentAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("broadcast_id", this.getBroadcastId());
        writer.writeStringValue("scheduled_at", this.getScheduledAt());
        writer.writeStringValue("sent_at", this.getSentAt());
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
    public void setScheduledAt(@jakarta.annotation.Nullable final String value) {
        this.scheduledAt = value;
    }
    /**
     * Sets the sent_at property value. The sent_at property
     * @param value Value to set for the sent_at property.
     */
    public void setSentAt(@jakarta.annotation.Nullable final String value) {
        this.sentAt = value;
    }
}
