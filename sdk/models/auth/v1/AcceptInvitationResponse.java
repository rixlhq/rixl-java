package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AcceptInvitationResponse implements Parsable {
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * The orgName property
     */
    private String orgName;
    /**
     * The role property
     */
    private MembershipRole role;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AcceptInvitationResponse}
     */
    @jakarta.annotation.Nonnull
    public static AcceptInvitationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AcceptInvitationResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("orgName", (n) -> { this.setOrgName(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MembershipRole::forValue)); });
        return deserializerMap;
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
     * Gets the orgName property value. The orgName property
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeStringValue("orgName", this.getOrgName());
        writer.writeEnumValue("role", this.getRole());
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the orgName property value. The orgName property
     * @param value Value to set for the orgName property.
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
}
