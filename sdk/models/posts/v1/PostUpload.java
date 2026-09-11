package com.rixl.sdk.models.posts.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PostUpload implements Parsable {
    /**
     * The content_id property
     */
    private String contentId;
    /**
     * The content_upload_url property
     */
    private String contentUploadUrl;
    /**
     * The poster_id property
     */
    private String posterId;
    /**
     * The poster_upload_url property
     */
    private String posterUploadUrl;
    /**
     * The post_id property
     */
    private String postId;
    /**
     * The upload_expires property
     */
    private OffsetDateTime uploadExpires;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PostUpload}
     */
    @jakarta.annotation.Nonnull
    public static PostUpload createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PostUpload();
    }
    /**
     * Gets the content_id property value. The content_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Gets the content_upload_url property value. The content_upload_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentUploadUrl() {
        return this.contentUploadUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("content_id", (n) -> { this.setContentId(n.getStringValue()); });
        deserializerMap.put("content_upload_url", (n) -> { this.setContentUploadUrl(n.getStringValue()); });
        deserializerMap.put("poster_id", (n) -> { this.setPosterId(n.getStringValue()); });
        deserializerMap.put("poster_upload_url", (n) -> { this.setPosterUploadUrl(n.getStringValue()); });
        deserializerMap.put("post_id", (n) -> { this.setPostId(n.getStringValue()); });
        deserializerMap.put("upload_expires", (n) -> { this.setUploadExpires(n.getOffsetDateTimeValue()); });
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
     * Gets the post_id property value. The post_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostId() {
        return this.postId;
    }
    /**
     * Gets the upload_expires property value. The upload_expires property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUploadExpires() {
        return this.uploadExpires;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content_id", this.getContentId());
        writer.writeStringValue("content_upload_url", this.getContentUploadUrl());
        writer.writeStringValue("poster_id", this.getPosterId());
        writer.writeStringValue("poster_upload_url", this.getPosterUploadUrl());
        writer.writeStringValue("post_id", this.getPostId());
        writer.writeOffsetDateTimeValue("upload_expires", this.getUploadExpires());
    }
    /**
     * Sets the content_id property value. The content_id property
     * @param value Value to set for the content_id property.
     */
    public void setContentId(@jakarta.annotation.Nullable final String value) {
        this.contentId = value;
    }
    /**
     * Sets the content_upload_url property value. The content_upload_url property
     * @param value Value to set for the content_upload_url property.
     */
    public void setContentUploadUrl(@jakarta.annotation.Nullable final String value) {
        this.contentUploadUrl = value;
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
     * Sets the post_id property value. The post_id property
     * @param value Value to set for the post_id property.
     */
    public void setPostId(@jakarta.annotation.Nullable final String value) {
        this.postId = value;
    }
    /**
     * Sets the upload_expires property value. The upload_expires property
     * @param value Value to set for the upload_expires property.
     */
    public void setUploadExpires(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.uploadExpires = value;
    }
}
