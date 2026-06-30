package com.rixl.sdk.models.types;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API key creation request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateAPIKeyRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The expiring_at property
     */
    private String expiringAt;
    /**
     * The name property
     */
    private String name;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * Instantiates a new {@link CreateAPIKeyRequest} and sets the default values.
     */
    public CreateAPIKeyRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateAPIKeyRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateAPIKeyRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateAPIKeyRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("expiring_at", (n) -> { this.setExpiringAt(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the project_id property value. The project_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expiring_at", this.getExpiringAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("project_id", this.getProjectId());
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
     * Sets the expiring_at property value. The expiring_at property
     * @param value Value to set for the expiring_at property.
     */
    public void setExpiringAt(@jakarta.annotation.Nullable final String value) {
        this.expiringAt = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the project_id property value. The project_id property
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
}
