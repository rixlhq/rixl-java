package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetScopeTreeRequestResourceType implements ValuedEnum {
    Video("video"),
    Image("image"),
    Post("post"),
    Feed("feed");
    public final String value;
    GetScopeTreeRequestResourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetScopeTreeRequestResourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "video": return Video;
            case "image": return Image;
            case "post": return Post;
            case "feed": return Feed;
            default: return null;
        }
    }
}
