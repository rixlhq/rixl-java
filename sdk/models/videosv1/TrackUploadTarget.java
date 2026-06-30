package com.rixl.sdk.models.videosv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrackUploadTarget implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The id property
     */
    private String id;
    /**
     * The language_code property
     */
    private String languageCode;
    /**
     * The object_key property
     */
    private String objectKey;
    /**
     * The upload_url property
     */
    private String uploadUrl;
    /**
     * Instantiates a new {@link TrackUploadTarget} and sets the default values.
     */
    public TrackUploadTarget() {
        this.setAdditionalData(new HashMap<>());
    }
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("language_code", (n) -> { this.setLanguageCode(n.getStringValue()); });
        deserializerMap.put("object_key", (n) -> { this.setObjectKey(n.getStringValue()); });
        deserializerMap.put("upload_url", (n) -> { this.setUploadUrl(n.getStringValue()); });
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
     * Gets the language_code property value. The language_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Gets the object_key property value. The object_key property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectKey() {
        return this.objectKey;
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
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("language_code", this.getLanguageCode());
        writer.writeStringValue("object_key", this.getObjectKey());
        writer.writeStringValue("upload_url", this.getUploadUrl());
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the language_code property value. The language_code property
     * @param value Value to set for the language_code property.
     */
    public void setLanguageCode(@jakarta.annotation.Nullable final String value) {
        this.languageCode = value;
    }
    /**
     * Sets the object_key property value. The object_key property
     * @param value Value to set for the object_key property.
     */
    public void setObjectKey(@jakarta.annotation.Nullable final String value) {
        this.objectKey = value;
    }
    /**
     * Sets the upload_url property value. The upload_url property
     * @param value Value to set for the upload_url property.
     */
    public void setUploadUrl(@jakarta.annotation.Nullable final String value) {
        this.uploadUrl = value;
    }
}
