package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FunnelStep implements Parsable {
    /**
     * The eventType property
     */
    private String eventType;
    /**
     * The filters property
     */
    private FunnelStepFilters filters;
    /**
     * The name property
     */
    private String name;
    /**
     * The pageType property
     */
    private String pageType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FunnelStep}
     */
    @jakarta.annotation.Nonnull
    public static FunnelStep createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FunnelStep();
    }
    /**
     * Gets the eventType property value. The eventType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventType() {
        return this.eventType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getObjectValue(FunnelStepFilters::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("pageType", (n) -> { this.setPageType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filters property value. The filters property
     * @return a {@link FunnelStepFilters}
     */
    @jakarta.annotation.Nullable
    public FunnelStepFilters getFilters() {
        return this.filters;
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
     * Gets the pageType property value. The pageType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPageType() {
        return this.pageType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("eventType", this.getEventType());
        writer.writeObjectValue("filters", this.getFilters());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("pageType", this.getPageType());
    }
    /**
     * Sets the eventType property value. The eventType property
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final String value) {
        this.eventType = value;
    }
    /**
     * Sets the filters property value. The filters property
     * @param value Value to set for the filters property.
     */
    public void setFilters(@jakarta.annotation.Nullable final FunnelStepFilters value) {
        this.filters = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the pageType property value. The pageType property
     * @param value Value to set for the pageType property.
     */
    public void setPageType(@jakarta.annotation.Nullable final String value) {
        this.pageType = value;
    }
}
