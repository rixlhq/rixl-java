package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.google.protobuf.Struct;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationAuditEvent implements Parsable {
    /**
     * The action property
     */
    private String action;
    /**
     * The actor_id property
     */
    private String actorId;
    /**
     * The actor_type property
     */
    private String actorType;
    /**
     * The id property
     */
    private String id;
    /**
     * A JSON object whose property values may be any JSON value.
     */
    private Struct metadata;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime occurredAt;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The target_id property
     */
    private String targetId;
    /**
     * The target_type property
     */
    private String targetType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationAuditEvent}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationAuditEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationAuditEvent();
    }
    /**
     * Gets the action property value. The action property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAction() {
        return this.action;
    }
    /**
     * Gets the actor_id property value. The actor_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorId() {
        return this.actorId;
    }
    /**
     * Gets the actor_type property value. The actor_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorType() {
        return this.actorType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("action", (n) -> { this.setAction(n.getStringValue()); });
        deserializerMap.put("actor_id", (n) -> { this.setActorId(n.getStringValue()); });
        deserializerMap.put("actor_type", (n) -> { this.setActorType(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(Struct::createFromDiscriminatorValue)); });
        deserializerMap.put("occurred_at", (n) -> { this.setOccurredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("target_id", (n) -> { this.setTargetId(n.getStringValue()); });
        deserializerMap.put("target_type", (n) -> { this.setTargetType(n.getStringValue()); });
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
     * Gets the metadata property value. A JSON object whose property values may be any JSON value.
     * @return a {@link Struct}
     */
    @jakarta.annotation.Nullable
    public Struct getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the occurred_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOccurredAt() {
        return this.occurredAt;
    }
    /**
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the target_id property value. The target_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetId() {
        return this.targetId;
    }
    /**
     * Gets the target_type property value. The target_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetType() {
        return this.targetType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("action", this.getAction());
        writer.writeStringValue("actor_id", this.getActorId());
        writer.writeStringValue("actor_type", this.getActorType());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeOffsetDateTimeValue("occurred_at", this.getOccurredAt());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("target_id", this.getTargetId());
        writer.writeStringValue("target_type", this.getTargetType());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final String value) {
        this.action = value;
    }
    /**
     * Sets the actor_id property value. The actor_id property
     * @param value Value to set for the actor_id property.
     */
    public void setActorId(@jakarta.annotation.Nullable final String value) {
        this.actorId = value;
    }
    /**
     * Sets the actor_type property value. The actor_type property
     * @param value Value to set for the actor_type property.
     */
    public void setActorType(@jakarta.annotation.Nullable final String value) {
        this.actorType = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the metadata property value. A JSON object whose property values may be any JSON value.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final Struct value) {
        this.metadata = value;
    }
    /**
     * Sets the occurred_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the occurred_at property.
     */
    public void setOccurredAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.occurredAt = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the target_id property value. The target_id property
     * @param value Value to set for the target_id property.
     */
    public void setTargetId(@jakarta.annotation.Nullable final String value) {
        this.targetId = value;
    }
    /**
     * Sets the target_type property value. The target_type property
     * @param value Value to set for the target_type property.
     */
    public void setTargetType(@jakarta.annotation.Nullable final String value) {
        this.targetType = value;
    }
}
