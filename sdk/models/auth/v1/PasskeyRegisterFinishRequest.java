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
     * The credential property
     */
    private byte[] credential;
    /**
     * The name property
     */
    private String name;
    /**
     * The sessionId property
     */
    private String sessionId;
    /**
     * The userId property
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
        deserializerMap.put("credential", (n) -> { this.setCredential(n.getByteArrayValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the sessionId property value. The sessionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Gets the userId property value. The userId property
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
        writer.writeByteArrayValue("credential", this.getCredential());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the credential property value. The credential property
     * @param value Value to set for the credential property.
     */
    public void setCredential(@jakarta.annotation.Nullable final byte[] value) {
        this.credential = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
