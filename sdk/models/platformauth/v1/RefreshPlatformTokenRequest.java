package com.rixl.sdk.models.platformauth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RefreshPlatformTokenRequest implements Parsable {
    /**
     * The refreshToken property
     */
    private String refreshToken;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RefreshPlatformTokenRequest}
     */
    @jakarta.annotation.Nonnull
    public static RefreshPlatformTokenRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RefreshPlatformTokenRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("refreshToken", (n) -> { this.setRefreshToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the refreshToken property value. The refreshToken property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefreshToken() {
        return this.refreshToken;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("refreshToken", this.getRefreshToken());
    }
    /**
     * Sets the refreshToken property value. The refreshToken property
     * @param value Value to set for the refreshToken property.
     */
    public void setRefreshToken(@jakarta.annotation.Nullable final String value) {
        this.refreshToken = value;
    }
}
