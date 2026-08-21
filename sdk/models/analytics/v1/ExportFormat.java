package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExportFormat implements ValuedEnum {
    EXPORT_FORMAT_UNSPECIFIED("EXPORT_FORMAT_UNSPECIFIED"),
    EXPORT_FORMAT_CSV("EXPORT_FORMAT_CSV"),
    EXPORT_FORMAT_XLSX("EXPORT_FORMAT_XLSX"),
    EXPORT_FORMAT_PDF("EXPORT_FORMAT_PDF"),
    EXPORT_FORMAT_JSON("EXPORT_FORMAT_JSON");
    public final String value;
    ExportFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExportFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EXPORT_FORMAT_UNSPECIFIED": return EXPORT_FORMAT_UNSPECIFIED;
            case "EXPORT_FORMAT_CSV": return EXPORT_FORMAT_CSV;
            case "EXPORT_FORMAT_XLSX": return EXPORT_FORMAT_XLSX;
            case "EXPORT_FORMAT_PDF": return EXPORT_FORMAT_PDF;
            case "EXPORT_FORMAT_JSON": return EXPORT_FORMAT_JSON;
            default: return null;
        }
    }
}
