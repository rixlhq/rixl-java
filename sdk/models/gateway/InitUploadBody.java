package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Upload initialization request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InitUploadBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The content_type property
     */
    private InitUploadBodyContentType contentType;
    /**
     * The creator_id property
     */
    private String creatorId;
    /**
     * The description property
     */
    private String description;
    /**
     * The file_name property
     */
    private String fileName;
    /**
     * The format property
     */
    private String format;
    /**
     * The image_format property
     */
    private String imageFormat;
    /**
     * The video_quality property
     */
    private String videoQuality;
    /**
     * Instantiates a new {@link InitUploadBody} and sets the default values.
     */
    public InitUploadBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InitUploadBody}
     */
    @jakarta.annotation.Nonnull
    public static InitUploadBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InitUploadBody();
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
     * Gets the content_type property value. The content_type property
     * @return a {@link InitUploadBodyContentType}
     */
    @jakarta.annotation.Nullable
    public InitUploadBodyContentType getContentType() {
        return this.contentType;
    }
    /**
     * Gets the creator_id property value. The creator_id property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("content_type", (n) -> { this.setContentType(n.getEnumValue(InitUploadBodyContentType::forValue)); });
        deserializerMap.put("creator_id", (n) -> { this.setCreatorId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("file_name", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("image_format", (n) -> { this.setImageFormat(n.getStringValue()); });
        deserializerMap.put("video_quality", (n) -> { this.setVideoQuality(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file_name property value. The file_name property
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
     * Gets the image_format property value. The image_format property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageFormat() {
        return this.imageFormat;
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
        writer.writeEnumValue("content_type", this.getContentType());
        writer.writeStringValue("creator_id", this.getCreatorId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("file_name", this.getFileName());
        writer.writeStringValue("format", this.getFormat());
        writer.writeStringValue("image_format", this.getImageFormat());
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
     * Sets the content_type property value. The content_type property
     * @param value Value to set for the content_type property.
     */
    public void setContentType(@jakarta.annotation.Nullable final InitUploadBodyContentType value) {
        this.contentType = value;
    }
    /**
     * Sets the creator_id property value. The creator_id property
     * @param value Value to set for the creator_id property.
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
     * Sets the file_name property value. The file_name property
     * @param value Value to set for the file_name property.
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
     * Sets the image_format property value. The image_format property
     * @param value Value to set for the image_format property.
     */
    public void setImageFormat(@jakarta.annotation.Nullable final String value) {
        this.imageFormat = value;
    }
    /**
     * Sets the video_quality property value. The video_quality property
     * @param value Value to set for the video_quality property.
     */
    public void setVideoQuality(@jakarta.annotation.Nullable final String value) {
        this.videoQuality = value;
    }
}
