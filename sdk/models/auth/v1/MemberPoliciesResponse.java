package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MemberPoliciesResponse implements Parsable {
    /**
     * The permissions property
     */
    private java.util.List<String> permissions;
    /**
     * The policies property
     */
    private java.util.List<Policy> policies;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MemberPoliciesResponse}
     */
    @jakarta.annotation.Nonnull
    public static MemberPoliciesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MemberPoliciesResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(Policy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissions property value. The permissions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }
    /**
     * Gets the policies property value. The policies property
     * @return a {@link java.util.List<Policy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Policy> getPolicies() {
        return this.policies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("permissions", this.getPermissions());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
    }
    /**
     * Sets the permissions property value. The permissions property
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.permissions = value;
    }
    /**
     * Sets the policies property value. The policies property
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<Policy> value) {
        this.policies = value;
    }
}
