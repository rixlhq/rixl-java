package com.rixl.sdk.models.webhooks.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateEndpointResponse implements Parsable {
    /**
     * The endpoint property
     */
    private WebhookEndpoint endpoint;
    /**
     * Signing secret in whsec_&lt;base64&gt; form. Returned only here.
     */
    private String secret;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateEndpointResponse}
     */
    @jakarta.annotation.Nonnull
    public static CreateEndpointResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateEndpointResponse();
    }
    /**
     * Gets the endpoint property value. The endpoint property
     * @return a {@link WebhookEndpoint}
     */
    @jakarta.annotation.Nullable
    public WebhookEndpoint getEndpoint() {
        return this.endpoint;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("endpoint", (n) -> { this.setEndpoint(n.getObjectValue(WebhookEndpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("secret", (n) -> { this.setSecret(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the secret property value. Signing secret in whsec_&lt;base64&gt; form. Returned only here.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecret() {
        return this.secret;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endpoint", this.getEndpoint());
        writer.writeStringValue("secret", this.getSecret());
    }
    /**
     * Sets the endpoint property value. The endpoint property
     * @param value Value to set for the endpoint property.
     */
    public void setEndpoint(@jakarta.annotation.Nullable final WebhookEndpoint value) {
        this.endpoint = value;
    }
    /**
     * Sets the secret property value. Signing secret in whsec_&lt;base64&gt; form. Returned only here.
     * @param value Value to set for the secret property.
     */
    public void setSecret(@jakarta.annotation.Nullable final String value) {
        this.secret = value;
    }
}
