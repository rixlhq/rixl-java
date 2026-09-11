package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ErrorEvent implements Parsable {
    /**
     * The browser property
     */
    private String browser;
    /**
     * The device_type property
     */
    private String deviceType;
    /**
     * The endpoint property
     */
    private String endpoint;
    /**
     * The error_code property
     */
    private String errorCode;
    /**
     * The error_message property
     */
    private String errorMessage;
    /**
     * The error_type property
     */
    private String errorType;
    /**
     * The os property
     */
    private String os;
    /**
     * The resource_id property
     */
    private String resourceId;
    /**
     * The resource_type property
     */
    private String resourceType;
    /**
     * The session_id property
     */
    private String sessionId;
    /**
     * The stack_trace property
     */
    private String stackTrace;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ErrorEvent}
     */
    @jakarta.annotation.Nonnull
    public static ErrorEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ErrorEvent();
    }
    /**
     * Gets the browser property value. The browser property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.browser;
    }
    /**
     * Gets the device_type property value. The device_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceType() {
        return this.deviceType;
    }
    /**
     * Gets the endpoint property value. The endpoint property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * Gets the error_code property value. The error_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * Gets the error_message property value. The error_message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Gets the error_type property value. The error_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorType() {
        return this.errorType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("device_type", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("endpoint", (n) -> { this.setEndpoint(n.getStringValue()); });
        deserializerMap.put("error_code", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("error_message", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("error_type", (n) -> { this.setErrorType(n.getStringValue()); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        deserializerMap.put("resource_id", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("session_id", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("stack_trace", (n) -> { this.setStackTrace(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the os property value. The os property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.os;
    }
    /**
     * Gets the resource_id property value. The resource_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Gets the resource_type property value. The resource_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the session_id property value. The session_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Gets the stack_trace property value. The stack_trace property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStackTrace() {
        return this.stackTrace;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeStringValue("device_type", this.getDeviceType());
        writer.writeStringValue("endpoint", this.getEndpoint());
        writer.writeStringValue("error_code", this.getErrorCode());
        writer.writeStringValue("error_message", this.getErrorMessage());
        writer.writeStringValue("error_type", this.getErrorType());
        writer.writeStringValue("os", this.getOs());
        writer.writeStringValue("resource_id", this.getResourceId());
        writer.writeStringValue("resource_type", this.getResourceType());
        writer.writeStringValue("session_id", this.getSessionId());
        writer.writeStringValue("stack_trace", this.getStackTrace());
    }
    /**
     * Sets the browser property value. The browser property
     * @param value Value to set for the browser property.
     */
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.browser = value;
    }
    /**
     * Sets the device_type property value. The device_type property
     * @param value Value to set for the device_type property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.deviceType = value;
    }
    /**
     * Sets the endpoint property value. The endpoint property
     * @param value Value to set for the endpoint property.
     */
    public void setEndpoint(@jakarta.annotation.Nullable final String value) {
        this.endpoint = value;
    }
    /**
     * Sets the error_code property value. The error_code property
     * @param value Value to set for the error_code property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the error_message property value. The error_message property
     * @param value Value to set for the error_message property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.errorMessage = value;
    }
    /**
     * Sets the error_type property value. The error_type property
     * @param value Value to set for the error_type property.
     */
    public void setErrorType(@jakarta.annotation.Nullable final String value) {
        this.errorType = value;
    }
    /**
     * Sets the os property value. The os property
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.os = value;
    }
    /**
     * Sets the resource_id property value. The resource_id property
     * @param value Value to set for the resource_id property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.resourceId = value;
    }
    /**
     * Sets the resource_type property value. The resource_type property
     * @param value Value to set for the resource_type property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.resourceType = value;
    }
    /**
     * Sets the session_id property value. The session_id property
     * @param value Value to set for the session_id property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
    /**
     * Sets the stack_trace property value. The stack_trace property
     * @param value Value to set for the stack_trace property.
     */
    public void setStackTrace(@jakarta.annotation.Nullable final String value) {
        this.stackTrace = value;
    }
}
