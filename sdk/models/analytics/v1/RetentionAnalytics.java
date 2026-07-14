package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetentionAnalytics implements Parsable {
    /**
     * The cohorts property
     */
    private java.util.List<RetentionCohort> cohorts;
    /**
     * The period property
     */
    private String period;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RetentionAnalytics}
     */
    @jakarta.annotation.Nonnull
    public static RetentionAnalytics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionAnalytics();
    }
    /**
     * Gets the cohorts property value. The cohorts property
     * @return a {@link java.util.List<RetentionCohort>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RetentionCohort> getCohorts() {
        return this.cohorts;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("cohorts", (n) -> { this.setCohorts(n.getCollectionOfObjectValues(RetentionCohort::createFromDiscriminatorValue)); });
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("cohorts", this.getCohorts());
        writer.writeStringValue("period", this.getPeriod());
    }
    /**
     * Sets the cohorts property value. The cohorts property
     * @param value Value to set for the cohorts property.
     */
    public void setCohorts(@jakarta.annotation.Nullable final java.util.List<RetentionCohort> value) {
        this.cohorts = value;
    }
    /**
     * Sets the period property value. The period property
     * @param value Value to set for the period property.
     */
    public void setPeriod(@jakarta.annotation.Nullable final String value) {
        this.period = value;
    }
}
