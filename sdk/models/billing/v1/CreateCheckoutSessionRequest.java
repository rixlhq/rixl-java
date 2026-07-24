package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateCheckoutSessionRequest implements Parsable {
    /**
     * The cancel_url property
     */
    private String cancelUrl;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The stripe_price_id property
     */
    private String stripePriceId;
    /**
     * The success_url property
     */
    private String successUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateCheckoutSessionRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateCheckoutSessionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateCheckoutSessionRequest();
    }
    /**
     * Gets the cancel_url property value. The cancel_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelUrl() {
        return this.cancelUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cancel_url", (n) -> { this.setCancelUrl(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("stripe_price_id", (n) -> { this.setStripePriceId(n.getStringValue()); });
        deserializerMap.put("success_url", (n) -> { this.setSuccessUrl(n.getStringValue()); });
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
     * Gets the stripe_price_id property value. The stripe_price_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripePriceId() {
        return this.stripePriceId;
    }
    /**
     * Gets the success_url property value. The success_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSuccessUrl() {
        return this.successUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cancel_url", this.getCancelUrl());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("stripe_price_id", this.getStripePriceId());
        writer.writeStringValue("success_url", this.getSuccessUrl());
    }
    /**
     * Sets the cancel_url property value. The cancel_url property
     * @param value Value to set for the cancel_url property.
     */
    public void setCancelUrl(@jakarta.annotation.Nullable final String value) {
        this.cancelUrl = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the stripe_price_id property value. The stripe_price_id property
     * @param value Value to set for the stripe_price_id property.
     */
    public void setStripePriceId(@jakarta.annotation.Nullable final String value) {
        this.stripePriceId = value;
    }
    /**
     * Sets the success_url property value. The success_url property
     * @param value Value to set for the success_url property.
     */
    public void setSuccessUrl(@jakarta.annotation.Nullable final String value) {
        this.successUrl = value;
    }
}
