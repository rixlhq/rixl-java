package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Invoice implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The amount property
     */
    private String amount;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The description property
     */
    private String description;
    /**
     * The due_date property
     */
    private String dueDate;
    /**
     * The id property
     */
    private String id;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The paid_at property
     */
    private String paidAt;
    /**
     * The status property
     */
    private String status;
    /**
     * The subscription_id property
     */
    private String subscriptionId;
    /**
     * Instantiates a new {@link Invoice} and sets the default values.
     */
    public Invoice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Invoice}
     */
    @jakarta.annotation.Nonnull
    public static Invoice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Invoice();
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
     * Gets the amount property value. The amount property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAmount() {
        return this.amount;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
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
     * Gets the due_date property value. The due_date property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDueDate() {
        return this.dueDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("due_date", (n) -> { this.setDueDate(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("paid_at", (n) -> { this.setPaidAt(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("subscription_id", (n) -> { this.setSubscriptionId(n.getStringValue()); });
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
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the paid_at property value. The paid_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaidAt() {
        return this.paidAt;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the subscription_id property value. The subscription_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("amount", this.getAmount());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("due_date", this.getDueDate());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("paid_at", this.getPaidAt());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("subscription_id", this.getSubscriptionId());
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
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final String value) {
        this.amount = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
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
     * Sets the due_date property value. The due_date property
     * @param value Value to set for the due_date property.
     */
    public void setDueDate(@jakarta.annotation.Nullable final String value) {
        this.dueDate = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the paid_at property value. The paid_at property
     * @param value Value to set for the paid_at property.
     */
    public void setPaidAt(@jakarta.annotation.Nullable final String value) {
        this.paidAt = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the subscription_id property value. The subscription_id property
     * @param value Value to set for the subscription_id property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
}
