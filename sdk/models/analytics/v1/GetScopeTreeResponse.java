package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetScopeTreeResponse implements Parsable {
    /**
     * The level property
     */
    private String level;
    /**
     * The nodes property
     */
    private java.util.List<ScopeNode> nodes;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetScopeTreeResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetScopeTreeResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetScopeTreeResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("level", (n) -> { this.setLevel(n.getStringValue()); });
        deserializerMap.put("nodes", (n) -> { this.setNodes(n.getCollectionOfObjectValues(ScopeNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the level property value. The level property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLevel() {
        return this.level;
    }
    /**
     * Gets the nodes property value. The nodes property
     * @return a {@link java.util.List<ScopeNode>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ScopeNode> getNodes() {
        return this.nodes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("level", this.getLevel());
        writer.writeCollectionOfObjectValues("nodes", this.getNodes());
    }
    /**
     * Sets the level property value. The level property
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final String value) {
        this.level = value;
    }
    /**
     * Sets the nodes property value. The nodes property
     * @param value Value to set for the nodes property.
     */
    public void setNodes(@jakarta.annotation.Nullable final java.util.List<ScopeNode> value) {
        this.nodes = value;
    }
}
