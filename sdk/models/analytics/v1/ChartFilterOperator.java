package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChartFilterOperator implements ValuedEnum {
    Eq("eq"),
    Neq("neq"),
    Gt("gt"),
    Gte("gte"),
    Lt("lt"),
    Lte("lte"),
    In("in"),
    Contains("contains");
    public final String value;
    ChartFilterOperator(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChartFilterOperator forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "eq": return Eq;
            case "neq": return Neq;
            case "gt": return Gt;
            case "gte": return Gte;
            case "lt": return Lt;
            case "lte": return Lte;
            case "in": return In;
            case "contains": return Contains;
            default: return null;
        }
    }
}
