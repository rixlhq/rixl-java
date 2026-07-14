package com.rixl.sdk.auth.v1.memberships.item.name;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.ActorOrgRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NamePatchRequestBody implements Parsable {
    /**
     * The fullName property
     */
    private String fullName;
    /**
     * The user property
     */
    private ActorOrgRequest user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NamePatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static NamePatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NamePatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("fullName", (n) -> { this.setFullName(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(ActorOrgRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fullName property value. The fullName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFullName() {
        return this.fullName;
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
        writer.writeStringValue("fullName", this.getFullName());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the fullName property value. The fullName property
     * @param value Value to set for the fullName property.
     */
    public void setFullName(@jakarta.annotation.Nullable final String value) {
        this.fullName = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final ActorOrgRequest value) {
        this.user = value;
    }
}
