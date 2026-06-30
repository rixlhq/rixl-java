package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrgMember implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The first_name property
     */
    private String firstName;
    /**
     * The id property
     */
    private String id;
    /**
     * The invitation_expires_at property
     */
    private String invitationExpiresAt;
    /**
     * The joined_at property
     */
    private String joinedAt;
    /**
     * The last_name property
     */
    private String lastName;
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
     * The username property
     */
    private String username;
    /**
     * Instantiates a new {@link OrgMember} and sets the default values.
     */
    public OrgMember() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrgMember}
     */
    @jakarta.annotation.Nonnull
    public static OrgMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrgMember();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("invitation_expires_at", (n) -> { this.setInvitationExpiresAt(n.getStringValue()); });
        deserializerMap.put("joined_at", (n) -> { this.setJoinedAt(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
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
     * Gets the invitation_expires_at property value. The invitation_expires_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInvitationExpiresAt() {
        return this.invitationExpiresAt;
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
     * Gets the last_name property value. The last_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
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
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("invitation_expires_at", this.getInvitationExpiresAt());
        writer.writeStringValue("joined_at", this.getJoinedAt());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("role", this.getRole());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("user_id", this.getUserId());
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
     * Sets the invitation_expires_at property value. The invitation_expires_at property
     * @param value Value to set for the invitation_expires_at property.
     */
    public void setInvitationExpiresAt(@jakarta.annotation.Nullable final String value) {
        this.invitationExpiresAt = value;
    }
    /**
     * Sets the joined_at property value. The joined_at property
     * @param value Value to set for the joined_at property.
     */
    public void setJoinedAt(@jakarta.annotation.Nullable final String value) {
        this.joinedAt = value;
    }
    /**
     * Sets the last_name property value. The last_name property
     * @param value Value to set for the last_name property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
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
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
