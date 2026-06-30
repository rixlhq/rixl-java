package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Tax calculation request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalculateTaxBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The amount property
     */
    private Double amount;
    /**
     * The billing_address property
     */
    private BillingAddressBody billingAddress;
    /**
     * The billing_cycle property
     */
    private String billingCycle;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The interval_count property
     */
    private Integer intervalCount;
    /**
     * The line_items property
     */
    private java.util.List<TaxLineItemBody> lineItems;
    /**
     * The metadata property
     */
    private CalculateTaxBodyMetadata metadata;
    /**
     * The plan_id property
     */
    private String planId;
    /**
     * The plan_name property
     */
    private String planName;
    /**
     * Instantiates a new {@link CalculateTaxBody} and sets the default values.
     */
    public CalculateTaxBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CalculateTaxBody}
     */
    @jakarta.annotation.Nonnull
    public static CalculateTaxBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculateTaxBody();
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
     * Gets the amount property value. The amount property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAmount() {
        return this.amount;
    }
    /**
     * Gets the billing_address property value. The billing_address property
     * @return a {@link BillingAddressBody}
     */
    @jakarta.annotation.Nullable
    public BillingAddressBody getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * Gets the billing_cycle property value. The billing_cycle property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingCycle() {
        return this.billingCycle;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getDoubleValue()); });
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddressBody::createFromDiscriminatorValue)); });
        deserializerMap.put("billing_cycle", (n) -> { this.setBillingCycle(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("interval_count", (n) -> { this.setIntervalCount(n.getIntegerValue()); });
        deserializerMap.put("line_items", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(TaxLineItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(CalculateTaxBodyMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("plan_name", (n) -> { this.setPlanName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the interval_count property value. The interval_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIntervalCount() {
        return this.intervalCount;
    }
    /**
     * Gets the line_items property value. The line_items property
     * @return a {@link java.util.List<TaxLineItemBody>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaxLineItemBody> getLineItems() {
        return this.lineItems;
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a {@link CalculateTaxBodyMetadata}
     */
    @jakarta.annotation.Nullable
    public CalculateTaxBodyMetadata getMetadata() {
        return this.metadata;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("amount", this.getAmount());
        writer.writeObjectValue("billing_address", this.getBillingAddress());
        writer.writeStringValue("billing_cycle", this.getBillingCycle());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeIntegerValue("interval_count", this.getIntervalCount());
        writer.writeCollectionOfObjectValues("line_items", this.getLineItems());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("plan_id", this.getPlanId());
        writer.writeStringValue("plan_name", this.getPlanName());
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
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Double value) {
        this.amount = value;
    }
    /**
     * Sets the billing_address property value. The billing_address property
     * @param value Value to set for the billing_address property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final BillingAddressBody value) {
        this.billingAddress = value;
    }
    /**
     * Sets the billing_cycle property value. The billing_cycle property
     * @param value Value to set for the billing_cycle property.
     */
    public void setBillingCycle(@jakarta.annotation.Nullable final String value) {
        this.billingCycle = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the interval_count property value. The interval_count property
     * @param value Value to set for the interval_count property.
     */
    public void setIntervalCount(@jakarta.annotation.Nullable final Integer value) {
        this.intervalCount = value;
    }
    /**
     * Sets the line_items property value. The line_items property
     * @param value Value to set for the line_items property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<TaxLineItemBody> value) {
        this.lineItems = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final CalculateTaxBodyMetadata value) {
        this.metadata = value;
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
}
