package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.analyticscommon.v1.MediaType;
import com.rixl.sdk.models.analyticscommon.v1.VideoQuality;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentViewEvent implements Parsable {
    /**
     * The audio_language property
     */
    private String audioLanguage;
    /**
     * The content_id property
     */
    private String contentId;
    /**
     * The content_type property
     */
    private MediaType contentType;
    /**
     * The country property
     */
    private String country;
    /**
     * The device_id property
     */
    private String deviceId;
    /**
     * The feed_id property
     */
    private String feedId;
    /**
     * The page property
     */
    private ContentViewEventPage page;
    /**
     * The post_id property
     */
    private String postId;
    /**
     * The quality property
     */
    private VideoQuality quality;
    /**
     * The segments property
     */
    private java.util.List<Segment> segments;
    /**
     * The subtitle_language property
     */
    private String subtitleLanguage;
    /**
     * The video_position_ms property
     */
    private PeriodAndDuration videoPositionMs;
    /**
     * The video_total_duration_ms property
     */
    private PeriodAndDuration videoTotalDurationMs;
    /**
     * The view_type property
     */
    private ContentViewEventViewType viewType;
    /**
     * The watch_duration_ms property
     */
    private PeriodAndDuration watchDurationMs;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentViewEvent}
     */
    @jakarta.annotation.Nonnull
    public static ContentViewEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentViewEvent();
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
     * Gets the content_id property value. The content_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Gets the content_type property value. The content_type property
     * @return a {@link MediaType}
     */
    @jakarta.annotation.Nullable
    public MediaType getContentType() {
        return this.contentType;
    }
    /**
     * Gets the country property value. The country property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the device_id property value. The device_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the feed_id property value. The feed_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedId() {
        return this.feedId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("audio_language", (n) -> { this.setAudioLanguage(n.getStringValue()); });
        deserializerMap.put("content_id", (n) -> { this.setContentId(n.getStringValue()); });
        deserializerMap.put("content_type", (n) -> { this.setContentType(n.getEnumValue(MediaType::forValue)); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("device_id", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("feed_id", (n) -> { this.setFeedId(n.getStringValue()); });
        deserializerMap.put("page", (n) -> { this.setPage(n.getEnumValue(ContentViewEventPage::forValue)); });
        deserializerMap.put("post_id", (n) -> { this.setPostId(n.getStringValue()); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getEnumValue(VideoQuality::forValue)); });
        deserializerMap.put("segments", (n) -> { this.setSegments(n.getCollectionOfObjectValues(Segment::createFromDiscriminatorValue)); });
        deserializerMap.put("subtitle_language", (n) -> { this.setSubtitleLanguage(n.getStringValue()); });
        deserializerMap.put("video_position_ms", (n) -> { this.setVideoPositionMs(n.getPeriodAndDurationValue()); });
        deserializerMap.put("video_total_duration_ms", (n) -> { this.setVideoTotalDurationMs(n.getPeriodAndDurationValue()); });
        deserializerMap.put("view_type", (n) -> { this.setViewType(n.getEnumValue(ContentViewEventViewType::forValue)); });
        deserializerMap.put("watch_duration_ms", (n) -> { this.setWatchDurationMs(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the page property value. The page property
     * @return a {@link ContentViewEventPage}
     */
    @jakarta.annotation.Nullable
    public ContentViewEventPage getPage() {
        return this.page;
    }
    /**
     * Gets the post_id property value. The post_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostId() {
        return this.postId;
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
     * Gets the segments property value. The segments property
     * @return a {@link java.util.List<Segment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Segment> getSegments() {
        return this.segments;
    }
    /**
     * Gets the subtitle_language property value. The subtitle_language property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }
    /**
     * Gets the video_position_ms property value. The video_position_ms property
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getVideoPositionMs() {
        return this.videoPositionMs;
    }
    /**
     * Gets the video_total_duration_ms property value. The video_total_duration_ms property
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getVideoTotalDurationMs() {
        return this.videoTotalDurationMs;
    }
    /**
     * Gets the view_type property value. The view_type property
     * @return a {@link ContentViewEventViewType}
     */
    @jakarta.annotation.Nullable
    public ContentViewEventViewType getViewType() {
        return this.viewType;
    }
    /**
     * Gets the watch_duration_ms property value. The watch_duration_ms property
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getWatchDurationMs() {
        return this.watchDurationMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("audio_language", this.getAudioLanguage());
        writer.writeStringValue("content_id", this.getContentId());
        writer.writeEnumValue("content_type", this.getContentType());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("device_id", this.getDeviceId());
        writer.writeStringValue("feed_id", this.getFeedId());
        writer.writeEnumValue("page", this.getPage());
        writer.writeStringValue("post_id", this.getPostId());
        writer.writeEnumValue("quality", this.getQuality());
        writer.writeCollectionOfObjectValues("segments", this.getSegments());
        writer.writeStringValue("subtitle_language", this.getSubtitleLanguage());
        writer.writePeriodAndDurationValue("video_position_ms", this.getVideoPositionMs());
        writer.writePeriodAndDurationValue("video_total_duration_ms", this.getVideoTotalDurationMs());
        writer.writeEnumValue("view_type", this.getViewType());
        writer.writePeriodAndDurationValue("watch_duration_ms", this.getWatchDurationMs());
    }
    /**
     * Sets the audio_language property value. The audio_language property
     * @param value Value to set for the audio_language property.
     */
    public void setAudioLanguage(@jakarta.annotation.Nullable final String value) {
        this.audioLanguage = value;
    }
    /**
     * Sets the content_id property value. The content_id property
     * @param value Value to set for the content_id property.
     */
    public void setContentId(@jakarta.annotation.Nullable final String value) {
        this.contentId = value;
    }
    /**
     * Sets the content_type property value. The content_type property
     * @param value Value to set for the content_type property.
     */
    public void setContentType(@jakarta.annotation.Nullable final MediaType value) {
        this.contentType = value;
    }
    /**
     * Sets the country property value. The country property
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the device_id property value. The device_id property
     * @param value Value to set for the device_id property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the feed_id property value. The feed_id property
     * @param value Value to set for the feed_id property.
     */
    public void setFeedId(@jakarta.annotation.Nullable final String value) {
        this.feedId = value;
    }
    /**
     * Sets the page property value. The page property
     * @param value Value to set for the page property.
     */
    public void setPage(@jakarta.annotation.Nullable final ContentViewEventPage value) {
        this.page = value;
    }
    /**
     * Sets the post_id property value. The post_id property
     * @param value Value to set for the post_id property.
     */
    public void setPostId(@jakarta.annotation.Nullable final String value) {
        this.postId = value;
    }
    /**
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     */
    public void setQuality(@jakarta.annotation.Nullable final VideoQuality value) {
        this.quality = value;
    }
    /**
     * Sets the segments property value. The segments property
     * @param value Value to set for the segments property.
     */
    public void setSegments(@jakarta.annotation.Nullable final java.util.List<Segment> value) {
        this.segments = value;
    }
    /**
     * Sets the subtitle_language property value. The subtitle_language property
     * @param value Value to set for the subtitle_language property.
     */
    public void setSubtitleLanguage(@jakarta.annotation.Nullable final String value) {
        this.subtitleLanguage = value;
    }
    /**
     * Sets the video_position_ms property value. The video_position_ms property
     * @param value Value to set for the video_position_ms property.
     */
    public void setVideoPositionMs(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.videoPositionMs = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the video_total_duration_ms property value. The video_total_duration_ms property
     * @param value Value to set for the video_total_duration_ms property.
     */
    public void setVideoTotalDurationMs(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.videoTotalDurationMs = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the view_type property value. The view_type property
     * @param value Value to set for the view_type property.
     */
    public void setViewType(@jakarta.annotation.Nullable final ContentViewEventViewType value) {
        this.viewType = value;
    }
    /**
     * Sets the watch_duration_ms property value. The watch_duration_ms property
     * @param value Value to set for the watch_duration_ms property.
     */
    public void setWatchDurationMs(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.watchDurationMs = PeriodAndDuration.ofPeriodAndDuration(value);
    }
}
