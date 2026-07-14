package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoStats implements Parsable {
    /**
     * The avgWatchTimeMs property
     */
    private Double avgWatchTimeMs;
    /**
     * The completionRate property
     */
    private Double completionRate;
    /**
     * The completions property
     */
    private UntypedNode completions;
    /**
     * The starts property
     */
    private UntypedNode starts;
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
     * The videoId property
     */
    private String videoId;
    /**
     * The watches property
     */
    private UntypedNode watches;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoStats}
     */
    @jakarta.annotation.Nonnull
    public static VideoStats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoStats();
    }
    /**
     * Gets the avgWatchTimeMs property value. The avgWatchTimeMs property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAvgWatchTimeMs() {
        return this.avgWatchTimeMs;
    }
    /**
     * Gets the completionRate property value. The completionRate property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCompletionRate() {
        return this.completionRate;
    }
    /**
     * Gets the completions property value. The completions property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCompletions() {
        return this.completions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("avgWatchTimeMs", (n) -> { this.setAvgWatchTimeMs(n.getDoubleValue()); });
        deserializerMap.put("completionRate", (n) -> { this.setCompletionRate(n.getDoubleValue()); });
        deserializerMap.put("completions", (n) -> { this.setCompletions(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("starts", (n) -> { this.setStarts(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("totalViews", (n) -> { this.setTotalViews(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("totalWatchTimeMs", (n) -> { this.setTotalWatchTimeMs(n.getDoubleValue()); });
        deserializerMap.put("uniqueViewers", (n) -> { this.setUniqueViewers(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("videoId", (n) -> { this.setVideoId(n.getStringValue()); });
        deserializerMap.put("watches", (n) -> { this.setWatches(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the starts property value. The starts property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getStarts() {
        return this.starts;
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
     * Gets the videoId property value. The videoId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Gets the watches property value. The watches property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getWatches() {
        return this.watches;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("avgWatchTimeMs", this.getAvgWatchTimeMs());
        writer.writeDoubleValue("completionRate", this.getCompletionRate());
        writer.writeObjectValue("completions", this.getCompletions());
        writer.writeObjectValue("starts", this.getStarts());
        writer.writeObjectValue("totalViews", this.getTotalViews());
        writer.writeDoubleValue("totalWatchTimeMs", this.getTotalWatchTimeMs());
        writer.writeObjectValue("uniqueViewers", this.getUniqueViewers());
        writer.writeStringValue("videoId", this.getVideoId());
        writer.writeObjectValue("watches", this.getWatches());
    }
    /**
     * Sets the avgWatchTimeMs property value. The avgWatchTimeMs property
     * @param value Value to set for the avgWatchTimeMs property.
     */
    public void setAvgWatchTimeMs(@jakarta.annotation.Nullable final Double value) {
        this.avgWatchTimeMs = value;
    }
    /**
     * Sets the completionRate property value. The completionRate property
     * @param value Value to set for the completionRate property.
     */
    public void setCompletionRate(@jakarta.annotation.Nullable final Double value) {
        this.completionRate = value;
    }
    /**
     * Sets the completions property value. The completions property
     * @param value Value to set for the completions property.
     */
    public void setCompletions(@jakarta.annotation.Nullable final UntypedNode value) {
        this.completions = value;
    }
    /**
     * Sets the starts property value. The starts property
     * @param value Value to set for the starts property.
     */
    public void setStarts(@jakarta.annotation.Nullable final UntypedNode value) {
        this.starts = value;
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
    /**
     * Sets the videoId property value. The videoId property
     * @param value Value to set for the videoId property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
    /**
     * Sets the watches property value. The watches property
     * @param value Value to set for the watches property.
     */
    public void setWatches(@jakarta.annotation.Nullable final UntypedNode value) {
        this.watches = value;
    }
}
