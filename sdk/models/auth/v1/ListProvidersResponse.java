package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListProvidersResponse implements Parsable {
    /**
     * The providers property
     */
    private java.util.List<ConnectedProvider> providers;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListProvidersResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListProvidersResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListProvidersResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("providers", (n) -> { this.setProviders(n.getCollectionOfObjectValues(ConnectedProvider::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the providers property value. The providers property
     * @return a {@link java.util.List<ConnectedProvider>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectedProvider> getProviders() {
        return this.providers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("providers", this.getProviders());
    }
    /**
     * Sets the providers property value. The providers property
     * @param value Value to set for the providers property.
     */
    public void setProviders(@jakarta.annotation.Nullable final java.util.List<ConnectedProvider> value) {
        this.providers = value;
    }
}
