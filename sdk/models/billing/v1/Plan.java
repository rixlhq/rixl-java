package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.google.protobuf.Struct;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Plan implements Parsable {
    /**
     * The active property
     */
    private Boolean active;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The description property
     */
    private String description;
    /**
     * `Struct` represents a structured data value, consisting of fields which map to dynamically typed values. In some languages, `Struct` might be supported by a native representation. For example, in scripting languages like JS a struct is represented as an object. The details of that representation are described together with the proto support for the language. The JSON representation for `Struct` is JSON object.
     */
    private Struct features;
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
     * The is_public property
     */
    private Boolean isPublic;
    /**
     * The name property
     */
    private String name;
    /**
     * The plan_type property
     */
    private PlanType planType;
    /**
     * The price property
     */
    private String price;
    /**
     * The sort_order property
     */
    private Integer sortOrder;
    /**
     * The stripe_price_id property
     */
    private String stripePriceId;
    /**
     * The stripe_product_id property
     */
    private String stripeProductId;
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
     * Gets the active property value. The active property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getActive() {
        return this.active;
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
     * Gets the features property value. `Struct` represents a structured data value, consisting of fields which map to dynamically typed values. In some languages, `Struct` might be supported by a native representation. For example, in scripting languages like JS a struct is represented as an object. The details of that representation are described together with the proto support for the language. The JSON representation for `Struct` is JSON object.
     * @return a {@link Struct}
     */
    @jakarta.annotation.Nullable
    public Struct getFeatures() {
        return this.features;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("active", (n) -> { this.setActive(n.getBooleanValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("features", (n) -> { this.setFeatures(n.getObjectValue(Struct::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getStringValue()); });
        deserializerMap.put("interval_count", (n) -> { this.setIntervalCount(n.getIntegerValue()); });
        deserializerMap.put("is_public", (n) -> { this.setIsPublic(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("plan_type", (n) -> { this.setPlanType(n.getEnumValue(PlanType::forValue)); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getStringValue()); });
        deserializerMap.put("sort_order", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        deserializerMap.put("stripe_price_id", (n) -> { this.setStripePriceId(n.getStringValue()); });
        deserializerMap.put("stripe_product_id", (n) -> { this.setStripeProductId(n.getStringValue()); });
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
     * Gets the is_public property value. The is_public property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPublic() {
        return this.isPublic;
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
     * @return a {@link PlanType}
     */
    @jakarta.annotation.Nullable
    public PlanType getPlanType() {
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
     * Gets the stripe_price_id property value. The stripe_price_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripePriceId() {
        return this.stripePriceId;
    }
    /**
     * Gets the stripe_product_id property value. The stripe_product_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripeProductId() {
        return this.stripeProductId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("active", this.getActive());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("features", this.getFeatures());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("interval", this.getInterval());
        writer.writeIntegerValue("interval_count", this.getIntervalCount());
        writer.writeBooleanValue("is_public", this.getIsPublic());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("plan_type", this.getPlanType());
        writer.writeStringValue("price", this.getPrice());
        writer.writeIntegerValue("sort_order", this.getSortOrder());
        writer.writeStringValue("stripe_price_id", this.getStripePriceId());
        writer.writeStringValue("stripe_product_id", this.getStripeProductId());
    }
    /**
     * Sets the active property value. The active property
     * @param value Value to set for the active property.
     */
    public void setActive(@jakarta.annotation.Nullable final Boolean value) {
        this.active = value;
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
     * Sets the features property value. `Struct` represents a structured data value, consisting of fields which map to dynamically typed values. In some languages, `Struct` might be supported by a native representation. For example, in scripting languages like JS a struct is represented as an object. The details of that representation are described together with the proto support for the language. The JSON representation for `Struct` is JSON object.
     * @param value Value to set for the features property.
     */
    public void setFeatures(@jakarta.annotation.Nullable final Struct value) {
        this.features = value;
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
     * Sets the is_public property value. The is_public property
     * @param value Value to set for the is_public property.
     */
    public void setIsPublic(@jakarta.annotation.Nullable final Boolean value) {
        this.isPublic = value;
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
    public void setPlanType(@jakarta.annotation.Nullable final PlanType value) {
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
    /**
     * Sets the stripe_price_id property value. The stripe_price_id property
     * @param value Value to set for the stripe_price_id property.
     */
    public void setStripePriceId(@jakarta.annotation.Nullable final String value) {
        this.stripePriceId = value;
    }
    /**
     * Sets the stripe_product_id property value. The stripe_product_id property
     * @param value Value to set for the stripe_product_id property.
     */
    public void setStripeProductId(@jakarta.annotation.Nullable final String value) {
        this.stripeProductId = value;
    }
}
