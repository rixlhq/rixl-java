package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetupIntentResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The client_secret property
     */
    private String clientSecret;
    /**
     * The setup_intent_id property
     */
    private String setupIntentId;
    /**
     * Instantiates a new {@link SetupIntentResponse} and sets the default values.
     */
    public SetupIntentResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SetupIntentResponse}
     */
    @jakarta.annotation.Nonnull
    public static SetupIntentResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetupIntentResponse();
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
     * Gets the client_secret property value. The client_secret property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("client_secret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("setup_intent_id", (n) -> { this.setSetupIntentId(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("client_secret", this.getClientSecret());
        writer.writeStringValue("setup_intent_id", this.getSetupIntentId());
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
     * Sets the client_secret property value. The client_secret property
     * @param value Value to set for the client_secret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.clientSecret = value;
    }
    /**
     * Sets the setup_intent_id property value. The setup_intent_id property
     * @param value Value to set for the setup_intent_id property.
     */
    public void setSetupIntentId(@jakarta.annotation.Nullable final String value) {
        this.setupIntentId = value;
    }
}
