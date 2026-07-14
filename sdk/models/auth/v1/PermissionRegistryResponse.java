package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionRegistryResponse implements Parsable {
    /**
     * The permissions property
     */
    private java.util.List<PermissionOffset> permissions;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PermissionRegistryResponse}
     */
    @jakarta.annotation.Nonnull
    public static PermissionRegistryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionRegistryResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfObjectValues(PermissionOffset::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissions property value. The permissions property
     * @return a {@link java.util.List<PermissionOffset>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionOffset> getPermissions() {
        return this.permissions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
    }
    /**
     * Sets the permissions property value. The permissions property
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<PermissionOffset> value) {
        this.permissions = value;
    }
}
