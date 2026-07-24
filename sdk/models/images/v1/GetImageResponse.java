package com.rixl.sdk.models.images.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.Visibility;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetImageResponse implements Parsable {
    /**
     * The attached_to_video property
     */
    private Boolean attachedToVideo;
    /**
     * The file property
     */
    private ImageFile file;
    /**
     * The height property
     */
    private Integer height;
    /**
     * The id property
     */
    private String id;
    /**
     * The thumbhash property
     */
    private String thumbhash;
    /**
     * The visibility property
     */
    private Visibility visibility;
    /**
     * The width property
     */
    private Integer width;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetImageResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetImageResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetImageResponse();
    }
    /**
     * Gets the attached_to_video property value. The attached_to_video property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAttachedToVideo() {
        return this.attachedToVideo;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("attached_to_video", (n) -> { this.setAttachedToVideo(n.getBooleanValue()); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getObjectValue(ImageFile::createFromDiscriminatorValue)); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("thumbhash", (n) -> { this.setThumbhash(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumValue(Visibility::forValue)); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. The file property
     * @return a {@link ImageFile}
     */
    @jakarta.annotation.Nullable
    public ImageFile getFile() {
        return this.file;
    }
    /**
     * Gets the height property value. The height property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
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
     * Gets the thumbhash property value. The thumbhash property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbhash() {
        return this.thumbhash;
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
     * Gets the width property value. The width property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("attached_to_video", this.getAttachedToVideo());
        writer.writeObjectValue("file", this.getFile());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("thumbhash", this.getThumbhash());
        writer.writeEnumValue("visibility", this.getVisibility());
        writer.writeIntegerValue("width", this.getWidth());
    }
    /**
     * Sets the attached_to_video property value. The attached_to_video property
     * @param value Value to set for the attached_to_video property.
     */
    public void setAttachedToVideo(@jakarta.annotation.Nullable final Boolean value) {
        this.attachedToVideo = value;
    }
    /**
     * Sets the file property value. The file property
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final ImageFile value) {
        this.file = value;
    }
    /**
     * Sets the height property value. The height property
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the thumbhash property value. The thumbhash property
     * @param value Value to set for the thumbhash property.
     */
    public void setThumbhash(@jakarta.annotation.Nullable final String value) {
        this.thumbhash = value;
    }
    /**
     * Sets the visibility property value. The visibility property
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final Visibility value) {
        this.visibility = value;
    }
    /**
     * Sets the width property value. The width property
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}
