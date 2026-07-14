package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostedCheckoutSessionResponse implements Parsable {
    /**
     * The amount property
     */
    private Double amount;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The sessionId property
     */
    private String sessionId;
    /**
     * The sessionUrl property
     */
    private String sessionUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HostedCheckoutSessionResponse}
     */
    @jakarta.annotation.Nonnull
    public static HostedCheckoutSessionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostedCheckoutSessionResponse();
    }
    /**
     * Gets the amount property value. The amount property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAmount() {
        return this.amount;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getDoubleValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("sessionUrl", (n) -> { this.setSessionUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sessionId property value. The sessionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Gets the sessionUrl property value. The sessionUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionUrl() {
        return this.sessionUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("amount", this.getAmount());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeStringValue("sessionUrl", this.getSessionUrl());
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Double value) {
        this.amount = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
    /**
     * Sets the sessionUrl property value. The sessionUrl property
     * @param value Value to set for the sessionUrl property.
     */
    public void setSessionUrl(@jakarta.annotation.Nullable final String value) {
        this.sessionUrl = value;
    }
}
