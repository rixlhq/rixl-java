package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethodDetails implements Parsable {
    /**
     * The brand property
     */
    private String brand;
    /**
     * The expMonth property
     */
    private UntypedNode expMonth;
    /**
     * The expYear property
     */
    private UntypedNode expYear;
    /**
     * The id property
     */
    private String id;
    /**
     * The isDefault property
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
     * Gets the brand property value. The brand property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrand() {
        return this.brand;
    }
    /**
     * Gets the expMonth property value. The expMonth property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getExpMonth() {
        return this.expMonth;
    }
    /**
     * Gets the expYear property value. The expYear property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getExpYear() {
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
        deserializerMap.put("expMonth", (n) -> { this.setExpMonth(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("expYear", (n) -> { this.setExpYear(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
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
     * Gets the isDefault property value. The isDefault property
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
        writer.writeObjectValue("expMonth", this.getExpMonth());
        writer.writeObjectValue("expYear", this.getExpYear());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeStringValue("last4", this.getLast4());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the brand property value. The brand property
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final String value) {
        this.brand = value;
    }
    /**
     * Sets the expMonth property value. The expMonth property
     * @param value Value to set for the expMonth property.
     */
    public void setExpMonth(@jakarta.annotation.Nullable final UntypedNode value) {
        this.expMonth = value;
    }
    /**
     * Sets the expYear property value. The expYear property
     * @param value Value to set for the expYear property.
     */
    public void setExpYear(@jakarta.annotation.Nullable final UntypedNode value) {
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
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
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
