package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetupOTPResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The qr_code_url property
     */
    private String qrCodeUrl;
    /**
     * The secret property
     */
    private String secret;
    /**
     * Instantiates a new {@link SetupOTPResponse} and sets the default values.
     */
    public SetupOTPResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SetupOTPResponse}
     */
    @jakarta.annotation.Nonnull
    public static SetupOTPResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetupOTPResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("qr_code_url", (n) -> { this.setQrCodeUrl(n.getStringValue()); });
        deserializerMap.put("secret", (n) -> { this.setSecret(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the qr_code_url property value. The qr_code_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }
    /**
     * Gets the secret property value. The secret property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecret() {
        return this.secret;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("qr_code_url", this.getQrCodeUrl());
        writer.writeStringValue("secret", this.getSecret());
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
     * Sets the qr_code_url property value. The qr_code_url property
     * @param value Value to set for the qr_code_url property.
     */
    public void setQrCodeUrl(@jakarta.annotation.Nullable final String value) {
        this.qrCodeUrl = value;
    }
    /**
     * Sets the secret property value. The secret property
     * @param value Value to set for the secret property.
     */
    public void setSecret(@jakarta.annotation.Nullable final String value) {
        this.secret = value;
    }
}
