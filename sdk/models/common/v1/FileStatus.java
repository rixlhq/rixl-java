package com.rixl.sdk.models.common.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileStatus implements ValuedEnum {
    FILE_STATUS_UNSPECIFIED("FILE_STATUS_UNSPECIFIED"),
    FILE_STATUS_UPLOADING("FILE_STATUS_UPLOADING"),
    FILE_STATUS_UPLOADED("FILE_STATUS_UPLOADED"),
    FILE_STATUS_PROCESSING("FILE_STATUS_PROCESSING"),
    FILE_STATUS_PREPARING("FILE_STATUS_PREPARING"),
    FILE_STATUS_READY("FILE_STATUS_READY"),
    FILE_STATUS_ERROR("FILE_STATUS_ERROR");
    public final String value;
    FileStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FILE_STATUS_UNSPECIFIED": return FILE_STATUS_UNSPECIFIED;
            case "FILE_STATUS_UPLOADING": return FILE_STATUS_UPLOADING;
            case "FILE_STATUS_UPLOADED": return FILE_STATUS_UPLOADED;
            case "FILE_STATUS_PROCESSING": return FILE_STATUS_PROCESSING;
            case "FILE_STATUS_PREPARING": return FILE_STATUS_PREPARING;
            case "FILE_STATUS_READY": return FILE_STATUS_READY;
            case "FILE_STATUS_ERROR": return FILE_STATUS_ERROR;
            default: return null;
        }
    }
}
