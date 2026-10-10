package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateTicketRequest implements Parsable {
    /**
     * The category_id property
     */
    private String categoryId;
    /**
     * The message property
     */
    private String message;
    /**
     * The priority property
     */
    private TicketPriority priority;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * The subject property
     */
    private String subject;
    /**
     * The topic_id property
     */
    private String topicId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateTicketRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateTicketRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateTicketRequest();
    }
    /**
     * Gets the category_id property value. The category_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("category_id", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getEnumValue(TicketPriority::forValue)); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("topic_id", (n) -> { this.setTopicId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link TicketPriority}
     */
    @jakarta.annotation.Nullable
    public TicketPriority getPriority() {
        return this.priority;
    }
    /**
     * Gets the project_id property value. The project_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the topic_id property value. The topic_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTopicId() {
        return this.topicId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category_id", this.getCategoryId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeStringValue("project_id", this.getProjectId());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("topic_id", this.getTopicId());
    }
    /**
     * Sets the category_id property value. The category_id property
     * @param value Value to set for the category_id property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final TicketPriority value) {
        this.priority = value;
    }
    /**
     * Sets the project_id property value. The project_id property
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the topic_id property value. The topic_id property
     * @param value Value to set for the topic_id property.
     */
    public void setTopicId(@jakarta.annotation.Nullable final String value) {
        this.topicId = value;
    }
}
