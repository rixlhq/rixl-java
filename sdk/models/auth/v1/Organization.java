package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Organization implements Parsable {
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime createdAt;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime deleteTime;
    /**
     * The id property
     */
    private String id;
    /**
     * The image_id property
     */
    private String imageId;
    /**
     * The internal property
     */
    private Boolean internal;
    /**
     * The name property
     */
    private String name;
    /**
     * The personal property
     */
    private Boolean personal;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime purgeTime;
    /**
     * The slug property
     */
    private String slug;
    /**
     * The state property
     */
    private OrganizationState state;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Organization}
     */
    @jakarta.annotation.Nonnull
    public static Organization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Organization();
    }
    /**
     * Gets the created_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the delete_time property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("delete_time", (n) -> { this.setDeleteTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("image_id", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("internal", (n) -> { this.setInternal(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("personal", (n) -> { this.setPersonal(n.getBooleanValue()); });
        deserializerMap.put("purge_time", (n) -> { this.setPurgeTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(OrganizationState::forValue)); });
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
     * Gets the image_id property value. The image_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageId() {
        return this.imageId;
    }
    /**
     * Gets the internal property value. The internal property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInternal() {
        return this.internal;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the personal property value. The personal property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPersonal() {
        return this.personal;
    }
    /**
     * Gets the purge_time property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPurgeTime() {
        return this.purgeTime;
    }
    /**
     * Gets the slug property value. The slug property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link OrganizationState}
     */
    @jakarta.annotation.Nullable
    public OrganizationState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeOffsetDateTimeValue("delete_time", this.getDeleteTime());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("image_id", this.getImageId());
        writer.writeBooleanValue("internal", this.getInternal());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("personal", this.getPersonal());
        writer.writeOffsetDateTimeValue("purge_time", this.getPurgeTime());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the created_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the delete_time property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the delete_time property.
     */
    public void setDeleteTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deleteTime = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the image_id property value. The image_id property
     * @param value Value to set for the image_id property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.imageId = value;
    }
    /**
     * Sets the internal property value. The internal property
     * @param value Value to set for the internal property.
     */
    public void setInternal(@jakarta.annotation.Nullable final Boolean value) {
        this.internal = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the personal property value. The personal property
     * @param value Value to set for the personal property.
     */
    public void setPersonal(@jakarta.annotation.Nullable final Boolean value) {
        this.personal = value;
    }
    /**
     * Sets the purge_time property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the purge_time property.
     */
    public void setPurgeTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.purgeTime = value;
    }
    /**
     * Sets the slug property value. The slug property
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final OrganizationState value) {
        this.state = value;
    }
}
