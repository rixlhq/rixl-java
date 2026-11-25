package com.rixl.sdk.auth.v1.organizations.item.members.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.MembershipRole;
import com.rixl.sdk.models.auth.v1.MembershipState;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MemberPatchRequestBody implements Parsable {
    /**
     * The role property
     */
    private MembershipRole role;
    /**
     * The state property
     */
    private MembershipState state;
    /**
     * Comma-separated field paths in lowerCamelCase (for example, `user.displayName,photo`).
     */
    private String updateMask;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MemberPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static MemberPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MemberPatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MembershipRole::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MembershipState::forValue)); });
        deserializerMap.put("update_mask", (n) -> { this.setUpdateMask(n.getStringValue()); });
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
     * Gets the state property value. The state property
     * @return a {@link MembershipState}
     */
    @jakarta.annotation.Nullable
    public MembershipState getState() {
        return this.state;
    }
    /**
     * Gets the update_mask property value. Comma-separated field paths in lowerCamelCase (for example, `user.displayName,photo`).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpdateMask() {
        return this.updateMask;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("update_mask", this.getUpdateMask());
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
    /**
     * Sets the update_mask property value. Comma-separated field paths in lowerCamelCase (for example, `user.displayName,photo`).
     * @param value Value to set for the update_mask property.
     */
    public void setUpdateMask(@jakarta.annotation.Nullable final String value) {
        this.updateMask = value;
    }
}
