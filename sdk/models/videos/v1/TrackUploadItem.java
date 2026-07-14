package com.rixl.sdk.models.videos.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrackUploadItem implements Parsable {
    /**
     * The fileName property
     */
    private String fileName;
    /**
     * The format property
     */
    private String format;
    /**
     * The label property
     */
    private String label;
    /**
     * The languageCode property
     */
    private String languageCode;
    /**
     * The size property
     */
    private UntypedNode size;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrackUploadItem}
     */
    @jakarta.annotation.Nonnull
    public static TrackUploadItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrackUploadItem();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("languageCode", (n) -> { this.setLanguageCode(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the format property value. The format property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.format;
    }
    /**
     * Gets the label property value. The label property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the languageCode property value. The languageCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageCode() {
        return this.languageCode;
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
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("format", this.getFormat());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("languageCode", this.getLanguageCode());
        writer.writeObjectValue("size", this.getSize());
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the format property value. The format property
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.format = value;
    }
    /**
     * Sets the label property value. The label property
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the languageCode property value. The languageCode property
     * @param value Value to set for the languageCode property.
     */
    public void setLanguageCode(@jakarta.annotation.Nullable final String value) {
        this.languageCode = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final UntypedNode value) {
        this.size = value;
    }
}
