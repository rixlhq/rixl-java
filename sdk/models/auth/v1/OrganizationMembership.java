package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationMembership implements Parsable {
    /**
     * The organization property
     */
    private Organization organization;
    /**
     * The role property
     */
    private MembershipRole role;
    /**
     * The state property
     */
    private MembershipState state;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationMembership}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationMembership createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationMembership();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(Organization::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MembershipRole::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MembershipState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the organization property value. The organization property
     * @return a {@link Organization}
     */
    @jakarta.annotation.Nullable
    public Organization getOrganization() {
        return this.organization;
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
     * @return a {@link MembershipState}
     */
    @jakarta.annotation.Nullable
    public MembershipState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final Organization value) {
        this.organization = value;
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
    public void setState(@jakarta.annotation.Nullable final MembershipState value) {
        this.state = value;
    }
}
