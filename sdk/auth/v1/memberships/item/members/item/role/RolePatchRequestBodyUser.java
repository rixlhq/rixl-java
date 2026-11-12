package com.rixl.sdk.auth.v1.memberships.item.members.item.role;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RolePatchRequestBodyUser implements Parsable {
    /**
     * The actor_id property
     */
    private String actorId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RolePatchRequestBodyUser}
     */
    @jakarta.annotation.Nonnull
    public static RolePatchRequestBodyUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RolePatchRequestBodyUser();
    }
    /**
     * Gets the actor_id property value. The actor_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorId() {
        return this.actorId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("actor_id", (n) -> { this.setActorId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actor_id", this.getActorId());
    }
    /**
     * Sets the actor_id property value. The actor_id property
     * @param value Value to set for the actor_id property.
     */
    public void setActorId(@jakarta.annotation.Nullable final String value) {
        this.actorId = value;
    }
}
