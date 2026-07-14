package com.rixl.sdk.models.images.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarkImageProcessedRequest implements Parsable {
    /**
     * The fileId property
     */
    private String fileId;
    /**
     * The size property
     */
    private UntypedNode size;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MarkImageProcessedRequest}
     */
    @jakarta.annotation.Nonnull
    public static MarkImageProcessedRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MarkImageProcessedRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("fileId", (n) -> { this.setFileId(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileId property value. The fileId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileId() {
        return this.fileId;
    }
    /**
     * Gets the size property value. The size property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSize() {
        return this.size;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fileId", this.getFileId());
        writer.writeObjectValue("size", this.getSize());
    }
    /**
     * Sets the fileId property value. The fileId property
     * @param value Value to set for the fileId property.
     */
    public void setFileId(@jakarta.annotation.Nullable final String value) {
        this.fileId = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final UntypedNode value) {
        this.size = value;
    }
}
