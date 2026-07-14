package com.rixl.sdk.models.apikeys.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RotateApiKeyResponse implements Parsable {
    /**
     * The apiKey property
     */
    private ApiKey apiKey;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RotateApiKeyResponse}
     */
    @jakarta.annotation.Nonnull
    public static RotateApiKeyResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RotateApiKeyResponse();
    }
    /**
     * Gets the apiKey property value. The apiKey property
     * @return a {@link ApiKey}
     */
    @jakarta.annotation.Nullable
    public ApiKey getApiKey() {
        return this.apiKey;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("apiKey", (n) -> { this.setApiKey(n.getObjectValue(ApiKey::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("apiKey", this.getApiKey());
    }
    /**
     * Sets the apiKey property value. The apiKey property
     * @param value Value to set for the apiKey property.
     */
    public void setApiKey(@jakarta.annotation.Nullable final ApiKey value) {
        this.apiKey = value;
    }
}
