package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Provider implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The email_address property
     */
    private String emailAddress;
    /**
     * The first_name property
     */
    private String firstName;
    /**
     * The image_url property
     */
    private String imageUrl;
    /**
     * The last_name property
     */
    private String lastName;
    /**
     * The provider property
     */
    private String provider;
    /**
     * The username property
     */
    private String username;
    /**
     * Instantiates a new {@link Provider} and sets the default values.
     */
    public Provider() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Provider}
     */
    @jakarta.annotation.Nonnull
    public static Provider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Provider();
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
     * Gets the email_address property value. The email_address property
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
        deserializerMap.put("email_address", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("image_url", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first_name property value. The first_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the image_url property value. The image_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Gets the last_name property value. The last_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
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
        writer.writeStringValue("email_address", this.getEmailAddress());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("image_url", this.getImageUrl());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the email_address property value. The email_address property
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the first_name property value. The first_name property
     * @param value Value to set for the first_name property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the image_url property value. The image_url property
     * @param value Value to set for the image_url property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the last_name property value. The last_name property
     * @param value Value to set for the last_name property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
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
