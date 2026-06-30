package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * session_id and WebAuthn credential
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasskeyLoginFinishBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The credential property
     */
    private java.util.List<Integer> credential;
    /**
     * The session_id property
     */
    private String sessionId;
    /**
     * Instantiates a new {@link PasskeyLoginFinishBody} and sets the default values.
     */
    public PasskeyLoginFinishBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PasskeyLoginFinishBody}
     */
    @jakarta.annotation.Nonnull
    public static PasskeyLoginFinishBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasskeyLoginFinishBody();
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
     * Gets the credential property value. The credential property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getCredential() {
        return this.credential;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("credential", (n) -> { this.setCredential(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("session_id", (n) -> { this.setSessionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the session_id property value. The session_id property
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
        writer.writeCollectionOfPrimitiveValues("credential", this.getCredential());
        writer.writeStringValue("session_id", this.getSessionId());
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
     * Sets the credential property value. The credential property
     * @param value Value to set for the credential property.
     */
    public void setCredential(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.credential = value;
    }
    /**
     * Sets the session_id property value. The session_id property
     * @param value Value to set for the session_id property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
}
