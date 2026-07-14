package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListOrgMembersResponse implements Parsable {
    /**
     * The members property
     */
    private java.util.List<OrgMember> members;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListOrgMembersResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListOrgMembersResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListOrgMembersResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(OrgMember::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. The members property
     * @return a {@link java.util.List<OrgMember>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrgMember> getMembers() {
        return this.members;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("members", this.getMembers());
    }
    /**
     * Sets the members property value. The members property
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<OrgMember> value) {
        this.members = value;
    }
}
