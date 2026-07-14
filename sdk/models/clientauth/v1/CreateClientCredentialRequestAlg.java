package com.rixl.sdk.models.clientauth.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateClientCredentialRequestAlg implements ValuedEnum {
    EdDSA("EdDSA");
    public final String value;
    CreateClientCredentialRequestAlg(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateClientCredentialRequestAlg forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EdDSA": return EdDSA;
            default: return null;
        }
    }
}
