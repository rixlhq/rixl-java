package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaxCalculationResponse implements Parsable {
    /**
     * The amount_total property
     */
    private UntypedNode amountTotal;
    /**
     * The calculation_id property
     */
    private String calculationId;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The tax_amount_exclusive property
     */
    private UntypedNode taxAmountExclusive;
    /**
     * The tax_amount_inclusive property
     */
    private UntypedNode taxAmountInclusive;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TaxCalculationResponse}
     */
    @jakarta.annotation.Nonnull
    public static TaxCalculationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaxCalculationResponse();
    }
    /**
     * Gets the amount_total property value. The amount_total property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAmountTotal() {
        return this.amountTotal;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("amount_total", (n) -> { this.setAmountTotal(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("calculation_id", (n) -> { this.setCalculationId(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("tax_amount_exclusive", (n) -> { this.setTaxAmountExclusive(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("tax_amount_inclusive", (n) -> { this.setTaxAmountInclusive(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tax_amount_exclusive property value. The tax_amount_exclusive property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTaxAmountExclusive() {
        return this.taxAmountExclusive;
    }
    /**
     * Gets the tax_amount_inclusive property value. The tax_amount_inclusive property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTaxAmountInclusive() {
        return this.taxAmountInclusive;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount_total", this.getAmountTotal());
        writer.writeStringValue("calculation_id", this.getCalculationId());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeObjectValue("tax_amount_exclusive", this.getTaxAmountExclusive());
        writer.writeObjectValue("tax_amount_inclusive", this.getTaxAmountInclusive());
    }
    /**
     * Sets the amount_total property value. The amount_total property
     * @param value Value to set for the amount_total property.
     */
    public void setAmountTotal(@jakarta.annotation.Nullable final UntypedNode value) {
        this.amountTotal = value;
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
     * Sets the tax_amount_exclusive property value. The tax_amount_exclusive property
     * @param value Value to set for the tax_amount_exclusive property.
     */
    public void setTaxAmountExclusive(@jakarta.annotation.Nullable final UntypedNode value) {
        this.taxAmountExclusive = value;
    }
    /**
     * Sets the tax_amount_inclusive property value. The tax_amount_inclusive property
     * @param value Value to set for the tax_amount_inclusive property.
     */
    public void setTaxAmountInclusive(@jakarta.annotation.Nullable final UntypedNode value) {
        this.taxAmountInclusive = value;
    }
}
