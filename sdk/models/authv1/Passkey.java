package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Passkey implements AdditionalDataHolder, Parsable {
    /**
     * The aaguid property
     */
    private String aaguid;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The backup_state property
     */
    private Boolean backupState;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The credential_id property
     */
    private String credentialId;
    /**
     * The id property
     */
    private String id;
    /**
     * The last_used_at property
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
     * Instantiates a new {@link Passkey} and sets the default values.
     */
    public Passkey() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the backup_state property value. The backup_state property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBackupState() {
        return this.backupState;
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
     * Gets the credential_id property value. The credential_id property
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
        deserializerMap.put("backup_state", (n) -> { this.setBackupState(n.getBooleanValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("credential_id", (n) -> { this.setCredentialId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("last_used_at", (n) -> { this.setLastUsedAt(n.getStringValue()); });
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
     * Gets the last_used_at property value. The last_used_at property
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
        writer.writeBooleanValue("backup_state", this.getBackupState());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("credential_id", this.getCredentialId());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("last_used_at", this.getLastUsedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("transports", this.getTransports());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the aaguid property value. The aaguid property
     * @param value Value to set for the aaguid property.
     */
    public void setAaguid(@jakarta.annotation.Nullable final String value) {
        this.aaguid = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the backup_state property value. The backup_state property
     * @param value Value to set for the backup_state property.
     */
    public void setBackupState(@jakarta.annotation.Nullable final Boolean value) {
        this.backupState = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the credential_id property value. The credential_id property
     * @param value Value to set for the credential_id property.
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
     * Sets the last_used_at property value. The last_used_at property
     * @param value Value to set for the last_used_at property.
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
