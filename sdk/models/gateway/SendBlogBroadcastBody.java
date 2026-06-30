package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Broadcast payload
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendBlogBroadcastBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category property
     */
    private String category;
    /**
     * The commit_sha property
     */
    private String commitSha;
    /**
     * The description property
     */
    private String description;
    /**
     * The published_at property
     */
    private String publishedAt;
    /**
     * The read_more_url property
     */
    private String readMoreUrl;
    /**
     * The slug property
     */
    private String slug;
    /**
     * The title property
     */
    private String title;
    /**
     * Instantiates a new {@link SendBlogBroadcastBody} and sets the default values.
     */
    public SendBlogBroadcastBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendBlogBroadcastBody}
     */
    @jakarta.annotation.Nonnull
    public static SendBlogBroadcastBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendBlogBroadcastBody();
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
     * Gets the category property value. The category property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the commit_sha property value. The commit_sha property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommitSha() {
        return this.commitSha;
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
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("commit_sha", (n) -> { this.setCommitSha(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("published_at", (n) -> { this.setPublishedAt(n.getStringValue()); });
        deserializerMap.put("read_more_url", (n) -> { this.setReadMoreUrl(n.getStringValue()); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the published_at property value. The published_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublishedAt() {
        return this.publishedAt;
    }
    /**
     * Gets the read_more_url property value. The read_more_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReadMoreUrl() {
        return this.readMoreUrl;
    }
    /**
     * Gets the slug property value. The slug property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Gets the title property value. The title property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("commit_sha", this.getCommitSha());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("published_at", this.getPublishedAt());
        writer.writeStringValue("read_more_url", this.getReadMoreUrl());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the commit_sha property value. The commit_sha property
     * @param value Value to set for the commit_sha property.
     */
    public void setCommitSha(@jakarta.annotation.Nullable final String value) {
        this.commitSha = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the published_at property value. The published_at property
     * @param value Value to set for the published_at property.
     */
    public void setPublishedAt(@jakarta.annotation.Nullable final String value) {
        this.publishedAt = value;
    }
    /**
     * Sets the read_more_url property value. The read_more_url property
     * @param value Value to set for the read_more_url property.
     */
    public void setReadMoreUrl(@jakarta.annotation.Nullable final String value) {
        this.readMoreUrl = value;
    }
    /**
     * Sets the slug property value. The slug property
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
