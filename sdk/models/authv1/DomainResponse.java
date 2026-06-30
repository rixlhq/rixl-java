package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The auto_join property
     */
    private Boolean autoJoin;
    /**
     * The domain property
     */
    private String domain;
    /**
     * The expires_at property
     */
    private String expiresAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The message property
     */
    private String message;
    /**
     * The present property
     */
    private Boolean present;
    /**
     * The status property
     */
    private String status;
    /**
     * The verification_token property
     */
    private String verificationToken;
    /**
     * The verified_at property
     */
    private String verifiedAt;
    /**
     * Instantiates a new {@link DomainResponse} and sets the default values.
     */
    public DomainResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DomainResponse}
     */
    @jakarta.annotation.Nonnull
    public static DomainResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainResponse();
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
     * Gets the auto_join property value. The auto_join property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoJoin() {
        return this.autoJoin;
    }
    /**
     * Gets the domain property value. The domain property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * Gets the expires_at property value. The expires_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("auto_join", (n) -> { this.setAutoJoin(n.getBooleanValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("present", (n) -> { this.setPresent(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("verification_token", (n) -> { this.setVerificationToken(n.getStringValue()); });
        deserializerMap.put("verified_at", (n) -> { this.setVerifiedAt(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the present property value. The present property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPresent() {
        return this.present;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the verification_token property value. The verification_token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerificationToken() {
        return this.verificationToken;
    }
    /**
     * Gets the verified_at property value. The verified_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerifiedAt() {
        return this.verifiedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("auto_join", this.getAutoJoin());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeStringValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeBooleanValue("present", this.getPresent());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("verification_token", this.getVerificationToken());
        writer.writeStringValue("verified_at", this.getVerifiedAt());
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
     * Sets the auto_join property value. The auto_join property
     * @param value Value to set for the auto_join property.
     */
    public void setAutoJoin(@jakarta.annotation.Nullable final Boolean value) {
        this.autoJoin = value;
    }
    /**
     * Sets the domain property value. The domain property
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the expires_at property value. The expires_at property
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final String value) {
        this.expiresAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the present property value. The present property
     * @param value Value to set for the present property.
     */
    public void setPresent(@jakarta.annotation.Nullable final Boolean value) {
        this.present = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the verification_token property value. The verification_token property
     * @param value Value to set for the verification_token property.
     */
    public void setVerificationToken(@jakarta.annotation.Nullable final String value) {
        this.verificationToken = value;
    }
    /**
     * Sets the verified_at property value. The verified_at property
     * @param value Value to set for the verified_at property.
     */
    public void setVerifiedAt(@jakarta.annotation.Nullable final String value) {
        this.verifiedAt = value;
    }
}
