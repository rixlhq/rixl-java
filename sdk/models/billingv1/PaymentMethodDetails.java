package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethodDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The brand property
     */
    private String brand;
    /**
     * The exp_month property
     */
    private Integer expMonth;
    /**
     * The exp_year property
     */
    private Integer expYear;
    /**
     * The id property
     */
    private String id;
    /**
     * The is_default property
     */
    private Boolean isDefault;
    /**
     * The last4 property
     */
    private String last4;
    /**
     * The type property
     */
    private String type;
    /**
     * Instantiates a new {@link PaymentMethodDetails} and sets the default values.
     */
    public PaymentMethodDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentMethodDetails}
     */
    @jakarta.annotation.Nonnull
    public static PaymentMethodDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentMethodDetails();
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
     * Gets the brand property value. The brand property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrand() {
        return this.brand;
    }
    /**
     * Gets the exp_month property value. The exp_month property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpMonth() {
        return this.expMonth;
    }
    /**
     * Gets the exp_year property value. The exp_year property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpYear() {
        return this.expYear;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getStringValue()); });
        deserializerMap.put("exp_month", (n) -> { this.setExpMonth(n.getIntegerValue()); });
        deserializerMap.put("exp_year", (n) -> { this.setExpYear(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("is_default", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("last4", (n) -> { this.setLast4(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
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
     * Gets the is_default property value. The is_default property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the last4 property value. The last4 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLast4() {
        return this.last4;
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("brand", this.getBrand());
        writer.writeIntegerValue("exp_month", this.getExpMonth());
        writer.writeIntegerValue("exp_year", this.getExpYear());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("is_default", this.getIsDefault());
        writer.writeStringValue("last4", this.getLast4());
        writer.writeStringValue("type", this.getType());
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
     * Sets the brand property value. The brand property
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final String value) {
        this.brand = value;
    }
    /**
     * Sets the exp_month property value. The exp_month property
     * @param value Value to set for the exp_month property.
     */
    public void setExpMonth(@jakarta.annotation.Nullable final Integer value) {
        this.expMonth = value;
    }
    /**
     * Sets the exp_year property value. The exp_year property
     * @param value Value to set for the exp_year property.
     */
    public void setExpYear(@jakarta.annotation.Nullable final Integer value) {
        this.expYear = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the is_default property value. The is_default property
     * @param value Value to set for the is_default property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the last4 property value. The last4 property
     * @param value Value to set for the last4 property.
     */
    public void setLast4(@jakarta.annotation.Nullable final String value) {
        this.last4 = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
