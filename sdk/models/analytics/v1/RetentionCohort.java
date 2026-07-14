package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetentionCohort implements Parsable {
    /**
     * The cohortDate property
     */
    private String cohortDate;
    /**
     * The cohortSize property
     */
    private Integer cohortSize;
    /**
     * The retentionData property
     */
    private java.util.List<Double> retentionData;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RetentionCohort}
     */
    @jakarta.annotation.Nonnull
    public static RetentionCohort createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionCohort();
    }
    /**
     * Gets the cohortDate property value. The cohortDate property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCohortDate() {
        return this.cohortDate;
    }
    /**
     * Gets the cohortSize property value. The cohortSize property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCohortSize() {
        return this.cohortSize;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cohortDate", (n) -> { this.setCohortDate(n.getStringValue()); });
        deserializerMap.put("cohortSize", (n) -> { this.setCohortSize(n.getIntegerValue()); });
        deserializerMap.put("retentionData", (n) -> { this.setRetentionData(n.getCollectionOfPrimitiveValues(Double.class)); });
        return deserializerMap;
    }
    /**
     * Gets the retentionData property value. The retentionData property
     * @return a {@link java.util.List<Double>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Double> getRetentionData() {
        return this.retentionData;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cohortDate", this.getCohortDate());
        writer.writeIntegerValue("cohortSize", this.getCohortSize());
        writer.writeCollectionOfPrimitiveValues("retentionData", this.getRetentionData());
    }
    /**
     * Sets the cohortDate property value. The cohortDate property
     * @param value Value to set for the cohortDate property.
     */
    public void setCohortDate(@jakarta.annotation.Nullable final String value) {
        this.cohortDate = value;
    }
    /**
     * Sets the cohortSize property value. The cohortSize property
     * @param value Value to set for the cohortSize property.
     */
    public void setCohortSize(@jakarta.annotation.Nullable final Integer value) {
        this.cohortSize = value;
    }
    /**
     * Sets the retentionData property value. The retentionData property
     * @param value Value to set for the retentionData property.
     */
    public void setRetentionData(@jakarta.annotation.Nullable final java.util.List<Double> value) {
        this.retentionData = value;
    }
}
