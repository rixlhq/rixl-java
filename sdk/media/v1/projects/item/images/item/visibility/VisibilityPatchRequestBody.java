package com.rixl.sdk.media.v1.projects.item.images.item.visibility;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.Visibility;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VisibilityPatchRequestBody implements Parsable {
    /**
     * The image_id property
     */
    private String imageId;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * The visibility property
     */
    private Visibility visibility;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VisibilityPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static VisibilityPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VisibilityPatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("image_id", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumValue(Visibility::forValue)); });
        return deserializerMap;
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
     * Gets the project_id property value. The project_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Gets the visibility property value. The visibility property
     * @return a {@link Visibility}
     */
    @jakarta.annotation.Nullable
    public Visibility getVisibility() {
        return this.visibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("image_id", this.getImageId());
        writer.writeStringValue("project_id", this.getProjectId());
        writer.writeEnumValue("visibility", this.getVisibility());
    }
    /**
     * Sets the image_id property value. The image_id property
     * @param value Value to set for the image_id property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.imageId = value;
    }
    /**
     * Sets the project_id property value. The project_id property
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the visibility property value. The visibility property
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final Visibility value) {
        this.visibility = value;
    }
}
