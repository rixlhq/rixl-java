package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DateRange implements Parsable {
    /**
     * The end property
     */
    private String end;
    /**
     * The start property
     */
    private String start;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DateRange}
     */
    @jakarta.annotation.Nonnull
    public static DateRange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DateRange();
    }
    /**
     * Gets the end property value. The end property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnd() {
        return this.end;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("end", (n) -> { this.setEnd(n.getStringValue()); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the start property value. The start property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStart() {
        return this.start;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("end", this.getEnd());
        writer.writeStringValue("start", this.getStart());
    }
    /**
     * Sets the end property value. The end property
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final String value) {
        this.end = value;
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final String value) {
        this.start = value;
    }
}
