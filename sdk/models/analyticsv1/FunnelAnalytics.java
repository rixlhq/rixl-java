package com.rixl.sdk.models.analyticsv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FunnelAnalytics implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The average_time_hours property
     */
    private Double averageTimeHours;
    /**
     * The completed_users property
     */
    private Integer completedUsers;
    /**
     * The completion_rate property
     */
    private Double completionRate;
    /**
     * The steps property
     */
    private java.util.List<FunnelStepResult> steps;
    /**
     * The total_users property
     */
    private Integer totalUsers;
    /**
     * Instantiates a new {@link FunnelAnalytics} and sets the default values.
     */
    public FunnelAnalytics() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FunnelAnalytics}
     */
    @jakarta.annotation.Nonnull
    public static FunnelAnalytics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FunnelAnalytics();
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
     * Gets the average_time_hours property value. The average_time_hours property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageTimeHours() {
        return this.averageTimeHours;
    }
    /**
     * Gets the completed_users property value. The completed_users property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCompletedUsers() {
        return this.completedUsers;
    }
    /**
     * Gets the completion_rate property value. The completion_rate property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCompletionRate() {
        return this.completionRate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("average_time_hours", (n) -> { this.setAverageTimeHours(n.getDoubleValue()); });
        deserializerMap.put("completed_users", (n) -> { this.setCompletedUsers(n.getIntegerValue()); });
        deserializerMap.put("completion_rate", (n) -> { this.setCompletionRate(n.getDoubleValue()); });
        deserializerMap.put("steps", (n) -> { this.setSteps(n.getCollectionOfObjectValues(FunnelStepResult::createFromDiscriminatorValue)); });
        deserializerMap.put("total_users", (n) -> { this.setTotalUsers(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the steps property value. The steps property
     * @return a {@link java.util.List<FunnelStepResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FunnelStepResult> getSteps() {
        return this.steps;
    }
    /**
     * Gets the total_users property value. The total_users property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUsers() {
        return this.totalUsers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("average_time_hours", this.getAverageTimeHours());
        writer.writeIntegerValue("completed_users", this.getCompletedUsers());
        writer.writeDoubleValue("completion_rate", this.getCompletionRate());
        writer.writeCollectionOfObjectValues("steps", this.getSteps());
        writer.writeIntegerValue("total_users", this.getTotalUsers());
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
     * Sets the average_time_hours property value. The average_time_hours property
     * @param value Value to set for the average_time_hours property.
     */
    public void setAverageTimeHours(@jakarta.annotation.Nullable final Double value) {
        this.averageTimeHours = value;
    }
    /**
     * Sets the completed_users property value. The completed_users property
     * @param value Value to set for the completed_users property.
     */
    public void setCompletedUsers(@jakarta.annotation.Nullable final Integer value) {
        this.completedUsers = value;
    }
    /**
     * Sets the completion_rate property value. The completion_rate property
     * @param value Value to set for the completion_rate property.
     */
    public void setCompletionRate(@jakarta.annotation.Nullable final Double value) {
        this.completionRate = value;
    }
    /**
     * Sets the steps property value. The steps property
     * @param value Value to set for the steps property.
     */
    public void setSteps(@jakarta.annotation.Nullable final java.util.List<FunnelStepResult> value) {
        this.steps = value;
    }
    /**
     * Sets the total_users property value. The total_users property
     * @param value Value to set for the total_users property.
     */
    public void setTotalUsers(@jakarta.annotation.Nullable final Integer value) {
        this.totalUsers = value;
    }
}
