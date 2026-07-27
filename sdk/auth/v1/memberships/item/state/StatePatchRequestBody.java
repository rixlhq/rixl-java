package com.rixl.sdk.auth.v1.memberships.item.state;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.MembershipApplicationState;
import com.rixl.sdk.models.auth.v1.UserOrgRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StatePatchRequestBody implements Parsable {
    /**
     * The state property
     */
    private MembershipApplicationState state;
    /**
     * The user property
     */
    private UserOrgRequest user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StatePatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static StatePatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StatePatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MembershipApplicationState::forValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(UserOrgRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link MembershipApplicationState}
     */
    @jakarta.annotation.Nullable
    public MembershipApplicationState getState() {
        return this.state;
    }
    /**
     * Gets the user property value. The user property
     * @return a {@link UserOrgRequest}
     */
    @jakarta.annotation.Nullable
    public UserOrgRequest getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("state", this.getState());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final MembershipApplicationState value) {
        this.state = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final UserOrgRequest value) {
        this.user = value;
    }
}
