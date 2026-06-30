package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Video upload details
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateVideoUploadBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The image_format property
     */
    private String imageFormat;
    /**
     * The name property
     */
    private String name;
    /**
     * The video_quality property
     */
    private String videoQuality;
    /**
     * Instantiates a new {@link CreateVideoUploadBody} and sets the default values.
     */
    public CreateVideoUploadBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateVideoUploadBody}
     */
    @jakarta.annotation.Nonnull
    public static CreateVideoUploadBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateVideoUploadBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("image_format", (n) -> { this.setImageFormat(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("video_quality", (n) -> { this.setVideoQuality(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
        writer.writeStringValue("image_format", this.getImageFormat());
        writer.writeStringValue("name", this.getName());
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
     * Sets the image_format property value. The image_format property
     * @param value Value to set for the image_format property.
     */
    public void setImageFormat(@jakarta.annotation.Nullable final String value) {
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
     * Sets the video_quality property value. The video_quality property
     * @param value Value to set for the video_quality property.
     */
    public void setVideoQuality(@jakarta.annotation.Nullable final String value) {
        this.videoQuality = value;
    }
}
