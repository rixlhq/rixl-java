package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConvertToTeamOrganizationResponse implements Parsable {
    /**
     * The organization property
     */
    private Organization organization;
    /**
     * The personal_organization property
     */
    private Organization personalOrganization;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConvertToTeamOrganizationResponse}
     */
    @jakarta.annotation.Nonnull
    public static ConvertToTeamOrganizationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConvertToTeamOrganizationResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(Organization::createFromDiscriminatorValue)); });
        deserializerMap.put("personal_organization", (n) -> { this.setPersonalOrganization(n.getObjectValue(Organization::createFromDiscriminatorValue)); });
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
     * Gets the personal_organization property value. The personal_organization property
     * @return a {@link Organization}
     */
    @jakarta.annotation.Nullable
    public Organization getPersonalOrganization() {
        return this.personalOrganization;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeObjectValue("personal_organization", this.getPersonalOrganization());
    }
    /**
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final Organization value) {
        this.organization = value;
    }
    /**
     * Sets the personal_organization property value. The personal_organization property
     * @param value Value to set for the personal_organization property.
     */
    public void setPersonalOrganization(@jakarta.annotation.Nullable final Organization value) {
        this.personalOrganization = value;
    }
}
