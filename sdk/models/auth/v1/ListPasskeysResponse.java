package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListPasskeysResponse implements Parsable {
    /**
     * The passkeys property
     */
    private java.util.List<Passkey> passkeys;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListPasskeysResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListPasskeysResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListPasskeysResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("passkeys", (n) -> { this.setPasskeys(n.getCollectionOfObjectValues(Passkey::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the passkeys property value. The passkeys property
     * @return a {@link java.util.List<Passkey>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Passkey> getPasskeys() {
        return this.passkeys;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("passkeys", this.getPasskeys());
    }
    /**
     * Sets the passkeys property value. The passkeys property
     * @param value Value to set for the passkeys property.
     */
    public void setPasskeys(@jakarta.annotation.Nullable final java.util.List<Passkey> value) {
        this.passkeys = value;
    }
}
