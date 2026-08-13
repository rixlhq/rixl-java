package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Dataset implements Parsable {
    /**
     * The dimensions property
     */
    private java.util.List<DatasetField> dimensions;
    /**
     * The filters property
     */
    private java.util.List<DatasetField> filters;
    /**
     * The id property
     */
    private String id;
    /**
     * The label property
     */
    private String label;
    /**
     * The metrics property
     */
    private java.util.List<DatasetMetric> metrics;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Dataset}
     */
    @jakarta.annotation.Nonnull
    public static Dataset createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Dataset();
    }
    /**
     * Gets the dimensions property value. The dimensions property
     * @return a {@link java.util.List<DatasetField>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DatasetField> getDimensions() {
        return this.dimensions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("dimensions", (n) -> { this.setDimensions(n.getCollectionOfObjectValues(DatasetField::createFromDiscriminatorValue)); });
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getCollectionOfObjectValues(DatasetField::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getCollectionOfObjectValues(DatasetMetric::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filters property value. The filters property
     * @return a {@link java.util.List<DatasetField>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DatasetField> getFilters() {
        return this.filters;
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
     * Gets the label property value. The label property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the metrics property value. The metrics property
     * @return a {@link java.util.List<DatasetMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DatasetMetric> getMetrics() {
        return this.metrics;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dimensions", this.getDimensions());
        writer.writeCollectionOfObjectValues("filters", this.getFilters());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("label", this.getLabel());
        writer.writeCollectionOfObjectValues("metrics", this.getMetrics());
    }
    /**
     * Sets the dimensions property value. The dimensions property
     * @param value Value to set for the dimensions property.
     */
    public void setDimensions(@jakarta.annotation.Nullable final java.util.List<DatasetField> value) {
        this.dimensions = value;
    }
    /**
     * Sets the filters property value. The filters property
     * @param value Value to set for the filters property.
     */
    public void setFilters(@jakarta.annotation.Nullable final java.util.List<DatasetField> value) {
        this.filters = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the label property value. The label property
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the metrics property value. The metrics property
     * @param value Value to set for the metrics property.
     */
    public void setMetrics(@jakarta.annotation.Nullable final java.util.List<DatasetMetric> value) {
        this.metrics = value;
    }
}
