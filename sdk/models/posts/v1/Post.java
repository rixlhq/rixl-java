package com.rixl.sdk.models.posts.v1;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.ParseNodeHelper;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Composed type wrapper for classes {@link PostMember1}, {@link PostMember2}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Post implements ComposedTypeWrapper, Parsable {
    /**
     * Composed type representation for type {@link PostMember1}
     */
    private PostMember1 postMember1;
    /**
     * Composed type representation for type {@link PostMember2}
     */
    private PostMember2 postMember2;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Post}
     */
    @jakarta.annotation.Nonnull
    public static Post createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final Post result = new Post();
        result.setPostMember1(new PostMember1());
        result.setPostMember2(new PostMember2());
        return result;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        if (this.getPostMember1() != null || this.getPostMember2() != null) {
            return ParseNodeHelper.mergeDeserializersForIntersectionWrapper(this.getPostMember1(), this.getPostMember2());
        }
        return new HashMap<String, java.util.function.Consumer<ParseNode>>();
    }
    /**
     * Gets the PostMember1 property value. Composed type representation for type {@link PostMember1}
     * @return a {@link PostMember1}
     */
    @jakarta.annotation.Nullable
    public PostMember1 getPostMember1() {
        return this.postMember1;
    }
    /**
     * Gets the PostMember2 property value. Composed type representation for type {@link PostMember2}
     * @return a {@link PostMember2}
     */
    @jakarta.annotation.Nullable
    public PostMember2 getPostMember2() {
        return this.postMember2;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue(null, this.getPostMember1(), this.getPostMember2());
    }
    /**
     * Sets the PostMember1 property value. Composed type representation for type {@link PostMember1}
     * @param value Value to set for the PostMember1 property.
     */
    public void setPostMember1(@jakarta.annotation.Nullable final PostMember1 value) {
        this.postMember1 = value;
    }
    /**
     * Sets the PostMember2 property value. Composed type representation for type {@link PostMember2}
     * @param value Value to set for the PostMember2 property.
     */
    public void setPostMember2(@jakarta.annotation.Nullable final PostMember2 value) {
        this.postMember2 = value;
    }
}
