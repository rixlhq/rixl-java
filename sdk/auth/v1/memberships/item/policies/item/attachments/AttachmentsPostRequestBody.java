package com.rixl.sdk.auth.v1.memberships.item.policies.item.attachments;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.PolicyIdentityType;
import com.rixl.sdk.models.auth.v1.UserOrgRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttachmentsPostRequestBody implements Parsable {
    /**
     * The identityId property
     */
    private String identityId;
    /**
     * The identityType property
     */
    private PolicyIdentityType identityType;
    /**
     * The user property
     */
    private UserOrgRequest user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttachmentsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static AttachmentsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentsPostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("identityId", (n) -> { this.setIdentityId(n.getStringValue()); });
        deserializerMap.put("identityType", (n) -> { this.setIdentityType(n.getEnumValue(PolicyIdentityType::forValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(UserOrgRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityId property value. The identityId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityId() {
        return this.identityId;
    }
    /**
     * Gets the identityType property value. The identityType property
     * @return a {@link PolicyIdentityType}
     */
    @jakarta.annotation.Nullable
    public PolicyIdentityType getIdentityType() {
        return this.identityType;
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
        writer.writeStringValue("identityId", this.getIdentityId());
        writer.writeEnumValue("identityType", this.getIdentityType());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the identityId property value. The identityId property
     * @param value Value to set for the identityId property.
     */
    public void setIdentityId(@jakarta.annotation.Nullable final String value) {
        this.identityId = value;
    }
    /**
     * Sets the identityType property value. The identityType property
     * @param value Value to set for the identityType property.
     */
    public void setIdentityType(@jakarta.annotation.Nullable final PolicyIdentityType value) {
        this.identityType = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final UserOrgRequest value) {
        this.user = value;
    }
}
