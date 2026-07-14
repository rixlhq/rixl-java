package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RealtimeStats implements Parsable {
    /**
     * The activeUsers property
     */
    private UntypedNode activeUsers;
    /**
     * The eventsPerMinute property
     */
    private UntypedNode eventsPerMinute;
    /**
     * The recentEvents property
     */
    private java.util.List<RecentEvent> recentEvents;
    /**
     * The timestamp property
     */
    private String timestamp;
    /**
     * The topCountries property
     */
    private java.util.List<CountryCount> topCountries;
    /**
     * The topEvents property
     */
    private java.util.List<EventCount> topEvents;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RealtimeStats}
     */
    @jakarta.annotation.Nonnull
    public static RealtimeStats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RealtimeStats();
    }
    /**
     * Gets the activeUsers property value. The activeUsers property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getActiveUsers() {
        return this.activeUsers;
    }
    /**
     * Gets the eventsPerMinute property value. The eventsPerMinute property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getEventsPerMinute() {
        return this.eventsPerMinute;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("activeUsers", (n) -> { this.setActiveUsers(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("eventsPerMinute", (n) -> { this.setEventsPerMinute(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("recentEvents", (n) -> { this.setRecentEvents(n.getCollectionOfObjectValues(RecentEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getStringValue()); });
        deserializerMap.put("topCountries", (n) -> { this.setTopCountries(n.getCollectionOfObjectValues(CountryCount::createFromDiscriminatorValue)); });
        deserializerMap.put("topEvents", (n) -> { this.setTopEvents(n.getCollectionOfObjectValues(EventCount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recentEvents property value. The recentEvents property
     * @return a {@link java.util.List<RecentEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecentEvent> getRecentEvents() {
        return this.recentEvents;
    }
    /**
     * Gets the timestamp property value. The timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the topCountries property value. The topCountries property
     * @return a {@link java.util.List<CountryCount>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CountryCount> getTopCountries() {
        return this.topCountries;
    }
    /**
     * Gets the topEvents property value. The topEvents property
     * @return a {@link java.util.List<EventCount>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EventCount> getTopEvents() {
        return this.topEvents;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("activeUsers", this.getActiveUsers());
        writer.writeObjectValue("eventsPerMinute", this.getEventsPerMinute());
        writer.writeCollectionOfObjectValues("recentEvents", this.getRecentEvents());
        writer.writeStringValue("timestamp", this.getTimestamp());
        writer.writeCollectionOfObjectValues("topCountries", this.getTopCountries());
        writer.writeCollectionOfObjectValues("topEvents", this.getTopEvents());
    }
    /**
     * Sets the activeUsers property value. The activeUsers property
     * @param value Value to set for the activeUsers property.
     */
    public void setActiveUsers(@jakarta.annotation.Nullable final UntypedNode value) {
        this.activeUsers = value;
    }
    /**
     * Sets the eventsPerMinute property value. The eventsPerMinute property
     * @param value Value to set for the eventsPerMinute property.
     */
    public void setEventsPerMinute(@jakarta.annotation.Nullable final UntypedNode value) {
        this.eventsPerMinute = value;
    }
    /**
     * Sets the recentEvents property value. The recentEvents property
     * @param value Value to set for the recentEvents property.
     */
    public void setRecentEvents(@jakarta.annotation.Nullable final java.util.List<RecentEvent> value) {
        this.recentEvents = value;
    }
    /**
     * Sets the timestamp property value. The timestamp property
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final String value) {
        this.timestamp = value;
    }
    /**
     * Sets the topCountries property value. The topCountries property
     * @param value Value to set for the topCountries property.
     */
    public void setTopCountries(@jakarta.annotation.Nullable final java.util.List<CountryCount> value) {
        this.topCountries = value;
    }
    /**
     * Sets the topEvents property value. The topEvents property
     * @param value Value to set for the topEvents property.
     */
    public void setTopEvents(@jakarta.annotation.Nullable final java.util.List<EventCount> value) {
        this.topEvents = value;
    }
}
