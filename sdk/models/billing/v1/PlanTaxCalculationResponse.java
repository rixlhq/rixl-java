package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlanTaxCalculationResponse implements Parsable {
    /**
     * The amount_total property
     */
    private String amountTotal;
    /**
     * The base_amount property
     */
    private String baseAmount;
    /**
     * The billing_address property
     */
    private BillingAddress billingAddress;
    /**
     * The billing_cycle property
     */
    private BillingCycle billingCycle;
    /**
     * The calculated_at property
     */
    private OffsetDateTime calculatedAt;
    /**
     * The calculation_id property
     */
    private String calculationId;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The plan_id property
     */
    private String planId;
    /**
     * The plan_name property
     */
    private String planName;
    /**
     * The tax_amount_exclusive property
     */
    private String taxAmountExclusive;
    /**
     * The tax_amount_inclusive property
     */
    private String taxAmountInclusive;
    /**
     * The tax_percentage property
     */
    private Double taxPercentage;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlanTaxCalculationResponse}
     */
    @jakarta.annotation.Nonnull
    public static PlanTaxCalculationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlanTaxCalculationResponse();
    }
    /**
     * Gets the amount_total property value. The amount_total property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAmountTotal() {
        return this.amountTotal;
    }
    /**
     * Gets the base_amount property value. The base_amount property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBaseAmount() {
        return this.baseAmount;
    }
    /**
     * Gets the billing_address property value. The billing_address property
     * @return a {@link BillingAddress}
     */
    @jakarta.annotation.Nullable
    public BillingAddress getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * Gets the billing_cycle property value. The billing_cycle property
     * @return a {@link BillingCycle}
     */
    @jakarta.annotation.Nullable
    public BillingCycle getBillingCycle() {
        return this.billingCycle;
    }
    /**
     * Gets the calculated_at property value. The calculated_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCalculatedAt() {
        return this.calculatedAt;
    }
    /**
     * Gets the calculation_id property value. The calculation_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCalculationId() {
        return this.calculationId;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("amount_total", (n) -> { this.setAmountTotal(n.getStringValue()); });
        deserializerMap.put("base_amount", (n) -> { this.setBaseAmount(n.getStringValue()); });
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("billing_cycle", (n) -> { this.setBillingCycle(n.getEnumValue(BillingCycle::forValue)); });
        deserializerMap.put("calculated_at", (n) -> { this.setCalculatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("calculation_id", (n) -> { this.setCalculationId(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("plan_name", (n) -> { this.setPlanName(n.getStringValue()); });
        deserializerMap.put("tax_amount_exclusive", (n) -> { this.setTaxAmountExclusive(n.getStringValue()); });
        deserializerMap.put("tax_amount_inclusive", (n) -> { this.setTaxAmountInclusive(n.getStringValue()); });
        deserializerMap.put("tax_percentage", (n) -> { this.setTaxPercentage(n.getDoubleValue()); });
        return deserializerMap;
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
     * Gets the tax_amount_exclusive property value. The tax_amount_exclusive property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxAmountExclusive() {
        return this.taxAmountExclusive;
    }
    /**
     * Gets the tax_amount_inclusive property value. The tax_amount_inclusive property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxAmountInclusive() {
        return this.taxAmountInclusive;
    }
    /**
     * Gets the tax_percentage property value. The tax_percentage property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTaxPercentage() {
        return this.taxPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("amount_total", this.getAmountTotal());
        writer.writeStringValue("base_amount", this.getBaseAmount());
        writer.writeObjectValue("billing_address", this.getBillingAddress());
        writer.writeEnumValue("billing_cycle", this.getBillingCycle());
        writer.writeOffsetDateTimeValue("calculated_at", this.getCalculatedAt());
        writer.writeStringValue("calculation_id", this.getCalculationId());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("plan_id", this.getPlanId());
        writer.writeStringValue("plan_name", this.getPlanName());
        writer.writeStringValue("tax_amount_exclusive", this.getTaxAmountExclusive());
        writer.writeStringValue("tax_amount_inclusive", this.getTaxAmountInclusive());
        writer.writeDoubleValue("tax_percentage", this.getTaxPercentage());
    }
    /**
     * Sets the amount_total property value. The amount_total property
     * @param value Value to set for the amount_total property.
     */
    public void setAmountTotal(@jakarta.annotation.Nullable final String value) {
        this.amountTotal = value;
    }
    /**
     * Sets the base_amount property value. The base_amount property
     * @param value Value to set for the base_amount property.
     */
    public void setBaseAmount(@jakarta.annotation.Nullable final String value) {
        this.baseAmount = value;
    }
    /**
     * Sets the billing_address property value. The billing_address property
     * @param value Value to set for the billing_address property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final BillingAddress value) {
        this.billingAddress = value;
    }
    /**
     * Sets the billing_cycle property value. The billing_cycle property
     * @param value Value to set for the billing_cycle property.
     */
    public void setBillingCycle(@jakarta.annotation.Nullable final BillingCycle value) {
        this.billingCycle = value;
    }
    /**
     * Sets the calculated_at property value. The calculated_at property
     * @param value Value to set for the calculated_at property.
     */
    public void setCalculatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.calculatedAt = value;
    }
    /**
     * Sets the calculation_id property value. The calculation_id property
     * @param value Value to set for the calculation_id property.
     */
    public void setCalculationId(@jakarta.annotation.Nullable final String value) {
        this.calculationId = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
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
     * Sets the tax_amount_exclusive property value. The tax_amount_exclusive property
     * @param value Value to set for the tax_amount_exclusive property.
     */
    public void setTaxAmountExclusive(@jakarta.annotation.Nullable final String value) {
        this.taxAmountExclusive = value;
    }
    /**
     * Sets the tax_amount_inclusive property value. The tax_amount_inclusive property
     * @param value Value to set for the tax_amount_inclusive property.
     */
    public void setTaxAmountInclusive(@jakarta.annotation.Nullable final String value) {
        this.taxAmountInclusive = value;
    }
    /**
     * Sets the tax_percentage property value. The tax_percentage property
     * @param value Value to set for the tax_percentage property.
     */
    public void setTaxPercentage(@jakarta.annotation.Nullable final Double value) {
        this.taxPercentage = value;
    }
}
