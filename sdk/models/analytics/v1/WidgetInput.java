package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WidgetInput implements Parsable {
    /**
     * The chart_type property
     */
    private String chartType;
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
     * The height property
     */
    private Integer height;
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
     * The pos_x property
     */
    private Integer posX;
    /**
     * The pos_y property
     */
    private Integer posY;
    /**
     * The sort_order property
     */
    private Integer sortOrder;
    /**
     * The title property
     */
    private String title;
    /**
     * The width property
     */
    private Integer width;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WidgetInput}
     */
    @jakarta.annotation.Nonnull
    public static WidgetInput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WidgetInput();
    }
    /**
     * Gets the chart_type property value. The chart_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChartType() {
        return this.chartType;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("chart_type", (n) -> { this.setChartType(n.getStringValue()); });
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getStringValue()); });
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getCollectionOfObjectValues(ChartFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("group_by", (n) -> { this.setGroupBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("metric", (n) -> { this.setMetric(n.getStringValue()); });
        deserializerMap.put("pos_x", (n) -> { this.setPosX(n.getIntegerValue()); });
        deserializerMap.put("pos_y", (n) -> { this.setPosY(n.getIntegerValue()); });
        deserializerMap.put("sort_order", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
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
     * Gets the height property value. The height property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
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
     * Gets the pos_x property value. The pos_x property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPosX() {
        return this.posX;
    }
    /**
     * Gets the pos_y property value. The pos_y property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPosY() {
        return this.posY;
    }
    /**
     * Gets the sort_order property value. The sort_order property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.sortOrder;
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
     * Gets the width property value. The width property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("chart_type", this.getChartType());
        writer.writeStringValue("dataset", this.getDataset());
        writer.writeCollectionOfObjectValues("filters", this.getFilters());
        writer.writeCollectionOfPrimitiveValues("group_by", this.getGroupBy());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("interval", this.getInterval());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("metric", this.getMetric());
        writer.writeIntegerValue("pos_x", this.getPosX());
        writer.writeIntegerValue("pos_y", this.getPosY());
        writer.writeIntegerValue("sort_order", this.getSortOrder());
        writer.writeStringValue("title", this.getTitle());
        writer.writeIntegerValue("width", this.getWidth());
    }
    /**
     * Sets the chart_type property value. The chart_type property
     * @param value Value to set for the chart_type property.
     */
    public void setChartType(@jakarta.annotation.Nullable final String value) {
        this.chartType = value;
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
     * Sets the height property value. The height property
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
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
     * Sets the pos_x property value. The pos_x property
     * @param value Value to set for the pos_x property.
     */
    public void setPosX(@jakarta.annotation.Nullable final Integer value) {
        this.posX = value;
    }
    /**
     * Sets the pos_y property value. The pos_y property
     * @param value Value to set for the pos_y property.
     */
    public void setPosY(@jakarta.annotation.Nullable final Integer value) {
        this.posY = value;
    }
    /**
     * Sets the sort_order property value. The sort_order property
     * @param value Value to set for the sort_order property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.sortOrder = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the width property value. The width property
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}
