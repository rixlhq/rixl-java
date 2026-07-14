package com.rixl.sdk.models.clientauth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MintClientTokenRequest implements Parsable {
    /**
     * The clientId property
     */
    private String clientId;
    /**
     * The clientSecret property
     */
    private String clientSecret;
    /**
     * The projectId property
     */
    private String projectId;
    /**
     * The subject property
     */
    private String subject;
    /**
     * The ttlMinutes property
     */
    private Integer ttlMinutes;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MintClientTokenRequest}
     */
    @jakarta.annotation.Nonnull
    public static MintClientTokenRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MintClientTokenRequest();
    }
    /**
     * Gets the clientId property value. The clientId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Gets the clientSecret property value. The clientSecret property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("clientSecret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("projectId", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("ttlMinutes", (n) -> { this.setTtlMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the projectId property value. The projectId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the ttlMinutes property value. The ttlMinutes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTtlMinutes() {
        return this.ttlMinutes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("projectId", this.getProjectId());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeIntegerValue("ttlMinutes", this.getTtlMinutes());
    }
    /**
     * Sets the clientId property value. The clientId property
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the clientSecret property value. The clientSecret property
     * @param value Value to set for the clientSecret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.clientSecret = value;
    }
    /**
     * Sets the projectId property value. The projectId property
     * @param value Value to set for the projectId property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the ttlMinutes property value. The ttlMinutes property
     * @param value Value to set for the ttlMinutes property.
     */
    public void setTtlMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.ttlMinutes = value;
    }
}
