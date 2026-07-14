package com.rixl.sdk.auth.v1.memberships.item.members.item.role;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.ActorOrgRequest;
import com.rixl.sdk.models.auth.v1.MembershipRole;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RolePatchRequestBody implements Parsable {
    /**
     * The role property
     */
    private MembershipRole role;
    /**
     * The user property
     */
    private ActorOrgRequest user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RolePatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static RolePatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RolePatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MembershipRole::forValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(ActorOrgRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the user property value. The user property
     * @return a {@link ActorOrgRequest}
     */
    @jakarta.annotation.Nullable
    public ActorOrgRequest getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("role", this.getRole());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final MembershipRole value) {
        this.role = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final ActorOrgRequest value) {
        this.user = value;
    }
}
