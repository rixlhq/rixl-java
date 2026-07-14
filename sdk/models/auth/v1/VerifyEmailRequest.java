package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifyEmailRequest implements Parsable {
    /**
     * The code property
     */
    private String code;
    /**
     * The verificationId property
     */
    private String verificationId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerifyEmailRequest}
     */
    @jakarta.annotation.Nonnull
    public static VerifyEmailRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifyEmailRequest();
    }
    /**
     * Gets the code property value. The code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("verificationId", (n) -> { this.setVerificationId(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("verificationId", this.getVerificationId());
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the verificationId property value. The verificationId property
     * @param value Value to set for the verificationId property.
     */
    public void setVerificationId(@jakarta.annotation.Nullable final String value) {
        this.verificationId = value;
    }
}
