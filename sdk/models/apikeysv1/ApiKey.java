package com.rixl.sdk.models.apikeysv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiKey implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The expiring_at property
     */
    private String expiringAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The last_used property
     */
    private String lastUsed;
    /**
     * The name property
     */
    private String name;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * The project_name property
     */
    private String projectName;
    /**
     * The secret property
     */
    private String secret;
    /**
     * Instantiates a new {@link ApiKey} and sets the default values.
     */
    public ApiKey() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApiKey}
     */
    @jakarta.annotation.Nonnull
    public static ApiKey createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApiKey();
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
     * Gets the expiring_at property value. The expiring_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpiringAt() {
        return this.expiringAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("expiring_at", (n) -> { this.setExpiringAt(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("last_used", (n) -> { this.setLastUsed(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("project_name", (n) -> { this.setProjectName(n.getStringValue()); });
        deserializerMap.put("secret", (n) -> { this.setSecret(n.getStringValue()); });
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
     * Gets the last_used property value. The last_used property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUsed() {
        return this.lastUsed;
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
     * Gets the project_id property value. The project_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Gets the project_name property value. The project_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectName() {
        return this.projectName;
    }
    /**
     * Gets the secret property value. The secret property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecret() {
        return this.secret;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("expiring_at", this.getExpiringAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("last_used", this.getLastUsed());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("project_id", this.getProjectId());
        writer.writeStringValue("project_name", this.getProjectName());
        writer.writeStringValue("secret", this.getSecret());
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
     * Sets the expiring_at property value. The expiring_at property
     * @param value Value to set for the expiring_at property.
     */
    public void setExpiringAt(@jakarta.annotation.Nullable final String value) {
        this.expiringAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the last_used property value. The last_used property
     * @param value Value to set for the last_used property.
     */
    public void setLastUsed(@jakarta.annotation.Nullable final String value) {
        this.lastUsed = value;
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
     * Sets the project_id property value. The project_id property
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the project_name property value. The project_name property
     * @param value Value to set for the project_name property.
     */
    public void setProjectName(@jakarta.annotation.Nullable final String value) {
        this.projectName = value;
    }
    /**
     * Sets the secret property value. The secret property
     * @param value Value to set for the secret property.
     */
    public void setSecret(@jakarta.annotation.Nullable final String value) {
        this.secret = value;
    }
}
