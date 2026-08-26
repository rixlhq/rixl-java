package com.rixl.sdk.support.v1.chat.messages;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.rixl.sdk.models.support.v1.ListChatMessagesResponse;
import com.rixl.sdk.models.support.v1.SendChatMessageRequest;
import com.rixl.sdk.models.support.v1.SendChatMessageResponse;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /support/v1/chat/messages
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessagesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MessagesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/chat/messages{?after*,limit*}", pathParameters);
    }
    /**
     * Instantiates a new {@link MessagesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/chat/messages{?after*,limit*}", rawUrl);
    }
    /**
     * ListChatMessages
     * @return a {@link ListChatMessagesResponse}
     */
    @jakarta.annotation.Nullable
    public ListChatMessagesResponse get() {
        return get(null);
    }
    /**
     * ListChatMessages
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ListChatMessagesResponse}
     */
    @jakarta.annotation.Nullable
    public ListChatMessagesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListChatMessagesResponse::createFromDiscriminatorValue);
    }
    /**
     * SendChatMessage
     * @param body The request body
     * @return a {@link SendChatMessageResponse}
     */
    @jakarta.annotation.Nullable
    public SendChatMessageResponse post(@jakarta.annotation.Nonnull final SendChatMessageRequest body) {
        return post(body, null);
    }
    /**
     * SendChatMessage
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SendChatMessageResponse}
     */
    @jakarta.annotation.Nullable
    public SendChatMessageResponse post(@jakarta.annotation.Nonnull final SendChatMessageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SendChatMessageResponse::createFromDiscriminatorValue);
    }
    /**
     * ListChatMessages
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * ListChatMessages
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * SendChatMessage
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SendChatMessageRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * SendChatMessage
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SendChatMessageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MessagesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * ListChatMessages
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
         */
        @jakarta.annotation.Nullable
        public OffsetDateTime after;
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("after", after);
            allQueryParams.put("limit", limit);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
