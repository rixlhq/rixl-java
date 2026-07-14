package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RefreshTokenRequest implements Parsable {
    /**
     * The countryCode property
     */
    private String countryCode;
    /**
     * The origin property
     */
    private String origin;
    /**
     * The refreshToken property
     */
    private String refreshToken;
    /**
     * The tokenType property
     */
    private String tokenType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RefreshTokenRequest}
     */
    @jakarta.annotation.Nonnull
    public static RefreshTokenRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RefreshTokenRequest();
    }
    /**
     * Gets the countryCode property value. The countryCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getStringValue()); });
        deserializerMap.put("refreshToken", (n) -> { this.setRefreshToken(n.getStringValue()); });
        deserializerMap.put("tokenType", (n) -> { this.setTokenType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the origin property value. The origin property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrigin() {
        return this.origin;
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
     * Gets the tokenType property value. The tokenType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTokenType() {
        return this.tokenType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeStringValue("refreshToken", this.getRefreshToken());
        writer.writeStringValue("tokenType", this.getTokenType());
    }
    /**
     * Sets the countryCode property value. The countryCode property
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the origin property value. The origin property
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final String value) {
        this.origin = value;
    }
    /**
     * Sets the refreshToken property value. The refreshToken property
     * @param value Value to set for the refreshToken property.
     */
    public void setRefreshToken(@jakarta.annotation.Nullable final String value) {
        this.refreshToken = value;
    }
    /**
     * Sets the tokenType property value. The tokenType property
     * @param value Value to set for the tokenType property.
     */
    public void setTokenType(@jakarta.annotation.Nullable final String value) {
        this.tokenType = value;
    }
}
