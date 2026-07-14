package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InvoiceStatus implements ValuedEnum {
    INVOICE_STATUS_UNSPECIFIED("INVOICE_STATUS_UNSPECIFIED"),
    INVOICE_STATUS_DRAFT("INVOICE_STATUS_DRAFT"),
    INVOICE_STATUS_OPEN("INVOICE_STATUS_OPEN"),
    INVOICE_STATUS_PAID("INVOICE_STATUS_PAID"),
    INVOICE_STATUS_VOID("INVOICE_STATUS_VOID"),
    INVOICE_STATUS_UNCOLLECTIBLE("INVOICE_STATUS_UNCOLLECTIBLE");
    public final String value;
    InvoiceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InvoiceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVOICE_STATUS_UNSPECIFIED": return INVOICE_STATUS_UNSPECIFIED;
            case "INVOICE_STATUS_DRAFT": return INVOICE_STATUS_DRAFT;
            case "INVOICE_STATUS_OPEN": return INVOICE_STATUS_OPEN;
            case "INVOICE_STATUS_PAID": return INVOICE_STATUS_PAID;
            case "INVOICE_STATUS_VOID": return INVOICE_STATUS_VOID;
            case "INVOICE_STATUS_UNCOLLECTIBLE": return INVOICE_STATUS_UNCOLLECTIBLE;
            default: return null;
        }
    }
}
