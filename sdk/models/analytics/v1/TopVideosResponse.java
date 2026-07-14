package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TopVideosResponse implements Parsable {
    /**
     * The videos property
     */
    private java.util.List<VideoStats> videos;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TopVideosResponse}
     */
    @jakarta.annotation.Nonnull
    public static TopVideosResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TopVideosResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("videos", (n) -> { this.setVideos(n.getCollectionOfObjectValues(VideoStats::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the videos property value. The videos property
     * @return a {@link java.util.List<VideoStats>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VideoStats> getVideos() {
        return this.videos;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("videos", this.getVideos());
    }
    /**
     * Sets the videos property value. The videos property
     * @param value Value to set for the videos property.
     */
    public void setVideos(@jakarta.annotation.Nullable final java.util.List<VideoStats> value) {
        this.videos = value;
    }
}
