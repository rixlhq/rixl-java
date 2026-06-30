package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifyEmailResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The email property
     */
    private String email;
    /**
     * The message property
     */
    private String message;
    /**
     * The tokens property
     */
    private TokenResponse tokens;
    /**
     * The verified property
     */
    private Boolean verified;
    /**
     * Instantiates a new {@link VerifyEmailResponse} and sets the default values.
     */
    public VerifyEmailResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerifyEmailResponse}
     */
    @jakarta.annotation.Nonnull
    public static VerifyEmailResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifyEmailResponse();
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
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("tokens", (n) -> { this.setTokens(n.getObjectValue(TokenResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("verified", (n) -> { this.setVerified(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the tokens property value. The tokens property
     * @return a {@link TokenResponse}
     */
    @jakarta.annotation.Nullable
    public TokenResponse getTokens() {
        return this.tokens;
    }
    /**
     * Gets the verified property value. The verified property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVerified() {
        return this.verified;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("tokens", this.getTokens());
        writer.writeBooleanValue("verified", this.getVerified());
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
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the tokens property value. The tokens property
     * @param value Value to set for the tokens property.
     */
    public void setTokens(@jakarta.annotation.Nullable final TokenResponse value) {
        this.tokens = value;
    }
    /**
     * Sets the verified property value. The verified property
     * @param value Value to set for the verified property.
     */
    public void setVerified(@jakarta.annotation.Nullable final Boolean value) {
        this.verified = value;
    }
}
