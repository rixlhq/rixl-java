package com.rixl.sdk.auth.v1.organizations.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.Organization;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOrgPatchRequestBody implements Parsable {
    /**
     * The organization property
     */
    private Organization organization;
    /**
     * Supported paths are name, slug and image_id.
     */
    private String updateMask;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WithOrgPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static WithOrgPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithOrgPatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(Organization::createFromDiscriminatorValue)); });
        deserializerMap.put("update_mask", (n) -> { this.setUpdateMask(n.getStringValue()); });
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
     * Gets the update_mask property value. Supported paths are name, slug and image_id.
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
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeStringValue("update_mask", this.getUpdateMask());
    }
    /**
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final Organization value) {
        this.organization = value;
    }
    /**
     * Sets the update_mask property value. Supported paths are name, slug and image_id.
     * @param value Value to set for the update_mask property.
     */
    public void setUpdateMask(@jakarta.annotation.Nullable final String value) {
        this.updateMask = value;
    }
}
