package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BillingCycle implements ValuedEnum {
    BILLING_CYCLE_UNSPECIFIED("BILLING_CYCLE_UNSPECIFIED"),
    BILLING_CYCLE_MONTHLY("BILLING_CYCLE_MONTHLY"),
    BILLING_CYCLE_YEARLY("BILLING_CYCLE_YEARLY");
    public final String value;
    BillingCycle(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BillingCycle forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BILLING_CYCLE_UNSPECIFIED": return BILLING_CYCLE_UNSPECIFIED;
            case "BILLING_CYCLE_MONTHLY": return BILLING_CYCLE_MONTHLY;
            case "BILLING_CYCLE_YEARLY": return BILLING_CYCLE_YEARLY;
            default: return null;
        }
    }
}
