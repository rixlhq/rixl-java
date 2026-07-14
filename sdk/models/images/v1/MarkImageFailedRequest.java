package com.rixl.sdk.models.images.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarkImageFailedRequest implements Parsable {
    /**
     * The fileId property
     */
    private String fileId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MarkImageFailedRequest}
     */
    @jakarta.annotation.Nonnull
    public static MarkImageFailedRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MarkImageFailedRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("fileId", (n) -> { this.setFileId(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fileId", this.getFileId());
    }
    /**
     * Sets the fileId property value. The fileId property
     * @param value Value to set for the fileId property.
     */
    public void setFileId(@jakarta.annotation.Nullable final String value) {
        this.fileId = value;
    }
}
