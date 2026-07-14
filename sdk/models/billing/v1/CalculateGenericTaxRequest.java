package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalculateGenericTaxRequest implements Parsable {
    /**
     * The amount property
     */
    private UntypedNode amount;
    /**
     * The billingAddress property
     */
    private BillingAddress billingAddress;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The lineItems property
     */
    private java.util.List<TaxLineItem> lineItems;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CalculateGenericTaxRequest}
     */
    @jakarta.annotation.Nonnull
    public static CalculateGenericTaxRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculateGenericTaxRequest();
    }
    /**
     * Gets the amount property value. The amount property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAmount() {
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
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingAddress", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(TaxLineItem::createFromDiscriminatorValue)); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the orgId property value. The orgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeObjectValue("billingAddress", this.getBillingAddress());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeCollectionOfObjectValues("lineItems", this.getLineItems());
        writer.writeStringValue("orgId", this.getOrgId());
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final UntypedNode value) {
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
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the lineItems property value. The lineItems property
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<TaxLineItem> value) {
        this.lineItems = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
}
