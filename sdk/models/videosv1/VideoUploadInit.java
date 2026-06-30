package com.rixl.sdk.models.videosv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoUploadInit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The expires_at property
     */
    private String expiresAt;
    /**
     * The poster_id property
     */
    private String posterId;
    /**
     * The poster_upload_url property
     */
    private String posterUploadUrl;
    /**
     * The video_id property
     */
    private String videoId;
    /**
     * The video_upload_url property
     */
    private String videoUploadUrl;
    /**
     * Instantiates a new {@link VideoUploadInit} and sets the default values.
     */
    public VideoUploadInit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoUploadInit}
     */
    @jakarta.annotation.Nonnull
    public static VideoUploadInit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoUploadInit();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getStringValue()); });
        deserializerMap.put("poster_id", (n) -> { this.setPosterId(n.getStringValue()); });
        deserializerMap.put("poster_upload_url", (n) -> { this.setPosterUploadUrl(n.getStringValue()); });
        deserializerMap.put("video_id", (n) -> { this.setVideoId(n.getStringValue()); });
        deserializerMap.put("video_upload_url", (n) -> { this.setVideoUploadUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the poster_id property value. The poster_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPosterId() {
        return this.posterId;
    }
    /**
     * Gets the poster_upload_url property value. The poster_upload_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPosterUploadUrl() {
        return this.posterUploadUrl;
    }
    /**
     * Gets the video_id property value. The video_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Gets the video_upload_url property value. The video_upload_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoUploadUrl() {
        return this.videoUploadUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("poster_id", this.getPosterId());
        writer.writeStringValue("poster_upload_url", this.getPosterUploadUrl());
        writer.writeStringValue("video_id", this.getVideoId());
        writer.writeStringValue("video_upload_url", this.getVideoUploadUrl());
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
     * Sets the poster_id property value. The poster_id property
     * @param value Value to set for the poster_id property.
     */
    public void setPosterId(@jakarta.annotation.Nullable final String value) {
        this.posterId = value;
    }
    /**
     * Sets the poster_upload_url property value. The poster_upload_url property
     * @param value Value to set for the poster_upload_url property.
     */
    public void setPosterUploadUrl(@jakarta.annotation.Nullable final String value) {
        this.posterUploadUrl = value;
    }
    /**
     * Sets the video_id property value. The video_id property
     * @param value Value to set for the video_id property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
    /**
     * Sets the video_upload_url property value. The video_upload_url property
     * @param value Value to set for the video_upload_url property.
     */
    public void setVideoUploadUrl(@jakarta.annotation.Nullable final String value) {
        this.videoUploadUrl = value;
    }
}
