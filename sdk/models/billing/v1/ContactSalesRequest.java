package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContactSalesRequest implements Parsable {
    /**
     * The company property
     */
    private String company;
    /**
     * The email property
     */
    private String email;
    /**
     * The firstName property
     */
    private String firstName;
    /**
     * The jobTitle property
     */
    private String jobTitle;
    /**
     * The lastName property
     */
    private String lastName;
    /**
     * The message property
     */
    private String message;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * The phone property
     */
    private String phone;
    /**
     * The website property
     */
    private String website;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContactSalesRequest}
     */
    @jakarta.annotation.Nonnull
    public static ContactSalesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContactSalesRequest();
    }
    /**
     * Gets the company property value. The company property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompany() {
        return this.company;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
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
     * Gets the jobTitle property value. The jobTitle property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
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
     * Gets the message property value. The message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the orgId property value. The orgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the phone property value. The phone property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the website property value. The website property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("company", this.getCompany());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("website", this.getWebsite());
    }
    /**
     * Sets the company property value. The company property
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final String value) {
        this.company = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the firstName property value. The firstName property
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the jobTitle property value. The jobTitle property
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the lastName property value. The lastName property
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the phone property value. The phone property
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the website property value. The website property
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.website = value;
    }
}
