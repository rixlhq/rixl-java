package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.userdeletionplanentry.Kind;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserDeletionPlanEntry implements Parsable {
    /**
     * Set when another member will lose access to the personal org.
     */
    private String affectedUserId;
    /**
     * The affected_username property
     */
    private String affectedUsername;
    /**
     * The kind property
     */
    private Kind kind;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The org_name property
     */
    private String orgName;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserDeletionPlanEntry}
     */
    @jakarta.annotation.Nonnull
    public static UserDeletionPlanEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserDeletionPlanEntry();
    }
    /**
     * Gets the affected_user_id property value. Set when another member will lose access to the personal org.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAffectedUserId() {
        return this.affectedUserId;
    }
    /**
     * Gets the affected_username property value. The affected_username property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAffectedUsername() {
        return this.affectedUsername;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("affected_user_id", (n) -> { this.setAffectedUserId(n.getStringValue()); });
        deserializerMap.put("affected_username", (n) -> { this.setAffectedUsername(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getEnumValue(Kind::forValue)); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("org_name", (n) -> { this.setOrgName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kind property value. The kind property
     * @return a {@link Kind}
     */
    @jakarta.annotation.Nullable
    public Kind getKind() {
        return this.kind;
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
     * Gets the org_name property value. The org_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgName() {
        return this.orgName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("affected_user_id", this.getAffectedUserId());
        writer.writeStringValue("affected_username", this.getAffectedUsername());
        writer.writeEnumValue("kind", this.getKind());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("org_name", this.getOrgName());
    }
    /**
     * Sets the affected_user_id property value. Set when another member will lose access to the personal org.
     * @param value Value to set for the affected_user_id property.
     */
    public void setAffectedUserId(@jakarta.annotation.Nullable final String value) {
        this.affectedUserId = value;
    }
    /**
     * Sets the affected_username property value. The affected_username property
     * @param value Value to set for the affected_username property.
     */
    public void setAffectedUsername(@jakarta.annotation.Nullable final String value) {
        this.affectedUsername = value;
    }
    /**
     * Sets the kind property value. The kind property
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final Kind value) {
        this.kind = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the org_name property value. The org_name property
     * @param value Value to set for the org_name property.
     */
    public void setOrgName(@jakarta.annotation.Nullable final String value) {
        this.orgName = value;
    }
}
