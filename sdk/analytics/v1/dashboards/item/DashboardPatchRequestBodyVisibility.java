package com.rixl.sdk.analytics.v1.dashboards.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DashboardPatchRequestBodyVisibility implements ValuedEnum {
    Private("private"),
    Org("org");
    public final String value;
    DashboardPatchRequestBodyVisibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DashboardPatchRequestBodyVisibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "private": return Private;
            case "org": return Org;
            default: return null;
        }
    }
}
