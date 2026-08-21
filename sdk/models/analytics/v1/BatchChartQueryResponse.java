package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BatchChartQueryResponse implements Parsable {
    /**
     * The results property
     */
    private java.util.List<BatchChartQueryResult> results;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BatchChartQueryResponse}
     */
    @jakarta.annotation.Nonnull
    public static BatchChartQueryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BatchChartQueryResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("results", (n) -> { this.setResults(n.getCollectionOfObjectValues(BatchChartQueryResult::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the results property value. The results property
     * @return a {@link java.util.List<BatchChartQueryResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BatchChartQueryResult> getResults() {
        return this.results;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("results", this.getResults());
    }
    /**
     * Sets the results property value. The results property
     * @param value Value to set for the results property.
     */
    public void setResults(@jakarta.annotation.Nullable final java.util.List<BatchChartQueryResult> value) {
        this.results = value;
    }
}
