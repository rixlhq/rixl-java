package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalculateTaxRequest implements Parsable {
    /**
     * The amount property
     */
    private Double amount;
    /**
     * The billingAddress property
     */
    private BillingAddress billingAddress;
    /**
     * The billingCycle property
     */
    private BillingCycle billingCycle;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The intervalCount property
     */
    private UntypedNode intervalCount;
    /**
     * The lineItems property
     */
    private java.util.List<TaxLineItem> lineItems;
    /**
     * The metadata property
     */
    private CalculateTaxRequestMetadata metadata;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * The planId property
     */
    private String planId;
    /**
     * The planName property
     */
    private String planName;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CalculateTaxRequest}
     */
    @jakarta.annotation.Nonnull
    public static CalculateTaxRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculateTaxRequest();
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
     * Gets the billingAddress property value. The billingAddress property
     * @return a {@link BillingAddress}
     */
    @jakarta.annotation.Nullable
    public BillingAddress getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * Gets the billingCycle property value. The billingCycle property
     * @return a {@link BillingCycle}
     */
    @jakarta.annotation.Nullable
    public BillingCycle getBillingCycle() {
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getDoubleValue()); });
        deserializerMap.put("billingAddress", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("billingCycle", (n) -> { this.setBillingCycle(n.getEnumValue(BillingCycle::forValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("intervalCount", (n) -> { this.setIntervalCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(TaxLineItem::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(CalculateTaxRequestMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("planName", (n) -> { this.setPlanName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intervalCount property value. The intervalCount property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getIntervalCount() {
        return this.intervalCount;
    }
    /**
     * Gets the lineItems property value. The lineItems property
     * @return a {@link java.util.List<TaxLineItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaxLineItem> getLineItems() {
        return this.lineItems;
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a {@link CalculateTaxRequestMetadata}
     */
    @jakarta.annotation.Nullable
    public CalculateTaxRequestMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the orgId property value. The orgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the planId property value. The planId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Gets the planName property value. The planName property
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
        writer.writeObjectValue("billingAddress", this.getBillingAddress());
        writer.writeEnumValue("billingCycle", this.getBillingCycle());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeObjectValue("intervalCount", this.getIntervalCount());
        writer.writeCollectionOfObjectValues("lineItems", this.getLineItems());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeStringValue("planName", this.getPlanName());
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Double value) {
        this.amount = value;
    }
    /**
     * Sets the billingAddress property value. The billingAddress property
     * @param value Value to set for the billingAddress property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final BillingAddress value) {
        this.billingAddress = value;
    }
    /**
     * Sets the billingCycle property value. The billingCycle property
     * @param value Value to set for the billingCycle property.
     */
    public void setBillingCycle(@jakarta.annotation.Nullable final BillingCycle value) {
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
     * Sets the intervalCount property value. The intervalCount property
     * @param value Value to set for the intervalCount property.
     */
    public void setIntervalCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.intervalCount = value;
    }
    /**
     * Sets the lineItems property value. The lineItems property
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<TaxLineItem> value) {
        this.lineItems = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final CalculateTaxRequestMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the planId property value. The planId property
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.planId = value;
    }
    /**
     * Sets the planName property value. The planName property
     * @param value Value to set for the planName property.
     */
    public void setPlanName(@jakarta.annotation.Nullable final String value) {
        this.planName = value;
    }
}
