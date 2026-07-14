package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainResponse implements Parsable {
    /**
     * The domain property
     */
    private String domain;
    /**
     * The id property
     */
    private String id;
    /**
     * The present property
     */
    private Boolean present;
    /**
     * The status property
     */
    private DomainStatus status;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DomainResponse}
     */
    @jakarta.annotation.Nonnull
    public static DomainResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainResponse();
    }
    /**
     * Gets the domain property value. The domain property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("present", (n) -> { this.setPresent(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(DomainStatus::createFromDiscriminatorValue)); });
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
     * Gets the present property value. The present property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPresent() {
        return this.present;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link DomainStatus}
     */
    @jakarta.annotation.Nullable
    public DomainStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("domain", this.getDomain());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("present", this.getPresent());
        writer.writeObjectValue("status", this.getStatus());
    }
    /**
     * Sets the domain property value. The domain property
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the present property value. The present property
     * @param value Value to set for the present property.
     */
    public void setPresent(@jakarta.annotation.Nullable final Boolean value) {
        this.present = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DomainStatus value) {
        this.status = value;
    }
}
