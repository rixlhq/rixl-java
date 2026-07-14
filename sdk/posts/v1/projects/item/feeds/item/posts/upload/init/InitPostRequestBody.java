package com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.upload.init;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.ImageFormat;
import com.rixl.sdk.models.common.v1.MediaType;
import com.rixl.sdk.models.common.v1.VideoQuality;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InitPostRequestBody implements Parsable {
    /**
     * The contentType property
     */
    private MediaType contentType;
    /**
     * The creatorId property
     */
    private String creatorId;
    /**
     * The description property
     */
    private String description;
    /**
     * The fileName property
     */
    private String fileName;
    /**
     * The format property
     */
    private String format;
    /**
     * The imageFormat property
     */
    private ImageFormat imageFormat;
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
     * @return a {@link InitPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static InitPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InitPostRequestBody();
    }
    /**
     * Gets the contentType property value. The contentType property
     * @return a {@link MediaType}
     */
    @jakarta.annotation.Nullable
    public MediaType getContentType() {
        return this.contentType;
    }
    /**
     * Gets the creatorId property value. The creatorId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatorId() {
        return this.creatorId;
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getEnumValue(MediaType::forValue)); });
        deserializerMap.put("creatorId", (n) -> { this.setCreatorId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("imageFormat", (n) -> { this.setImageFormat(n.getEnumValue(ImageFormat::forValue)); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("videoQuality", (n) -> { this.setVideoQuality(n.getEnumValue(VideoQuality::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the format property value. The format property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.format;
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
        writer.writeEnumValue("contentType", this.getContentType());
        writer.writeStringValue("creatorId", this.getCreatorId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("format", this.getFormat());
        writer.writeEnumValue("imageFormat", this.getImageFormat());
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeEnumValue("videoQuality", this.getVideoQuality());
    }
    /**
     * Sets the contentType property value. The contentType property
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final MediaType value) {
        this.contentType = value;
    }
    /**
     * Sets the creatorId property value. The creatorId property
     * @param value Value to set for the creatorId property.
     */
    public void setCreatorId(@jakarta.annotation.Nullable final String value) {
        this.creatorId = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the format property value. The format property
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.format = value;
    }
    /**
     * Sets the imageFormat property value. The imageFormat property
     * @param value Value to set for the imageFormat property.
     */
    public void setImageFormat(@jakarta.annotation.Nullable final ImageFormat value) {
        this.imageFormat = value;
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
