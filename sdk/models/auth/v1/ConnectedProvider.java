package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectedProvider implements Parsable {
    /**
     * The emailAddress property
     */
    private String emailAddress;
    /**
     * The firstName property
     */
    private String firstName;
    /**
     * The imageUrl property
     */
    private String imageUrl;
    /**
     * The lastName property
     */
    private String lastName;
    /**
     * The provider property
     */
    private ExternalAccountProvider provider;
    /**
     * The username property
     */
    private String username;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConnectedProvider}
     */
    @jakarta.annotation.Nonnull
    public static ConnectedProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectedProvider();
    }
    /**
     * Gets the emailAddress property value. The emailAddress property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("imageUrl", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getEnumValue(ExternalAccountProvider::forValue)); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. The firstName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the imageUrl property value. The imageUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Gets the lastName property value. The lastName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
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
     * Gets the username property value. The username property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("imageUrl", this.getImageUrl());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeEnumValue("provider", this.getProvider());
        writer.writeStringValue("username", this.getUsername());
    }
    /**
     * Sets the emailAddress property value. The emailAddress property
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the firstName property value. The firstName property
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the imageUrl property value. The imageUrl property
     * @param value Value to set for the imageUrl property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the lastName property value. The lastName property
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final ExternalAccountProvider value) {
        this.provider = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
