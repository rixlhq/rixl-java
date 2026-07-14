package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListMembershipsResponse implements Parsable {
    /**
     * The memberships property
     */
    private java.util.List<Membership> memberships;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListMembershipsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListMembershipsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListMembershipsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("memberships", (n) -> { this.setMemberships(n.getCollectionOfObjectValues(Membership::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memberships property value. The memberships property
     * @return a {@link java.util.List<Membership>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Membership> getMemberships() {
        return this.memberships;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("memberships", this.getMemberships());
    }
    /**
     * Sets the memberships property value. The memberships property
     * @param value Value to set for the memberships property.
     */
    public void setMemberships(@jakarta.annotation.Nullable final java.util.List<Membership> value) {
        this.memberships = value;
    }
}
