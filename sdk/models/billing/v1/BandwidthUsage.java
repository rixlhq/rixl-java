package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BandwidthUsage implements Parsable {
    /**
     * A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     */
    private OffsetDateTime createdAt;
    /**
     * The dataSource property
     */
    private String dataSource;
    /**
     * The imageBandwidthBytes property
     */
    private UntypedNode imageBandwidthBytes;
    /**
     * The imageRequests property
     */
    private UntypedNode imageRequests;
    /**
     * The orgId property
     */
    private String orgId;
    /**
     * A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     */
    private OffsetDateTime snapshotDate;
    /**
     * The snapshotType property
     */
    private String snapshotType;
    /**
     * The totalBandwidthBytes property
     */
    private UntypedNode totalBandwidthBytes;
    /**
     * The totalRequests property
     */
    private UntypedNode totalRequests;
    /**
     * The uniqueVisitors property
     */
    private UntypedNode uniqueVisitors;
    /**
     * The videoBandwidthBytes property
     */
    private UntypedNode videoBandwidthBytes;
    /**
     * The videoRequests property
     */
    private UntypedNode videoRequests;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BandwidthUsage}
     */
    @jakarta.annotation.Nonnull
    public static BandwidthUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BandwidthUsage();
    }
    /**
     * Gets the createdAt property value. A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the dataSource property value. The dataSource property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataSource() {
        return this.dataSource;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dataSource", (n) -> { this.setDataSource(n.getStringValue()); });
        deserializerMap.put("imageBandwidthBytes", (n) -> { this.setImageBandwidthBytes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("imageRequests", (n) -> { this.setImageRequests(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("orgId", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("snapshotDate", (n) -> { this.setSnapshotDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("snapshotType", (n) -> { this.setSnapshotType(n.getStringValue()); });
        deserializerMap.put("totalBandwidthBytes", (n) -> { this.setTotalBandwidthBytes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("totalRequests", (n) -> { this.setTotalRequests(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("uniqueVisitors", (n) -> { this.setUniqueVisitors(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("videoBandwidthBytes", (n) -> { this.setVideoBandwidthBytes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("videoRequests", (n) -> { this.setVideoRequests(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the imageBandwidthBytes property value. The imageBandwidthBytes property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getImageBandwidthBytes() {
        return this.imageBandwidthBytes;
    }
    /**
     * Gets the imageRequests property value. The imageRequests property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getImageRequests() {
        return this.imageRequests;
    }
    /**
     * Gets the orgId property value. The orgId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the snapshotDate property value. A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSnapshotDate() {
        return this.snapshotDate;
    }
    /**
     * Gets the snapshotType property value. The snapshotType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSnapshotType() {
        return this.snapshotType;
    }
    /**
     * Gets the totalBandwidthBytes property value. The totalBandwidthBytes property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTotalBandwidthBytes() {
        return this.totalBandwidthBytes;
    }
    /**
     * Gets the totalRequests property value. The totalRequests property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTotalRequests() {
        return this.totalRequests;
    }
    /**
     * Gets the uniqueVisitors property value. The uniqueVisitors property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getUniqueVisitors() {
        return this.uniqueVisitors;
    }
    /**
     * Gets the videoBandwidthBytes property value. The videoBandwidthBytes property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getVideoBandwidthBytes() {
        return this.videoBandwidthBytes;
    }
    /**
     * Gets the videoRequests property value. The videoRequests property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getVideoRequests() {
        return this.videoRequests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("dataSource", this.getDataSource());
        writer.writeObjectValue("imageBandwidthBytes", this.getImageBandwidthBytes());
        writer.writeObjectValue("imageRequests", this.getImageRequests());
        writer.writeStringValue("orgId", this.getOrgId());
        writer.writeOffsetDateTimeValue("snapshotDate", this.getSnapshotDate());
        writer.writeStringValue("snapshotType", this.getSnapshotType());
        writer.writeObjectValue("totalBandwidthBytes", this.getTotalBandwidthBytes());
        writer.writeObjectValue("totalRequests", this.getTotalRequests());
        writer.writeObjectValue("uniqueVisitors", this.getUniqueVisitors());
        writer.writeObjectValue("videoBandwidthBytes", this.getVideoBandwidthBytes());
        writer.writeObjectValue("videoRequests", this.getVideoRequests());
    }
    /**
     * Sets the createdAt property value. A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the dataSource property value. The dataSource property
     * @param value Value to set for the dataSource property.
     */
    public void setDataSource(@jakarta.annotation.Nullable final String value) {
        this.dataSource = value;
    }
    /**
     * Sets the imageBandwidthBytes property value. The imageBandwidthBytes property
     * @param value Value to set for the imageBandwidthBytes property.
     */
    public void setImageBandwidthBytes(@jakarta.annotation.Nullable final UntypedNode value) {
        this.imageBandwidthBytes = value;
    }
    /**
     * Sets the imageRequests property value. The imageRequests property
     * @param value Value to set for the imageRequests property.
     */
    public void setImageRequests(@jakarta.annotation.Nullable final UntypedNode value) {
        this.imageRequests = value;
    }
    /**
     * Sets the orgId property value. The orgId property
     * @param value Value to set for the orgId property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the snapshotDate property value. A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     * @param value Value to set for the snapshotDate property.
     */
    public void setSnapshotDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.snapshotDate = value;
    }
    /**
     * Sets the snapshotType property value. The snapshotType property
     * @param value Value to set for the snapshotType property.
     */
    public void setSnapshotType(@jakarta.annotation.Nullable final String value) {
        this.snapshotType = value;
    }
    /**
     * Sets the totalBandwidthBytes property value. The totalBandwidthBytes property
     * @param value Value to set for the totalBandwidthBytes property.
     */
    public void setTotalBandwidthBytes(@jakarta.annotation.Nullable final UntypedNode value) {
        this.totalBandwidthBytes = value;
    }
    /**
     * Sets the totalRequests property value. The totalRequests property
     * @param value Value to set for the totalRequests property.
     */
    public void setTotalRequests(@jakarta.annotation.Nullable final UntypedNode value) {
        this.totalRequests = value;
    }
    /**
     * Sets the uniqueVisitors property value. The uniqueVisitors property
     * @param value Value to set for the uniqueVisitors property.
     */
    public void setUniqueVisitors(@jakarta.annotation.Nullable final UntypedNode value) {
        this.uniqueVisitors = value;
    }
    /**
     * Sets the videoBandwidthBytes property value. The videoBandwidthBytes property
     * @param value Value to set for the videoBandwidthBytes property.
     */
    public void setVideoBandwidthBytes(@jakarta.annotation.Nullable final UntypedNode value) {
        this.videoBandwidthBytes = value;
    }
    /**
     * Sets the videoRequests property value. The videoRequests property
     * @param value Value to set for the videoRequests property.
     */
    public void setVideoRequests(@jakarta.annotation.Nullable final UntypedNode value) {
        this.videoRequests = value;
    }
}
