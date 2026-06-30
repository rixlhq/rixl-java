package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegisterResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The email_verification_sent property
     */
    private Boolean emailVerificationSent;
    /**
     * The message property
     */
    private String message;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * The verification_id property
     */
    private String verificationId;
    /**
     * Instantiates a new {@link RegisterResponse} and sets the default values.
     */
    public RegisterResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RegisterResponse}
     */
    @jakarta.annotation.Nonnull
    public static RegisterResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegisterResponse();
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
     * Gets the email_verification_sent property value. The email_verification_sent property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailVerificationSent() {
        return this.emailVerificationSent;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("email_verification_sent", (n) -> { this.setEmailVerificationSent(n.getBooleanValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("verification_id", (n) -> { this.setVerificationId(n.getStringValue()); });
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
     * Gets the user_id property value. The user_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the verification_id property value. The verification_id property
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
        writer.writeBooleanValue("email_verification_sent", this.getEmailVerificationSent());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("user_id", this.getUserId());
        writer.writeStringValue("verification_id", this.getVerificationId());
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
     * Sets the email_verification_sent property value. The email_verification_sent property
     * @param value Value to set for the email_verification_sent property.
     */
    public void setEmailVerificationSent(@jakarta.annotation.Nullable final Boolean value) {
        this.emailVerificationSent = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the verification_id property value. The verification_id property
     * @param value Value to set for the verification_id property.
     */
    public void setVerificationId(@jakarta.annotation.Nullable final String value) {
        this.verificationId = value;
    }
}
