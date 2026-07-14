package com.rixl.sdk.organizations.item.projects.v1.item.customdomain;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomDomainPutRequestBody implements Parsable {
    /**
     * The customDomain property
     */
    private String customDomain;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomDomainPutRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static CustomDomainPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomDomainPutRequestBody();
    }
    /**
     * Gets the customDomain property value. The customDomain property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomDomain() {
        return this.customDomain;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("customDomain", (n) -> { this.setCustomDomain(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customDomain", this.getCustomDomain());
    }
    /**
     * Sets the customDomain property value. The customDomain property
     * @param value Value to set for the customDomain property.
     */
    public void setCustomDomain(@jakarta.annotation.Nullable final String value) {
        this.customDomain = value;
    }
}
