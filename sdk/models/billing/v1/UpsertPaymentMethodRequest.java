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
     * The orgId property
     */
    private String orgId;
    /**
     * The paymentMethodId property
     */
    private String paymentMethodId;
    /**
     * The setAsDefault property
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
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("paymentMethodId", (n) -> { this.setPaymentMethodId(n.getStringValue()); });
        deserializerMap.put("setAsDefault", (n) -> { this.setSetAsDefault(n.getBooleanValue()); });
        return deserializerMap;
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
     * Gets the paymentMethodId property value. The paymentMethodId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Gets the setAsDefault property value. The setAsDefault property
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
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeStringValue("paymentMethodId", this.getPaymentMethodId());
        writer.writeBooleanValue("setAsDefault", this.getSetAsDefault());
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the paymentMethodId property value. The paymentMethodId property
     * @param value Value to set for the paymentMethodId property.
     */
    public void setPaymentMethodId(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodId = value;
    }
    /**
     * Sets the setAsDefault property value. The setAsDefault property
     * @param value Value to set for the setAsDefault property.
     */
    public void setSetAsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.setAsDefault = value;
    }
}
