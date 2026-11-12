package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * At most one of `session_start`, `content_view`, `engagement`, `interaction`, `error` may be set.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyticsEvent implements Parsable {
    /**
     * The content_view property
     */
    private ContentViewEvent contentView;
    /**
     * The engagement property
     */
    private EngagementEvent engagement;
    /**
     * The error property
     */
    private ErrorEvent error;
    /**
     * The interaction property
     */
    private InteractionEvent interaction;
    /**
     * The session_start property
     */
    private SessionStartEvent sessionStart;
    /**
     * A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     */
    private OffsetDateTime timestamp;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyticsEvent}
     */
    @jakarta.annotation.Nonnull
    public static AnalyticsEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyticsEvent();
    }
    /**
     * Gets the content_view property value. The content_view property
     * @return a {@link ContentViewEvent}
     */
    @jakarta.annotation.Nullable
    public ContentViewEvent getContentView() {
        return this.contentView;
    }
    /**
     * Gets the engagement property value. The engagement property
     * @return a {@link EngagementEvent}
     */
    @jakarta.annotation.Nullable
    public EngagementEvent getEngagement() {
        return this.engagement;
    }
    /**
     * Gets the error property value. The error property
     * @return a {@link ErrorEvent}
     */
    @jakarta.annotation.Nullable
    public ErrorEvent getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("content_view", (n) -> { this.setContentView(n.getObjectValue(ContentViewEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("engagement", (n) -> { this.setEngagement(n.getObjectValue(EngagementEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(ErrorEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("interaction", (n) -> { this.setInteraction(n.getObjectValue(InteractionEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("session_start", (n) -> { this.setSessionStart(n.getObjectValue(SessionStartEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the interaction property value. The interaction property
     * @return a {@link InteractionEvent}
     */
    @jakarta.annotation.Nullable
    public InteractionEvent getInteraction() {
        return this.interaction;
    }
    /**
     * Gets the session_start property value. The session_start property
     * @return a {@link SessionStartEvent}
     */
    @jakarta.annotation.Nullable
    public SessionStartEvent getSessionStart() {
        return this.sessionStart;
    }
    /**
     * Gets the timestamp property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("content_view", this.getContentView());
        writer.writeObjectValue("engagement", this.getEngagement());
        writer.writeObjectValue("error", this.getError());
        writer.writeObjectValue("interaction", this.getInteraction());
        writer.writeObjectValue("session_start", this.getSessionStart());
        writer.writeOffsetDateTimeValue("timestamp", this.getTimestamp());
    }
    /**
     * Sets the content_view property value. The content_view property
     * @param value Value to set for the content_view property.
     */
    public void setContentView(@jakarta.annotation.Nullable final ContentViewEvent value) {
        this.contentView = value;
    }
    /**
     * Sets the engagement property value. The engagement property
     * @param value Value to set for the engagement property.
     */
    public void setEngagement(@jakarta.annotation.Nullable final EngagementEvent value) {
        this.engagement = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final ErrorEvent value) {
        this.error = value;
    }
    /**
     * Sets the interaction property value. The interaction property
     * @param value Value to set for the interaction property.
     */
    public void setInteraction(@jakarta.annotation.Nullable final InteractionEvent value) {
        this.interaction = value;
    }
    /**
     * Sets the session_start property value. The session_start property
     * @param value Value to set for the session_start property.
     */
    public void setSessionStart(@jakarta.annotation.Nullable final SessionStartEvent value) {
        this.sessionStart = value;
    }
    /**
     * Sets the timestamp property value. A point in time in RFC 3339 format, with up to nanosecond precision. Output uses UTC (`Z`); input may use an offset from UTC.
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timestamp = value;
    }
}
