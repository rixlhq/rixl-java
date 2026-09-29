package com.rixl.sdk.models.project.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.VideoQuality;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Project implements Parsable {
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * The custom_domain property
     */
    private String customDomain;
    /**
     * The id property
     */
    private String id;
    /**
     * The name property
     */
    private String name;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The regions property
     */
    private java.util.List<String> regions;
    /**
     * The updated_at property
     */
    private OffsetDateTime updatedAt;
    /**
     * The video_quality property
     */
    private VideoQuality videoQuality;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Project}
     */
    @jakarta.annotation.Nonnull
    public static Project createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Project();
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
     * Gets the custom_domain property value. The custom_domain property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomDomain() {
        return this.customDomain;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("custom_domain", (n) -> { this.setCustomDomain(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("regions", (n) -> { this.setRegions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("video_quality", (n) -> { this.setVideoQuality(n.getEnumValue(VideoQuality::forValue)); });
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
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the regions property value. The regions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRegions() {
        return this.regions;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the video_quality property value. The video_quality property
     * @return a {@link VideoQuality}
     */
    @jakarta.annotation.Nullable
    public VideoQuality getVideoQuality() {
        return this.videoQuality;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("custom_domain", this.getCustomDomain());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeCollectionOfPrimitiveValues("regions", this.getRegions());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
        writer.writeEnumValue("video_quality", this.getVideoQuality());
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the custom_domain property value. The custom_domain property
     * @param value Value to set for the custom_domain property.
     */
    public void setCustomDomain(@jakarta.annotation.Nullable final String value) {
        this.customDomain = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the regions property value. The regions property
     * @param value Value to set for the regions property.
     */
    public void setRegions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.regions = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
    /**
     * Sets the video_quality property value. The video_quality property
     * @param value Value to set for the video_quality property.
     */
    public void setVideoQuality(@jakarta.annotation.Nullable final VideoQuality value) {
        this.videoQuality = value;
    }
}
