package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectProviderRequest implements Parsable {
    /**
     * The country_code property
     */
    private String countryCode;
    /**
     * The origin property
     */
    private String origin;
    /**
     * The provider property
     */
    private ExternalAccountProvider provider;
    /**
     * The token property
     */
    private String token;
    /**
     * The user property
     */
    private UserRequest user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConnectProviderRequest}
     */
    @jakarta.annotation.Nonnull
    public static ConnectProviderRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectProviderRequest();
    }
    /**
     * Gets the country_code property value. The country_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("country_code", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getEnumValue(ExternalAccountProvider::forValue)); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(UserRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the origin property value. The origin property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrigin() {
        return this.origin;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a {@link ExternalAccountProvider}
     */
    @jakarta.annotation.Nullable
    public ExternalAccountProvider getProvider() {
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
     * Gets the user property value. The user property
     * @return a {@link UserRequest}
     */
    @jakarta.annotation.Nullable
    public UserRequest getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("country_code", this.getCountryCode());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeEnumValue("provider", this.getProvider());
        writer.writeStringValue("token", this.getToken());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the country_code property value. The country_code property
     * @param value Value to set for the country_code property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the origin property value. The origin property
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final String value) {
        this.origin = value;
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final ExternalAccountProvider value) {
        this.provider = value;
    }
    /**
     * Sets the token property value. The token property
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final UserRequest value) {
        this.user = value;
    }
}
