package com.rixl.sdk.models.clientauthv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateClientCredentialResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The client_secret property
     */
    private String clientSecret;
    /**
     * The credential property
     */
    private ClientCredential credential;
    /**
     * Instantiates a new {@link CreateClientCredentialResponse} and sets the default values.
     */
    public CreateClientCredentialResponse() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the client_secret property value. The client_secret property
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
        deserializerMap.put("client_secret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("credential", (n) -> { this.setCredential(n.getObjectValue(ClientCredential::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("client_secret", this.getClientSecret());
        writer.writeObjectValue("credential", this.getCredential());
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
     * Sets the client_secret property value. The client_secret property
     * @param value Value to set for the client_secret property.
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
