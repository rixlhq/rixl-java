package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A closed invitation reports only its state.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LookupInvitationResponse implements Parsable {
    /**
     * The email property
     */
    private String email;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime expiresAt;
    /**
     * The inviter_display_name property
     */
    private String inviterDisplayName;
    /**
     * The org_image_id property
     */
    private String orgImageId;
    /**
     * The org_name property
     */
    private String orgName;
    /**
     * The role property
     */
    private MembershipRole role;
    /**
     * The state property
     */
    private InvitationState state;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LookupInvitationResponse}
     */
    @jakarta.annotation.Nonnull
    public static LookupInvitationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupInvitationResponse();
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
     * Gets the expires_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("inviter_display_name", (n) -> { this.setInviterDisplayName(n.getStringValue()); });
        deserializerMap.put("org_image_id", (n) -> { this.setOrgImageId(n.getStringValue()); });
        deserializerMap.put("org_name", (n) -> { this.setOrgName(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MembershipRole::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(InvitationState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inviter_display_name property value. The inviter_display_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInviterDisplayName() {
        return this.inviterDisplayName;
    }
    /**
     * Gets the org_image_id property value. The org_image_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgImageId() {
        return this.orgImageId;
    }
    /**
     * Gets the org_name property value. The org_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgName() {
        return this.orgName;
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
     * @return a {@link InvitationState}
     */
    @jakarta.annotation.Nullable
    public InvitationState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeOffsetDateTimeValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("inviter_display_name", this.getInviterDisplayName());
        writer.writeStringValue("org_image_id", this.getOrgImageId());
        writer.writeStringValue("org_name", this.getOrgName());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the expires_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the inviter_display_name property value. The inviter_display_name property
     * @param value Value to set for the inviter_display_name property.
     */
    public void setInviterDisplayName(@jakarta.annotation.Nullable final String value) {
        this.inviterDisplayName = value;
    }
    /**
     * Sets the org_image_id property value. The org_image_id property
     * @param value Value to set for the org_image_id property.
     */
    public void setOrgImageId(@jakarta.annotation.Nullable final String value) {
        this.orgImageId = value;
    }
    /**
     * Sets the org_name property value. The org_name property
     * @param value Value to set for the org_name property.
     */
    public void setOrgName(@jakarta.annotation.Nullable final String value) {
        this.orgName = value;
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
    public void setState(@jakarta.annotation.Nullable final InvitationState value) {
        this.state = value;
    }
}
