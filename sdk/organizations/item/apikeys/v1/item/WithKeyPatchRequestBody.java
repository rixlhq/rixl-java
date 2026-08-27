package com.rixl.sdk.organizations.item.apikeys.v1.item;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.google.protobuf.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithKeyPatchRequestBody implements Parsable {
    /**
     * The expiring_at property
     */
    private WithKeyPatchRequestBodyExpiringAt expiringAt;
    /**
     * The key_id property
     */
    private String keyId;
    /**
     * The name property
     */
    private String name;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The policy_ids property
     */
    private java.util.List<String> policyIds;
    /**
     * The replace_policies property
     */
    private Boolean replacePolicies;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WithKeyPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static WithKeyPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithKeyPatchRequestBody();
    }
    /**
     * Gets the expiring_at property value. The expiring_at property
     * @return a {@link WithKeyPatchRequestBodyExpiringAt}
     */
    @jakarta.annotation.Nullable
    public WithKeyPatchRequestBodyExpiringAt getExpiringAt() {
        return this.expiringAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("expiring_at", (n) -> { this.setExpiringAt(n.getObjectValue(WithKeyPatchRequestBodyExpiringAt::createFromDiscriminatorValue)); });
        deserializerMap.put("key_id", (n) -> { this.setKeyId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("policy_ids", (n) -> { this.setPolicyIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("replace_policies", (n) -> { this.setReplacePolicies(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key_id property value. The key_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeyId() {
        return this.keyId;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the policy_ids property value. The policy_ids property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }
    /**
     * Gets the replace_policies property value. The replace_policies property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReplacePolicies() {
        return this.replacePolicies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("expiring_at", this.getExpiringAt());
        writer.writeStringValue("key_id", this.getKeyId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeCollectionOfPrimitiveValues("policy_ids", this.getPolicyIds());
        writer.writeBooleanValue("replace_policies", this.getReplacePolicies());
    }
    /**
     * Sets the expiring_at property value. The expiring_at property
     * @param value Value to set for the expiring_at property.
     */
    public void setExpiringAt(@jakarta.annotation.Nullable final WithKeyPatchRequestBodyExpiringAt value) {
        this.expiringAt = value;
    }
    /**
     * Sets the key_id property value. The key_id property
     * @param value Value to set for the key_id property.
     */
    public void setKeyId(@jakarta.annotation.Nullable final String value) {
        this.keyId = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the policy_ids property value. The policy_ids property
     * @param value Value to set for the policy_ids property.
     */
    public void setPolicyIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.policyIds = value;
    }
    /**
     * Sets the replace_policies property value. The replace_policies property
     * @param value Value to set for the replace_policies property.
     */
    public void setReplacePolicies(@jakarta.annotation.Nullable final Boolean value) {
        this.replacePolicies = value;
    }
    /**
     * Composed type wrapper for classes {@link Timestamp}, {@link WithKeyPatchRequestBodyExpiringAtMember1}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class WithKeyPatchRequestBodyExpiringAt implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type {@link Timestamp}
         */
        private Timestamp timestamp;
        /**
         * Composed type representation for type {@link WithKeyPatchRequestBodyExpiringAtMember1}
         */
        private WithKeyPatchRequestBodyExpiringAtMember1 withKeyPatchRequestBodyExpiringAtMember1;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link WithKeyPatchRequestBodyExpiringAt}
         */
        @jakarta.annotation.Nonnull
        public static WithKeyPatchRequestBodyExpiringAt createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final WithKeyPatchRequestBodyExpiringAt result = new WithKeyPatchRequestBodyExpiringAt();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            return result;
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getTimestamp() != null) {
                return this.getTimestamp().getFieldDeserializers();
            } else if (this.getWithKeyPatchRequestBodyExpiringAtMember1() != null) {
                return this.getWithKeyPatchRequestBodyExpiringAtMember1().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the Timestamp property value. Composed type representation for type {@link Timestamp}
         * @return a {@link Timestamp}
         */
        @jakarta.annotation.Nullable
        public Timestamp getTimestamp() {
            return this.timestamp;
        }
        /**
         * Gets the WithKey_PatchRequestBody_expiring_atMember1 property value. Composed type representation for type {@link WithKeyPatchRequestBodyExpiringAtMember1}
         * @return a {@link WithKeyPatchRequestBodyExpiringAtMember1}
         */
        @jakarta.annotation.Nullable
        public WithKeyPatchRequestBodyExpiringAtMember1 getWithKeyPatchRequestBodyExpiringAtMember1() {
            return this.withKeyPatchRequestBodyExpiringAtMember1;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getTimestamp() != null) {
                writer.writeObjectValue(null, this.getTimestamp());
            } else if (this.getWithKeyPatchRequestBodyExpiringAtMember1() != null) {
                writer.writeObjectValue(null, this.getWithKeyPatchRequestBodyExpiringAtMember1());
            }
        }
        /**
         * Sets the Timestamp property value. Composed type representation for type {@link Timestamp}
         * @param value Value to set for the Timestamp property.
         */
        public void setTimestamp(@jakarta.annotation.Nullable final Timestamp value) {
            this.timestamp = value;
        }
        /**
         * Sets the WithKey_PatchRequestBody_expiring_atMember1 property value. Composed type representation for type {@link WithKeyPatchRequestBodyExpiringAtMember1}
         * @param value Value to set for the WithKey_PatchRequestBody_expiring_atMember1 property.
         */
        public void setWithKeyPatchRequestBodyExpiringAtMember1(@jakarta.annotation.Nullable final WithKeyPatchRequestBodyExpiringAtMember1 value) {
            this.withKeyPatchRequestBodyExpiringAtMember1 = value;
        }
    }
}
