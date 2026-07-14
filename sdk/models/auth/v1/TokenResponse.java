package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TokenResponse implements Parsable {
    /**
     * The accessToken property
     */
    private String accessToken;
    /**
     * The expiresIn property
     */
    private UntypedNode expiresIn;
    /**
     * The refreshToken property
     */
    private String refreshToken;
    /**
     * The requiresAction property
     */
    private String requiresAction;
    /**
     * The tokenType property
     */
    private String tokenType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TokenResponse}
     */
    @jakarta.annotation.Nonnull
    public static TokenResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TokenResponse();
    }
    /**
     * Gets the accessToken property value. The accessToken property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessToken() {
        return this.accessToken;
    }
    /**
     * Gets the expiresIn property value. The expiresIn property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getExpiresIn() {
        return this.expiresIn;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("accessToken", (n) -> { this.setAccessToken(n.getStringValue()); });
        deserializerMap.put("expiresIn", (n) -> { this.setExpiresIn(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("refreshToken", (n) -> { this.setRefreshToken(n.getStringValue()); });
        deserializerMap.put("requiresAction", (n) -> { this.setRequiresAction(n.getStringValue()); });
        deserializerMap.put("tokenType", (n) -> { this.setTokenType(n.getStringValue()); });
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
     * Gets the requiresAction property value. The requiresAction property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequiresAction() {
        return this.requiresAction;
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
        writer.writeStringValue("accessToken", this.getAccessToken());
        writer.writeObjectValue("expiresIn", this.getExpiresIn());
        writer.writeStringValue("refreshToken", this.getRefreshToken());
        writer.writeStringValue("requiresAction", this.getRequiresAction());
        writer.writeStringValue("tokenType", this.getTokenType());
    }
    /**
     * Sets the accessToken property value. The accessToken property
     * @param value Value to set for the accessToken property.
     */
    public void setAccessToken(@jakarta.annotation.Nullable final String value) {
        this.accessToken = value;
    }
    /**
     * Sets the expiresIn property value. The expiresIn property
     * @param value Value to set for the expiresIn property.
     */
    public void setExpiresIn(@jakarta.annotation.Nullable final UntypedNode value) {
        this.expiresIn = value;
    }
    /**
     * Sets the refreshToken property value. The refreshToken property
     * @param value Value to set for the refreshToken property.
     */
    public void setRefreshToken(@jakarta.annotation.Nullable final String value) {
        this.refreshToken = value;
    }
    /**
     * Sets the requiresAction property value. The requiresAction property
     * @param value Value to set for the requiresAction property.
     */
    public void setRequiresAction(@jakarta.annotation.Nullable final String value) {
        this.requiresAction = value;
    }
    /**
     * Sets the tokenType property value. The tokenType property
     * @param value Value to set for the tokenType property.
     */
    public void setTokenType(@jakarta.annotation.Nullable final String value) {
        this.tokenType = value;
    }
}
