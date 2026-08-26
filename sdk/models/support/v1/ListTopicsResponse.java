package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListTopicsResponse implements Parsable {
    /**
     * The topics property
     */
    private java.util.List<Topic> topics;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListTopicsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListTopicsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListTopicsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("topics", (n) -> { this.setTopics(n.getCollectionOfObjectValues(Topic::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the topics property value. The topics property
     * @return a {@link java.util.List<Topic>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Topic> getTopics() {
        return this.topics;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("topics", this.getTopics());
    }
    /**
     * Sets the topics property value. The topics property
     * @param value Value to set for the topics property.
     */
    public void setTopics(@jakarta.annotation.Nullable final java.util.List<Topic> value) {
        this.topics = value;
    }
}
