package com.rixl.sdk.models.analyticsv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedStats implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The avg_time_per_visit_ms property
     */
    private Double avgTimePerVisitMs;
    /**
     * The feed_id property
     */
    private String feedId;
    /**
     * The total_posts property
     */
    private Integer totalPosts;
    /**
     * The total_views property
     */
    private Integer totalViews;
    /**
     * The total_watch_time_ms property
     */
    private Double totalWatchTimeMs;
    /**
     * The unique_viewers property
     */
    private Integer uniqueViewers;
    /**
     * Instantiates a new {@link FeedStats} and sets the default values.
     */
    public FeedStats() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the avg_time_per_visit_ms property value. The avg_time_per_visit_ms property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAvgTimePerVisitMs() {
        return this.avgTimePerVisitMs;
    }
    /**
     * Gets the feed_id property value. The feed_id property
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
        deserializerMap.put("avg_time_per_visit_ms", (n) -> { this.setAvgTimePerVisitMs(n.getDoubleValue()); });
        deserializerMap.put("feed_id", (n) -> { this.setFeedId(n.getStringValue()); });
        deserializerMap.put("total_posts", (n) -> { this.setTotalPosts(n.getIntegerValue()); });
        deserializerMap.put("total_views", (n) -> { this.setTotalViews(n.getIntegerValue()); });
        deserializerMap.put("total_watch_time_ms", (n) -> { this.setTotalWatchTimeMs(n.getDoubleValue()); });
        deserializerMap.put("unique_viewers", (n) -> { this.setUniqueViewers(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the total_posts property value. The total_posts property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalPosts() {
        return this.totalPosts;
    }
    /**
     * Gets the total_views property value. The total_views property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalViews() {
        return this.totalViews;
    }
    /**
     * Gets the total_watch_time_ms property value. The total_watch_time_ms property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTotalWatchTimeMs() {
        return this.totalWatchTimeMs;
    }
    /**
     * Gets the unique_viewers property value. The unique_viewers property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUniqueViewers() {
        return this.uniqueViewers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("avg_time_per_visit_ms", this.getAvgTimePerVisitMs());
        writer.writeStringValue("feed_id", this.getFeedId());
        writer.writeIntegerValue("total_posts", this.getTotalPosts());
        writer.writeIntegerValue("total_views", this.getTotalViews());
        writer.writeDoubleValue("total_watch_time_ms", this.getTotalWatchTimeMs());
        writer.writeIntegerValue("unique_viewers", this.getUniqueViewers());
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
     * Sets the avg_time_per_visit_ms property value. The avg_time_per_visit_ms property
     * @param value Value to set for the avg_time_per_visit_ms property.
     */
    public void setAvgTimePerVisitMs(@jakarta.annotation.Nullable final Double value) {
        this.avgTimePerVisitMs = value;
    }
    /**
     * Sets the feed_id property value. The feed_id property
     * @param value Value to set for the feed_id property.
     */
    public void setFeedId(@jakarta.annotation.Nullable final String value) {
        this.feedId = value;
    }
    /**
     * Sets the total_posts property value. The total_posts property
     * @param value Value to set for the total_posts property.
     */
    public void setTotalPosts(@jakarta.annotation.Nullable final Integer value) {
        this.totalPosts = value;
    }
    /**
     * Sets the total_views property value. The total_views property
     * @param value Value to set for the total_views property.
     */
    public void setTotalViews(@jakarta.annotation.Nullable final Integer value) {
        this.totalViews = value;
    }
    /**
     * Sets the total_watch_time_ms property value. The total_watch_time_ms property
     * @param value Value to set for the total_watch_time_ms property.
     */
    public void setTotalWatchTimeMs(@jakarta.annotation.Nullable final Double value) {
        this.totalWatchTimeMs = value;
    }
    /**
     * Sets the unique_viewers property value. The unique_viewers property
     * @param value Value to set for the unique_viewers property.
     */
    public void setUniqueViewers(@jakarta.annotation.Nullable final Integer value) {
        this.uniqueViewers = value;
    }
}
