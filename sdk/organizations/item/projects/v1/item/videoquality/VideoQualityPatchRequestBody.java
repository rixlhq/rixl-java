package com.rixl.sdk.organizations.item.projects.v1.item.videoquality;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.VideoQuality;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoQualityPatchRequestBody implements Parsable {
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * The video_quality property
     */
    private VideoQuality videoQuality;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoQualityPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static VideoQualityPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoQualityPatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("video_quality", (n) -> { this.setVideoQuality(n.getEnumValue(VideoQuality::forValue)); });
        return deserializerMap;
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
     * Gets the project_id property value. The project_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
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
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("project_id", this.getProjectId());
        writer.writeEnumValue("video_quality", this.getVideoQuality());
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the project_id property value. The project_id property
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the video_quality property value. The video_quality property
     * @param value Value to set for the video_quality property.
     */
    public void setVideoQuality(@jakarta.annotation.Nullable final VideoQuality value) {
        this.videoQuality = value;
    }
}
