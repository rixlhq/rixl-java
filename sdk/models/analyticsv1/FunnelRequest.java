package com.rixl.sdk.models.analyticsv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Funnel definition
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FunnelRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The range property
     */
    private DateRange range;
    /**
     * The steps property
     */
    private java.util.List<FunnelStep> steps;
    /**
     * The time_window property
     */
    private Integer timeWindow;
    /**
     * Instantiates a new {@link FunnelRequest} and sets the default values.
     */
    public FunnelRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FunnelRequest}
     */
    @jakarta.annotation.Nonnull
    public static FunnelRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FunnelRequest();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("range", (n) -> { this.setRange(n.getObjectValue(DateRange::createFromDiscriminatorValue)); });
        deserializerMap.put("steps", (n) -> { this.setSteps(n.getCollectionOfObjectValues(FunnelStep::createFromDiscriminatorValue)); });
        deserializerMap.put("time_window", (n) -> { this.setTimeWindow(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the steps property value. The steps property
     * @return a {@link java.util.List<FunnelStep>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FunnelStep> getSteps() {
        return this.steps;
    }
    /**
     * Gets the time_window property value. The time_window property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimeWindow() {
        return this.timeWindow;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("range", this.getRange());
        writer.writeCollectionOfObjectValues("steps", this.getSteps());
        writer.writeIntegerValue("time_window", this.getTimeWindow());
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
     * Sets the range property value. The range property
     * @param value Value to set for the range property.
     */
    public void setRange(@jakarta.annotation.Nullable final DateRange value) {
        this.range = value;
    }
    /**
     * Sets the steps property value. The steps property
     * @param value Value to set for the steps property.
     */
    public void setSteps(@jakarta.annotation.Nullable final java.util.List<FunnelStep> value) {
        this.steps = value;
    }
    /**
     * Sets the time_window property value. The time_window property
     * @param value Value to set for the time_window property.
     */
    public void setTimeWindow(@jakarta.annotation.Nullable final Integer value) {
        this.timeWindow = value;
    }
}
