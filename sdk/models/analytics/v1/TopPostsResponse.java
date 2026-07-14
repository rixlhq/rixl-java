package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TopPostsResponse implements Parsable {
    /**
     * The posts property
     */
    private java.util.List<PostStats> posts;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TopPostsResponse}
     */
    @jakarta.annotation.Nonnull
    public static TopPostsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TopPostsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("posts", (n) -> { this.setPosts(n.getCollectionOfObjectValues(PostStats::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the posts property value. The posts property
     * @return a {@link java.util.List<PostStats>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PostStats> getPosts() {
        return this.posts;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("posts", this.getPosts());
    }
    /**
     * Sets the posts property value. The posts property
     * @param value Value to set for the posts property.
     */
    public void setPosts(@jakarta.annotation.Nullable final java.util.List<PostStats> value) {
        this.posts = value;
    }
}
