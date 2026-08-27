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
     * The active_org_id property
     */
    private String activeOrgId;
    /**
     * The country_code property
     */
    private String countryCode;
    /**
     * The email property
     */
    private String email;
    /**
     * The email_verified property
     */
    private Boolean emailVerified;
    /**
     * The first_name property
     */
    private String firstName;
    /**
     * The id property
     */
    private String id;
    /**
     * The image_id property
     */
    private String imageId;
    /**
     * The image_url property
     */
    private String imageUrl;
    /**
     * The language_code property
     */
    private String languageCode;
    /**
     * The last_name property
     */
    private String lastName;
    /**
     * The permissions property
     */
    private java.util.List<String> permissions;
    /**
     * The policies property
     */
    private java.util.List<Policy> policies;
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
     * Gets the active_org_id property value. The active_org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActiveOrgId() {
        return this.activeOrgId;
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
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the email_verified property value. The email_verified property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("active_org_id", (n) -> { this.setActiveOrgId(n.getStringValue()); });
        deserializerMap.put("country_code", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("email_verified", (n) -> { this.setEmailVerified(n.getBooleanValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("image_id", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("image_url", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("language_code", (n) -> { this.setLanguageCode(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(Policy::createFromDiscriminatorValue)); });
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
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the image_id property value. The image_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageId() {
        return this.imageId;
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
     * Gets the language_code property value. The language_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageCode() {
        return this.languageCode;
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
     * Gets the permissions property value. The permissions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }
    /**
     * Gets the policies property value. The policies property
     * @return a {@link java.util.List<Policy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Policy> getPolicies() {
        return this.policies;
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
        writer.writeStringValue("active_org_id", this.getActiveOrgId());
        writer.writeStringValue("country_code", this.getCountryCode());
        writer.writeStringValue("email", this.getEmail());
        writer.writeBooleanValue("email_verified", this.getEmailVerified());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("image_id", this.getImageId());
        writer.writeStringValue("image_url", this.getImageUrl());
        writer.writeStringValue("language_code", this.getLanguageCode());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeCollectionOfPrimitiveValues("permissions", this.getPermissions());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
        writer.writeStringValue("username", this.getUsername());
    }
    /**
     * Sets the active_org_id property value. The active_org_id property
     * @param value Value to set for the active_org_id property.
     */
    public void setActiveOrgId(@jakarta.annotation.Nullable final String value) {
        this.activeOrgId = value;
    }
    /**
     * Sets the country_code property value. The country_code property
     * @param value Value to set for the country_code property.
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
     * Sets the email_verified property value. The email_verified property
     * @param value Value to set for the email_verified property.
     */
    public void setEmailVerified(@jakarta.annotation.Nullable final Boolean value) {
        this.emailVerified = value;
    }
    /**
     * Sets the first_name property value. The first_name property
     * @param value Value to set for the first_name property.
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
     * Sets the image_id property value. The image_id property
     * @param value Value to set for the image_id property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.imageId = value;
    }
    /**
     * Sets the image_url property value. The image_url property
     * @param value Value to set for the image_url property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the language_code property value. The language_code property
     * @param value Value to set for the language_code property.
     */
    public void setLanguageCode(@jakarta.annotation.Nullable final String value) {
        this.languageCode = value;
    }
    /**
     * Sets the last_name property value. The last_name property
     * @param value Value to set for the last_name property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the permissions property value. The permissions property
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.permissions = value;
    }
    /**
     * Sets the policies property value. The policies property
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<Policy> value) {
        this.policies = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
