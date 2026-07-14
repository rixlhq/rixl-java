package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedStats implements Parsable {
    /**
     * The avgTimePerVisitMs property
     */
    private Double avgTimePerVisitMs;
    /**
     * The feedId property
     */
    private String feedId;
    /**
     * The totalPosts property
     */
    private UntypedNode totalPosts;
    /**
     * The totalViews property
     */
    private UntypedNode totalViews;
    /**
     * The totalWatchTimeMs property
     */
    private Double totalWatchTimeMs;
    /**
     * The uniqueViewers property
     */
    private UntypedNode uniqueViewers;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedStats}
     */
    @jakarta.annotation.Nonnull
    public static FeedStats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedStats();
    }
    /**
     * Gets the avgTimePerVisitMs property value. The avgTimePerVisitMs property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAvgTimePerVisitMs() {
        return this.avgTimePerVisitMs;
    }
    /**
     * Gets the feedId property value. The feedId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedId() {
        return this.feedId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("avgTimePerVisitMs", (n) -> { this.setAvgTimePerVisitMs(n.getDoubleValue()); });
        deserializerMap.put("feedId", (n) -> { this.setFeedId(n.getStringValue()); });
        deserializerMap.put("totalPosts", (n) -> { this.setTotalPosts(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("totalViews", (n) -> { this.setTotalViews(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("totalWatchTimeMs", (n) -> { this.setTotalWatchTimeMs(n.getDoubleValue()); });
        deserializerMap.put("uniqueViewers", (n) -> { this.setUniqueViewers(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the totalPosts property value. The totalPosts property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTotalPosts() {
        return this.totalPosts;
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
     * Gets the totalWatchTimeMs property value. The totalWatchTimeMs property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTotalWatchTimeMs() {
        return this.totalWatchTimeMs;
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
        writer.writeDoubleValue("avgTimePerVisitMs", this.getAvgTimePerVisitMs());
        writer.writeStringValue("feedId", this.getFeedId());
        writer.writeObjectValue("totalPosts", this.getTotalPosts());
        writer.writeObjectValue("totalViews", this.getTotalViews());
        writer.writeDoubleValue("totalWatchTimeMs", this.getTotalWatchTimeMs());
        writer.writeObjectValue("uniqueViewers", this.getUniqueViewers());
    }
    /**
     * Sets the avgTimePerVisitMs property value. The avgTimePerVisitMs property
     * @param value Value to set for the avgTimePerVisitMs property.
     */
    public void setAvgTimePerVisitMs(@jakarta.annotation.Nullable final Double value) {
        this.avgTimePerVisitMs = value;
    }
    /**
     * Sets the feedId property value. The feedId property
     * @param value Value to set for the feedId property.
     */
    public void setFeedId(@jakarta.annotation.Nullable final String value) {
        this.feedId = value;
    }
    /**
     * Sets the totalPosts property value. The totalPosts property
     * @param value Value to set for the totalPosts property.
     */
    public void setTotalPosts(@jakarta.annotation.Nullable final UntypedNode value) {
        this.totalPosts = value;
    }
    /**
     * Sets the totalViews property value. The totalViews property
     * @param value Value to set for the totalViews property.
     */
    public void setTotalViews(@jakarta.annotation.Nullable final UntypedNode value) {
        this.totalViews = value;
    }
    /**
     * Sets the totalWatchTimeMs property value. The totalWatchTimeMs property
     * @param value Value to set for the totalWatchTimeMs property.
     */
    public void setTotalWatchTimeMs(@jakarta.annotation.Nullable final Double value) {
        this.totalWatchTimeMs = value;
    }
    /**
     * Sets the uniqueViewers property value. The uniqueViewers property
     * @param value Value to set for the uniqueViewers property.
     */
    public void setUniqueViewers(@jakarta.annotation.Nullable final UntypedNode value) {
        this.uniqueViewers = value;
    }
}
