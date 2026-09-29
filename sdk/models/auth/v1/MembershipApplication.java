package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembershipApplication implements Parsable {
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * The decided_at property
     */
    private OffsetDateTime decidedAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The invitation_expires_at property
     */
    private OffsetDateTime invitationExpiresAt;
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
    private MembershipRole role;
    /**
     * The state property
     */
    private MembershipApplicationState state;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MembershipApplication}
     */
    @jakarta.annotation.Nonnull
    public static MembershipApplication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembershipApplication();
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the decided_at property value. The decided_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDecidedAt() {
        return this.decidedAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("decided_at", (n) -> { this.setDecidedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("invitation_expires_at", (n) -> { this.setInvitationExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("organization_first_name", (n) -> { this.setOrganizationFirstName(n.getStringValue()); });
        deserializerMap.put("organization_last_name", (n) -> { this.setOrganizationLastName(n.getStringValue()); });
        deserializerMap.put("organization_username", (n) -> { this.setOrganizationUsername(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MembershipRole::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MembershipApplicationState::forValue)); });
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
     * Gets the invitation_expires_at property value. The invitation_expires_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInvitationExpiresAt() {
        return this.invitationExpiresAt;
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
     * @return a {@link MembershipRole}
     */
    @jakarta.annotation.Nullable
    public MembershipRole getRole() {
        return this.role;
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link MembershipApplicationState}
     */
    @jakarta.annotation.Nullable
    public MembershipApplicationState getState() {
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
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeOffsetDateTimeValue("decided_at", this.getDecidedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("invitation_expires_at", this.getInvitationExpiresAt());
        writer.writeStringValue("organization_first_name", this.getOrganizationFirstName());
        writer.writeStringValue("organization_last_name", this.getOrganizationLastName());
        writer.writeStringValue("organization_username", this.getOrganizationUsername());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("user_id", this.getUserId());
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the decided_at property value. The decided_at property
     * @param value Value to set for the decided_at property.
     */
    public void setDecidedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.decidedAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the invitation_expires_at property value. The invitation_expires_at property
     * @param value Value to set for the invitation_expires_at property.
     */
    public void setInvitationExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.invitationExpiresAt = value;
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
    public void setRole(@jakarta.annotation.Nullable final MembershipRole value) {
        this.role = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final MembershipApplicationState value) {
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
