package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Subscription implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cancel_at_period_end property
     */
    private Boolean cancelAtPeriodEnd;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The current_period_end property
     */
    private String currentPeriodEnd;
    /**
     * The expiring_soon property
     */
    private Boolean expiringSoon;
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
     * The plan_type property
     */
    private String planType;
    /**
     * The price property
     */
    private String price;
    /**
     * The status property
     */
    private String status;
    /**
     * The trials_ending_soon property
     */
    private Boolean trialsEndingSoon;
    /**
     * Instantiates a new {@link Subscription} and sets the default values.
     */
    public Subscription() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Subscription}
     */
    @jakarta.annotation.Nonnull
    public static Subscription createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Subscription();
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
     * Gets the expiring_soon property value. The expiring_soon property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExpiringSoon() {
        return this.expiringSoon;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("cancel_at_period_end", (n) -> { this.setCancelAtPeriodEnd(n.getBooleanValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("current_period_end", (n) -> { this.setCurrentPeriodEnd(n.getStringValue()); });
        deserializerMap.put("expiring_soon", (n) -> { this.setExpiringSoon(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("plan_name", (n) -> { this.setPlanName(n.getStringValue()); });
        deserializerMap.put("plan_type", (n) -> { this.setPlanType(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("trials_ending_soon", (n) -> { this.setTrialsEndingSoon(n.getBooleanValue()); });
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
     * Gets the plan_type property value. The plan_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanType() {
        return this.planType;
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
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the trials_ending_soon property value. The trials_ending_soon property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTrialsEndingSoon() {
        return this.trialsEndingSoon;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cancel_at_period_end", this.getCancelAtPeriodEnd());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("current_period_end", this.getCurrentPeriodEnd());
        writer.writeBooleanValue("expiring_soon", this.getExpiringSoon());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("plan_id", this.getPlanId());
        writer.writeStringValue("plan_name", this.getPlanName());
        writer.writeStringValue("plan_type", this.getPlanType());
        writer.writeStringValue("price", this.getPrice());
        writer.writeStringValue("status", this.getStatus());
        writer.writeBooleanValue("trials_ending_soon", this.getTrialsEndingSoon());
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
     * Sets the expiring_soon property value. The expiring_soon property
     * @param value Value to set for the expiring_soon property.
     */
    public void setExpiringSoon(@jakarta.annotation.Nullable final Boolean value) {
        this.expiringSoon = value;
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
     * Sets the plan_type property value. The plan_type property
     * @param value Value to set for the plan_type property.
     */
    public void setPlanType(@jakarta.annotation.Nullable final String value) {
        this.planType = value;
    }
    /**
     * Sets the price property value. The price property
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final String value) {
        this.price = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the trials_ending_soon property value. The trials_ending_soon property
     * @param value Value to set for the trials_ending_soon property.
     */
    public void setTrialsEndingSoon(@jakarta.annotation.Nullable final Boolean value) {
        this.trialsEndingSoon = value;
    }
}
