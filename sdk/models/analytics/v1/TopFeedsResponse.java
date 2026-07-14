package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TopFeedsResponse implements Parsable {
    /**
     * The feeds property
     */
    private java.util.List<FeedStats> feeds;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TopFeedsResponse}
     */
    @jakarta.annotation.Nonnull
    public static TopFeedsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TopFeedsResponse();
    }
    /**
     * Gets the feeds property value. The feeds property
     * @return a {@link java.util.List<FeedStats>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeedStats> getFeeds() {
        return this.feeds;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("feeds", (n) -> { this.setFeeds(n.getCollectionOfObjectValues(FeedStats::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("feeds", this.getFeeds());
    }
    /**
     * Sets the feeds property value. The feeds property
     * @param value Value to set for the feeds property.
     */
    public void setFeeds(@jakarta.annotation.Nullable final java.util.List<FeedStats> value) {
        this.feeds = value;
    }
}
