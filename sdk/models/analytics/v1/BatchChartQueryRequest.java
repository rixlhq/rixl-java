package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BatchChartQueryRequest implements Parsable {
    /**
     * The queries property
     */
    private java.util.List<ChartQueryRequest> queries;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BatchChartQueryRequest}
     */
    @jakarta.annotation.Nonnull
    public static BatchChartQueryRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BatchChartQueryRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("queries", (n) -> { this.setQueries(n.getCollectionOfObjectValues(ChartQueryRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the queries property value. The queries property
     * @return a {@link java.util.List<ChartQueryRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChartQueryRequest> getQueries() {
        return this.queries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("queries", this.getQueries());
    }
    /**
     * Sets the queries property value. The queries property
     * @param value Value to set for the queries property.
     */
    public void setQueries(@jakarta.annotation.Nullable final java.util.List<ChartQueryRequest> value) {
        this.queries = value;
    }
}
