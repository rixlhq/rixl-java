package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyAttachment implements Parsable {
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The identity_id property
     */
    private String identityId;
    /**
     * The identity_type property
     */
    private PolicyIdentityType identityType;
    /**
     * The policy_id property
     */
    private String policyId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyAttachment}
     */
    @jakarta.annotation.Nonnull
    public static PolicyAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyAttachment();
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("identity_id", (n) -> { this.setIdentityId(n.getStringValue()); });
        deserializerMap.put("identity_type", (n) -> { this.setIdentityType(n.getEnumValue(PolicyIdentityType::forValue)); });
        deserializerMap.put("policy_id", (n) -> { this.setPolicyId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the identity_id property value. The identity_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityId() {
        return this.identityId;
    }
    /**
     * Gets the identity_type property value. The identity_type property
     * @return a {@link PolicyIdentityType}
     */
    @jakarta.annotation.Nullable
    public PolicyIdentityType getIdentityType() {
        return this.identityType;
    }
    /**
     * Gets the policy_id property value. The policy_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("identity_id", this.getIdentityId());
        writer.writeEnumValue("identity_type", this.getIdentityType());
        writer.writeStringValue("policy_id", this.getPolicyId());
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the identity_id property value. The identity_id property
     * @param value Value to set for the identity_id property.
     */
    public void setIdentityId(@jakarta.annotation.Nullable final String value) {
        this.identityId = value;
    }
    /**
     * Sets the identity_type property value. The identity_type property
     * @param value Value to set for the identity_type property.
     */
    public void setIdentityType(@jakarta.annotation.Nullable final PolicyIdentityType value) {
        this.identityType = value;
    }
    /**
     * Sets the policy_id property value. The policy_id property
     * @param value Value to set for the policy_id property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.policyId = value;
    }
}
