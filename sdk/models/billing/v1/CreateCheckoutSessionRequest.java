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
     * The cancelUrl property
     */
    private String cancelUrl;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * The stripePriceId property
     */
    private String stripePriceId;
    /**
     * The successUrl property
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
     * Gets the cancelUrl property value. The cancelUrl property
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
        deserializerMap.put("cancelUrl", (n) -> { this.setCancelUrl(n.getStringValue()); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("stripePriceId", (n) -> { this.setStripePriceId(n.getStringValue()); });
        deserializerMap.put("successUrl", (n) -> { this.setSuccessUrl(n.getStringValue()); });
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
     * Gets the stripePriceId property value. The stripePriceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripePriceId() {
        return this.stripePriceId;
    }
    /**
     * Gets the successUrl property value. The successUrl property
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
        writer.writeStringValue("cancelUrl", this.getCancelUrl());
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeStringValue("stripePriceId", this.getStripePriceId());
        writer.writeStringValue("successUrl", this.getSuccessUrl());
    }
    /**
     * Sets the cancelUrl property value. The cancelUrl property
     * @param value Value to set for the cancelUrl property.
     */
    public void setCancelUrl(@jakarta.annotation.Nullable final String value) {
        this.cancelUrl = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the stripePriceId property value. The stripePriceId property
     * @param value Value to set for the stripePriceId property.
     */
    public void setStripePriceId(@jakarta.annotation.Nullable final String value) {
        this.stripePriceId = value;
    }
    /**
     * Sets the successUrl property value. The successUrl property
     * @param value Value to set for the successUrl property.
     */
    public void setSuccessUrl(@jakarta.annotation.Nullable final String value) {
        this.successUrl = value;
    }
}
