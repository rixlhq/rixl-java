package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * At most one of `token`, `invitation_id` may be set.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeclineInvitationRequest implements Parsable {
    /**
     * The invitation_id property
     */
    private String invitationId;
    /**
     * The token property
     */
    private String token;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeclineInvitationRequest}
     */
    @jakarta.annotation.Nonnull
    public static DeclineInvitationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeclineInvitationRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("invitation_id", (n) -> { this.setInvitationId(n.getStringValue()); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitation_id property value. The invitation_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInvitationId() {
        return this.invitationId;
    }
    /**
     * Gets the token property value. The token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("invitation_id", this.getInvitationId());
        writer.writeStringValue("token", this.getToken());
    }
    /**
     * Sets the invitation_id property value. The invitation_id property
     * @param value Value to set for the invitation_id property.
     */
    public void setInvitationId(@jakarta.annotation.Nullable final String value) {
        this.invitationId = value;
    }
    /**
     * Sets the token property value. The token property
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
}
