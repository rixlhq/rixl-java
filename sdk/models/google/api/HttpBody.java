package com.rixl.sdk.models.google.api;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.google.protobuf.Any;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Message that represents an arbitrary HTTP body. It should only be used for payload formats that can&apos;t be represented as JSON, such as raw binary or an HTML page. This message can be used both in streaming and non-streaming API methods in the request as well as the response. It can be used as a top-level request field, which is convenient if one wants to extract parameters from either the URL or HTTP template into the request fields and also want access to the raw HTTP body. Example:     message GetResourceRequest {       // A unique request id.       string request_id = 1;       // The raw HTTP body is bound to this field.       google.api.HttpBody http_body = 2;     }     service ResourceService {       rpc GetResource(GetResourceRequest)         returns (google.api.HttpBody);       rpc UpdateResource(google.api.HttpBody)         returns (google.protobuf.Empty);     } Example with streaming methods:     service CaldavService {       rpc GetCalendar(stream google.api.HttpBody)         returns (stream google.api.HttpBody);       rpc UpdateCalendar(stream google.api.HttpBody)         returns (stream google.api.HttpBody);     } Use of this type only changes how the request and response bodies are handled, all other features will continue to work unchanged.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HttpBody implements Parsable {
    /**
     * The HTTP Content-Type header value specifying the content type of the body.
     */
    private String contentType;
    /**
     * The HTTP request/response body as raw binary.
     */
    private byte[] data;
    /**
     * Application specific response metadata. Must be set in the first response for streaming APIs.
     */
    private java.util.List<Any> extensions;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HttpBody}
     */
    @jakarta.annotation.Nonnull
    public static HttpBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HttpBody();
    }
    /**
     * Gets the content_type property value. The HTTP Content-Type header value specifying the content type of the body.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * Gets the data property value. The HTTP request/response body as raw binary.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getData() {
        return this.data;
    }
    /**
     * Gets the extensions property value. Application specific response metadata. Must be set in the first response for streaming APIs.
     * @return a {@link java.util.List<Any>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Any> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("content_type", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getByteArrayValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Any::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content_type", this.getContentType());
        writer.writeByteArrayValue("data", this.getData());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
    }
    /**
     * Sets the content_type property value. The HTTP Content-Type header value specifying the content type of the body.
     * @param value Value to set for the content_type property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the data property value. The HTTP request/response body as raw binary.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final byte[] value) {
        this.data = value;
    }
    /**
     * Sets the extensions property value. Application specific response metadata. Must be set in the first response for streaming APIs.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Any> value) {
        this.extensions = value;
    }
}
