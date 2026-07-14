package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoginResponse implements Parsable {
    /**
     * The accessToken property
     */
    private String accessToken;
    /**
     * authentication lists the 2FA methods the user has configured when status is &quot;2fa_required&quot;. The public API renders these as lowercase strings: &quot;passkey&quot;, &quot;totp&quot;.
     */
    private java.util.List<AuthMethod> authentication;
    /**
     * The email property
     */
    private String email;
    /**
     * The expiresIn property
     */
    private UntypedNode expiresIn;
    /**
     * passkey_options is the WebAuthn PublicKeyCredentialRequestOptions as JSON, present only when &quot;passkey&quot; is one of the authentication methods.
     */
    private byte[] passkeyOptions;
    /**
     * The refreshToken property
     */
    private String refreshToken;
    /**
     * The requiresAction property
     */
    private String requiresAction;
    /**
     * The sessionId property
     */
    private String sessionId;
    /**
     * &quot;ok&quot; | &quot;2fa_required&quot; | &quot;email_not_verified&quot;
     */
    private String status;
    /**
     * The tokenType property
     */
    private String tokenType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LoginResponse}
     */
    @jakarta.annotation.Nonnull
    public static LoginResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoginResponse();
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
     * Gets the authentication property value. authentication lists the 2FA methods the user has configured when status is &quot;2fa_required&quot;. The public API renders these as lowercase strings: &quot;passkey&quot;, &quot;totp&quot;.
     * @return a {@link java.util.List<AuthMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthMethod> getAuthentication() {
        return this.authentication;
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("accessToken", (n) -> { this.setAccessToken(n.getStringValue()); });
        deserializerMap.put("authentication", (n) -> { this.setAuthentication(n.getCollectionOfEnumValues(AuthMethod::forValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("expiresIn", (n) -> { this.setExpiresIn(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("passkeyOptions", (n) -> { this.setPasskeyOptions(n.getByteArrayValue()); });
        deserializerMap.put("refreshToken", (n) -> { this.setRefreshToken(n.getStringValue()); });
        deserializerMap.put("requiresAction", (n) -> { this.setRequiresAction(n.getStringValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("tokenType", (n) -> { this.setTokenType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passkeyOptions property value. passkey_options is the WebAuthn PublicKeyCredentialRequestOptions as JSON, present only when &quot;passkey&quot; is one of the authentication methods.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getPasskeyOptions() {
        return this.passkeyOptions;
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
     * Gets the sessionId property value. The sessionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Gets the status property value. &quot;ok&quot; | &quot;2fa_required&quot; | &quot;email_not_verified&quot;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
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
        writer.writeCollectionOfEnumValues("authentication", this.getAuthentication());
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("expiresIn", this.getExpiresIn());
        writer.writeByteArrayValue("passkeyOptions", this.getPasskeyOptions());
        writer.writeStringValue("refreshToken", this.getRefreshToken());
        writer.writeStringValue("requiresAction", this.getRequiresAction());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the authentication property value. authentication lists the 2FA methods the user has configured when status is &quot;2fa_required&quot;. The public API renders these as lowercase strings: &quot;passkey&quot;, &quot;totp&quot;.
     * @param value Value to set for the authentication property.
     */
    public void setAuthentication(@jakarta.annotation.Nullable final java.util.List<AuthMethod> value) {
        this.authentication = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the expiresIn property value. The expiresIn property
     * @param value Value to set for the expiresIn property.
     */
    public void setExpiresIn(@jakarta.annotation.Nullable final UntypedNode value) {
        this.expiresIn = value;
    }
    /**
     * Sets the passkeyOptions property value. passkey_options is the WebAuthn PublicKeyCredentialRequestOptions as JSON, present only when &quot;passkey&quot; is one of the authentication methods.
     * @param value Value to set for the passkeyOptions property.
     */
    public void setPasskeyOptions(@jakarta.annotation.Nullable final byte[] value) {
        this.passkeyOptions = value;
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
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
    /**
     * Sets the status property value. &quot;ok&quot; | &quot;2fa_required&quot; | &quot;email_not_verified&quot;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the tokenType property value. The tokenType property
     * @param value Value to set for the tokenType property.
     */
    public void setTokenType(@jakarta.annotation.Nullable final String value) {
        this.tokenType = value;
    }
}
