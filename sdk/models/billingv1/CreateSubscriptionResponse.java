package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateSubscriptionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cancel_at_period_end property
     */
    private Boolean cancelAtPeriodEnd;
    /**
     * The current_period_end property
     */
    private String currentPeriodEnd;
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
     * The status property
     */
    private String status;
    /**
     * The stripe_customer_id property
     */
    private String stripeCustomerId;
    /**
     * The stripe_subscription_id property
     */
    private String stripeSubscriptionId;
    /**
     * Instantiates a new {@link CreateSubscriptionResponse} and sets the default values.
     */
    public CreateSubscriptionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateSubscriptionResponse}
     */
    @jakarta.annotation.Nonnull
    public static CreateSubscriptionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateSubscriptionResponse();
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
     * Gets the current_period_end property value. The current_period_end property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrentPeriodEnd() {
        return this.currentPeriodEnd;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("cancel_at_period_end", (n) -> { this.setCancelAtPeriodEnd(n.getBooleanValue()); });
        deserializerMap.put("current_period_end", (n) -> { this.setCurrentPeriodEnd(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("stripe_customer_id", (n) -> { this.setStripeCustomerId(n.getStringValue()); });
        deserializerMap.put("stripe_subscription_id", (n) -> { this.setStripeSubscriptionId(n.getStringValue()); });
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
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the stripe_customer_id property value. The stripe_customer_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripeCustomerId() {
        return this.stripeCustomerId;
    }
    /**
     * Gets the stripe_subscription_id property value. The stripe_subscription_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripeSubscriptionId() {
        return this.stripeSubscriptionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cancel_at_period_end", this.getCancelAtPeriodEnd());
        writer.writeStringValue("current_period_end", this.getCurrentPeriodEnd());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("plan_id", this.getPlanId());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("stripe_customer_id", this.getStripeCustomerId());
        writer.writeStringValue("stripe_subscription_id", this.getStripeSubscriptionId());
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
     * Sets the current_period_end property value. The current_period_end property
     * @param value Value to set for the current_period_end property.
     */
    public void setCurrentPeriodEnd(@jakarta.annotation.Nullable final String value) {
        this.currentPeriodEnd = value;
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
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the stripe_customer_id property value. The stripe_customer_id property
     * @param value Value to set for the stripe_customer_id property.
     */
    public void setStripeCustomerId(@jakarta.annotation.Nullable final String value) {
        this.stripeCustomerId = value;
    }
    /**
     * Sets the stripe_subscription_id property value. The stripe_subscription_id property
     * @param value Value to set for the stripe_subscription_id property.
     */
    public void setStripeSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.stripeSubscriptionId = value;
    }
}
