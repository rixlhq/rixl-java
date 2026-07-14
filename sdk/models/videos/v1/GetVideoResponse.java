package com.rixl.sdk.models.videos.v1;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.Visibility;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetVideoResponse implements Parsable {
    /**
     * The bitrate property
     */
    private Integer bitrate;
    /**
     * The codec property
     */
    private String codec;
    /**
     * A Duration represents a signed, fixed-length span of time represented as a count of seconds and fractions of seconds at nanosecond resolution. It is independent of any calendar and concepts like &quot;day&quot; or &quot;month&quot;. It is related to Timestamp in that the difference between two Timestamp values is a Duration and it can be added or subtracted from a Timestamp. Range is approximately +-10,000 years. # Examples Example 1: Compute Duration from two Timestamps in pseudo code.     Timestamp start = ...;     Timestamp end = ...;     Duration duration = ...;     duration.seconds = end.seconds - start.seconds;     duration.nanos = end.nanos - start.nanos;     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {       duration.seconds += 1;       duration.nanos -= 1000000000;     } else if (duration.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {       duration.seconds -= 1;       duration.nanos += 1000000000;     } Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.     Timestamp start = ...;     Duration duration = ...;     Timestamp end = ...;     end.seconds = start.seconds + duration.seconds;     end.nanos = start.nanos + duration.nanos;     if (end.nanos &lt; 0) {       end.seconds -= 1;       end.nanos += 1000000000;     } else if (end.nanos &gt;= 1000000000) {       end.seconds += 1;       end.nanos -= 1000000000;     } Example 3: Compute Duration from datetime.timedelta in Python.     td = datetime.timedelta(days=3, minutes=10)     duration = Duration()     duration.FromTimedelta(td) # JSON Mapping In JSON format, the Duration type is encoded as a string rather than an object, where the string ends in the suffix &quot;s&quot; (indicating seconds) and is preceded by the number of seconds, with nanoseconds expressed as fractional seconds. For example, 3 seconds with 0 nanoseconds should be encoded in JSON format as &quot;3s&quot;, while 3 seconds and 1 nanosecond should be expressed in JSON format as &quot;3.000000001s&quot;, and 3 seconds and 1 microsecond should be expressed in JSON format as &quot;3.000001s&quot;.
     */
    private PeriodAndDuration duration;
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
    private Visibility visibility;
    /**
     * The width property
     */
    private Integer width;
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
     * Gets the duration property value. A Duration represents a signed, fixed-length span of time represented as a count of seconds and fractions of seconds at nanosecond resolution. It is independent of any calendar and concepts like &quot;day&quot; or &quot;month&quot;. It is related to Timestamp in that the difference between two Timestamp values is a Duration and it can be added or subtracted from a Timestamp. Range is approximately +-10,000 years. # Examples Example 1: Compute Duration from two Timestamps in pseudo code.     Timestamp start = ...;     Timestamp end = ...;     Duration duration = ...;     duration.seconds = end.seconds - start.seconds;     duration.nanos = end.nanos - start.nanos;     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {       duration.seconds += 1;       duration.nanos -= 1000000000;     } else if (duration.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {       duration.seconds -= 1;       duration.nanos += 1000000000;     } Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.     Timestamp start = ...;     Duration duration = ...;     Timestamp end = ...;     end.seconds = start.seconds + duration.seconds;     end.nanos = start.nanos + duration.nanos;     if (end.nanos &lt; 0) {       end.seconds -= 1;       end.nanos += 1000000000;     } else if (end.nanos &gt;= 1000000000) {       end.seconds += 1;       end.nanos -= 1000000000;     } Example 3: Compute Duration from datetime.timedelta in Python.     td = datetime.timedelta(days=3, minutes=10)     duration = Duration()     duration.FromTimedelta(td) # JSON Mapping In JSON format, the Duration type is encoded as a string rather than an object, where the string ends in the suffix &quot;s&quot; (indicating seconds) and is preceded by the number of seconds, with nanoseconds expressed as fractional seconds. For example, 3 seconds with 0 nanoseconds should be encoded in JSON format as &quot;3s&quot;, while 3 seconds and 1 nanosecond should be expressed in JSON format as &quot;3.000000001s&quot;, and 3 seconds and 1 microsecond should be expressed in JSON format as &quot;3.000001s&quot;.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("bitrate", (n) -> { this.setBitrate(n.getIntegerValue()); });
        deserializerMap.put("codec", (n) -> { this.setCodec(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("framerate", (n) -> { this.setFramerate(n.getStringValue()); });
        deserializerMap.put("hdr", (n) -> { this.setHdr(n.getBooleanValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumValue(Visibility::forValue)); });
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
        writer.writeStringValue("framerate", this.getFramerate());
        writer.writeBooleanValue("hdr", this.getHdr());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("id", this.getId());
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
     * Sets the duration property value. A Duration represents a signed, fixed-length span of time represented as a count of seconds and fractions of seconds at nanosecond resolution. It is independent of any calendar and concepts like &quot;day&quot; or &quot;month&quot;. It is related to Timestamp in that the difference between two Timestamp values is a Duration and it can be added or subtracted from a Timestamp. Range is approximately +-10,000 years. # Examples Example 1: Compute Duration from two Timestamps in pseudo code.     Timestamp start = ...;     Timestamp end = ...;     Duration duration = ...;     duration.seconds = end.seconds - start.seconds;     duration.nanos = end.nanos - start.nanos;     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {       duration.seconds += 1;       duration.nanos -= 1000000000;     } else if (duration.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {       duration.seconds -= 1;       duration.nanos += 1000000000;     } Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.     Timestamp start = ...;     Duration duration = ...;     Timestamp end = ...;     end.seconds = start.seconds + duration.seconds;     end.nanos = start.nanos + duration.nanos;     if (end.nanos &lt; 0) {       end.seconds -= 1;       end.nanos += 1000000000;     } else if (end.nanos &gt;= 1000000000) {       end.seconds += 1;       end.nanos -= 1000000000;     } Example 3: Compute Duration from datetime.timedelta in Python.     td = datetime.timedelta(days=3, minutes=10)     duration = Duration()     duration.FromTimedelta(td) # JSON Mapping In JSON format, the Duration type is encoded as a string rather than an object, where the string ends in the suffix &quot;s&quot; (indicating seconds) and is preceded by the number of seconds, with nanoseconds expressed as fractional seconds. For example, 3 seconds with 0 nanoseconds should be encoded in JSON format as &quot;3s&quot;, while 3 seconds and 1 nanosecond should be expressed in JSON format as &quot;3.000000001s&quot;, and 3 seconds and 1 microsecond should be expressed in JSON format as &quot;3.000001s&quot;.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.duration = PeriodAndDuration.ofPeriodAndDuration(value);
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
