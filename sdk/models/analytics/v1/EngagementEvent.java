package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EngagementEvent implements Parsable {
    /**
     * The comment_text property
     */
    private String commentText;
    /**
     * The country property
     */
    private String country;
    /**
     * The device_type property
     */
    private String deviceType;
    /**
     * The engagement_type property
     */
    private String engagementType;
    /**
     * The page property
     */
    private String page;
    /**
     * The resource_id property
     */
    private String resourceId;
    /**
     * The resource_type property
     */
    private String resourceType;
    /**
     * The share_platform property
     */
    private String sharePlatform;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EngagementEvent}
     */
    @jakarta.annotation.Nonnull
    public static EngagementEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EngagementEvent();
    }
    /**
     * Gets the comment_text property value. The comment_text property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommentText() {
        return this.commentText;
    }
    /**
     * Gets the country property value. The country property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the device_type property value. The device_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceType() {
        return this.deviceType;
    }
    /**
     * Gets the engagement_type property value. The engagement_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEngagementType() {
        return this.engagementType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("comment_text", (n) -> { this.setCommentText(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("device_type", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("engagement_type", (n) -> { this.setEngagementType(n.getStringValue()); });
        deserializerMap.put("page", (n) -> { this.setPage(n.getStringValue()); });
        deserializerMap.put("resource_id", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("share_platform", (n) -> { this.setSharePlatform(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the page property value. The page property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPage() {
        return this.page;
    }
    /**
     * Gets the resource_id property value. The resource_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Gets the resource_type property value. The resource_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the share_platform property value. The share_platform property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSharePlatform() {
        return this.sharePlatform;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("comment_text", this.getCommentText());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("device_type", this.getDeviceType());
        writer.writeStringValue("engagement_type", this.getEngagementType());
        writer.writeStringValue("page", this.getPage());
        writer.writeStringValue("resource_id", this.getResourceId());
        writer.writeStringValue("resource_type", this.getResourceType());
        writer.writeStringValue("share_platform", this.getSharePlatform());
    }
    /**
     * Sets the comment_text property value. The comment_text property
     * @param value Value to set for the comment_text property.
     */
    public void setCommentText(@jakarta.annotation.Nullable final String value) {
        this.commentText = value;
    }
    /**
     * Sets the country property value. The country property
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the device_type property value. The device_type property
     * @param value Value to set for the device_type property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.deviceType = value;
    }
    /**
     * Sets the engagement_type property value. The engagement_type property
     * @param value Value to set for the engagement_type property.
     */
    public void setEngagementType(@jakarta.annotation.Nullable final String value) {
        this.engagementType = value;
    }
    /**
     * Sets the page property value. The page property
     * @param value Value to set for the page property.
     */
    public void setPage(@jakarta.annotation.Nullable final String value) {
        this.page = value;
    }
    /**
     * Sets the resource_id property value. The resource_id property
     * @param value Value to set for the resource_id property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.resourceId = value;
    }
    /**
     * Sets the resource_type property value. The resource_type property
     * @param value Value to set for the resource_type property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.resourceType = value;
    }
    /**
     * Sets the share_platform property value. The share_platform property
     * @param value Value to set for the share_platform property.
     */
    public void setSharePlatform(@jakarta.annotation.Nullable final String value) {
        this.sharePlatform = value;
    }
}
