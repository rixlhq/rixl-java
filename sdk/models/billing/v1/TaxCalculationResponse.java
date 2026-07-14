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
     * The amountTotal property
     */
    private UntypedNode amountTotal;
    /**
     * The calculationId property
     */
    private String calculationId;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The taxAmountExclusive property
     */
    private UntypedNode taxAmountExclusive;
    /**
     * The taxAmountInclusive property
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
     * Gets the amountTotal property value. The amountTotal property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAmountTotal() {
        return this.amountTotal;
    }
    /**
     * Gets the calculationId property value. The calculationId property
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
        deserializerMap.put("amountTotal", (n) -> { this.setAmountTotal(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("calculationId", (n) -> { this.setCalculationId(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("taxAmountExclusive", (n) -> { this.setTaxAmountExclusive(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("taxAmountInclusive", (n) -> { this.setTaxAmountInclusive(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the taxAmountExclusive property value. The taxAmountExclusive property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTaxAmountExclusive() {
        return this.taxAmountExclusive;
    }
    /**
     * Gets the taxAmountInclusive property value. The taxAmountInclusive property
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
        writer.writeObjectValue("amountTotal", this.getAmountTotal());
        writer.writeStringValue("calculationId", this.getCalculationId());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeObjectValue("taxAmountExclusive", this.getTaxAmountExclusive());
        writer.writeObjectValue("taxAmountInclusive", this.getTaxAmountInclusive());
    }
    /**
     * Sets the amountTotal property value. The amountTotal property
     * @param value Value to set for the amountTotal property.
     */
    public void setAmountTotal(@jakarta.annotation.Nullable final UntypedNode value) {
        this.amountTotal = value;
    }
    /**
     * Sets the calculationId property value. The calculationId property
     * @param value Value to set for the calculationId property.
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
     * Sets the taxAmountExclusive property value. The taxAmountExclusive property
     * @param value Value to set for the taxAmountExclusive property.
     */
    public void setTaxAmountExclusive(@jakarta.annotation.Nullable final UntypedNode value) {
        this.taxAmountExclusive = value;
    }
    /**
     * Sets the taxAmountInclusive property value. The taxAmountInclusive property
     * @param value Value to set for the taxAmountInclusive property.
     */
    public void setTaxAmountInclusive(@jakarta.annotation.Nullable final UntypedNode value) {
        this.taxAmountInclusive = value;
    }
}
