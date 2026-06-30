package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Subscription request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateSubscriptionBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The billing_address property
     */
    private BillingAddressBody billingAddress;
    /**
     * The payment_method_id property
     */
    private String paymentMethodId;
    /**
     * The stripe_price_id property
     */
    private String stripePriceId;
    /**
     * Instantiates a new {@link CreateSubscriptionBody} and sets the default values.
     */
    public CreateSubscriptionBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateSubscriptionBody}
     */
    @jakarta.annotation.Nonnull
    public static CreateSubscriptionBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateSubscriptionBody();
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
     * Gets the billing_address property value. The billing_address property
     * @return a {@link BillingAddressBody}
     */
    @jakarta.annotation.Nullable
    public BillingAddressBody getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddressBody::createFromDiscriminatorValue)); });
        deserializerMap.put("payment_method_id", (n) -> { this.setPaymentMethodId(n.getStringValue()); });
        deserializerMap.put("stripe_price_id", (n) -> { this.setStripePriceId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the stripe_price_id property value. The stripe_price_id property
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
        writer.writeObjectValue("billing_address", this.getBillingAddress());
        writer.writeStringValue("payment_method_id", this.getPaymentMethodId());
        writer.writeStringValue("stripe_price_id", this.getStripePriceId());
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
     * Sets the billing_address property value. The billing_address property
     * @param value Value to set for the billing_address property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final BillingAddressBody value) {
        this.billingAddress = value;
    }
    /**
     * Sets the payment_method_id property value. The payment_method_id property
     * @param value Value to set for the payment_method_id property.
     */
    public void setPaymentMethodId(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodId = value;
    }
    /**
     * Sets the stripe_price_id property value. The stripe_price_id property
     * @param value Value to set for the stripe_price_id property.
     */
    public void setStripePriceId(@jakarta.annotation.Nullable final String value) {
        this.stripePriceId = value;
    }
}
