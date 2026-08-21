package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WidgetPatch implements Parsable {
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
    private WidgetPatchFilters filters;
    /**
     * The group_by property
     */
    private WidgetPatchGroupBy groupBy;
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
     * The title property
     */
    private String title;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WidgetPatch}
     */
    @jakarta.annotation.Nonnull
    public static WidgetPatch createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WidgetPatch();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("chart_type", (n) -> { this.setChartType(n.getStringValue()); });
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getStringValue()); });
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getObjectValue(WidgetPatchFilters::createFromDiscriminatorValue)); });
        deserializerMap.put("group_by", (n) -> { this.setGroupBy(n.getObjectValue(WidgetPatchGroupBy::createFromDiscriminatorValue)); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("metric", (n) -> { this.setMetric(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filters property value. The filters property
     * @return a {@link WidgetPatchFilters}
     */
    @jakarta.annotation.Nullable
    public WidgetPatchFilters getFilters() {
        return this.filters;
    }
    /**
     * Gets the group_by property value. The group_by property
     * @return a {@link WidgetPatchGroupBy}
     */
    @jakarta.annotation.Nullable
    public WidgetPatchGroupBy getGroupBy() {
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
        writer.writeStringValue("chart_type", this.getChartType());
        writer.writeStringValue("dataset", this.getDataset());
        writer.writeObjectValue("filters", this.getFilters());
        writer.writeObjectValue("group_by", this.getGroupBy());
        writer.writeStringValue("interval", this.getInterval());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("metric", this.getMetric());
        writer.writeStringValue("title", this.getTitle());
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
    public void setFilters(@jakarta.annotation.Nullable final WidgetPatchFilters value) {
        this.filters = value;
    }
    /**
     * Sets the group_by property value. The group_by property
     * @param value Value to set for the group_by property.
     */
    public void setGroupBy(@jakarta.annotation.Nullable final WidgetPatchGroupBy value) {
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
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Composed type wrapper for classes {@link Filters}, {@link WidgetPatchFiltersMember1}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class WidgetPatchFilters implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type {@link Filters}
         */
        private Filters filters;
        /**
         * Composed type representation for type {@link WidgetPatchFiltersMember1}
         */
        private WidgetPatchFiltersMember1 widgetPatchFiltersMember1;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link WidgetPatchFilters}
         */
        @jakarta.annotation.Nonnull
        public static WidgetPatchFilters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final WidgetPatchFilters result = new WidgetPatchFilters();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            return result;
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getFilters() != null) {
                return this.getFilters().getFieldDeserializers();
            } else if (this.getWidgetPatchFiltersMember1() != null) {
                return this.getWidgetPatchFiltersMember1().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the Filters property value. Composed type representation for type {@link Filters}
         * @return a {@link Filters}
         */
        @jakarta.annotation.Nullable
        public Filters getFilters() {
            return this.filters;
        }
        /**
         * Gets the WidgetPatch_filtersMember1 property value. Composed type representation for type {@link WidgetPatchFiltersMember1}
         * @return a {@link WidgetPatchFiltersMember1}
         */
        @jakarta.annotation.Nullable
        public WidgetPatchFiltersMember1 getWidgetPatchFiltersMember1() {
            return this.widgetPatchFiltersMember1;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getFilters() != null) {
                writer.writeObjectValue(null, this.getFilters());
            } else if (this.getWidgetPatchFiltersMember1() != null) {
                writer.writeObjectValue(null, this.getWidgetPatchFiltersMember1());
            }
        }
        /**
         * Sets the Filters property value. Composed type representation for type {@link Filters}
         * @param value Value to set for the Filters property.
         */
        public void setFilters(@jakarta.annotation.Nullable final Filters value) {
            this.filters = value;
        }
        /**
         * Sets the WidgetPatch_filtersMember1 property value. Composed type representation for type {@link WidgetPatchFiltersMember1}
         * @param value Value to set for the WidgetPatch_filtersMember1 property.
         */
        public void setWidgetPatchFiltersMember1(@jakarta.annotation.Nullable final WidgetPatchFiltersMember1 value) {
            this.widgetPatchFiltersMember1 = value;
        }
    }
    /**
     * Composed type wrapper for classes {@link GroupBy}, {@link WidgetPatchGroupByMember1}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class WidgetPatchGroupBy implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type {@link GroupBy}
         */
        private GroupBy groupBy;
        /**
         * Composed type representation for type {@link WidgetPatchGroupByMember1}
         */
        private WidgetPatchGroupByMember1 widgetPatchGroupByMember1;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link WidgetPatchGroupBy}
         */
        @jakarta.annotation.Nonnull
        public static WidgetPatchGroupBy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final WidgetPatchGroupBy result = new WidgetPatchGroupBy();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            return result;
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getGroupBy() != null) {
                return this.getGroupBy().getFieldDeserializers();
            } else if (this.getWidgetPatchGroupByMember1() != null) {
                return this.getWidgetPatchGroupByMember1().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the GroupBy property value. Composed type representation for type {@link GroupBy}
         * @return a {@link GroupBy}
         */
        @jakarta.annotation.Nullable
        public GroupBy getGroupBy() {
            return this.groupBy;
        }
        /**
         * Gets the WidgetPatch_group_byMember1 property value. Composed type representation for type {@link WidgetPatchGroupByMember1}
         * @return a {@link WidgetPatchGroupByMember1}
         */
        @jakarta.annotation.Nullable
        public WidgetPatchGroupByMember1 getWidgetPatchGroupByMember1() {
            return this.widgetPatchGroupByMember1;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getGroupBy() != null) {
                writer.writeObjectValue(null, this.getGroupBy());
            } else if (this.getWidgetPatchGroupByMember1() != null) {
                writer.writeObjectValue(null, this.getWidgetPatchGroupByMember1());
            }
        }
        /**
         * Sets the GroupBy property value. Composed type representation for type {@link GroupBy}
         * @param value Value to set for the GroupBy property.
         */
        public void setGroupBy(@jakarta.annotation.Nullable final GroupBy value) {
            this.groupBy = value;
        }
        /**
         * Sets the WidgetPatch_group_byMember1 property value. Composed type representation for type {@link WidgetPatchGroupByMember1}
         * @param value Value to set for the WidgetPatch_group_byMember1 property.
         */
        public void setWidgetPatchGroupByMember1(@jakarta.annotation.Nullable final WidgetPatchGroupByMember1 value) {
            this.widgetPatchGroupByMember1 = value;
        }
    }
}
