package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatMessage implements Parsable {
    /**
     * The author_id property
     */
    private String authorId;
    /**
     * The author_type property
     */
    private MessageAuthor authorType;
    /**
     * The body property
     */
    private String body;
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * The id property
     */
    private String id;
    /**
     * The thread_id property
     */
    private String threadId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChatMessage}
     */
    @jakarta.annotation.Nonnull
    public static ChatMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessage();
    }
    /**
     * Gets the author_id property value. The author_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthorId() {
        return this.authorId;
    }
    /**
     * Gets the author_type property value. The author_type property
     * @return a {@link MessageAuthor}
     */
    @jakarta.annotation.Nullable
    public MessageAuthor getAuthorType() {
        return this.authorType;
    }
    /**
     * Gets the body property value. The body property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBody() {
        return this.body;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("author_id", (n) -> { this.setAuthorId(n.getStringValue()); });
        deserializerMap.put("author_type", (n) -> { this.setAuthorType(n.getEnumValue(MessageAuthor::forValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("thread_id", (n) -> { this.setThreadId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the thread_id property value. The thread_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThreadId() {
        return this.threadId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("author_id", this.getAuthorId());
        writer.writeEnumValue("author_type", this.getAuthorType());
        writer.writeStringValue("body", this.getBody());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("thread_id", this.getThreadId());
    }
    /**
     * Sets the author_id property value. The author_id property
     * @param value Value to set for the author_id property.
     */
    public void setAuthorId(@jakarta.annotation.Nullable final String value) {
        this.authorId = value;
    }
    /**
     * Sets the author_type property value. The author_type property
     * @param value Value to set for the author_type property.
     */
    public void setAuthorType(@jakarta.annotation.Nullable final MessageAuthor value) {
        this.authorType = value;
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final String value) {
        this.body = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the thread_id property value. The thread_id property
     * @param value Value to set for the thread_id property.
     */
    public void setThreadId(@jakarta.annotation.Nullable final String value) {
        this.threadId = value;
    }
}
