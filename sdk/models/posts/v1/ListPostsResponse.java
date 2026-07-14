package com.rixl.sdk.models.posts.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListPostsResponse implements Parsable {
    /**
     * The posts property
     */
    private java.util.List<Post> posts;
    /**
     * The total property
     */
    private UntypedNode total;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListPostsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListPostsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListPostsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("posts", (n) -> { this.setPosts(n.getCollectionOfObjectValues(Post::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the posts property value. The posts property
     * @return a {@link java.util.List<Post>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Post> getPosts() {
        return this.posts;
    }
    /**
     * Gets the total property value. The total property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("posts", this.getPosts());
        writer.writeObjectValue("total", this.getTotal());
    }
    /**
     * Sets the posts property value. The posts property
     * @param value Value to set for the posts property.
     */
    public void setPosts(@jakarta.annotation.Nullable final java.util.List<Post> value) {
        this.posts = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final UntypedNode value) {
        this.total = value;
    }
}
