package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.analyticscommon.v1.VideoQuality;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Segment implements Parsable {
    /**
     * The audio_language property
     */
    private String audioLanguage;
    /**
     * The chapter_title property
     */
    private String chapterTitle;
    /**
     * The end_ms property
     */
    private PeriodAndDuration endMs;
    /**
     * The quality property
     */
    private VideoQuality quality;
    /**
     * The speed property
     */
    private Double speed;
    /**
     * The start_ms property
     */
    private PeriodAndDuration startMs;
    /**
     * Unset fields inherit the value the view was opened with.
     */
    private String subtitleLanguage;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Segment}
     */
    @jakarta.annotation.Nonnull
    public static Segment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Segment();
    }
    /**
     * Gets the audio_language property value. The audio_language property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAudioLanguage() {
        return this.audioLanguage;
    }
    /**
     * Gets the chapter_title property value. The chapter_title property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChapterTitle() {
        return this.chapterTitle;
    }
    /**
     * Gets the end_ms property value. The end_ms property
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getEndMs() {
        return this.endMs;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("audio_language", (n) -> { this.setAudioLanguage(n.getStringValue()); });
        deserializerMap.put("chapter_title", (n) -> { this.setChapterTitle(n.getStringValue()); });
        deserializerMap.put("end_ms", (n) -> { this.setEndMs(n.getPeriodAndDurationValue()); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getEnumValue(VideoQuality::forValue)); });
        deserializerMap.put("speed", (n) -> { this.setSpeed(n.getDoubleValue()); });
        deserializerMap.put("start_ms", (n) -> { this.setStartMs(n.getPeriodAndDurationValue()); });
        deserializerMap.put("subtitle_language", (n) -> { this.setSubtitleLanguage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the quality property value. The quality property
     * @return a {@link VideoQuality}
     */
    @jakarta.annotation.Nullable
    public VideoQuality getQuality() {
        return this.quality;
    }
    /**
     * Gets the speed property value. The speed property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getSpeed() {
        return this.speed;
    }
    /**
     * Gets the start_ms property value. The start_ms property
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getStartMs() {
        return this.startMs;
    }
    /**
     * Gets the subtitle_language property value. Unset fields inherit the value the view was opened with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("audio_language", this.getAudioLanguage());
        writer.writeStringValue("chapter_title", this.getChapterTitle());
        writer.writePeriodAndDurationValue("end_ms", this.getEndMs());
        writer.writeEnumValue("quality", this.getQuality());
        writer.writeDoubleValue("speed", this.getSpeed());
        writer.writePeriodAndDurationValue("start_ms", this.getStartMs());
        writer.writeStringValue("subtitle_language", this.getSubtitleLanguage());
    }
    /**
     * Sets the audio_language property value. The audio_language property
     * @param value Value to set for the audio_language property.
     */
    public void setAudioLanguage(@jakarta.annotation.Nullable final String value) {
        this.audioLanguage = value;
    }
    /**
     * Sets the chapter_title property value. The chapter_title property
     * @param value Value to set for the chapter_title property.
     */
    public void setChapterTitle(@jakarta.annotation.Nullable final String value) {
        this.chapterTitle = value;
    }
    /**
     * Sets the end_ms property value. The end_ms property
     * @param value Value to set for the end_ms property.
     */
    public void setEndMs(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.endMs = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     */
    public void setQuality(@jakarta.annotation.Nullable final VideoQuality value) {
        this.quality = value;
    }
    /**
     * Sets the speed property value. The speed property
     * @param value Value to set for the speed property.
     */
    public void setSpeed(@jakarta.annotation.Nullable final Double value) {
        this.speed = value;
    }
    /**
     * Sets the start_ms property value. The start_ms property
     * @param value Value to set for the start_ms property.
     */
    public void setStartMs(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.startMs = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the subtitle_language property value. Unset fields inherit the value the view was opened with.
     * @param value Value to set for the subtitle_language property.
     */
    public void setSubtitleLanguage(@jakarta.annotation.Nullable final String value) {
        this.subtitleLanguage = value;
    }
}
