package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InteractionEvent implements Parsable {
    /**
     * The browser property
     */
    private String browser;
    /**
     * The click_x property
     */
    private Integer clickX;
    /**
     * The click_y property
     */
    private Integer clickY;
    /**
     * The device_type property
     */
    private String deviceType;
    /**
     * The element_id property
     */
    private String elementId;
    /**
     * The element_type property
     */
    private String elementType;
    /**
     * The interaction_type property
     */
    private String interactionType;
    /**
     * The page property
     */
    private String page;
    /**
     * The page_url property
     */
    private String pageUrl;
    /**
     * The scroll_depth property
     */
    private Double scrollDepth;
    /**
     * The search_query property
     */
    private String searchQuery;
    /**
     * The session_id property
     */
    private String sessionId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InteractionEvent}
     */
    @jakarta.annotation.Nonnull
    public static InteractionEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InteractionEvent();
    }
    /**
     * Gets the browser property value. The browser property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.browser;
    }
    /**
     * Gets the click_x property value. The click_x property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getClickX() {
        return this.clickX;
    }
    /**
     * Gets the click_y property value. The click_y property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getClickY() {
        return this.clickY;
    }
    /**
     * Gets the device_type property value. The device_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceType() {
        return this.deviceType;
    }
    /**
     * Gets the element_id property value. The element_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getElementId() {
        return this.elementId;
    }
    /**
     * Gets the element_type property value. The element_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getElementType() {
        return this.elementType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("click_x", (n) -> { this.setClickX(n.getIntegerValue()); });
        deserializerMap.put("click_y", (n) -> { this.setClickY(n.getIntegerValue()); });
        deserializerMap.put("device_type", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("element_id", (n) -> { this.setElementId(n.getStringValue()); });
        deserializerMap.put("element_type", (n) -> { this.setElementType(n.getStringValue()); });
        deserializerMap.put("interaction_type", (n) -> { this.setInteractionType(n.getStringValue()); });
        deserializerMap.put("page", (n) -> { this.setPage(n.getStringValue()); });
        deserializerMap.put("page_url", (n) -> { this.setPageUrl(n.getStringValue()); });
        deserializerMap.put("scroll_depth", (n) -> { this.setScrollDepth(n.getDoubleValue()); });
        deserializerMap.put("search_query", (n) -> { this.setSearchQuery(n.getStringValue()); });
        deserializerMap.put("session_id", (n) -> { this.setSessionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the interaction_type property value. The interaction_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInteractionType() {
        return this.interactionType;
    }
    /**
     * Gets the page property value. The page property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPage() {
        return this.page;
    }
    /**
     * Gets the page_url property value. The page_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPageUrl() {
        return this.pageUrl;
    }
    /**
     * Gets the scroll_depth property value. The scroll_depth property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getScrollDepth() {
        return this.scrollDepth;
    }
    /**
     * Gets the search_query property value. The search_query property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSearchQuery() {
        return this.searchQuery;
    }
    /**
     * Gets the session_id property value. The session_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeIntegerValue("click_x", this.getClickX());
        writer.writeIntegerValue("click_y", this.getClickY());
        writer.writeStringValue("device_type", this.getDeviceType());
        writer.writeStringValue("element_id", this.getElementId());
        writer.writeStringValue("element_type", this.getElementType());
        writer.writeStringValue("interaction_type", this.getInteractionType());
        writer.writeStringValue("page", this.getPage());
        writer.writeStringValue("page_url", this.getPageUrl());
        writer.writeDoubleValue("scroll_depth", this.getScrollDepth());
        writer.writeStringValue("search_query", this.getSearchQuery());
        writer.writeStringValue("session_id", this.getSessionId());
    }
    /**
     * Sets the browser property value. The browser property
     * @param value Value to set for the browser property.
     */
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.browser = value;
    }
    /**
     * Sets the click_x property value. The click_x property
     * @param value Value to set for the click_x property.
     */
    public void setClickX(@jakarta.annotation.Nullable final Integer value) {
        this.clickX = value;
    }
    /**
     * Sets the click_y property value. The click_y property
     * @param value Value to set for the click_y property.
     */
    public void setClickY(@jakarta.annotation.Nullable final Integer value) {
        this.clickY = value;
    }
    /**
     * Sets the device_type property value. The device_type property
     * @param value Value to set for the device_type property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.deviceType = value;
    }
    /**
     * Sets the element_id property value. The element_id property
     * @param value Value to set for the element_id property.
     */
    public void setElementId(@jakarta.annotation.Nullable final String value) {
        this.elementId = value;
    }
    /**
     * Sets the element_type property value. The element_type property
     * @param value Value to set for the element_type property.
     */
    public void setElementType(@jakarta.annotation.Nullable final String value) {
        this.elementType = value;
    }
    /**
     * Sets the interaction_type property value. The interaction_type property
     * @param value Value to set for the interaction_type property.
     */
    public void setInteractionType(@jakarta.annotation.Nullable final String value) {
        this.interactionType = value;
    }
    /**
     * Sets the page property value. The page property
     * @param value Value to set for the page property.
     */
    public void setPage(@jakarta.annotation.Nullable final String value) {
        this.page = value;
    }
    /**
     * Sets the page_url property value. The page_url property
     * @param value Value to set for the page_url property.
     */
    public void setPageUrl(@jakarta.annotation.Nullable final String value) {
        this.pageUrl = value;
    }
    /**
     * Sets the scroll_depth property value. The scroll_depth property
     * @param value Value to set for the scroll_depth property.
     */
    public void setScrollDepth(@jakarta.annotation.Nullable final Double value) {
        this.scrollDepth = value;
    }
    /**
     * Sets the search_query property value. The search_query property
     * @param value Value to set for the search_query property.
     */
    public void setSearchQuery(@jakarta.annotation.Nullable final String value) {
        this.searchQuery = value;
    }
    /**
     * Sets the session_id property value. The session_id property
     * @param value Value to set for the session_id property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
}
