package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResendVerificationResponse implements Parsable {
    /**
     * The codeSent property
     */
    private Boolean codeSent;
    /**
     * The message property
     */
    private String message;
    /**
     * The verificationId property
     */
    private String verificationId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResendVerificationResponse}
     */
    @jakarta.annotation.Nonnull
    public static ResendVerificationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResendVerificationResponse();
    }
    /**
     * Gets the codeSent property value. The codeSent property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCodeSent() {
        return this.codeSent;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("codeSent", (n) -> { this.setCodeSent(n.getBooleanValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("verificationId", (n) -> { this.setVerificationId(n.getStringValue()); });
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
     * Gets the verificationId property value. The verificationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerificationId() {
        return this.verificationId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("codeSent", this.getCodeSent());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("verificationId", this.getVerificationId());
    }
    /**
     * Sets the codeSent property value. The codeSent property
     * @param value Value to set for the codeSent property.
     */
    public void setCodeSent(@jakarta.annotation.Nullable final Boolean value) {
        this.codeSent = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the verificationId property value. The verificationId property
     * @param value Value to set for the verificationId property.
     */
    public void setVerificationId(@jakarta.annotation.Nullable final String value) {
        this.verificationId = value;
    }
}
