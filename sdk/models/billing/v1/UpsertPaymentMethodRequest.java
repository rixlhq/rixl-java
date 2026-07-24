package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpsertPaymentMethodRequest implements Parsable {
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The payment_method_id property
     */
    private String paymentMethodId;
    /**
     * The set_as_default property
     */
    private Boolean setAsDefault;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpsertPaymentMethodRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpsertPaymentMethodRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpsertPaymentMethodRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("payment_method_id", (n) -> { this.setPaymentMethodId(n.getStringValue()); });
        deserializerMap.put("set_as_default", (n) -> { this.setSetAsDefault(n.getBooleanValue()); });
        return deserializerMap;
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
     * Gets the payment_method_id property value. The payment_method_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Gets the set_as_default property value. The set_as_default property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("payment_method_id", this.getPaymentMethodId());
        writer.writeBooleanValue("set_as_default", this.getSetAsDefault());
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the payment_method_id property value. The payment_method_id property
     * @param value Value to set for the payment_method_id property.
     */
    public void setPaymentMethodId(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodId = value;
    }
    /**
     * Sets the set_as_default property value. The set_as_default property
     * @param value Value to set for the set_as_default property.
     */
    public void setSetAsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.setAsDefault = value;
    }
}
