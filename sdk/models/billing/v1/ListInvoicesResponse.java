package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListInvoicesResponse implements Parsable {
    /**
     * The invoices property
     */
    private java.util.List<Invoice> invoices;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListInvoicesResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListInvoicesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListInvoicesResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("invoices", (n) -> { this.setInvoices(n.getCollectionOfObjectValues(Invoice::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the invoices property value. The invoices property
     * @return a {@link java.util.List<Invoice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Invoice> getInvoices() {
        return this.invoices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("invoices", this.getInvoices());
    }
    /**
     * Sets the invoices property value. The invoices property
     * @param value Value to set for the invoices property.
     */
    public void setInvoices(@jakarta.annotation.Nullable final java.util.List<Invoice> value) {
        this.invoices = value;
    }
}
