package com.rixl.sdk.models.videos.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrackUploadTarget implements Parsable {
    /**
     * The id property
     */
    private String id;
    /**
     * The languageCode property
     */
    private String languageCode;
    /**
     * The objectKey property
     */
    private String objectKey;
    /**
     * The uploadUrl property
     */
    private String uploadUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrackUploadTarget}
     */
    @jakarta.annotation.Nonnull
    public static TrackUploadTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrackUploadTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("languageCode", (n) -> { this.setLanguageCode(n.getStringValue()); });
        deserializerMap.put("objectKey", (n) -> { this.setObjectKey(n.getStringValue()); });
        deserializerMap.put("uploadUrl", (n) -> { this.setUploadUrl(n.getStringValue()); });
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
     * Gets the languageCode property value. The languageCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Gets the objectKey property value. The objectKey property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectKey() {
        return this.objectKey;
    }
    /**
     * Gets the uploadUrl property value. The uploadUrl property
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
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("languageCode", this.getLanguageCode());
        writer.writeStringValue("objectKey", this.getObjectKey());
        writer.writeStringValue("uploadUrl", this.getUploadUrl());
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the languageCode property value. The languageCode property
     * @param value Value to set for the languageCode property.
     */
    public void setLanguageCode(@jakarta.annotation.Nullable final String value) {
        this.languageCode = value;
    }
    /**
     * Sets the objectKey property value. The objectKey property
     * @param value Value to set for the objectKey property.
     */
    public void setObjectKey(@jakarta.annotation.Nullable final String value) {
        this.objectKey = value;
    }
    /**
     * Sets the uploadUrl property value. The uploadUrl property
     * @param value Value to set for the uploadUrl property.
     */
    public void setUploadUrl(@jakarta.annotation.Nullable final String value) {
        this.uploadUrl = value;
    }
}
