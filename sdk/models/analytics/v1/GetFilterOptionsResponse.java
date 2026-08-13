package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetFilterOptionsResponse implements Parsable {
    /**
     * The options property
     */
    private java.util.List<FilterOption> options;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetFilterOptionsResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetFilterOptionsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetFilterOptionsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("options", (n) -> { this.setOptions(n.getCollectionOfObjectValues(FilterOption::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the options property value. The options property
     * @return a {@link java.util.List<FilterOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilterOption> getOptions() {
        return this.options;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("options", this.getOptions());
    }
    /**
     * Sets the options property value. The options property
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final java.util.List<FilterOption> value) {
        this.options = value;
    }
}
