package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provider token
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectProviderBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The provider property
     */
    private ConnectProviderBodyProvider provider;
    /**
     * The token property
     */
    private String token;
    /**
     * Instantiates a new {@link ConnectProviderBody} and sets the default values.
     */
    public ConnectProviderBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConnectProviderBody}
     */
    @jakarta.annotation.Nonnull
    public static ConnectProviderBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectProviderBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getEnumValue(ConnectProviderBodyProvider::forValue)); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a {@link ConnectProviderBodyProvider}
     */
    @jakarta.annotation.Nullable
    public ConnectProviderBodyProvider getProvider() {
        return this.provider;
    }
    /**
     * Gets the token property value. The token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("provider", this.getProvider());
        writer.writeStringValue("token", this.getToken());
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
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final ConnectProviderBodyProvider value) {
        this.provider = value;
    }
    /**
     * Sets the token property value. The token property
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
}
