package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyAttachment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The created_at property
     */
    private String createdAt;
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
    private String identityType;
    /**
     * The policy_id property
     */
    private String policyId;
    /**
     * Instantiates a new {@link PolicyAttachment} and sets the default values.
     */
    public PolicyAttachment() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("identity_id", (n) -> { this.setIdentityId(n.getStringValue()); });
        deserializerMap.put("identity_type", (n) -> { this.setIdentityType(n.getStringValue()); });
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityType() {
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
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("identity_id", this.getIdentityId());
        writer.writeStringValue("identity_type", this.getIdentityType());
        writer.writeStringValue("policy_id", this.getPolicyId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
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
    public void setIdentityType(@jakarta.annotation.Nullable final String value) {
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
