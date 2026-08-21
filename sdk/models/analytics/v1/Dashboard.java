package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Dashboard implements Parsable {
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The is_default property
     */
    private Boolean isDefault;
    /**
     * The name property
     */
    private String name;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The owner_user_id property
     */
    private String ownerUserId;
    /**
     * The revision property
     */
    private Integer revision;
    /**
     * The updated_at property
     */
    private String updatedAt;
    /**
     * The updated_by property
     */
    private String updatedBy;
    /**
     * The visibility property
     */
    private String visibility;
    /**
     * The widgets property
     */
    private java.util.List<Widget> widgets;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Dashboard}
     */
    @jakarta.annotation.Nonnull
    public static Dashboard createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Dashboard();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("is_default", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("owner_user_id", (n) -> { this.setOwnerUserId(n.getStringValue()); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getIntegerValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getStringValue()); });
        deserializerMap.put("updated_by", (n) -> { this.setUpdatedBy(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getStringValue()); });
        deserializerMap.put("widgets", (n) -> { this.setWidgets(n.getCollectionOfObjectValues(Widget::createFromDiscriminatorValue)); });
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
     * Gets the is_default property value. The is_default property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
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
     * Gets the owner_user_id property value. The owner_user_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerUserId() {
        return this.ownerUserId;
    }
    /**
     * Gets the revision property value. The revision property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRevision() {
        return this.revision;
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
     * Gets the updated_by property value. The updated_by property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    /**
     * Gets the visibility property value. The visibility property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVisibility() {
        return this.visibility;
    }
    /**
     * Gets the widgets property value. The widgets property
     * @return a {@link java.util.List<Widget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Widget> getWidgets() {
        return this.widgets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("is_default", this.getIsDefault());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("owner_user_id", this.getOwnerUserId());
        writer.writeIntegerValue("revision", this.getRevision());
        writer.writeStringValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("updated_by", this.getUpdatedBy());
        writer.writeStringValue("visibility", this.getVisibility());
        writer.writeCollectionOfObjectValues("widgets", this.getWidgets());
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the is_default property value. The is_default property
     * @param value Value to set for the is_default property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefault = value;
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
     * Sets the owner_user_id property value. The owner_user_id property
     * @param value Value to set for the owner_user_id property.
     */
    public void setOwnerUserId(@jakarta.annotation.Nullable final String value) {
        this.ownerUserId = value;
    }
    /**
     * Sets the revision property value. The revision property
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final Integer value) {
        this.revision = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final String value) {
        this.updatedAt = value;
    }
    /**
     * Sets the updated_by property value. The updated_by property
     * @param value Value to set for the updated_by property.
     */
    public void setUpdatedBy(@jakarta.annotation.Nullable final String value) {
        this.updatedBy = value;
    }
    /**
     * Sets the visibility property value. The visibility property
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final String value) {
        this.visibility = value;
    }
    /**
     * Sets the widgets property value. The widgets property
     * @param value Value to set for the widgets property.
     */
    public void setWidgets(@jakarta.annotation.Nullable final java.util.List<Widget> value) {
        this.widgets = value;
    }
}
