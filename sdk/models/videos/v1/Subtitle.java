package com.rixl.sdk.models.videos.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.SubtitleFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Subtitle implements Parsable {
    /**
     * The format property
     */
    private SubtitleFormat format;
    /**
     * The id property
     */
    private String id;
    /**
     * The label property
     */
    private String label;
    /**
     * The language_code property
     */
    private String languageCode;
    /**
     * The video_id property
     */
    private String videoId;
    /**
     * The vtt_path property
     */
    private String vttPath;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Subtitle}
     */
    @jakarta.annotation.Nonnull
    public static Subtitle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Subtitle();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("format", (n) -> { this.setFormat(n.getEnumValue(SubtitleFormat::forValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("language_code", (n) -> { this.setLanguageCode(n.getStringValue()); });
        deserializerMap.put("video_id", (n) -> { this.setVideoId(n.getStringValue()); });
        deserializerMap.put("vtt_path", (n) -> { this.setVttPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The format property
     * @return a {@link SubtitleFormat}
     */
    @jakarta.annotation.Nullable
    public SubtitleFormat getFormat() {
        return this.format;
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
     * Gets the label property value. The label property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the language_code property value. The language_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Gets the video_id property value. The video_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Gets the vtt_path property value. The vtt_path property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVttPath() {
        return this.vttPath;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("format", this.getFormat());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("language_code", this.getLanguageCode());
        writer.writeStringValue("video_id", this.getVideoId());
        writer.writeStringValue("vtt_path", this.getVttPath());
    }
    /**
     * Sets the format property value. The format property
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final SubtitleFormat value) {
        this.format = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the label property value. The label property
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the language_code property value. The language_code property
     * @param value Value to set for the language_code property.
     */
    public void setLanguageCode(@jakarta.annotation.Nullable final String value) {
        this.languageCode = value;
    }
    /**
     * Sets the video_id property value. The video_id property
     * @param value Value to set for the video_id property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
    /**
     * Sets the vtt_path property value. The vtt_path property
     * @param value Value to set for the vtt_path property.
     */
    public void setVttPath(@jakarta.annotation.Nullable final String value) {
        this.vttPath = value;
    }
}
