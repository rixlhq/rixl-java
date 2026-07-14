package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SalesLeadStatus implements ValuedEnum {
    SALES_LEAD_STATUS_UNSPECIFIED("SALES_LEAD_STATUS_UNSPECIFIED"),
    SALES_LEAD_STATUS_NEW("SALES_LEAD_STATUS_NEW"),
    SALES_LEAD_STATUS_CONTACTED("SALES_LEAD_STATUS_CONTACTED"),
    SALES_LEAD_STATUS_QUALIFIED("SALES_LEAD_STATUS_QUALIFIED"),
    SALES_LEAD_STATUS_CLOSED("SALES_LEAD_STATUS_CLOSED");
    public final String value;
    SalesLeadStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SalesLeadStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SALES_LEAD_STATUS_UNSPECIFIED": return SALES_LEAD_STATUS_UNSPECIFIED;
            case "SALES_LEAD_STATUS_NEW": return SALES_LEAD_STATUS_NEW;
            case "SALES_LEAD_STATUS_CONTACTED": return SALES_LEAD_STATUS_CONTACTED;
            case "SALES_LEAD_STATUS_QUALIFIED": return SALES_LEAD_STATUS_QUALIFIED;
            case "SALES_LEAD_STATUS_CLOSED": return SALES_LEAD_STATUS_CLOSED;
            default: return null;
        }
    }
}
