package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BatchChartQueryResult implements Parsable {
    /**
     * The error property
     */
    private String error;
    /**
     * The rows property
     */
    private java.util.List<ChartRow> rows;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BatchChartQueryResult}
     */
    @jakarta.annotation.Nonnull
    public static BatchChartQueryResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BatchChartQueryResult();
    }
    /**
     * Gets the error property value. The error property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("rows", (n) -> { this.setRows(n.getCollectionOfObjectValues(ChartRow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rows property value. The rows property
     * @return a {@link java.util.List<ChartRow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChartRow> getRows() {
        return this.rows;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeCollectionOfObjectValues("rows", this.getRows());
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the rows property value. The rows property
     * @param value Value to set for the rows property.
     */
    public void setRows(@jakarta.annotation.Nullable final java.util.List<ChartRow> value) {
        this.rows = value;
    }
}
