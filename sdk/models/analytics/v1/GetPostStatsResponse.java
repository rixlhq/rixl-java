package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetPostStatsResponse implements Parsable {
    /**
     * The postId property
     */
    private String postId;
    /**
     * The totalViews property
     */
    private UntypedNode totalViews;
    /**
     * The uniqueViewers property
     */
    private UntypedNode uniqueViewers;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetPostStatsResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetPostStatsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetPostStatsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("postId", (n) -> { this.setPostId(n.getStringValue()); });
        deserializerMap.put("totalViews", (n) -> { this.setTotalViews(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("uniqueViewers", (n) -> { this.setUniqueViewers(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the postId property value. The postId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostId() {
        return this.postId;
    }
    /**
     * Gets the totalViews property value. The totalViews property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTotalViews() {
        return this.totalViews;
    }
    /**
     * Gets the uniqueViewers property value. The uniqueViewers property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getUniqueViewers() {
        return this.uniqueViewers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("postId", this.getPostId());
        writer.writeObjectValue("totalViews", this.getTotalViews());
        writer.writeObjectValue("uniqueViewers", this.getUniqueViewers());
    }
    /**
     * Sets the postId property value. The postId property
     * @param value Value to set for the postId property.
     */
    public void setPostId(@jakarta.annotation.Nullable final String value) {
        this.postId = value;
    }
    /**
     * Sets the totalViews property value. The totalViews property
     * @param value Value to set for the totalViews property.
     */
    public void setTotalViews(@jakarta.annotation.Nullable final UntypedNode value) {
        this.totalViews = value;
    }
    /**
     * Sets the uniqueViewers property value. The uniqueViewers property
     * @param value Value to set for the uniqueViewers property.
     */
    public void setUniqueViewers(@jakarta.annotation.Nullable final UntypedNode value) {
        this.uniqueViewers = value;
    }
}
