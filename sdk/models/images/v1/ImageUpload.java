package com.rixl.sdk.models.images.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImageUpload implements Parsable {
    /**
     * The expires_at property
     */
    private OffsetDateTime expiresAt;
    /**
     * The image_id property
     */
    private String imageId;
    /**
     * The upload_url property
     */
    private String uploadUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImageUpload}
     */
    @jakarta.annotation.Nonnull
    public static ImageUpload createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageUpload();
    }
    /**
     * Gets the expires_at property value. The expires_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("image_id", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("upload_url", (n) -> { this.setUploadUrl(n.getStringValue()); });
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
     * Gets the upload_url property value. The upload_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUploadUrl() {
        return this.uploadUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("image_id", this.getImageId());
        writer.writeStringValue("upload_url", this.getUploadUrl());
    }
    /**
     * Sets the expires_at property value. The expires_at property
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the image_id property value. The image_id property
     * @param value Value to set for the image_id property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.imageId = value;
    }
    /**
     * Sets the upload_url property value. The upload_url property
     * @param value Value to set for the upload_url property.
     */
    public void setUploadUrl(@jakarta.annotation.Nullable final String value) {
        this.uploadUrl = value;
    }
}
