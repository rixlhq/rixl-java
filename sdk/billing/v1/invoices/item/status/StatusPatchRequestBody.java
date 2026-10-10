package com.rixl.sdk.billing.v1.invoices.item.status;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.billing.v1.InvoiceStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StatusPatchRequestBody implements Parsable {
    /**
     * The invoice_id property
     */
    private String invoiceId;
    /**
     * The status property
     */
    private InvoiceStatus status;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StatusPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static StatusPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StatusPatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("invoice_id", (n) -> { this.setInvoiceId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(InvoiceStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the invoice_id property value. The invoice_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInvoiceId() {
        return this.invoiceId;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link InvoiceStatus}
     */
    @jakarta.annotation.Nullable
    public InvoiceStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("invoice_id", this.getInvoiceId());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the invoice_id property value. The invoice_id property
     * @param value Value to set for the invoice_id property.
     */
    public void setInvoiceId(@jakarta.annotation.Nullable final String value) {
        this.invoiceId = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final InvoiceStatus value) {
        this.status = value;
    }
}
