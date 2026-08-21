package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * WidgetPosition is expressed in grid units, never pixels.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WidgetPosition implements Parsable {
    /**
     * The height property
     */
    private Integer height;
    /**
     * The pos_x property
     */
    private Integer posX;
    /**
     * The pos_y property
     */
    private Integer posY;
    /**
     * The sort_order property
     */
    private Integer sortOrder;
    /**
     * The widget_id property
     */
    private String widgetId;
    /**
     * The width property
     */
    private Integer width;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WidgetPosition}
     */
    @jakarta.annotation.Nonnull
    public static WidgetPosition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WidgetPosition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("pos_x", (n) -> { this.setPosX(n.getIntegerValue()); });
        deserializerMap.put("pos_y", (n) -> { this.setPosY(n.getIntegerValue()); });
        deserializerMap.put("sort_order", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        deserializerMap.put("widget_id", (n) -> { this.setWidgetId(n.getStringValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the height property value. The height property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
    }
    /**
     * Gets the pos_x property value. The pos_x property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPosX() {
        return this.posX;
    }
    /**
     * Gets the pos_y property value. The pos_y property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPosY() {
        return this.posY;
    }
    /**
     * Gets the sort_order property value. The sort_order property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Gets the widget_id property value. The widget_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWidgetId() {
        return this.widgetId;
    }
    /**
     * Gets the width property value. The width property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeIntegerValue("pos_x", this.getPosX());
        writer.writeIntegerValue("pos_y", this.getPosY());
        writer.writeIntegerValue("sort_order", this.getSortOrder());
        writer.writeStringValue("widget_id", this.getWidgetId());
        writer.writeIntegerValue("width", this.getWidth());
    }
    /**
     * Sets the height property value. The height property
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the pos_x property value. The pos_x property
     * @param value Value to set for the pos_x property.
     */
    public void setPosX(@jakarta.annotation.Nullable final Integer value) {
        this.posX = value;
    }
    /**
     * Sets the pos_y property value. The pos_y property
     * @param value Value to set for the pos_y property.
     */
    public void setPosY(@jakarta.annotation.Nullable final Integer value) {
        this.posY = value;
    }
    /**
     * Sets the sort_order property value. The sort_order property
     * @param value Value to set for the sort_order property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.sortOrder = value;
    }
    /**
     * Sets the widget_id property value. The widget_id property
     * @param value Value to set for the widget_id property.
     */
    public void setWidgetId(@jakarta.annotation.Nullable final String value) {
        this.widgetId = value;
    }
    /**
     * Sets the width property value. The width property
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}
