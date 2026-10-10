package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingConfig implements Parsable {
    /**
     * Stripe publishable key of the account the caller&apos;s organization is billed in.
     */
    private String publishableKey;
    /**
     * True when the organization is billed in the Stripe sandbox: no money moves.
     */
    private Boolean sandbox;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BillingConfig}
     */
    @jakarta.annotation.Nonnull
    public static BillingConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingConfig();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("publishable_key", (n) -> { this.setPublishableKey(n.getStringValue()); });
        deserializerMap.put("sandbox", (n) -> { this.setSandbox(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the publishable_key property value. Stripe publishable key of the account the caller&apos;s organization is billed in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublishableKey() {
        return this.publishableKey;
    }
    /**
     * Gets the sandbox property value. True when the organization is billed in the Stripe sandbox: no money moves.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSandbox() {
        return this.sandbox;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("publishable_key", this.getPublishableKey());
        writer.writeBooleanValue("sandbox", this.getSandbox());
    }
    /**
     * Sets the publishable_key property value. Stripe publishable key of the account the caller&apos;s organization is billed in.
     * @param value Value to set for the publishable_key property.
     */
    public void setPublishableKey(@jakarta.annotation.Nullable final String value) {
        this.publishableKey = value;
    }
    /**
     * Sets the sandbox property value. True when the organization is billed in the Stripe sandbox: no money moves.
     * @param value Value to set for the sandbox property.
     */
    public void setSandbox(@jakarta.annotation.Nullable final Boolean value) {
        this.sandbox = value;
    }
}
