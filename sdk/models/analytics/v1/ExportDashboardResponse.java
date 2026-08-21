package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportDashboardResponse implements Parsable {
    /**
     * The content property
     */
    private byte[] content;
    /**
     * The content_type property
     */
    private String contentType;
    /**
     * The filename property
     */
    private String filename;
    /**
     * The row_count property
     */
    private Integer rowCount;
    /**
     * The widget_count property
     */
    private Integer widgetCount;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExportDashboardResponse}
     */
    @jakarta.annotation.Nonnull
    public static ExportDashboardResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportDashboardResponse();
    }
    /**
     * Gets the content property value. The content property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the content_type property value. The content_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("content_type", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("filename", (n) -> { this.setFilename(n.getStringValue()); });
        deserializerMap.put("row_count", (n) -> { this.setRowCount(n.getIntegerValue()); });
        deserializerMap.put("widget_count", (n) -> { this.setWidgetCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filename property value. The filename property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilename() {
        return this.filename;
    }
    /**
     * Gets the row_count property value. The row_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRowCount() {
        return this.rowCount;
    }
    /**
     * Gets the widget_count property value. The widget_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidgetCount() {
        return this.widgetCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("content_type", this.getContentType());
        writer.writeStringValue("filename", this.getFilename());
        writer.writeIntegerValue("row_count", this.getRowCount());
        writer.writeIntegerValue("widget_count", this.getWidgetCount());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the content_type property value. The content_type property
     * @param value Value to set for the content_type property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the filename property value. The filename property
     * @param value Value to set for the filename property.
     */
    public void setFilename(@jakarta.annotation.Nullable final String value) {
        this.filename = value;
    }
    /**
     * Sets the row_count property value. The row_count property
     * @param value Value to set for the row_count property.
     */
    public void setRowCount(@jakarta.annotation.Nullable final Integer value) {
        this.rowCount = value;
    }
    /**
     * Sets the widget_count property value. The widget_count property
     * @param value Value to set for the widget_count property.
     */
    public void setWidgetCount(@jakarta.annotation.Nullable final Integer value) {
        this.widgetCount = value;
    }
}
