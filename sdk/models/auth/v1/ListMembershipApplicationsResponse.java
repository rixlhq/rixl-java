package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListMembershipApplicationsResponse implements Parsable {
    /**
     * The applications property
     */
    private java.util.List<MembershipApplication> applications;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListMembershipApplicationsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListMembershipApplicationsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListMembershipApplicationsResponse();
    }
    /**
     * Gets the applications property value. The applications property
     * @return a {@link java.util.List<MembershipApplication>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MembershipApplication> getApplications() {
        return this.applications;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("applications", (n) -> { this.setApplications(n.getCollectionOfObjectValues(MembershipApplication::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("applications", this.getApplications());
    }
    /**
     * Sets the applications property value. The applications property
     * @param value Value to set for the applications property.
     */
    public void setApplications(@jakarta.annotation.Nullable final java.util.List<MembershipApplication> value) {
        this.applications = value;
    }
}
