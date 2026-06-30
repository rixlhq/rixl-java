package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Membership implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The id property
     */
    private String id;
    /**
     * The joined_at property
     */
    private String joinedAt;
    /**
     * The organization_first_name property
     */
    private String organizationFirstName;
    /**
     * The organization_last_name property
     */
    private String organizationLastName;
    /**
     * The organization_username property
     */
    private String organizationUsername;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The role property
     */
    private String role;
    /**
     * The state property
     */
    private String state;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Instantiates a new {@link Membership} and sets the default values.
     */
    public Membership() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Membership}
     */
    @jakarta.annotation.Nonnull
    public static Membership createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Membership();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("joined_at", (n) -> { this.setJoinedAt(n.getStringValue()); });
        deserializerMap.put("organization_first_name", (n) -> { this.setOrganizationFirstName(n.getStringValue()); });
        deserializerMap.put("organization_last_name", (n) -> { this.setOrganizationLastName(n.getStringValue()); });
        deserializerMap.put("organization_username", (n) -> { this.setOrganizationUsername(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the joined_at property value. The joined_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJoinedAt() {
        return this.joinedAt;
    }
    /**
     * Gets the organization_first_name property value. The organization_first_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationFirstName() {
        return this.organizationFirstName;
    }
    /**
     * Gets the organization_last_name property value. The organization_last_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationLastName() {
        return this.organizationLastName;
    }
    /**
     * Gets the organization_username property value. The organization_username property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationUsername() {
        return this.organizationUsername;
    }
    /**
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the role property value. The role property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the user_id property value. The user_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("joined_at", this.getJoinedAt());
        writer.writeStringValue("organization_first_name", this.getOrganizationFirstName());
        writer.writeStringValue("organization_last_name", this.getOrganizationLastName());
        writer.writeStringValue("organization_username", this.getOrganizationUsername());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("role", this.getRole());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("user_id", this.getUserId());
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the joined_at property value. The joined_at property
     * @param value Value to set for the joined_at property.
     */
    public void setJoinedAt(@jakarta.annotation.Nullable final String value) {
        this.joinedAt = value;
    }
    /**
     * Sets the organization_first_name property value. The organization_first_name property
     * @param value Value to set for the organization_first_name property.
     */
    public void setOrganizationFirstName(@jakarta.annotation.Nullable final String value) {
        this.organizationFirstName = value;
    }
    /**
     * Sets the organization_last_name property value. The organization_last_name property
     * @param value Value to set for the organization_last_name property.
     */
    public void setOrganizationLastName(@jakarta.annotation.Nullable final String value) {
        this.organizationLastName = value;
    }
    /**
     * Sets the organization_username property value. The organization_username property
     * @param value Value to set for the organization_username property.
     */
    public void setOrganizationUsername(@jakarta.annotation.Nullable final String value) {
        this.organizationUsername = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
