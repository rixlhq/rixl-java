package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetStorageUsageHistoryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The total property
     */
    private Integer total;
    /**
     * The usages property
     */
    private java.util.List<StorageUsage> usages;
    /**
     * Instantiates a new {@link GetStorageUsageHistoryResponse} and sets the default values.
     */
    public GetStorageUsageHistoryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetStorageUsageHistoryResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetStorageUsageHistoryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetStorageUsageHistoryResponse();
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
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        deserializerMap.put("usages", (n) -> { this.setUsages(n.getCollectionOfObjectValues(StorageUsage::createFromDiscriminatorValue)); });
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
     * @return a {@link java.util.List<StorageUsage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StorageUsage> getUsages() {
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
    public void setUsages(@jakarta.annotation.Nullable final java.util.List<StorageUsage> value) {
        this.usages = value;
    }
}
