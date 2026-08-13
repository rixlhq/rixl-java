package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChartQueryRequest implements Parsable {
    /**
     * The dataset property
     */
    private String dataset;
    /**
     * The filters property
     */
    private java.util.List<ChartFilter> filters;
    /**
     * The group_by property
     */
    private java.util.List<String> groupBy;
    /**
     * The interval property
     */
    private String interval;
    /**
     * The limit property
     */
    private Integer limit;
    /**
     * The metric property
     */
    private String metric;
    /**
     * The time_end property
     */
    private String timeEnd;
    /**
     * The time_start property
     */
    private String timeStart;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChartQueryRequest}
     */
    @jakarta.annotation.Nonnull
    public static ChartQueryRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChartQueryRequest();
    }
    /**
     * Gets the dataset property value. The dataset property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataset() {
        return this.dataset;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getStringValue()); });
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getCollectionOfObjectValues(ChartFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("group_by", (n) -> { this.setGroupBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("metric", (n) -> { this.setMetric(n.getStringValue()); });
        deserializerMap.put("time_end", (n) -> { this.setTimeEnd(n.getStringValue()); });
        deserializerMap.put("time_start", (n) -> { this.setTimeStart(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filters property value. The filters property
     * @return a {@link java.util.List<ChartFilter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChartFilter> getFilters() {
        return this.filters;
    }
    /**
     * Gets the group_by property value. The group_by property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }
    /**
     * Gets the interval property value. The interval property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInterval() {
        return this.interval;
    }
    /**
     * Gets the limit property value. The limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the metric property value. The metric property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetric() {
        return this.metric;
    }
    /**
     * Gets the time_end property value. The time_end property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeEnd() {
        return this.timeEnd;
    }
    /**
     * Gets the time_start property value. The time_start property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeStart() {
        return this.timeStart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataset", this.getDataset());
        writer.writeCollectionOfObjectValues("filters", this.getFilters());
        writer.writeCollectionOfPrimitiveValues("group_by", this.getGroupBy());
        writer.writeStringValue("interval", this.getInterval());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("metric", this.getMetric());
        writer.writeStringValue("time_end", this.getTimeEnd());
        writer.writeStringValue("time_start", this.getTimeStart());
    }
    /**
     * Sets the dataset property value. The dataset property
     * @param value Value to set for the dataset property.
     */
    public void setDataset(@jakarta.annotation.Nullable final String value) {
        this.dataset = value;
    }
    /**
     * Sets the filters property value. The filters property
     * @param value Value to set for the filters property.
     */
    public void setFilters(@jakarta.annotation.Nullable final java.util.List<ChartFilter> value) {
        this.filters = value;
    }
    /**
     * Sets the group_by property value. The group_by property
     * @param value Value to set for the group_by property.
     */
    public void setGroupBy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.groupBy = value;
    }
    /**
     * Sets the interval property value. The interval property
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final String value) {
        this.interval = value;
    }
    /**
     * Sets the limit property value. The limit property
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the metric property value. The metric property
     * @param value Value to set for the metric property.
     */
    public void setMetric(@jakarta.annotation.Nullable final String value) {
        this.metric = value;
    }
    /**
     * Sets the time_end property value. The time_end property
     * @param value Value to set for the time_end property.
     */
    public void setTimeEnd(@jakarta.annotation.Nullable final String value) {
        this.timeEnd = value;
    }
    /**
     * Sets the time_start property value. The time_start property
     * @param value Value to set for the time_start property.
     */
    public void setTimeStart(@jakarta.annotation.Nullable final String value) {
        this.timeStart = value;
    }
}
