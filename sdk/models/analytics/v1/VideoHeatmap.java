package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoHeatmap implements Parsable {
    /**
     * The data property
     */
    private java.util.List<Double> data;
    /**
     * The totalDurationMs property
     */
    private UntypedNode totalDurationMs;
    /**
     * The videoId property
     */
    private String videoId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoHeatmap}
     */
    @jakarta.annotation.Nonnull
    public static VideoHeatmap createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoHeatmap();
    }
    /**
     * Gets the data property value. The data property
     * @return a {@link java.util.List<Double>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Double> getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("data", (n) -> { this.setData(n.getCollectionOfPrimitiveValues(Double.class)); });
        deserializerMap.put("totalDurationMs", (n) -> { this.setTotalDurationMs(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("videoId", (n) -> { this.setVideoId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalDurationMs property value. The totalDurationMs property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTotalDurationMs() {
        return this.totalDurationMs;
    }
    /**
     * Gets the videoId property value. The videoId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("data", this.getData());
        writer.writeObjectValue("totalDurationMs", this.getTotalDurationMs());
        writer.writeStringValue("videoId", this.getVideoId());
    }
    /**
     * Sets the data property value. The data property
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final java.util.List<Double> value) {
        this.data = value;
    }
    /**
     * Sets the totalDurationMs property value. The totalDurationMs property
     * @param value Value to set for the totalDurationMs property.
     */
    public void setTotalDurationMs(@jakarta.annotation.Nullable final UntypedNode value) {
        this.totalDurationMs = value;
    }
    /**
     * Sets the videoId property value. The videoId property
     * @param value Value to set for the videoId property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
}
