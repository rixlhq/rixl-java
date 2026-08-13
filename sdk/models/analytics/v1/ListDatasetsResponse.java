package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListDatasetsResponse implements Parsable {
    /**
     * The datasets property
     */
    private java.util.List<Dataset> datasets;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListDatasetsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListDatasetsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListDatasetsResponse();
    }
    /**
     * Gets the datasets property value. The datasets property
     * @return a {@link java.util.List<Dataset>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Dataset> getDatasets() {
        return this.datasets;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("datasets", (n) -> { this.setDatasets(n.getCollectionOfObjectValues(Dataset::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("datasets", this.getDatasets());
    }
    /**
     * Sets the datasets property value. The datasets property
     * @param value Value to set for the datasets property.
     */
    public void setDatasets(@jakarta.annotation.Nullable final java.util.List<Dataset> value) {
        this.datasets = value;
    }
}
