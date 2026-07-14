package com.rixl.sdk.models.videos.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListAudioTracksResponse implements Parsable {
    /**
     * The audioTracks property
     */
    private java.util.List<AudioTrack> audioTracks;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListAudioTracksResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListAudioTracksResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListAudioTracksResponse();
    }
    /**
     * Gets the audioTracks property value. The audioTracks property
     * @return a {@link java.util.List<AudioTrack>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AudioTrack> getAudioTracks() {
        return this.audioTracks;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("audioTracks", (n) -> { this.setAudioTracks(n.getCollectionOfObjectValues(AudioTrack::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("audioTracks", this.getAudioTracks());
    }
    /**
     * Sets the audioTracks property value. The audioTracks property
     * @param value Value to set for the audioTracks property.
     */
    public void setAudioTracks(@jakarta.annotation.Nullable final java.util.List<AudioTrack> value) {
        this.audioTracks = value;
    }
}
