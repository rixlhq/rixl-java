package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FunnelAnalytics implements Parsable {
    /**
     * The averageTimeHours property
     */
    private Double averageTimeHours;
    /**
     * The completedUsers property
     */
    private Integer completedUsers;
    /**
     * The completionRate property
     */
    private Double completionRate;
    /**
     * The steps property
     */
    private java.util.List<FunnelStepResult> steps;
    /**
     * The totalUsers property
     */
    private Integer totalUsers;
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
     * Gets the averageTimeHours property value. The averageTimeHours property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageTimeHours() {
        return this.averageTimeHours;
    }
    /**
     * Gets the completedUsers property value. The completedUsers property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCompletedUsers() {
        return this.completedUsers;
    }
    /**
     * Gets the completionRate property value. The completionRate property
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
        deserializerMap.put("averageTimeHours", (n) -> { this.setAverageTimeHours(n.getDoubleValue()); });
        deserializerMap.put("completedUsers", (n) -> { this.setCompletedUsers(n.getIntegerValue()); });
        deserializerMap.put("completionRate", (n) -> { this.setCompletionRate(n.getDoubleValue()); });
        deserializerMap.put("steps", (n) -> { this.setSteps(n.getCollectionOfObjectValues(FunnelStepResult::createFromDiscriminatorValue)); });
        deserializerMap.put("totalUsers", (n) -> { this.setTotalUsers(n.getIntegerValue()); });
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
     * Gets the totalUsers property value. The totalUsers property
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
        writer.writeDoubleValue("averageTimeHours", this.getAverageTimeHours());
        writer.writeIntegerValue("completedUsers", this.getCompletedUsers());
        writer.writeDoubleValue("completionRate", this.getCompletionRate());
        writer.writeCollectionOfObjectValues("steps", this.getSteps());
        writer.writeIntegerValue("totalUsers", this.getTotalUsers());
    }
    /**
     * Sets the averageTimeHours property value. The averageTimeHours property
     * @param value Value to set for the averageTimeHours property.
     */
    public void setAverageTimeHours(@jakarta.annotation.Nullable final Double value) {
        this.averageTimeHours = value;
    }
    /**
     * Sets the completedUsers property value. The completedUsers property
     * @param value Value to set for the completedUsers property.
     */
    public void setCompletedUsers(@jakarta.annotation.Nullable final Integer value) {
        this.completedUsers = value;
    }
    /**
     * Sets the completionRate property value. The completionRate property
     * @param value Value to set for the completionRate property.
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
     * Sets the totalUsers property value. The totalUsers property
     * @param value Value to set for the totalUsers property.
     */
    public void setTotalUsers(@jakarta.annotation.Nullable final Integer value) {
        this.totalUsers = value;
    }
}
