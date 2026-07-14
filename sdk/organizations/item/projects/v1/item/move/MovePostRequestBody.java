package com.rixl.sdk.organizations.item.projects.v1.item.move;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MovePostRequestBody implements Parsable {
    /**
     * The targetOrganizationId property
     */
    private String targetOrganizationId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MovePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static MovePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MovePostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("targetOrganizationId", (n) -> { this.setTargetOrganizationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetOrganizationId property value. The targetOrganizationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetOrganizationId() {
        return this.targetOrganizationId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("targetOrganizationId", this.getTargetOrganizationId());
    }
    /**
     * Sets the targetOrganizationId property value. The targetOrganizationId property
     * @param value Value to set for the targetOrganizationId property.
     */
    public void setTargetOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.targetOrganizationId = value;
    }
}
