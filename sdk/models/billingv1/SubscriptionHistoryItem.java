package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscriptionHistoryItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cancel_at_period_end property
     */
    private Boolean cancelAtPeriodEnd;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The current_period_end property
     */
    private String currentPeriodEnd;
    /**
     * The end_date property
     */
    private String endDate;
    /**
     * The id property
     */
    private String id;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The plan_id property
     */
    private String planId;
    /**
     * The plan_name property
     */
    private String planName;
    /**
     * The price property
     */
    private String price;
    /**
     * The start_date property
     */
    private String startDate;
    /**
     * The status property
     */
    private String status;
    /**
     * Instantiates a new {@link SubscriptionHistoryItem} and sets the default values.
     */
    public SubscriptionHistoryItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SubscriptionHistoryItem}
     */
    @jakarta.annotation.Nonnull
    public static SubscriptionHistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscriptionHistoryItem();
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
     * Gets the cancel_at_period_end property value. The cancel_at_period_end property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCancelAtPeriodEnd() {
        return this.cancelAtPeriodEnd;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the current_period_end property value. The current_period_end property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrentPeriodEnd() {
        return this.currentPeriodEnd;
    }
    /**
     * Gets the end_date property value. The end_date property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("cancel_at_period_end", (n) -> { this.setCancelAtPeriodEnd(n.getBooleanValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("current_period_end", (n) -> { this.setCurrentPeriodEnd(n.getStringValue()); });
        deserializerMap.put("end_date", (n) -> { this.setEndDate(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("plan_name", (n) -> { this.setPlanName(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getStringValue()); });
        deserializerMap.put("start_date", (n) -> { this.setStartDate(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the plan_id property value. The plan_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Gets the plan_name property value. The plan_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanName() {
        return this.planName;
    }
    /**
     * Gets the price property value. The price property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrice() {
        return this.price;
    }
    /**
     * Gets the start_date property value. The start_date property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStartDate() {
        return this.startDate;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cancel_at_period_end", this.getCancelAtPeriodEnd());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("current_period_end", this.getCurrentPeriodEnd());
        writer.writeStringValue("end_date", this.getEndDate());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("plan_id", this.getPlanId());
        writer.writeStringValue("plan_name", this.getPlanName());
        writer.writeStringValue("price", this.getPrice());
        writer.writeStringValue("start_date", this.getStartDate());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the cancel_at_period_end property value. The cancel_at_period_end property
     * @param value Value to set for the cancel_at_period_end property.
     */
    public void setCancelAtPeriodEnd(@jakarta.annotation.Nullable final Boolean value) {
        this.cancelAtPeriodEnd = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the current_period_end property value. The current_period_end property
     * @param value Value to set for the current_period_end property.
     */
    public void setCurrentPeriodEnd(@jakarta.annotation.Nullable final String value) {
        this.currentPeriodEnd = value;
    }
    /**
     * Sets the end_date property value. The end_date property
     * @param value Value to set for the end_date property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final String value) {
        this.endDate = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the plan_id property value. The plan_id property
     * @param value Value to set for the plan_id property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.planId = value;
    }
    /**
     * Sets the plan_name property value. The plan_name property
     * @param value Value to set for the plan_name property.
     */
    public void setPlanName(@jakarta.annotation.Nullable final String value) {
        this.planName = value;
    }
    /**
     * Sets the price property value. The price property
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final String value) {
        this.price = value;
    }
    /**
     * Sets the start_date property value. The start_date property
     * @param value Value to set for the start_date property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final String value) {
        this.startDate = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
