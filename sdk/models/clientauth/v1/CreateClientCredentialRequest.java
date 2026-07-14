package com.rixl.sdk.models.clientauth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateClientCredentialRequest implements Parsable {
    /**
     * The alg property
     */
    private CreateClientCredentialRequestAlg alg;
    /**
     * The name property
     */
    private String name;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateClientCredentialRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateClientCredentialRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateClientCredentialRequest();
    }
    /**
     * Gets the alg property value. The alg property
     * @return a {@link CreateClientCredentialRequestAlg}
     */
    @jakarta.annotation.Nullable
    public CreateClientCredentialRequestAlg getAlg() {
        return this.alg;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("alg", (n) -> { this.setAlg(n.getEnumValue(CreateClientCredentialRequestAlg::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the orgId property value. The orgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("alg", this.getAlg());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("orgId", this.getOrgId());
    }
    /**
     * Sets the alg property value. The alg property
     * @param value Value to set for the alg property.
     */
    public void setAlg(@jakarta.annotation.Nullable final CreateClientCredentialRequestAlg value) {
        this.alg = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
}
