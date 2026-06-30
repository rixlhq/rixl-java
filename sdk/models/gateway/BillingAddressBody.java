package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Billing address
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingAddressBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The city property
     */
    private String city;
    /**
     * The country property
     */
    private String country;
    /**
     * The email property
     */
    private String email;
    /**
     * The line1 property
     */
    private String line1;
    /**
     * The line2 property
     */
    private String line2;
    /**
     * The name property
     */
    private String name;
    /**
     * The phone property
     */
    private String phone;
    /**
     * The postal_code property
     */
    private String postalCode;
    /**
     * The state property
     */
    private String state;
    /**
     * Instantiates a new {@link BillingAddressBody} and sets the default values.
     */
    public BillingAddressBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BillingAddressBody}
     */
    @jakarta.annotation.Nonnull
    public static BillingAddressBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingAddressBody();
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
     * Gets the city property value. The city property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. The country property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("line1", (n) -> { this.setLine1(n.getStringValue()); });
        deserializerMap.put("line2", (n) -> { this.setLine2(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("postal_code", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the line1 property value. The line1 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLine1() {
        return this.line1;
    }
    /**
     * Gets the line2 property value. The line2 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLine2() {
        return this.line2;
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
     * Gets the phone property value. The phone property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the postal_code property value. The postal_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("line1", this.getLine1());
        writer.writeStringValue("line2", this.getLine2());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("postal_code", this.getPostalCode());
        writer.writeStringValue("state", this.getState());
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
     * Sets the city property value. The city property
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. The country property
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the line1 property value. The line1 property
     * @param value Value to set for the line1 property.
     */
    public void setLine1(@jakarta.annotation.Nullable final String value) {
        this.line1 = value;
    }
    /**
     * Sets the line2 property value. The line2 property
     * @param value Value to set for the line2 property.
     */
    public void setLine2(@jakarta.annotation.Nullable final String value) {
        this.line2 = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the phone property value. The phone property
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the postal_code property value. The postal_code property
     * @param value Value to set for the postal_code property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
}
