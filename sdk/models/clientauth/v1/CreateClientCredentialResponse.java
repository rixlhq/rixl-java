package com.rixl.sdk.models.clientauth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateClientCredentialResponse implements Parsable {
    /**
     * The clientSecret property
     */
    private String clientSecret;
    /**
     * The credential property
     */
    private ClientCredential credential;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateClientCredentialResponse}
     */
    @jakarta.annotation.Nonnull
    public static CreateClientCredentialResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateClientCredentialResponse();
    }
    /**
     * Gets the clientSecret property value. The clientSecret property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * Gets the credential property value. The credential property
     * @return a {@link ClientCredential}
     */
    @jakarta.annotation.Nullable
    public ClientCredential getCredential() {
        return this.credential;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("clientSecret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("credential", (n) -> { this.setCredential(n.getObjectValue(ClientCredential::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeObjectValue("credential", this.getCredential());
    }
    /**
     * Sets the clientSecret property value. The clientSecret property
     * @param value Value to set for the clientSecret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.clientSecret = value;
    }
    /**
     * Sets the credential property value. The credential property
     * @param value Value to set for the credential property.
     */
    public void setCredential(@jakarta.annotation.Nullable final ClientCredential value) {
        this.credential = value;
    }
}
