package com.rixl.sdk.webhooks.v1.projects.item.endpoints;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EndpointsPostRequestBody implements Parsable {
    /**
     * The event_types property
     */
    private java.util.List<EndpointsPostRequestBodyEventTypes> eventTypes;
    /**
     * The url property
     */
    private String url;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EndpointsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static EndpointsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndpointsPostRequestBody();
    }
    /**
     * Gets the event_types property value. The event_types property
     * @return a {@link java.util.List<EndpointsPostRequestBodyEventTypes>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EndpointsPostRequestBodyEventTypes> getEventTypes() {
        return this.eventTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("event_types", (n) -> { this.setEventTypes(n.getCollectionOfEnumValues(EndpointsPostRequestBodyEventTypes::forValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeCollectionOfEnumValues("event_types", this.getEventTypes());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the event_types property value. The event_types property
     * @param value Value to set for the event_types property.
     */
    public void setEventTypes(@jakarta.annotation.Nullable final java.util.List<EndpointsPostRequestBodyEventTypes> value) {
        this.eventTypes = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
