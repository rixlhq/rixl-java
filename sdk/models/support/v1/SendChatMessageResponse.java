package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendChatMessageResponse implements Parsable {
    /**
     * The message property
     */
    private ChatMessage message;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendChatMessageResponse}
     */
    @jakarta.annotation.Nonnull
    public static SendChatMessageResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendChatMessageResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("message", (n) -> { this.setMessage(n.getObjectValue(ChatMessage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message property
     * @return a {@link ChatMessage}
     */
    @jakarta.annotation.Nullable
    public ChatMessage getMessage() {
        return this.message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("message", this.getMessage());
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final ChatMessage value) {
        this.message = value;
    }
}
