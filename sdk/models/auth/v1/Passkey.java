package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Passkey implements Parsable {
    /**
     * The aaguid property
     */
    private String aaguid;
    /**
     * The backupState property
     */
    private Boolean backupState;
    /**
     * The createdAt property
     */
    private String createdAt;
    /**
     * The credentialId property
     */
    private String credentialId;
    /**
     * The id property
     */
    private String id;
    /**
     * The lastUsedAt property
     */
    private String lastUsedAt;
    /**
     * The name property
     */
    private String name;
    /**
     * The transports property
     */
    private java.util.List<String> transports;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Passkey}
     */
    @jakarta.annotation.Nonnull
    public static Passkey createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Passkey();
    }
    /**
     * Gets the aaguid property value. The aaguid property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAaguid() {
        return this.aaguid;
    }
    /**
     * Gets the backupState property value. The backupState property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBackupState() {
        return this.backupState;
    }
    /**
     * Gets the createdAt property value. The createdAt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the credentialId property value. The credentialId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCredentialId() {
        return this.credentialId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("aaguid", (n) -> { this.setAaguid(n.getStringValue()); });
        deserializerMap.put("backupState", (n) -> { this.setBackupState(n.getBooleanValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("credentialId", (n) -> { this.setCredentialId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lastUsedAt", (n) -> { this.setLastUsedAt(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("transports", (n) -> { this.setTransports(n.getCollectionOfPrimitiveValues(String.class)); });
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
     * Gets the lastUsedAt property value. The lastUsedAt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUsedAt() {
        return this.lastUsedAt;
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
     * Gets the transports property value. The transports property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTransports() {
        return this.transports;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("aaguid", this.getAaguid());
        writer.writeBooleanValue("backupState", this.getBackupState());
        writer.writeStringValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("credentialId", this.getCredentialId());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("lastUsedAt", this.getLastUsedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("transports", this.getTransports());
    }
    /**
     * Sets the aaguid property value. The aaguid property
     * @param value Value to set for the aaguid property.
     */
    public void setAaguid(@jakarta.annotation.Nullable final String value) {
        this.aaguid = value;
    }
    /**
     * Sets the backupState property value. The backupState property
     * @param value Value to set for the backupState property.
     */
    public void setBackupState(@jakarta.annotation.Nullable final Boolean value) {
        this.backupState = value;
    }
    /**
     * Sets the createdAt property value. The createdAt property
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the credentialId property value. The credentialId property
     * @param value Value to set for the credentialId property.
     */
    public void setCredentialId(@jakarta.annotation.Nullable final String value) {
        this.credentialId = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lastUsedAt property value. The lastUsedAt property
     * @param value Value to set for the lastUsedAt property.
     */
    public void setLastUsedAt(@jakarta.annotation.Nullable final String value) {
        this.lastUsedAt = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the transports property value. The transports property
     * @param value Value to set for the transports property.
     */
    public void setTransports(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.transports = value;
    }
}
