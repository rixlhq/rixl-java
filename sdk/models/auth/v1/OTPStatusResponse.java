package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OTPStatusResponse implements Parsable {
    /**
     * The backup_codes_remaining property
     */
    private Integer backupCodesRemaining;
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * The is_setup property
     */
    private Boolean isSetup;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OTPStatusResponse}
     */
    @jakarta.annotation.Nonnull
    public static OTPStatusResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OTPStatusResponse();
    }
    /**
     * Gets the backup_codes_remaining property value. The backup_codes_remaining property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBackupCodesRemaining() {
        return this.backupCodesRemaining;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("backup_codes_remaining", (n) -> { this.setBackupCodesRemaining(n.getIntegerValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("is_setup", (n) -> { this.setIsSetup(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the is_setup property value. The is_setup property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSetup() {
        return this.isSetup;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("backup_codes_remaining", this.getBackupCodesRemaining());
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeBooleanValue("is_setup", this.getIsSetup());
    }
    /**
     * Sets the backup_codes_remaining property value. The backup_codes_remaining property
     * @param value Value to set for the backup_codes_remaining property.
     */
    public void setBackupCodesRemaining(@jakarta.annotation.Nullable final Integer value) {
        this.backupCodesRemaining = value;
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the is_setup property value. The is_setup property
     * @param value Value to set for the is_setup property.
     */
    public void setIsSetup(@jakarta.annotation.Nullable final Boolean value) {
        this.isSetup = value;
    }
}
