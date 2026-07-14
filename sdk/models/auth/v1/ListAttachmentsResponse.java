package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListAttachmentsResponse implements Parsable {
    /**
     * The attachments property
     */
    private java.util.List<PolicyAttachment> attachments;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListAttachmentsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListAttachmentsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListAttachmentsResponse();
    }
    /**
     * Gets the attachments property value. The attachments property
     * @return a {@link java.util.List<PolicyAttachment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyAttachment> getAttachments() {
        return this.attachments;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(PolicyAttachment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
    }
    /**
     * Sets the attachments property value. The attachments property
     * @param value Value to set for the attachments property.
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<PolicyAttachment> value) {
        this.attachments = value;
    }
}
