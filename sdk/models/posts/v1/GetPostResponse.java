package com.rixl.sdk.models.posts.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetPostResponse implements Parsable {
    /**
     * The post property
     */
    private Post post;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetPostResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetPostResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetPostResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("post", (n) -> { this.setPost(n.getObjectValue(Post::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the post property value. The post property
     * @return a {@link Post}
     */
    @jakarta.annotation.Nullable
    public Post getPost() {
        return this.post;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("post", this.getPost());
    }
    /**
     * Sets the post property value. The post property
     * @param value Value to set for the post property.
     */
    public void setPost(@jakarta.annotation.Nullable final Post value) {
        this.post = value;
    }
}
