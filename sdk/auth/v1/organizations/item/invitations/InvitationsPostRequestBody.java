package com.rixl.sdk.auth.v1.organizations.item.invitations;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.MembershipRole;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitationsPostRequestBody implements Parsable {
    /**
     * Trimmed and lowercased before validation as a bare email address. The normalized address must be nonempty and at most 254 UTF-8 bytes, with a local part of at most 64 bytes and a domain containing a dot that is neither leading nor trailing.
     */
    private String email;
    /**
     * Optional UUID that makes retries of the same create safe.
     */
    private String requestId;
    /**
     * The role property
     */
    private MembershipRole role;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InvitationsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static InvitationsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitationsPostRequestBody();
    }
    /**
     * Gets the email property value. Trimmed and lowercased before validation as a bare email address. The normalized address must be nonempty and at most 254 UTF-8 bytes, with a local part of at most 64 bytes and a domain containing a dot that is neither leading nor trailing.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("request_id", (n) -> { this.setRequestId(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MembershipRole::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the request_id property value. Optional UUID that makes retries of the same create safe.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestId() {
        return this.requestId;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("request_id", this.getRequestId());
        writer.writeEnumValue("role", this.getRole());
    }
    /**
     * Sets the email property value. Trimmed and lowercased before validation as a bare email address. The normalized address must be nonempty and at most 254 UTF-8 bytes, with a local part of at most 64 bytes and a domain containing a dot that is neither leading nor trailing.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the request_id property value. Optional UUID that makes retries of the same create safe.
     * @param value Value to set for the request_id property.
     */
    public void setRequestId(@jakarta.annotation.Nullable final String value) {
        this.requestId = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final MembershipRole value) {
        this.role = value;
    }
}
