package com.rixl.sdk.models.videosv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetVideoResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bitrate property
     */
    private Integer bitrate;
    /**
     * The codec property
     */
    private String codec;
    /**
     * The duration property
     */
    private Double duration;
    /**
     * The framerate property
     */
    private String framerate;
    /**
     * The hdr property
     */
    private Boolean hdr;
    /**
     * The height property
     */
    private Integer height;
    /**
     * The id property
     */
    private String id;
    /**
     * The visibility property
     */
    private Integer visibility;
    /**
     * The width property
     */
    private Integer width;
    /**
     * Instantiates a new {@link GetVideoResponse} and sets the default values.
     */
    public GetVideoResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetVideoResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetVideoResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetVideoResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the bitrate property value. The bitrate property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate() {
        return this.bitrate;
    }
    /**
     * Gets the codec property value. The codec property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCodec() {
        return this.codec;
    }
    /**
     * Gets the duration property value. The duration property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getDuration() {
        return this.duration;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("bitrate", (n) -> { this.setBitrate(n.getIntegerValue()); });
        deserializerMap.put("codec", (n) -> { this.setCodec(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getDoubleValue()); });
        deserializerMap.put("framerate", (n) -> { this.setFramerate(n.getStringValue()); });
        deserializerMap.put("hdr", (n) -> { this.setHdr(n.getBooleanValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getIntegerValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the framerate property value. The framerate property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFramerate() {
        return this.framerate;
    }
    /**
     * Gets the hdr property value. The hdr property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHdr() {
        return this.hdr;
    }
    /**
     * Gets the height property value. The height property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the visibility property value. The visibility property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVisibility() {
        return this.visibility;
    }
    /**
     * Gets the width property value. The width property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bitrate", this.getBitrate());
        writer.writeStringValue("codec", this.getCodec());
        writer.writeDoubleValue("duration", this.getDuration());
        writer.writeStringValue("framerate", this.getFramerate());
        writer.writeBooleanValue("hdr", this.getHdr());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("id", this.getId());
        writer.writeIntegerValue("visibility", this.getVisibility());
        writer.writeIntegerValue("width", this.getWidth());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the bitrate property value. The bitrate property
     * @param value Value to set for the bitrate property.
     */
    public void setBitrate(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate = value;
    }
    /**
     * Sets the codec property value. The codec property
     * @param value Value to set for the codec property.
     */
    public void setCodec(@jakarta.annotation.Nullable final String value) {
        this.codec = value;
    }
    /**
     * Sets the duration property value. The duration property
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Double value) {
        this.duration = value;
    }
    /**
     * Sets the framerate property value. The framerate property
     * @param value Value to set for the framerate property.
     */
    public void setFramerate(@jakarta.annotation.Nullable final String value) {
        this.framerate = value;
    }
    /**
     * Sets the hdr property value. The hdr property
     * @param value Value to set for the hdr property.
     */
    public void setHdr(@jakarta.annotation.Nullable final Boolean value) {
        this.hdr = value;
    }
    /**
     * Sets the height property value. The height property
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the visibility property value. The visibility property
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final Integer value) {
        this.visibility = value;
    }
    /**
     * Sets the width property value. The width property
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}
