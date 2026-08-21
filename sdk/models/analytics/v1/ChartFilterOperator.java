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
    Not_in("not_in"),
    Contains("contains"),
    Not_contains("not_contains"),
    Starts_with("starts_with"),
    Ends_with("ends_with"),
    Between("between"),
    Is_empty("is_empty"),
    Is_not_empty("is_not_empty");
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
            case "not_in": return Not_in;
            case "contains": return Contains;
            case "not_contains": return Not_contains;
            case "starts_with": return Starts_with;
            case "ends_with": return Ends_with;
            case "between": return Between;
            case "is_empty": return Is_empty;
            case "is_not_empty": return Is_not_empty;
            default: return null;
        }
    }
}
