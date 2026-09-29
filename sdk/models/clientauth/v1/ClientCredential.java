package com.rixl.sdk.models.clientauth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClientCredential implements Parsable {
    /**
     * The alg property
     */
    private String alg;
    /**
     * The client_id property
     */
    private String clientId;
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The kid property
     */
    private String kid;
    /**
     * The last_used_at property
     */
    private OffsetDateTime lastUsedAt;
    /**
     * The name property
     */
    private String name;
    /**
     * The status property
     */
    private ClientCredentialStatus status;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClientCredential}
     */
    @jakarta.annotation.Nonnull
    public static ClientCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClientCredential();
    }
    /**
     * Gets the alg property value. The alg property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlg() {
        return this.alg;
    }
    /**
     * Gets the client_id property value. The client_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.clientId;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("alg", (n) -> { this.setAlg(n.getStringValue()); });
        deserializerMap.put("client_id", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("kid", (n) -> { this.setKid(n.getStringValue()); });
        deserializerMap.put("last_used_at", (n) -> { this.setLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ClientCredentialStatus::forValue)); });
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
     * Gets the kid property value. The kid property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKid() {
        return this.kid;
    }
    /**
     * Gets the last_used_at property value. The last_used_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedAt() {
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
     * Gets the status property value. The status property
     * @return a {@link ClientCredentialStatus}
     */
    @jakarta.annotation.Nullable
    public ClientCredentialStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alg", this.getAlg());
        writer.writeStringValue("client_id", this.getClientId());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("kid", this.getKid());
        writer.writeOffsetDateTimeValue("last_used_at", this.getLastUsedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the alg property value. The alg property
     * @param value Value to set for the alg property.
     */
    public void setAlg(@jakarta.annotation.Nullable final String value) {
        this.alg = value;
    }
    /**
     * Sets the client_id property value. The client_id property
     * @param value Value to set for the client_id property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.clientId = value;
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
     * Sets the kid property value. The kid property
     * @param value Value to set for the kid property.
     */
    public void setKid(@jakarta.annotation.Nullable final String value) {
        this.kid = value;
    }
    /**
     * Sets the last_used_at property value. The last_used_at property
     * @param value Value to set for the last_used_at property.
     */
    public void setLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
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
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ClientCredentialStatus value) {
        this.status = value;
    }
}
