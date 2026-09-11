package com.rixl.sdk.models.common.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class File implements Parsable {
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * format describes the artifact currently served at url, not the uploaded source, and is only meaningful once status is FILE_STATUS_READY. Video flips from &quot;mp4&quot; to &quot;hls&quot; when packaging completes; that is the only signal for choosing a progressive player over an HLS one. Known values: jpg, png, webp, avif, gif, mp4, hls, srt, vtt.
     */
    private String format;
    /**
     * The id property
     */
    private String id;
    /**
     * The name property
     */
    private String name;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * size is the uploaded source&apos;s byte size for usage accounting; it is not updated when packaging replaces the artifact, so it does not describe the object at url.
     */
    private String size;
    /**
     * The status property
     */
    private FileStatus status;
    /**
     * The updated_at property
     */
    private OffsetDateTime updatedAt;
    /**
     * The url property
     */
    private String url;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link File}
     */
    @jakarta.annotation.Nonnull
    public static File createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new File();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FileStatus::forValue)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. format describes the artifact currently served at url, not the uploaded source, and is only meaningful once status is FILE_STATUS_READY. Video flips from &quot;mp4&quot; to &quot;hls&quot; when packaging completes; that is the only signal for choosing a progressive player over an HLS one. Known values: jpg, png, webp, avif, gif, mp4, hls, srt, vtt.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.format;
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
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the project_id property value. The project_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Gets the size property value. size is the uploaded source&apos;s byte size for usage accounting; it is not updated when packaging replaces the artifact, so it does not describe the object at url.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSize() {
        return this.size;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link FileStatus}
     */
    @jakarta.annotation.Nullable
    public FileStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the url property value. The url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("format", this.getFormat());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("project_id", this.getProjectId());
        writer.writeStringValue("size", this.getSize());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the format property value. format describes the artifact currently served at url, not the uploaded source, and is only meaningful once status is FILE_STATUS_READY. Video flips from &quot;mp4&quot; to &quot;hls&quot; when packaging completes; that is the only signal for choosing a progressive player over an HLS one. Known values: jpg, png, webp, avif, gif, mp4, hls, srt, vtt.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.format = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the project_id property value. The project_id property
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the size property value. size is the uploaded source&apos;s byte size for usage accounting; it is not updated when packaging replaces the artifact, so it does not describe the object at url.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final String value) {
        this.size = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FileStatus value) {
        this.status = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
