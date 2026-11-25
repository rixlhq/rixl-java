package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Invitation implements Parsable {
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime createdAt;
    /**
     * The email property
     */
    private String email;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime expiresAt;
    /**
     * The id property
     */
    private String id;
    /**
     * Unset once the inviter&apos;s account is deleted.
     */
    private InvitationInviter invitedBy;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime lastSentAt;
    /**
     * The org property
     */
    private Organization org;
    /**
     * Set while a daily sending limit would delay a resend by the caller.
     */
    private OffsetDateTime resendAvailableAt;
    /**
     * Never OWNER.
     */
    private MembershipRole role;
    /**
     * The effective state: a pending invitation past its expiry reads as expired.
     */
    private InvitationState state;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Invitation}
     */
    @jakarta.annotation.Nonnull
    public static Invitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Invitation();
    }
    /**
     * Gets the created_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("invited_by", (n) -> { this.setInvitedBy(n.getObjectValue(InvitationInviter::createFromDiscriminatorValue)); });
        deserializerMap.put("last_sent_at", (n) -> { this.setLastSentAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("org", (n) -> { this.setOrg(n.getObjectValue(Organization::createFromDiscriminatorValue)); });
        deserializerMap.put("resend_available_at", (n) -> { this.setResendAvailableAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MembershipRole::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(InvitationState::forValue)); });
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
     * Gets the invited_by property value. Unset once the inviter&apos;s account is deleted.
     * @return a {@link InvitationInviter}
     */
    @jakarta.annotation.Nullable
    public InvitationInviter getInvitedBy() {
        return this.invitedBy;
    }
    /**
     * Gets the last_sent_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSentAt() {
        return this.lastSentAt;
    }
    /**
     * Gets the org property value. The org property
     * @return a {@link Organization}
     */
    @jakarta.annotation.Nullable
    public Organization getOrg() {
        return this.org;
    }
    /**
     * Gets the resend_available_at property value. Set while a daily sending limit would delay a resend by the caller.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getResendAvailableAt() {
        return this.resendAvailableAt;
    }
    /**
     * Gets the role property value. Never OWNER.
     * @return a {@link MembershipRole}
     */
    @jakarta.annotation.Nullable
    public MembershipRole getRole() {
        return this.role;
    }
    /**
     * Gets the state property value. The effective state: a pending invitation past its expiry reads as expired.
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
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("email", this.getEmail());
        writer.writeOffsetDateTimeValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("invited_by", this.getInvitedBy());
        writer.writeOffsetDateTimeValue("last_sent_at", this.getLastSentAt());
        writer.writeObjectValue("org", this.getOrg());
        writer.writeOffsetDateTimeValue("resend_available_at", this.getResendAvailableAt());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the created_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the invited_by property value. Unset once the inviter&apos;s account is deleted.
     * @param value Value to set for the invited_by property.
     */
    public void setInvitedBy(@jakarta.annotation.Nullable final InvitationInviter value) {
        this.invitedBy = value;
    }
    /**
     * Sets the last_sent_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the last_sent_at property.
     */
    public void setLastSentAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSentAt = value;
    }
    /**
     * Sets the org property value. The org property
     * @param value Value to set for the org property.
     */
    public void setOrg(@jakarta.annotation.Nullable final Organization value) {
        this.org = value;
    }
    /**
     * Sets the resend_available_at property value. Set while a daily sending limit would delay a resend by the caller.
     * @param value Value to set for the resend_available_at property.
     */
    public void setResendAvailableAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.resendAvailableAt = value;
    }
    /**
     * Sets the role property value. Never OWNER.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final MembershipRole value) {
        this.role = value;
    }
    /**
     * Sets the state property value. The effective state: a pending invitation past its expiry reads as expired.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final InvitationState value) {
        this.state = value;
    }
}
