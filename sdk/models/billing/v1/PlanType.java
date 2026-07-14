package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlanType implements ValuedEnum {
    PLAN_TYPE_UNSPECIFIED("PLAN_TYPE_UNSPECIFIED"),
    PLAN_TYPE_FREE("PLAN_TYPE_FREE"),
    PLAN_TYPE_PAY_AS_YOU_GO("PLAN_TYPE_PAY_AS_YOU_GO"),
    PLAN_TYPE_PRO("PLAN_TYPE_PRO"),
    PLAN_TYPE_CUSTOM("PLAN_TYPE_CUSTOM");
    public final String value;
    PlanType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlanType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PLAN_TYPE_UNSPECIFIED": return PLAN_TYPE_UNSPECIFIED;
            case "PLAN_TYPE_FREE": return PLAN_TYPE_FREE;
            case "PLAN_TYPE_PAY_AS_YOU_GO": return PLAN_TYPE_PAY_AS_YOU_GO;
            case "PLAN_TYPE_PRO": return PLAN_TYPE_PRO;
            case "PLAN_TYPE_CUSTOM": return PLAN_TYPE_CUSTOM;
            default: return null;
        }
    }
}
