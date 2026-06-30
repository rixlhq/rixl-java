package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethodIdResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The payment_method_id property
     */
    private String paymentMethodId;
    /**
     * The setup_intent_id property
     */
    private String setupIntentId;
    /**
     * The status property
     */
    private String status;
    /**
     * Instantiates a new {@link PaymentMethodIdResponse} and sets the default values.
     */
    public PaymentMethodIdResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentMethodIdResponse}
     */
    @jakarta.annotation.Nonnull
    public static PaymentMethodIdResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentMethodIdResponse();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("payment_method_id", (n) -> { this.setPaymentMethodId(n.getStringValue()); });
        deserializerMap.put("setup_intent_id", (n) -> { this.setSetupIntentId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
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
     * Gets the setup_intent_id property value. The setup_intent_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSetupIntentId() {
        return this.setupIntentId;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("payment_method_id", this.getPaymentMethodId());
        writer.writeStringValue("setup_intent_id", this.getSetupIntentId());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the payment_method_id property value. The payment_method_id property
     * @param value Value to set for the payment_method_id property.
     */
    public void setPaymentMethodId(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodId = value;
    }
    /**
     * Sets the setup_intent_id property value. The setup_intent_id property
     * @param value Value to set for the setup_intent_id property.
     */
    public void setSetupIntentId(@jakarta.annotation.Nullable final String value) {
        this.setupIntentId = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
