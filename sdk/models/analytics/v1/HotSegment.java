package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HotSegment implements Parsable {
    /**
     * The end_second property
     */
    private Integer endSecond;
    /**
     * The multiplier property
     */
    private Double multiplier;
    /**
     * The start_second property
     */
    private Integer startSecond;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HotSegment}
     */
    @jakarta.annotation.Nonnull
    public static HotSegment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HotSegment();
    }
    /**
     * Gets the end_second property value. The end_second property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEndSecond() {
        return this.endSecond;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("end_second", (n) -> { this.setEndSecond(n.getIntegerValue()); });
        deserializerMap.put("multiplier", (n) -> { this.setMultiplier(n.getDoubleValue()); });
        deserializerMap.put("start_second", (n) -> { this.setStartSecond(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the multiplier property value. The multiplier property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMultiplier() {
        return this.multiplier;
    }
    /**
     * Gets the start_second property value. The start_second property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStartSecond() {
        return this.startSecond;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("end_second", this.getEndSecond());
        writer.writeDoubleValue("multiplier", this.getMultiplier());
        writer.writeIntegerValue("start_second", this.getStartSecond());
    }
    /**
     * Sets the end_second property value. The end_second property
     * @param value Value to set for the end_second property.
     */
    public void setEndSecond(@jakarta.annotation.Nullable final Integer value) {
        this.endSecond = value;
    }
    /**
     * Sets the multiplier property value. The multiplier property
     * @param value Value to set for the multiplier property.
     */
    public void setMultiplier(@jakarta.annotation.Nullable final Double value) {
        this.multiplier = value;
    }
    /**
     * Sets the start_second property value. The start_second property
     * @param value Value to set for the start_second property.
     */
    public void setStartSecond(@jakarta.annotation.Nullable final Integer value) {
        this.startSecond = value;
    }
}
