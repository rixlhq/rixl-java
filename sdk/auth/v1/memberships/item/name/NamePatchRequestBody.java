package com.rixl.sdk.auth.v1.memberships.item.name;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NamePatchRequestBody implements Parsable {
    /**
     * The full_name property
     */
    private String fullName;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NamePatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static NamePatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NamePatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("full_name", (n) -> { this.setFullName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the full_name property value. The full_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFullName() {
        return this.fullName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("full_name", this.getFullName());
    }
    /**
     * Sets the full_name property value. The full_name property
     * @param value Value to set for the full_name property.
     */
    public void setFullName(@jakarta.annotation.Nullable final String value) {
        this.fullName = value;
    }
}
