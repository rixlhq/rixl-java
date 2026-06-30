package com.rixl.sdk.models.authv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlogSubscriptionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The subscribed property
     */
    private Boolean subscribed;
    /**
     * The subscribed_at property
     */
    private String subscribedAt;
    /**
     * Instantiates a new {@link BlogSubscriptionResponse} and sets the default values.
     */
    public BlogSubscriptionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("subscribed", (n) -> { this.setSubscribed(n.getBooleanValue()); });
        deserializerMap.put("subscribed_at", (n) -> { this.setSubscribedAt(n.getStringValue()); });
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscribedAt() {
        return this.subscribedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("subscribed", this.getSubscribed());
        writer.writeStringValue("subscribed_at", this.getSubscribedAt());
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
    public void setSubscribedAt(@jakarta.annotation.Nullable final String value) {
        this.subscribedAt = value;
    }
}
