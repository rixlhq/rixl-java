package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageAuthor implements ValuedEnum {
    MESSAGE_AUTHOR_UNSPECIFIED("MESSAGE_AUTHOR_UNSPECIFIED"),
    MESSAGE_AUTHOR_CUSTOMER("MESSAGE_AUTHOR_CUSTOMER"),
    MESSAGE_AUTHOR_AGENT("MESSAGE_AUTHOR_AGENT"),
    MESSAGE_AUTHOR_SYSTEM("MESSAGE_AUTHOR_SYSTEM");
    public final String value;
    MessageAuthor(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageAuthor forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MESSAGE_AUTHOR_UNSPECIFIED": return MESSAGE_AUTHOR_UNSPECIFIED;
            case "MESSAGE_AUTHOR_CUSTOMER": return MESSAGE_AUTHOR_CUSTOMER;
            case "MESSAGE_AUTHOR_AGENT": return MESSAGE_AUTHOR_AGENT;
            case "MESSAGE_AUTHOR_SYSTEM": return MESSAGE_AUTHOR_SYSTEM;
            default: return null;
        }
    }
}
