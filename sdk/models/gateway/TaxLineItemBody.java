package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaxLineItemBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The amount property
     */
    private Integer amount;
    /**
     * The reference property
     */
    private String reference;
    /**
     * The tax_code property
     */
    private String taxCode;
    /**
     * Instantiates a new {@link TaxLineItemBody} and sets the default values.
     */
    public TaxLineItemBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TaxLineItemBody}
     */
    @jakarta.annotation.Nonnull
    public static TaxLineItemBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaxLineItemBody();
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
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAmount() {
        return this.amount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getIntegerValue()); });
        deserializerMap.put("reference", (n) -> { this.setReference(n.getStringValue()); });
        deserializerMap.put("tax_code", (n) -> { this.setTaxCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reference property value. The reference property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReference() {
        return this.reference;
    }
    /**
     * Gets the tax_code property value. The tax_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxCode() {
        return this.taxCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("amount", this.getAmount());
        writer.writeStringValue("reference", this.getReference());
        writer.writeStringValue("tax_code", this.getTaxCode());
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
    public void setAmount(@jakarta.annotation.Nullable final Integer value) {
        this.amount = value;
    }
    /**
     * Sets the reference property value. The reference property
     * @param value Value to set for the reference property.
     */
    public void setReference(@jakarta.annotation.Nullable final String value) {
        this.reference = value;
    }
    /**
     * Sets the tax_code property value. The tax_code property
     * @param value Value to set for the tax_code property.
     */
    public void setTaxCode(@jakarta.annotation.Nullable final String value) {
        this.taxCode = value;
    }
}
