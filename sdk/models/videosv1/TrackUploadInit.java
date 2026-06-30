package com.rixl.sdk.models.videosv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrackUploadInit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The expires_at property
     */
    private String expiresAt;
    /**
     * The targets property
     */
    private java.util.List<TrackUploadTarget> targets;
    /**
     * Instantiates a new {@link TrackUploadInit} and sets the default values.
     */
    public TrackUploadInit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrackUploadInit}
     */
    @jakarta.annotation.Nonnull
    public static TrackUploadInit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrackUploadInit();
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
     * Gets the expires_at property value. The expires_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getStringValue()); });
        deserializerMap.put("targets", (n) -> { this.setTargets(n.getCollectionOfObjectValues(TrackUploadTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the targets property value. The targets property
     * @return a {@link java.util.List<TrackUploadTarget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrackUploadTarget> getTargets() {
        return this.targets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expires_at", this.getExpiresAt());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
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
     * Sets the expires_at property value. The expires_at property
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final String value) {
        this.expiresAt = value;
    }
    /**
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     */
    public void setTargets(@jakarta.annotation.Nullable final java.util.List<TrackUploadTarget> value) {
        this.targets = value;
    }
}
