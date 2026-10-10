package com.rixl.sdk.models.clientauth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MintClientTokenResponse implements Parsable {
    /**
     * The access_token property
     */
    private String accessToken;
    /**
     * The expires_at property
     */
    private OffsetDateTime expiresAt;
    /**
     * The expires_in property
     */
    private String expiresIn;
    /**
     * The token_type property
     */
    private String tokenType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MintClientTokenResponse}
     */
    @jakarta.annotation.Nonnull
    public static MintClientTokenResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MintClientTokenResponse();
    }
    /**
     * Gets the access_token property value. The access_token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessToken() {
        return this.accessToken;
    }
    /**
     * Gets the expires_at property value. The expires_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * Gets the expires_in property value. The expires_in property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpiresIn() {
        return this.expiresIn;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("access_token", (n) -> { this.setAccessToken(n.getStringValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expires_in", (n) -> { this.setExpiresIn(n.getStringValue()); });
        deserializerMap.put("token_type", (n) -> { this.setTokenType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the token_type property value. The token_type property
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
        writer.writeStringValue("access_token", this.getAccessToken());
        writer.writeOffsetDateTimeValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("expires_in", this.getExpiresIn());
        writer.writeStringValue("token_type", this.getTokenType());
    }
    /**
     * Sets the access_token property value. The access_token property
     * @param value Value to set for the access_token property.
     */
    public void setAccessToken(@jakarta.annotation.Nullable final String value) {
        this.accessToken = value;
    }
    /**
     * Sets the expires_at property value. The expires_at property
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the expires_in property value. The expires_in property
     * @param value Value to set for the expires_in property.
     */
    public void setExpiresIn(@jakarta.annotation.Nullable final String value) {
        this.expiresIn = value;
    }
    /**
     * Sets the token_type property value. The token_type property
     * @param value Value to set for the token_type property.
     */
    public void setTokenType(@jakarta.annotation.Nullable final String value) {
        this.tokenType = value;
    }
}
