package com.rixl.sdk.media.v1.projects.item.videos.upload;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.ImageFormat;
import com.rixl.sdk.models.common.v1.VideoQuality;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadPostRequestBody implements Parsable {
    /**
     * The imageFormat property
     */
    private ImageFormat imageFormat;
    /**
     * The name property
     */
    private String name;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * The videoQuality property
     */
    private VideoQuality videoQuality;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UploadPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UploadPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadPostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("imageFormat", (n) -> { this.setImageFormat(n.getEnumValue(ImageFormat::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("videoQuality", (n) -> { this.setVideoQuality(n.getEnumValue(VideoQuality::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the imageFormat property value. The imageFormat property
     * @return a {@link ImageFormat}
     */
    @jakarta.annotation.Nullable
    public ImageFormat getImageFormat() {
        return this.imageFormat;
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
     * Gets the orgId property value. The orgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the videoQuality property value. The videoQuality property
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
        writer.writeEnumValue("imageFormat", this.getImageFormat());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeEnumValue("videoQuality", this.getVideoQuality());
    }
    /**
     * Sets the imageFormat property value. The imageFormat property
     * @param value Value to set for the imageFormat property.
     */
    public void setImageFormat(@jakarta.annotation.Nullable final ImageFormat value) {
        this.imageFormat = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the videoQuality property value. The videoQuality property
     * @param value Value to set for the videoQuality property.
     */
    public void setVideoQuality(@jakarta.annotation.Nullable final VideoQuality value) {
        this.videoQuality = value;
    }
}
