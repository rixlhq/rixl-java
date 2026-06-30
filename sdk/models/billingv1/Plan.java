package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Plan implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The description property
     */
    private String description;
    /**
     * The id property
     */
    private String id;
    /**
     * The interval property
     */
    private String interval;
    /**
     * The interval_count property
     */
    private Integer intervalCount;
    /**
     * The name property
     */
    private String name;
    /**
     * The plan_type property
     */
    private String planType;
    /**
     * The price property
     */
    private String price;
    /**
     * The sort_order property
     */
    private Integer sortOrder;
    /**
     * Instantiates a new {@link Plan} and sets the default values.
     */
    public Plan() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Plan}
     */
    @jakarta.annotation.Nonnull
    public static Plan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Plan();
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
     * Gets the currency property value. The currency property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getStringValue()); });
        deserializerMap.put("interval_count", (n) -> { this.setIntervalCount(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("plan_type", (n) -> { this.setPlanType(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getStringValue()); });
        deserializerMap.put("sort_order", (n) -> { this.setSortOrder(n.getIntegerValue()); });
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
     * Gets the interval property value. The interval property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInterval() {
        return this.interval;
    }
    /**
     * Gets the interval_count property value. The interval_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIntervalCount() {
        return this.intervalCount;
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
     * Gets the plan_type property value. The plan_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanType() {
        return this.planType;
    }
    /**
     * Gets the price property value. The price property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrice() {
        return this.price;
    }
    /**
     * Gets the sort_order property value. The sort_order property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("interval", this.getInterval());
        writer.writeIntegerValue("interval_count", this.getIntervalCount());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("plan_type", this.getPlanType());
        writer.writeStringValue("price", this.getPrice());
        writer.writeIntegerValue("sort_order", this.getSortOrder());
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
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the interval property value. The interval property
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final String value) {
        this.interval = value;
    }
    /**
     * Sets the interval_count property value. The interval_count property
     * @param value Value to set for the interval_count property.
     */
    public void setIntervalCount(@jakarta.annotation.Nullable final Integer value) {
        this.intervalCount = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the plan_type property value. The plan_type property
     * @param value Value to set for the plan_type property.
     */
    public void setPlanType(@jakarta.annotation.Nullable final String value) {
        this.planType = value;
    }
    /**
     * Sets the price property value. The price property
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final String value) {
        this.price = value;
    }
    /**
     * Sets the sort_order property value. The sort_order property
     * @param value Value to set for the sort_order property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.sortOrder = value;
    }
}
