package com.rixl.sdk.models.webhooks.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * WebhookAttempt is one recorded delivery attempt for an event/endpoint pair.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebhookAttempt implements Parsable {
    /**
     * The attempt property
     */
    private Integer attempt;
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * The duration_ms property
     */
    private Integer durationMs;
    /**
     * The error property
     */
    private String error;
    /**
     * The event_id property
     */
    private String eventId;
    /**
     * The id property
     */
    private String id;
    /**
     * True when this delivery was triggered by ReplayEvent or SendTestEvent rather than the original subscription fan-out.
     */
    private Boolean replay;
    /**
     * First 1 KiB of the endpoint&apos;s response body.
     */
    private String responseSnippet;
    /**
     * The status_code property
     */
    private Integer statusCode;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebhookAttempt}
     */
    @jakarta.annotation.Nonnull
    public static WebhookAttempt createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebhookAttempt();
    }
    /**
     * Gets the attempt property value. The attempt property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAttempt() {
        return this.attempt;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the duration_ms property value. The duration_ms property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDurationMs() {
        return this.durationMs;
    }
    /**
     * Gets the error property value. The error property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("attempt", (n) -> { this.setAttempt(n.getIntegerValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("duration_ms", (n) -> { this.setDurationMs(n.getIntegerValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("event_id", (n) -> { this.setEventId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("replay", (n) -> { this.setReplay(n.getBooleanValue()); });
        deserializerMap.put("response_snippet", (n) -> { this.setResponseSnippet(n.getStringValue()); });
        deserializerMap.put("status_code", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the replay property value. True when this delivery was triggered by ReplayEvent or SendTestEvent rather than the original subscription fan-out.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReplay() {
        return this.replay;
    }
    /**
     * Gets the response_snippet property value. First 1 KiB of the endpoint&apos;s response body.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResponseSnippet() {
        return this.responseSnippet;
    }
    /**
     * Gets the status_code property value. The status_code property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("attempt", this.getAttempt());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeIntegerValue("duration_ms", this.getDurationMs());
        writer.writeStringValue("error", this.getError());
        writer.writeStringValue("event_id", this.getEventId());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("replay", this.getReplay());
        writer.writeStringValue("response_snippet", this.getResponseSnippet());
        writer.writeIntegerValue("status_code", this.getStatusCode());
    }
    /**
     * Sets the attempt property value. The attempt property
     * @param value Value to set for the attempt property.
     */
    public void setAttempt(@jakarta.annotation.Nullable final Integer value) {
        this.attempt = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the duration_ms property value. The duration_ms property
     * @param value Value to set for the duration_ms property.
     */
    public void setDurationMs(@jakarta.annotation.Nullable final Integer value) {
        this.durationMs = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the event_id property value. The event_id property
     * @param value Value to set for the event_id property.
     */
    public void setEventId(@jakarta.annotation.Nullable final String value) {
        this.eventId = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the replay property value. True when this delivery was triggered by ReplayEvent or SendTestEvent rather than the original subscription fan-out.
     * @param value Value to set for the replay property.
     */
    public void setReplay(@jakarta.annotation.Nullable final Boolean value) {
        this.replay = value;
    }
    /**
     * Sets the response_snippet property value. First 1 KiB of the endpoint&apos;s response body.
     * @param value Value to set for the response_snippet property.
     */
    public void setResponseSnippet(@jakarta.annotation.Nullable final String value) {
        this.responseSnippet = value;
    }
    /**
     * Sets the status_code property value. The status_code property
     * @param value Value to set for the status_code property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
}
