package com.rixl.sdk.models.analyticsv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetentionCohort implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cohort_date property
     */
    private String cohortDate;
    /**
     * The cohort_size property
     */
    private Integer cohortSize;
    /**
     * The retention_data property
     */
    private java.util.List<Double> retentionData;
    /**
     * Instantiates a new {@link RetentionCohort} and sets the default values.
     */
    public RetentionCohort() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cohort_date property value. The cohort_date property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCohortDate() {
        return this.cohortDate;
    }
    /**
     * Gets the cohort_size property value. The cohort_size property
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
        deserializerMap.put("cohort_date", (n) -> { this.setCohortDate(n.getStringValue()); });
        deserializerMap.put("cohort_size", (n) -> { this.setCohortSize(n.getIntegerValue()); });
        deserializerMap.put("retention_data", (n) -> { this.setRetentionData(n.getCollectionOfPrimitiveValues(Double.class)); });
        return deserializerMap;
    }
    /**
     * Gets the retention_data property value. The retention_data property
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
        writer.writeStringValue("cohort_date", this.getCohortDate());
        writer.writeIntegerValue("cohort_size", this.getCohortSize());
        writer.writeCollectionOfPrimitiveValues("retention_data", this.getRetentionData());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cohort_date property value. The cohort_date property
     * @param value Value to set for the cohort_date property.
     */
    public void setCohortDate(@jakarta.annotation.Nullable final String value) {
        this.cohortDate = value;
    }
    /**
     * Sets the cohort_size property value. The cohort_size property
     * @param value Value to set for the cohort_size property.
     */
    public void setCohortSize(@jakarta.annotation.Nullable final Integer value) {
        this.cohortSize = value;
    }
    /**
     * Sets the retention_data property value. The retention_data property
     * @param value Value to set for the retention_data property.
     */
    public void setRetentionData(@jakarta.annotation.Nullable final java.util.List<Double> value) {
        this.retentionData = value;
    }
}
