package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListOrganizationAuditEventsResponse implements Parsable {
    /**
     * The events property
     */
    private java.util.List<OrganizationAuditEvent> events;
    /**
     * The next_page_token property
     */
    private String nextPageToken;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListOrganizationAuditEventsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListOrganizationAuditEventsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListOrganizationAuditEventsResponse();
    }
    /**
     * Gets the events property value. The events property
     * @return a {@link java.util.List<OrganizationAuditEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationAuditEvent> getEvents() {
        return this.events;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(OrganizationAuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("next_page_token", (n) -> { this.setNextPageToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the next_page_token property value. The next_page_token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNextPageToken() {
        return this.nextPageToken;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeStringValue("next_page_token", this.getNextPageToken());
    }
    /**
     * Sets the events property value. The events property
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<OrganizationAuditEvent> value) {
        this.events = value;
    }
    /**
     * Sets the next_page_token property value. The next_page_token property
     * @param value Value to set for the next_page_token property.
     */
    public void setNextPageToken(@jakarta.annotation.Nullable final String value) {
        this.nextPageToken = value;
    }
}
