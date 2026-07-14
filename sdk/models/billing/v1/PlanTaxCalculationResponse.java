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
public class PlanTaxCalculationResponse implements Parsable {
    /**
     * The amountTotal property
     */
    private UntypedNode amountTotal;
    /**
     * The baseAmount property
     */
    private UntypedNode baseAmount;
    /**
     * The billingAddress property
     */
    private BillingAddress billingAddress;
    /**
     * The billingCycle property
     */
    private BillingCycle billingCycle;
    /**
     * A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     */
    private OffsetDateTime calculatedAt;
    /**
     * The calculationId property
     */
    private String calculationId;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The planId property
     */
    private String planId;
    /**
     * The planName property
     */
    private String planName;
    /**
     * The taxAmountExclusive property
     */
    private UntypedNode taxAmountExclusive;
    /**
     * The taxAmountInclusive property
     */
    private UntypedNode taxAmountInclusive;
    /**
     * The taxPercentage property
     */
    private Double taxPercentage;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlanTaxCalculationResponse}
     */
    @jakarta.annotation.Nonnull
    public static PlanTaxCalculationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlanTaxCalculationResponse();
    }
    /**
     * Gets the amountTotal property value. The amountTotal property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAmountTotal() {
        return this.amountTotal;
    }
    /**
     * Gets the baseAmount property value. The baseAmount property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBaseAmount() {
        return this.baseAmount;
    }
    /**
     * Gets the billingAddress property value. The billingAddress property
     * @return a {@link BillingAddress}
     */
    @jakarta.annotation.Nullable
    public BillingAddress getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * Gets the billingCycle property value. The billingCycle property
     * @return a {@link BillingCycle}
     */
    @jakarta.annotation.Nullable
    public BillingCycle getBillingCycle() {
        return this.billingCycle;
    }
    /**
     * Gets the calculatedAt property value. A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCalculatedAt() {
        return this.calculatedAt;
    }
    /**
     * Gets the calculationId property value. The calculationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCalculationId() {
        return this.calculationId;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("amountTotal", (n) -> { this.setAmountTotal(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("baseAmount", (n) -> { this.setBaseAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingAddress", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("billingCycle", (n) -> { this.setBillingCycle(n.getEnumValue(BillingCycle::forValue)); });
        deserializerMap.put("calculatedAt", (n) -> { this.setCalculatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("calculationId", (n) -> { this.setCalculationId(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("planName", (n) -> { this.setPlanName(n.getStringValue()); });
        deserializerMap.put("taxAmountExclusive", (n) -> { this.setTaxAmountExclusive(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("taxAmountInclusive", (n) -> { this.setTaxAmountInclusive(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("taxPercentage", (n) -> { this.setTaxPercentage(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the planId property value. The planId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Gets the planName property value. The planName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanName() {
        return this.planName;
    }
    /**
     * Gets the taxAmountExclusive property value. The taxAmountExclusive property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTaxAmountExclusive() {
        return this.taxAmountExclusive;
    }
    /**
     * Gets the taxAmountInclusive property value. The taxAmountInclusive property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTaxAmountInclusive() {
        return this.taxAmountInclusive;
    }
    /**
     * Gets the taxPercentage property value. The taxPercentage property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTaxPercentage() {
        return this.taxPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amountTotal", this.getAmountTotal());
        writer.writeObjectValue("baseAmount", this.getBaseAmount());
        writer.writeObjectValue("billingAddress", this.getBillingAddress());
        writer.writeEnumValue("billingCycle", this.getBillingCycle());
        writer.writeOffsetDateTimeValue("calculatedAt", this.getCalculatedAt());
        writer.writeStringValue("calculationId", this.getCalculationId());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeStringValue("planName", this.getPlanName());
        writer.writeObjectValue("taxAmountExclusive", this.getTaxAmountExclusive());
        writer.writeObjectValue("taxAmountInclusive", this.getTaxAmountInclusive());
        writer.writeDoubleValue("taxPercentage", this.getTaxPercentage());
    }
    /**
     * Sets the amountTotal property value. The amountTotal property
     * @param value Value to set for the amountTotal property.
     */
    public void setAmountTotal(@jakarta.annotation.Nullable final UntypedNode value) {
        this.amountTotal = value;
    }
    /**
     * Sets the baseAmount property value. The baseAmount property
     * @param value Value to set for the baseAmount property.
     */
    public void setBaseAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.baseAmount = value;
    }
    /**
     * Sets the billingAddress property value. The billingAddress property
     * @param value Value to set for the billingAddress property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final BillingAddress value) {
        this.billingAddress = value;
    }
    /**
     * Sets the billingCycle property value. The billingCycle property
     * @param value Value to set for the billingCycle property.
     */
    public void setBillingCycle(@jakarta.annotation.Nullable final BillingCycle value) {
        this.billingCycle = value;
    }
    /**
     * Sets the calculatedAt property value. A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     * @param value Value to set for the calculatedAt property.
     */
    public void setCalculatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.calculatedAt = value;
    }
    /**
     * Sets the calculationId property value. The calculationId property
     * @param value Value to set for the calculationId property.
     */
    public void setCalculationId(@jakarta.annotation.Nullable final String value) {
        this.calculationId = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the planId property value. The planId property
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.planId = value;
    }
    /**
     * Sets the planName property value. The planName property
     * @param value Value to set for the planName property.
     */
    public void setPlanName(@jakarta.annotation.Nullable final String value) {
        this.planName = value;
    }
    /**
     * Sets the taxAmountExclusive property value. The taxAmountExclusive property
     * @param value Value to set for the taxAmountExclusive property.
     */
    public void setTaxAmountExclusive(@jakarta.annotation.Nullable final UntypedNode value) {
        this.taxAmountExclusive = value;
    }
    /**
     * Sets the taxAmountInclusive property value. The taxAmountInclusive property
     * @param value Value to set for the taxAmountInclusive property.
     */
    public void setTaxAmountInclusive(@jakarta.annotation.Nullable final UntypedNode value) {
        this.taxAmountInclusive = value;
    }
    /**
     * Sets the taxPercentage property value. The taxPercentage property
     * @param value Value to set for the taxPercentage property.
     */
    public void setTaxPercentage(@jakarta.annotation.Nullable final Double value) {
        this.taxPercentage = value;
    }
}
