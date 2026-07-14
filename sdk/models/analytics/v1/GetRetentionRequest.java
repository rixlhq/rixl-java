package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetRetentionRequest implements Parsable {
    /**
     * The period property
     */
    private String period;
    /**
     * The range property
     */
    private DateRange range;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetRetentionRequest}
     */
    @jakarta.annotation.Nonnull
    public static GetRetentionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetRetentionRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getStringValue()); });
        deserializerMap.put("range", (n) -> { this.setRange(n.getObjectValue(DateRange::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the period property value. The period property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPeriod() {
        return this.period;
    }
    /**
     * Gets the range property value. The range property
     * @return a {@link DateRange}
     */
    @jakarta.annotation.Nullable
    public DateRange getRange() {
        return this.range;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("period", this.getPeriod());
        writer.writeObjectValue("range", this.getRange());
    }
    /**
     * Sets the period property value. The period property
     * @param value Value to set for the period property.
     */
    public void setPeriod(@jakarta.annotation.Nullable final String value) {
        this.period = value;
    }
    /**
     * Sets the range property value. The range property
     * @param value Value to set for the range property.
     */
    public void setRange(@jakarta.annotation.Nullable final DateRange value) {
        this.range = value;
    }
}
