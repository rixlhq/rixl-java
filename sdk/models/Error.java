package com.rixl.sdk.models;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Error extends ApiException implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Human-readable message. Not stable; branch on the HTTP status.
     */
    private String error;
    /**
     * Reason-specific details, such as `invitation_id` on `INVITATION_PENDING` or `max_age_seconds` on `STEP_UP_REQUIRED`. Absent when there is none.
     */
    private ErrorMetadata metadata;
    /**
     * Machine-readable reason for some 4xx errors, such as `ORG_DELETED`, `MEMBERSHIP_SUSPENDED`, `NOT_A_MEMBER` or `STEP_UP_REQUIRED`. Absent when there is none, and always absent on 5xx.
     */
    private String reason;
    /**
     * Instantiates a new {@link Error} and sets the default values.
     */
    public Error() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Error}
     */
    @jakarta.annotation.Nonnull
    public static Error createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Error();
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
     * Gets the error property value. Human-readable message. Not stable; branch on the HTTP status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(ErrorMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
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
     * Gets the metadata property value. Reason-specific details, such as `invitation_id` on `INVITATION_PENDING` or `max_age_seconds` on `STEP_UP_REQUIRED`. Absent when there is none.
     * @return a {@link ErrorMetadata}
     */
    @jakarta.annotation.Nullable
    public ErrorMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the reason property value. Machine-readable reason for some 4xx errors, such as `ORG_DELETED`, `MEMBERSHIP_SUSPENDED`, `NOT_A_MEMBER` or `STEP_UP_REQUIRED`. Absent when there is none, and always absent on 5xx.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("reason", this.getReason());
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
     * Sets the error property value. Human-readable message. Not stable; branch on the HTTP status.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the metadata property value. Reason-specific details, such as `invitation_id` on `INVITATION_PENDING` or `max_age_seconds` on `STEP_UP_REQUIRED`. Absent when there is none.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final ErrorMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the reason property value. Machine-readable reason for some 4xx errors, such as `ORG_DELETED`, `MEMBERSHIP_SUSPENDED`, `NOT_A_MEMBER` or `STEP_UP_REQUIRED`. Absent when there is none, and always absent on 5xx.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
}
