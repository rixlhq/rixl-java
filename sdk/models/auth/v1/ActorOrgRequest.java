package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActorOrgRequest implements Parsable {
    /**
     * The actorId property
     */
    private String actorId;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActorOrgRequest}
     */
    @jakarta.annotation.Nonnull
    public static ActorOrgRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActorOrgRequest();
    }
    /**
     * Gets the actorId property value. The actorId property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("actorId", (n) -> { this.setActorId(n.getStringValue()); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actorId", this.getActorId());
        writer.writeStringValue("orgId", this.getOrgId());
    }
    /**
     * Sets the actorId property value. The actorId property
     * @param value Value to set for the actorId property.
     */
    public void setActorId(@jakarta.annotation.Nullable final String value) {
        this.actorId = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
}
