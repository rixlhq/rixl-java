package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserInfo implements Parsable {
    /**
     * The activeOrgId property
     */
    private String activeOrgId;
    /**
     * The countryCode property
     */
    private String countryCode;
    /**
     * The email property
     */
    private String email;
    /**
     * The emailVerified property
     */
    private Boolean emailVerified;
    /**
     * The firstName property
     */
    private String firstName;
    /**
     * The id property
     */
    private String id;
    /**
     * The imageUrl property
     */
    private String imageUrl;
    /**
     * The languageCode property
     */
    private String languageCode;
    /**
     * The lastName property
     */
    private String lastName;
    /**
     * The username property
     */
    private String username;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserInfo}
     */
    @jakarta.annotation.Nonnull
    public static UserInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserInfo();
    }
    /**
     * Gets the activeOrgId property value. The activeOrgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActiveOrgId() {
        return this.activeOrgId;
    }
    /**
     * Gets the countryCode property value. The countryCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the emailVerified property value. The emailVerified property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("activeOrgId", (n) -> { this.setActiveOrgId(n.getStringValue()); });
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("emailVerified", (n) -> { this.setEmailVerified(n.getBooleanValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("imageUrl", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("languageCode", (n) -> { this.setLanguageCode(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
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
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the languageCode property value. The languageCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageCode() {
        return this.languageCode;
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
        writer.writeStringValue("activeOrgId", this.getActiveOrgId());
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("email", this.getEmail());
        writer.writeBooleanValue("emailVerified", this.getEmailVerified());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("imageUrl", this.getImageUrl());
        writer.writeStringValue("languageCode", this.getLanguageCode());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("username", this.getUsername());
    }
    /**
     * Sets the activeOrgId property value. The activeOrgId property
     * @param value Value to set for the activeOrgId property.
     */
    public void setActiveOrgId(@jakarta.annotation.Nullable final String value) {
        this.activeOrgId = value;
    }
    /**
     * Sets the countryCode property value. The countryCode property
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the emailVerified property value. The emailVerified property
     * @param value Value to set for the emailVerified property.
     */
    public void setEmailVerified(@jakarta.annotation.Nullable final Boolean value) {
        this.emailVerified = value;
    }
    /**
     * Sets the firstName property value. The firstName property
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the imageUrl property value. The imageUrl property
     * @param value Value to set for the imageUrl property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the languageCode property value. The languageCode property
     * @param value Value to set for the languageCode property.
     */
    public void setLanguageCode(@jakarta.annotation.Nullable final String value) {
        this.languageCode = value;
    }
    /**
     * Sets the lastName property value. The lastName property
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
