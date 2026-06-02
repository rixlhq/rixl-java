package com.rixl.sdk.models.github_com_rixlhq_api_internal_feeds_types;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The allow_images property
     */
    private Boolean allowImages;
    /**
     * The allow_videos property
     */
    private Boolean allowVideos;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The description property
     */
    private String description;
    /**
     * The has_comments property
     */
    private Boolean hasComments;
    /**
     * The has_likes property
     */
    private Boolean hasLikes;
    /**
     * The has_shares property
     */
    private Boolean hasShares;
    /**
     * The id property
     */
    private String id;
    /**
     * The name property
     */
    private String name;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * The updated_at property
     */
    private String updatedAt;
    /**
     * Instantiates a new {@link FeedResponse} and sets the default values.
     */
    public FeedResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedResponse}
     */
    @jakarta.annotation.Nonnull
    public static FeedResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedResponse();
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
     * Gets the allow_images property value. The allow_images property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowImages() {
        return this.allowImages;
    }
    /**
     * Gets the allow_videos property value. The allow_videos property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowVideos() {
        return this.allowVideos;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("allow_images", (n) -> { this.setAllowImages(n.getBooleanValue()); });
        deserializerMap.put("allow_videos", (n) -> { this.setAllowVideos(n.getBooleanValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("has_comments", (n) -> { this.setHasComments(n.getBooleanValue()); });
        deserializerMap.put("has_likes", (n) -> { this.setHasLikes(n.getBooleanValue()); });
        deserializerMap.put("has_shares", (n) -> { this.setHasShares(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the has_comments property value. The has_comments property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasComments() {
        return this.hasComments;
    }
    /**
     * Gets the has_likes property value. The has_likes property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasLikes() {
        return this.hasLikes;
    }
    /**
     * Gets the has_shares property value. The has_shares property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasShares() {
        return this.hasShares;
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
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the project_id property value. The project_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allow_images", this.getAllowImages());
        writer.writeBooleanValue("allow_videos", this.getAllowVideos());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("has_comments", this.getHasComments());
        writer.writeBooleanValue("has_likes", this.getHasLikes());
        writer.writeBooleanValue("has_shares", this.getHasShares());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("project_id", this.getProjectId());
        writer.writeStringValue("updated_at", this.getUpdatedAt());
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
     * Sets the allow_images property value. The allow_images property
     * @param value Value to set for the allow_images property.
     */
    public void setAllowImages(@jakarta.annotation.Nullable final Boolean value) {
        this.allowImages = value;
    }
    /**
     * Sets the allow_videos property value. The allow_videos property
     * @param value Value to set for the allow_videos property.
     */
    public void setAllowVideos(@jakarta.annotation.Nullable final Boolean value) {
        this.allowVideos = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the has_comments property value. The has_comments property
     * @param value Value to set for the has_comments property.
     */
    public void setHasComments(@jakarta.annotation.Nullable final Boolean value) {
        this.hasComments = value;
    }
    /**
     * Sets the has_likes property value. The has_likes property
     * @param value Value to set for the has_likes property.
     */
    public void setHasLikes(@jakarta.annotation.Nullable final Boolean value) {
        this.hasLikes = value;
    }
    /**
     * Sets the has_shares property value. The has_shares property
     * @param value Value to set for the has_shares property.
     */
    public void setHasShares(@jakarta.annotation.Nullable final Boolean value) {
        this.hasShares = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the project_id property value. The project_id property
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final String value) {
        this.updatedAt = value;
    }
}
