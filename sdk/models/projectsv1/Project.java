package com.rixl.sdk.models.projectsv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Project implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The created_at property
     */
    private String createdAt;
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
    private String updatedAt;
    /**
     * The video_quality property
     */
    private String videoQuality;
    /**
     * Instantiates a new {@link Project} and sets the default values.
     */
    public Project() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
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
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("custom_domain", (n) -> { this.setCustomDomain(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("regions", (n) -> { this.setRegions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getStringValue()); });
        deserializerMap.put("video_quality", (n) -> { this.setVideoQuality(n.getStringValue()); });
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the video_quality property value. The video_quality property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoQuality() {
        return this.videoQuality;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("custom_domain", this.getCustomDomain());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeCollectionOfPrimitiveValues("regions", this.getRegions());
        writer.writeStringValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("video_quality", this.getVideoQuality());
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
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
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
    public void setUpdatedAt(@jakarta.annotation.Nullable final String value) {
        this.updatedAt = value;
    }
    /**
     * Sets the video_quality property value. The video_quality property
     * @param value Value to set for the video_quality property.
     */
    public void setVideoQuality(@jakarta.annotation.Nullable final String value) {
        this.videoQuality = value;
    }
}
