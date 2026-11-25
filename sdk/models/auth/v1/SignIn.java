package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignIn implements Parsable {
    /**
     * auth_method is how the sign-in was started: &quot;password&quot;, &quot;passkey&quot;, &quot;passkey_2fa&quot;, &quot;totp&quot;, or &quot;provider:&lt;name&gt;&quot;.
     */
    private String authMethod;
    /**
     * The country property
     */
    private String country;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime createdAt;
    /**
     * current marks the sign-in of the access token making the request.
     */
    private Boolean current;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime expiresAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The ip property
     */
    private String ip;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime lastUsedAt;
    /**
     * The user_agent property
     */
    private String userAgent;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SignIn}
     */
    @jakarta.annotation.Nonnull
    public static SignIn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignIn();
    }
    /**
     * Gets the auth_method property value. auth_method is how the sign-in was started: &quot;password&quot;, &quot;passkey&quot;, &quot;passkey_2fa&quot;, &quot;totp&quot;, or &quot;provider:&lt;name&gt;&quot;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthMethod() {
        return this.authMethod;
    }
    /**
     * Gets the country property value. The country property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the created_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the current property value. current marks the sign-in of the access token making the request.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCurrent() {
        return this.current;
    }
    /**
     * Gets the expires_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("auth_method", (n) -> { this.setAuthMethod(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("current", (n) -> { this.setCurrent(n.getBooleanValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("ip", (n) -> { this.setIp(n.getStringValue()); });
        deserializerMap.put("last_used_at", (n) -> { this.setLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("user_agent", (n) -> { this.setUserAgent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the ip property value. The ip property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIp() {
        return this.ip;
    }
    /**
     * Gets the last_used_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedAt() {
        return this.lastUsedAt;
    }
    /**
     * Gets the user_agent property value. The user_agent property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserAgent() {
        return this.userAgent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("auth_method", this.getAuthMethod());
        writer.writeStringValue("country", this.getCountry());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeBooleanValue("current", this.getCurrent());
        writer.writeOffsetDateTimeValue("expires_at", this.getExpiresAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("ip", this.getIp());
        writer.writeOffsetDateTimeValue("last_used_at", this.getLastUsedAt());
        writer.writeStringValue("user_agent", this.getUserAgent());
    }
    /**
     * Sets the auth_method property value. auth_method is how the sign-in was started: &quot;password&quot;, &quot;passkey&quot;, &quot;passkey_2fa&quot;, &quot;totp&quot;, or &quot;provider:&lt;name&gt;&quot;.
     * @param value Value to set for the auth_method property.
     */
    public void setAuthMethod(@jakarta.annotation.Nullable final String value) {
        this.authMethod = value;
    }
    /**
     * Sets the country property value. The country property
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the created_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the current property value. current marks the sign-in of the access token making the request.
     * @param value Value to set for the current property.
     */
    public void setCurrent(@jakarta.annotation.Nullable final Boolean value) {
        this.current = value;
    }
    /**
     * Sets the expires_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the ip property value. The ip property
     * @param value Value to set for the ip property.
     */
    public void setIp(@jakarta.annotation.Nullable final String value) {
        this.ip = value;
    }
    /**
     * Sets the last_used_at property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the last_used_at property.
     */
    public void setLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUsedAt = value;
    }
    /**
     * Sets the user_agent property value. The user_agent property
     * @param value Value to set for the user_agent property.
     */
    public void setUserAgent(@jakarta.annotation.Nullable final String value) {
        this.userAgent = value;
    }
}
