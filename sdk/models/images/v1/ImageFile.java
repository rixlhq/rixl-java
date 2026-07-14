package com.rixl.sdk.models.images.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import com.rixl.sdk.models.common.v1.FileStatus;
import com.rixl.sdk.models.common.v1.ImageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImageFile implements Parsable {
    /**
     * The format property
     */
    private ImageFormat format;
    /**
     * The id property
     */
    private String id;
    /**
     * The name property
     */
    private String name;
    /**
     * The projectId property
     */
    private String projectId;
    /**
     * The size property
     */
    private UntypedNode size;
    /**
     * The status property
     */
    private FileStatus status;
    /**
     * The url property
     */
    private String url;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImageFile}
     */
    @jakarta.annotation.Nonnull
    public static ImageFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageFile();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("format", (n) -> { this.setFormat(n.getEnumValue(ImageFormat::forValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("projectId", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FileStatus::forValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The format property
     * @return a {@link ImageFormat}
     */
    @jakarta.annotation.Nullable
    public ImageFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the projectId property value. The projectId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
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
     * Gets the status property value. The status property
     * @return a {@link FileStatus}
     */
    @jakarta.annotation.Nullable
    public FileStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the url property value. The url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("format", this.getFormat());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("projectId", this.getProjectId());
        writer.writeObjectValue("size", this.getSize());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the format property value. The format property
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final ImageFormat value) {
        this.format = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the projectId property value. The projectId property
     * @param value Value to set for the projectId property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final UntypedNode value) {
        this.size = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FileStatus value) {
        this.status = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
