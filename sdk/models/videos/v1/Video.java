package com.rixl.sdk.models.videos.v1;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.File;
import com.rixl.sdk.models.common.v1.Visibility;
import com.rixl.sdk.models.images.v1.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Video implements Parsable {
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
    private PeriodAndDuration duration;
    /**
     * The file property
     */
    private File file;
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
     * The poster property
     */
    private Image poster;
    /**
     * The visibility property
     */
    private Visibility visibility;
    /**
     * The width property
     */
    private Integer width;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Video}
     */
    @jakarta.annotation.Nonnull
    public static Video createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Video();
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
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.duration;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("bitrate", (n) -> { this.setBitrate(n.getIntegerValue()); });
        deserializerMap.put("codec", (n) -> { this.setCodec(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getObjectValue(File::createFromDiscriminatorValue)); });
        deserializerMap.put("framerate", (n) -> { this.setFramerate(n.getStringValue()); });
        deserializerMap.put("hdr", (n) -> { this.setHdr(n.getBooleanValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("poster", (n) -> { this.setPoster(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumValue(Visibility::forValue)); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. The file property
     * @return a {@link File}
     */
    @jakarta.annotation.Nullable
    public File getFile() {
        return this.file;
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
     * Gets the poster property value. The poster property
     * @return a {@link Image}
     */
    @jakarta.annotation.Nullable
    public Image getPoster() {
        return this.poster;
    }
    /**
     * Gets the visibility property value. The visibility property
     * @return a {@link Visibility}
     */
    @jakarta.annotation.Nullable
    public Visibility getVisibility() {
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
        writer.writePeriodAndDurationValue("duration", this.getDuration());
        writer.writeObjectValue("file", this.getFile());
        writer.writeStringValue("framerate", this.getFramerate());
        writer.writeBooleanValue("hdr", this.getHdr());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("poster", this.getPoster());
        writer.writeEnumValue("visibility", this.getVisibility());
        writer.writeIntegerValue("width", this.getWidth());
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
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.duration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the file property value. The file property
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final File value) {
        this.file = value;
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
     * Sets the poster property value. The poster property
     * @param value Value to set for the poster property.
     */
    public void setPoster(@jakarta.annotation.Nullable final Image value) {
        this.poster = value;
    }
    /**
     * Sets the visibility property value. The visibility property
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final Visibility value) {
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
