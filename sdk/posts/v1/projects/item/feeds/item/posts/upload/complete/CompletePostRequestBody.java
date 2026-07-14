package com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.upload.complete;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompletePostRequestBody implements Parsable {
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * The postId property
     */
    private String postId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CompletePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static CompletePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompletePostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("postId", (n) -> { this.setPostId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the orgId property value. The orgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the postId property value. The postId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostId() {
        return this.postId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeStringValue("postId", this.getPostId());
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the postId property value. The postId property
     * @param value Value to set for the postId property.
     */
    public void setPostId(@jakarta.annotation.Nullable final String value) {
        this.postId = value;
    }
}
