package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetBandwidthUsageHistoryResponse implements Parsable {
    /**
     * The total property
     */
    private Integer total;
    /**
     * The usages property
     */
    private java.util.List<BandwidthUsage> usages;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetBandwidthUsageHistoryResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetBandwidthUsageHistoryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetBandwidthUsageHistoryResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        deserializerMap.put("usages", (n) -> { this.setUsages(n.getCollectionOfObjectValues(BandwidthUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the total property value. The total property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Gets the usages property value. The usages property
     * @return a {@link java.util.List<BandwidthUsage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BandwidthUsage> getUsages() {
        return this.usages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("total", this.getTotal());
        writer.writeCollectionOfObjectValues("usages", this.getUsages());
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
    /**
     * Sets the usages property value. The usages property
     * @param value Value to set for the usages property.
     */
    public void setUsages(@jakarta.annotation.Nullable final java.util.List<BandwidthUsage> value) {
        this.usages = value;
    }
}
