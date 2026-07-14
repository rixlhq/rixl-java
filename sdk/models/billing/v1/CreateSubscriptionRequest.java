package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateSubscriptionRequest implements Parsable {
    /**
     * The billingAddress property
     */
    private BillingAddress billingAddress;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * The paymentMethodId property
     */
    private String paymentMethodId;
    /**
     * The stripePriceId property
     */
    private String stripePriceId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateSubscriptionRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateSubscriptionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateSubscriptionRequest();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("billingAddress", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("paymentMethodId", (n) -> { this.setPaymentMethodId(n.getStringValue()); });
        deserializerMap.put("stripePriceId", (n) -> { this.setStripePriceId(n.getStringValue()); });
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
     * Gets the stripePriceId property value. The stripePriceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripePriceId() {
        return this.stripePriceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("billingAddress", this.getBillingAddress());
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeStringValue("paymentMethodId", this.getPaymentMethodId());
        writer.writeStringValue("stripePriceId", this.getStripePriceId());
    }
    /**
     * Sets the billingAddress property value. The billingAddress property
     * @param value Value to set for the billingAddress property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final BillingAddress value) {
        this.billingAddress = value;
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
     * Sets the stripePriceId property value. The stripePriceId property
     * @param value Value to set for the stripePriceId property.
     */
    public void setStripePriceId(@jakarta.annotation.Nullable final String value) {
        this.stripePriceId = value;
    }
}
