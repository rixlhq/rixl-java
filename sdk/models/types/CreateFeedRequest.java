package com.rixl.sdk.models.types;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Feed details
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateFeedRequest implements AdditionalDataHolder, Parsable {
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
     * The name property
     */
    private String name;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * Instantiates a new {@link CreateFeedRequest} and sets the default values.
     */
    public CreateFeedRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateFeedRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateFeedRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateFeedRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("allow_images", (n) -> { this.setAllowImages(n.getBooleanValue()); });
        deserializerMap.put("allow_videos", (n) -> { this.setAllowVideos(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("has_comments", (n) -> { this.setHasComments(n.getBooleanValue()); });
        deserializerMap.put("has_likes", (n) -> { this.setHasLikes(n.getBooleanValue()); });
        deserializerMap.put("has_shares", (n) -> { this.setHasShares(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allow_images", this.getAllowImages());
        writer.writeBooleanValue("allow_videos", this.getAllowVideos());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("has_comments", this.getHasComments());
        writer.writeBooleanValue("has_likes", this.getHasLikes());
        writer.writeBooleanValue("has_shares", this.getHasShares());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("project_id", this.getProjectId());
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
}
