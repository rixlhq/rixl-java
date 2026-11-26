package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasskeyRegisterFinishRequest implements Parsable {
    /**
     * The challenge_id property
     */
    private String challengeId;
    /**
     * The credential property
     */
    private byte[] credential;
    /**
     * At most 64 UTF-8 bytes. When renaming, whitespace is trimmed before validation and the result must be nonempty.
     */
    private String name;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PasskeyRegisterFinishRequest}
     */
    @jakarta.annotation.Nonnull
    public static PasskeyRegisterFinishRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasskeyRegisterFinishRequest();
    }
    /**
     * Gets the challenge_id property value. The challenge_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChallengeId() {
        return this.challengeId;
    }
    /**
     * Gets the credential property value. The credential property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getCredential() {
        return this.credential;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("challenge_id", (n) -> { this.setChallengeId(n.getStringValue()); });
        deserializerMap.put("credential", (n) -> { this.setCredential(n.getByteArrayValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. At most 64 UTF-8 bytes. When renaming, whitespace is trimmed before validation and the result must be nonempty.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("challenge_id", this.getChallengeId());
        writer.writeByteArrayValue("credential", this.getCredential());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("user_id", this.getUserId());
    }
    /**
     * Sets the challenge_id property value. The challenge_id property
     * @param value Value to set for the challenge_id property.
     */
    public void setChallengeId(@jakarta.annotation.Nullable final String value) {
        this.challengeId = value;
    }
    /**
     * Sets the credential property value. The credential property
     * @param value Value to set for the credential property.
     */
    public void setCredential(@jakarta.annotation.Nullable final byte[] value) {
        this.credential = value;
    }
    /**
     * Sets the name property value. At most 64 UTF-8 bytes. When renaming, whitespace is trimmed before validation and the result must be nonempty.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
