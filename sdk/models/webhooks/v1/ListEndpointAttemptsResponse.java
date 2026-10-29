package com.rixl.sdk.models.webhooks.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListEndpointAttemptsResponse implements Parsable {
    /**
     * The attempts property
     */
    private java.util.List<WebhookAttempt> attempts;
    /**
     * The limit property
     */
    private Integer limit;
    /**
     * The offset property
     */
    private Integer offset;
    /**
     * The total property
     */
    private String total;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListEndpointAttemptsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListEndpointAttemptsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListEndpointAttemptsResponse();
    }
    /**
     * Gets the attempts property value. The attempts property
     * @return a {@link java.util.List<WebhookAttempt>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebhookAttempt> getAttempts() {
        return this.attempts;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("attempts", (n) -> { this.setAttempts(n.getCollectionOfObjectValues(WebhookAttempt::createFromDiscriminatorValue)); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. The limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. The offset property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the total property value. The total property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attempts", this.getAttempts());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("total", this.getTotal());
    }
    /**
     * Sets the attempts property value. The attempts property
     * @param value Value to set for the attempts property.
     */
    public void setAttempts(@jakarta.annotation.Nullable final java.util.List<WebhookAttempt> value) {
        this.attempts = value;
    }
    /**
     * Sets the limit property value. The limit property
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final String value) {
        this.total = value;
    }
}
