package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PendingDomain implements Parsable {
    /**
     * The expires_at property
     */
    private OffsetDateTime expiresAt;
    /**
     * The verification_token property
     */
    private String verificationToken;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PendingDomain}
     */
    @jakarta.annotation.Nonnull
    public static PendingDomain createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PendingDomain();
    }
    /**
     * Gets the expires_at property value. The expires_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("verification_token", (n) -> { this.setVerificationToken(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("verification_token", this.getVerificationToken());
    }
    /**
     * Sets the expires_at property value. The expires_at property
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the verification_token property value. The verification_token property
     * @param value Value to set for the verification_token property.
     */
    public void setVerificationToken(@jakarta.annotation.Nullable final String value) {
        this.verificationToken = value;
    }
}
