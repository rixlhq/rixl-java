package com.rixl.sdk.feeds.v1.projects.item.feeds;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedsPostRequestBody implements Parsable {
    /**
     * The allowImages property
     */
    private Boolean allowImages;
    /**
     * The allowVideos property
     */
    private Boolean allowVideos;
    /**
     * The description property
     */
    private String description;
    /**
     * The hasComments property
     */
    private Boolean hasComments;
    /**
     * The hasLikes property
     */
    private Boolean hasLikes;
    /**
     * The hasShares property
     */
    private Boolean hasShares;
    /**
     * The name property
     */
    private String name;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static FeedsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedsPostRequestBody();
    }
    /**
     * Gets the allowImages property value. The allowImages property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowImages() {
        return this.allowImages;
    }
    /**
     * Gets the allowVideos property value. The allowVideos property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("allowImages", (n) -> { this.setAllowImages(n.getBooleanValue()); });
        deserializerMap.put("allowVideos", (n) -> { this.setAllowVideos(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("hasComments", (n) -> { this.setHasComments(n.getBooleanValue()); });
        deserializerMap.put("hasLikes", (n) -> { this.setHasLikes(n.getBooleanValue()); });
        deserializerMap.put("hasShares", (n) -> { this.setHasShares(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasComments property value. The hasComments property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasComments() {
        return this.hasComments;
    }
    /**
     * Gets the hasLikes property value. The hasLikes property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasLikes() {
        return this.hasLikes;
    }
    /**
     * Gets the hasShares property value. The hasShares property
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowImages", this.getAllowImages());
        writer.writeBooleanValue("allowVideos", this.getAllowVideos());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("hasComments", this.getHasComments());
        writer.writeBooleanValue("hasLikes", this.getHasLikes());
        writer.writeBooleanValue("hasShares", this.getHasShares());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the allowImages property value. The allowImages property
     * @param value Value to set for the allowImages property.
     */
    public void setAllowImages(@jakarta.annotation.Nullable final Boolean value) {
        this.allowImages = value;
    }
    /**
     * Sets the allowVideos property value. The allowVideos property
     * @param value Value to set for the allowVideos property.
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
     * Sets the hasComments property value. The hasComments property
     * @param value Value to set for the hasComments property.
     */
    public void setHasComments(@jakarta.annotation.Nullable final Boolean value) {
        this.hasComments = value;
    }
    /**
     * Sets the hasLikes property value. The hasLikes property
     * @param value Value to set for the hasLikes property.
     */
    public void setHasLikes(@jakarta.annotation.Nullable final Boolean value) {
        this.hasLikes = value;
    }
    /**
     * Sets the hasShares property value. The hasShares property
     * @param value Value to set for the hasShares property.
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
}
