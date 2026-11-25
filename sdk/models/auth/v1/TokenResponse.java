package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TokenResponse implements Parsable {
    /**
     * The access_token property
     */
    private String accessToken;
    /**
     * The domain_join_suggestions property
     */
    private java.util.List<Organization> domainJoinSuggestions;
    /**
     * The expires_in property
     */
    private String expiresIn;
    /**
     * The last_active_org_id property
     */
    private String lastActiveOrgId;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The refresh_token property
     */
    private String refreshToken;
    /**
     * The requires_action property
     */
    private String requiresAction;
    /**
     * The role property
     */
    private String role;
    /**
     * The token_type property
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
     * Gets the access_token property value. The access_token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessToken() {
        return this.accessToken;
    }
    /**
     * Gets the domain_join_suggestions property value. The domain_join_suggestions property
     * @return a {@link java.util.List<Organization>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Organization> getDomainJoinSuggestions() {
        return this.domainJoinSuggestions;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("access_token", (n) -> { this.setAccessToken(n.getStringValue()); });
        deserializerMap.put("domain_join_suggestions", (n) -> { this.setDomainJoinSuggestions(n.getCollectionOfObjectValues(Organization::createFromDiscriminatorValue)); });
        deserializerMap.put("expires_in", (n) -> { this.setExpiresIn(n.getStringValue()); });
        deserializerMap.put("last_active_org_id", (n) -> { this.setLastActiveOrgId(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("refresh_token", (n) -> { this.setRefreshToken(n.getStringValue()); });
        deserializerMap.put("requires_action", (n) -> { this.setRequiresAction(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("token_type", (n) -> { this.setTokenType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the last_active_org_id property value. The last_active_org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastActiveOrgId() {
        return this.lastActiveOrgId;
    }
    /**
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the refresh_token property value. The refresh_token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefreshToken() {
        return this.refreshToken;
    }
    /**
     * Gets the requires_action property value. The requires_action property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequiresAction() {
        return this.requiresAction;
    }
    /**
     * Gets the role property value. The role property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.role;
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
        writer.writeCollectionOfObjectValues("domain_join_suggestions", this.getDomainJoinSuggestions());
        writer.writeStringValue("expires_in", this.getExpiresIn());
        writer.writeStringValue("last_active_org_id", this.getLastActiveOrgId());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("refresh_token", this.getRefreshToken());
        writer.writeStringValue("requires_action", this.getRequiresAction());
        writer.writeStringValue("role", this.getRole());
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
     * Sets the domain_join_suggestions property value. The domain_join_suggestions property
     * @param value Value to set for the domain_join_suggestions property.
     */
    public void setDomainJoinSuggestions(@jakarta.annotation.Nullable final java.util.List<Organization> value) {
        this.domainJoinSuggestions = value;
    }
    /**
     * Sets the expires_in property value. The expires_in property
     * @param value Value to set for the expires_in property.
     */
    public void setExpiresIn(@jakarta.annotation.Nullable final String value) {
        this.expiresIn = value;
    }
    /**
     * Sets the last_active_org_id property value. The last_active_org_id property
     * @param value Value to set for the last_active_org_id property.
     */
    public void setLastActiveOrgId(@jakarta.annotation.Nullable final String value) {
        this.lastActiveOrgId = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the refresh_token property value. The refresh_token property
     * @param value Value to set for the refresh_token property.
     */
    public void setRefreshToken(@jakarta.annotation.Nullable final String value) {
        this.refreshToken = value;
    }
    /**
     * Sets the requires_action property value. The requires_action property
     * @param value Value to set for the requires_action property.
     */
    public void setRequiresAction(@jakarta.annotation.Nullable final String value) {
        this.requiresAction = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the token_type property value. The token_type property
     * @param value Value to set for the token_type property.
     */
    public void setTokenType(@jakarta.annotation.Nullable final String value) {
        this.tokenType = value;
    }
}
