package com.rixl.sdk.models.google.rpc;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.google.protobuf.Any;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Status type defines a logical error model suitable for gRPC and REST APIs.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Status extends ApiException implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The status code, which should be an enum value of google.rpc.Code.
     */
    private Integer code;
    /**
     * A list of messages that carry the error details.
     */
    private java.util.List<Any> details;
    /**
     * A developer-facing error message.
     */
    private String message;
    /**
     * Instantiates a new {@link Status} and sets the default values.
     */
    public Status() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Status}
     */
    @jakarta.annotation.Nonnull
    public static Status createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Status();
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
     * Gets the code property value. The status code, which should be an enum value of google.rpc.Code.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCode() {
        return this.code;
    }
    /**
     * Gets the details property value. A list of messages that carry the error details.
     * @return a {@link java.util.List<Any>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Any> getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("code", (n) -> { this.setCode(n.getIntegerValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(Any::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * The primary error message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nonnull
    @Override
    public String getMessage() {
        return super.getMessage();
    }
    /**
     * Gets the message property value. A developer-facing error message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageEscaped() {
        return this.message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("code", this.getCode());
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeStringValue("message", this.getMessageEscaped());
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
     * Sets the code property value. The status code, which should be an enum value of google.rpc.Code.
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final Integer value) {
        this.code = value;
    }
    /**
     * Sets the details property value. A list of messages that carry the error details.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<Any> value) {
        this.details = value;
    }
    /**
     * Sets the message property value. A developer-facing error message.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
}
