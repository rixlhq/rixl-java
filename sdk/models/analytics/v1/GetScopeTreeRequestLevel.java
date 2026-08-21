package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Which level to expand. Empty returns the projects at the root.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetScopeTreeRequestLevel implements ValuedEnum {
    Projects("projects"),
    Resource_types("resource_types"),
    Resources("resources");
    public final String value;
    GetScopeTreeRequestLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetScopeTreeRequestLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "projects": return Projects;
            case "resource_types": return Resource_types;
            case "resources": return Resources;
            default: return null;
        }
    }
}
