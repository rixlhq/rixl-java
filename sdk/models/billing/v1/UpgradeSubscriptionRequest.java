package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpgradeSubscriptionRequest implements Parsable {
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * The stripePriceId property
     */
    private String stripePriceId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpgradeSubscriptionRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpgradeSubscriptionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpgradeSubscriptionRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("stripePriceId", (n) -> { this.setStripePriceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the orgId property value. The orgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the stripePriceId property value. The stripePriceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripePriceId() {
        return this.stripePriceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeStringValue("stripePriceId", this.getStripePriceId());
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the stripePriceId property value. The stripePriceId property
     * @param value Value to set for the stripePriceId property.
     */
    public void setStripePriceId(@jakarta.annotation.Nullable final String value) {
        this.stripePriceId = value;
    }
}
