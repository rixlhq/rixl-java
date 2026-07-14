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
     * The conversionRate property
     */
    private Double conversionRate;
    /**
     * The dropoffRate property
     */
    private Double dropoffRate;
    /**
     * The stepName property
     */
    private String stepName;
    /**
     * The userCount property
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
     * Gets the conversionRate property value. The conversionRate property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConversionRate() {
        return this.conversionRate;
    }
    /**
     * Gets the dropoffRate property value. The dropoffRate property
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
        deserializerMap.put("conversionRate", (n) -> { this.setConversionRate(n.getDoubleValue()); });
        deserializerMap.put("dropoffRate", (n) -> { this.setDropoffRate(n.getDoubleValue()); });
        deserializerMap.put("stepName", (n) -> { this.setStepName(n.getStringValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the stepName property value. The stepName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStepName() {
        return this.stepName;
    }
    /**
     * Gets the userCount property value. The userCount property
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
        writer.writeDoubleValue("conversionRate", this.getConversionRate());
        writer.writeDoubleValue("dropoffRate", this.getDropoffRate());
        writer.writeStringValue("stepName", this.getStepName());
        writer.writeIntegerValue("userCount", this.getUserCount());
    }
    /**
     * Sets the conversionRate property value. The conversionRate property
     * @param value Value to set for the conversionRate property.
     */
    public void setConversionRate(@jakarta.annotation.Nullable final Double value) {
        this.conversionRate = value;
    }
    /**
     * Sets the dropoffRate property value. The dropoffRate property
     * @param value Value to set for the dropoffRate property.
     */
    public void setDropoffRate(@jakarta.annotation.Nullable final Double value) {
        this.dropoffRate = value;
    }
    /**
     * Sets the stepName property value. The stepName property
     * @param value Value to set for the stepName property.
     */
    public void setStepName(@jakarta.annotation.Nullable final String value) {
        this.stepName = value;
    }
    /**
     * Sets the userCount property value. The userCount property
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.userCount = value;
    }
}
