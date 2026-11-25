package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasskeyBeginResponse implements Parsable {
    /**
     * The challenge_id property
     */
    private String challengeId;
    /**
     * The options property
     */
    private byte[] options;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PasskeyBeginResponse}
     */
    @jakarta.annotation.Nonnull
    public static PasskeyBeginResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasskeyBeginResponse();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("challenge_id", (n) -> { this.setChallengeId(n.getStringValue()); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the options property value. The options property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getOptions() {
        return this.options;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("challenge_id", this.getChallengeId());
        writer.writeByteArrayValue("options", this.getOptions());
    }
    /**
     * Sets the challenge_id property value. The challenge_id property
     * @param value Value to set for the challenge_id property.
     */
    public void setChallengeId(@jakarta.annotation.Nullable final String value) {
        this.challengeId = value;
    }
    /**
     * Sets the options property value. The options property
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final byte[] value) {
        this.options = value;
    }
}
