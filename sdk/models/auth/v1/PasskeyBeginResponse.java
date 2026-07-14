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
     * The options property
     */
    private byte[] options;
    /**
     * The sessionId property
     */
    private String sessionId;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("options", (n) -> { this.setOptions(n.getByteArrayValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
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
     * Gets the sessionId property value. The sessionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("options", this.getOptions());
        writer.writeStringValue("sessionId", this.getSessionId());
    }
    /**
     * Sets the options property value. The options property
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final byte[] value) {
        this.options = value;
    }
    /**
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
}
