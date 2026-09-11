package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlogSubscriptionResponse implements Parsable {
    /**
     * The subscribed property
     */
    private Boolean subscribed;
    /**
     * The subscribed_at property
     */
    private OffsetDateTime subscribedAt;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BlogSubscriptionResponse}
     */
    @jakarta.annotation.Nonnull
    public static BlogSubscriptionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlogSubscriptionResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("subscribed", (n) -> { this.setSubscribed(n.getBooleanValue()); });
        deserializerMap.put("subscribed_at", (n) -> { this.setSubscribedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the subscribed property value. The subscribed property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubscribed() {
        return this.subscribed;
    }
    /**
     * Gets the subscribed_at property value. The subscribed_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubscribedAt() {
        return this.subscribedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("subscribed", this.getSubscribed());
        writer.writeOffsetDateTimeValue("subscribed_at", this.getSubscribedAt());
    }
    /**
     * Sets the subscribed property value. The subscribed property
     * @param value Value to set for the subscribed property.
     */
    public void setSubscribed(@jakarta.annotation.Nullable final Boolean value) {
        this.subscribed = value;
    }
    /**
     * Sets the subscribed_at property value. The subscribed_at property
     * @param value Value to set for the subscribed_at property.
     */
    public void setSubscribedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.subscribedAt = value;
    }
}
