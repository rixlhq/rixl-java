package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethodIdResponse implements Parsable {
    /**
     * The paymentMethodId property
     */
    private String paymentMethodId;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("paymentMethodId", (n) -> { this.setPaymentMethodId(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("paymentMethodId", this.getPaymentMethodId());
    }
    /**
     * Sets the paymentMethodId property value. The paymentMethodId property
     * @param value Value to set for the paymentMethodId property.
     */
    public void setPaymentMethodId(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodId = value;
    }
}
