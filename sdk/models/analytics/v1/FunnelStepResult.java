package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FunnelStepResult implements Parsable {
    /**
     * The conversion_rate property
     */
    private Double conversionRate;
    /**
     * The dropoff_rate property
     */
    private Double dropoffRate;
    /**
     * The step_name property
     */
    private String stepName;
    /**
     * The user_count property
     */
    private Integer userCount;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FunnelStepResult}
     */
    @jakarta.annotation.Nonnull
    public static FunnelStepResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FunnelStepResult();
    }
    /**
     * Gets the conversion_rate property value. The conversion_rate property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConversionRate() {
        return this.conversionRate;
    }
    /**
     * Gets the dropoff_rate property value. The dropoff_rate property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getDropoffRate() {
        return this.dropoffRate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("conversion_rate", (n) -> { this.setConversionRate(n.getDoubleValue()); });
        deserializerMap.put("dropoff_rate", (n) -> { this.setDropoffRate(n.getDoubleValue()); });
        deserializerMap.put("step_name", (n) -> { this.setStepName(n.getStringValue()); });
        deserializerMap.put("user_count", (n) -> { this.setUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the step_name property value. The step_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStepName() {
        return this.stepName;
    }
    /**
     * Gets the user_count property value. The user_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("conversion_rate", this.getConversionRate());
        writer.writeDoubleValue("dropoff_rate", this.getDropoffRate());
        writer.writeStringValue("step_name", this.getStepName());
        writer.writeIntegerValue("user_count", this.getUserCount());
    }
    /**
     * Sets the conversion_rate property value. The conversion_rate property
     * @param value Value to set for the conversion_rate property.
     */
    public void setConversionRate(@jakarta.annotation.Nullable final Double value) {
        this.conversionRate = value;
    }
    /**
     * Sets the dropoff_rate property value. The dropoff_rate property
     * @param value Value to set for the dropoff_rate property.
     */
    public void setDropoffRate(@jakarta.annotation.Nullable final Double value) {
        this.dropoffRate = value;
    }
    /**
     * Sets the step_name property value. The step_name property
     * @param value Value to set for the step_name property.
     */
    public void setStepName(@jakarta.annotation.Nullable final String value) {
        this.stepName = value;
    }
    /**
     * Sets the user_count property value. The user_count property
     * @param value Value to set for the user_count property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.userCount = value;
    }
}
