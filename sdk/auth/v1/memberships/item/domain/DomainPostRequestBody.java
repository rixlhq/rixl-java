package com.rixl.sdk.auth.v1.memberships.item.domain;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.UserOrgRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainPostRequestBody implements Parsable {
    /**
     * The domain property
     */
    private String domain;
    /**
     * The user property
     */
    private UserOrgRequest user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DomainPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static DomainPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainPostRequestBody();
    }
    /**
     * Gets the domain property value. The domain property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(UserOrgRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeStringValue("domain", this.getDomain());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the domain property value. The domain property
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final UserOrgRequest value) {
        this.user = value;
    }
}
