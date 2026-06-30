package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StorageUsage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The image_file_count property
     */
    private Integer imageFileCount;
    /**
     * The image_storage_bytes property
     */
    private Integer imageStorageBytes;
    /**
     * The last_updated property
     */
    private String lastUpdated;
    /**
     * The max_image_count property
     */
    private Integer maxImageCount;
    /**
     * The max_project_count property
     */
    private Integer maxProjectCount;
    /**
     * The max_video_count property
     */
    private Integer maxVideoCount;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The project_count property
     */
    private Integer projectCount;
    /**
     * The snapshot_date property
     */
    private String snapshotDate;
    /**
     * The total_file_count property
     */
    private Integer totalFileCount;
    /**
     * The total_storage_bytes property
     */
    private Integer totalStorageBytes;
    /**
     * The total_video_minutes property
     */
    private String totalVideoMinutes;
    /**
     * The video_file_count property
     */
    private Integer videoFileCount;
    /**
     * The video_storage_bytes property
     */
    private Integer videoStorageBytes;
    /**
     * Instantiates a new {@link StorageUsage} and sets the default values.
     */
    public StorageUsage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StorageUsage}
     */
    @jakarta.annotation.Nonnull
    public static StorageUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StorageUsage();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("image_file_count", (n) -> { this.setImageFileCount(n.getIntegerValue()); });
        deserializerMap.put("image_storage_bytes", (n) -> { this.setImageStorageBytes(n.getIntegerValue()); });
        deserializerMap.put("last_updated", (n) -> { this.setLastUpdated(n.getStringValue()); });
        deserializerMap.put("max_image_count", (n) -> { this.setMaxImageCount(n.getIntegerValue()); });
        deserializerMap.put("max_project_count", (n) -> { this.setMaxProjectCount(n.getIntegerValue()); });
        deserializerMap.put("max_video_count", (n) -> { this.setMaxVideoCount(n.getIntegerValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("project_count", (n) -> { this.setProjectCount(n.getIntegerValue()); });
        deserializerMap.put("snapshot_date", (n) -> { this.setSnapshotDate(n.getStringValue()); });
        deserializerMap.put("total_file_count", (n) -> { this.setTotalFileCount(n.getIntegerValue()); });
        deserializerMap.put("total_storage_bytes", (n) -> { this.setTotalStorageBytes(n.getIntegerValue()); });
        deserializerMap.put("total_video_minutes", (n) -> { this.setTotalVideoMinutes(n.getStringValue()); });
        deserializerMap.put("video_file_count", (n) -> { this.setVideoFileCount(n.getIntegerValue()); });
        deserializerMap.put("video_storage_bytes", (n) -> { this.setVideoStorageBytes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the image_file_count property value. The image_file_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getImageFileCount() {
        return this.imageFileCount;
    }
    /**
     * Gets the image_storage_bytes property value. The image_storage_bytes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getImageStorageBytes() {
        return this.imageStorageBytes;
    }
    /**
     * Gets the last_updated property value. The last_updated property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdated() {
        return this.lastUpdated;
    }
    /**
     * Gets the max_image_count property value. The max_image_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxImageCount() {
        return this.maxImageCount;
    }
    /**
     * Gets the max_project_count property value. The max_project_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxProjectCount() {
        return this.maxProjectCount;
    }
    /**
     * Gets the max_video_count property value. The max_video_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxVideoCount() {
        return this.maxVideoCount;
    }
    /**
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Gets the project_count property value. The project_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProjectCount() {
        return this.projectCount;
    }
    /**
     * Gets the snapshot_date property value. The snapshot_date property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSnapshotDate() {
        return this.snapshotDate;
    }
    /**
     * Gets the total_file_count property value. The total_file_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalFileCount() {
        return this.totalFileCount;
    }
    /**
     * Gets the total_storage_bytes property value. The total_storage_bytes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalStorageBytes() {
        return this.totalStorageBytes;
    }
    /**
     * Gets the total_video_minutes property value. The total_video_minutes property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTotalVideoMinutes() {
        return this.totalVideoMinutes;
    }
    /**
     * Gets the video_file_count property value. The video_file_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVideoFileCount() {
        return this.videoFileCount;
    }
    /**
     * Gets the video_storage_bytes property value. The video_storage_bytes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVideoStorageBytes() {
        return this.videoStorageBytes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("image_file_count", this.getImageFileCount());
        writer.writeIntegerValue("image_storage_bytes", this.getImageStorageBytes());
        writer.writeStringValue("last_updated", this.getLastUpdated());
        writer.writeIntegerValue("max_image_count", this.getMaxImageCount());
        writer.writeIntegerValue("max_project_count", this.getMaxProjectCount());
        writer.writeIntegerValue("max_video_count", this.getMaxVideoCount());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeIntegerValue("project_count", this.getProjectCount());
        writer.writeStringValue("snapshot_date", this.getSnapshotDate());
        writer.writeIntegerValue("total_file_count", this.getTotalFileCount());
        writer.writeIntegerValue("total_storage_bytes", this.getTotalStorageBytes());
        writer.writeStringValue("total_video_minutes", this.getTotalVideoMinutes());
        writer.writeIntegerValue("video_file_count", this.getVideoFileCount());
        writer.writeIntegerValue("video_storage_bytes", this.getVideoStorageBytes());
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
     * Sets the image_file_count property value. The image_file_count property
     * @param value Value to set for the image_file_count property.
     */
    public void setImageFileCount(@jakarta.annotation.Nullable final Integer value) {
        this.imageFileCount = value;
    }
    /**
     * Sets the image_storage_bytes property value. The image_storage_bytes property
     * @param value Value to set for the image_storage_bytes property.
     */
    public void setImageStorageBytes(@jakarta.annotation.Nullable final Integer value) {
        this.imageStorageBytes = value;
    }
    /**
     * Sets the last_updated property value. The last_updated property
     * @param value Value to set for the last_updated property.
     */
    public void setLastUpdated(@jakarta.annotation.Nullable final String value) {
        this.lastUpdated = value;
    }
    /**
     * Sets the max_image_count property value. The max_image_count property
     * @param value Value to set for the max_image_count property.
     */
    public void setMaxImageCount(@jakarta.annotation.Nullable final Integer value) {
        this.maxImageCount = value;
    }
    /**
     * Sets the max_project_count property value. The max_project_count property
     * @param value Value to set for the max_project_count property.
     */
    public void setMaxProjectCount(@jakarta.annotation.Nullable final Integer value) {
        this.maxProjectCount = value;
    }
    /**
     * Sets the max_video_count property value. The max_video_count property
     * @param value Value to set for the max_video_count property.
     */
    public void setMaxVideoCount(@jakarta.annotation.Nullable final Integer value) {
        this.maxVideoCount = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the project_count property value. The project_count property
     * @param value Value to set for the project_count property.
     */
    public void setProjectCount(@jakarta.annotation.Nullable final Integer value) {
        this.projectCount = value;
    }
    /**
     * Sets the snapshot_date property value. The snapshot_date property
     * @param value Value to set for the snapshot_date property.
     */
    public void setSnapshotDate(@jakarta.annotation.Nullable final String value) {
        this.snapshotDate = value;
    }
    /**
     * Sets the total_file_count property value. The total_file_count property
     * @param value Value to set for the total_file_count property.
     */
    public void setTotalFileCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalFileCount = value;
    }
    /**
     * Sets the total_storage_bytes property value. The total_storage_bytes property
     * @param value Value to set for the total_storage_bytes property.
     */
    public void setTotalStorageBytes(@jakarta.annotation.Nullable final Integer value) {
        this.totalStorageBytes = value;
    }
    /**
     * Sets the total_video_minutes property value. The total_video_minutes property
     * @param value Value to set for the total_video_minutes property.
     */
    public void setTotalVideoMinutes(@jakarta.annotation.Nullable final String value) {
        this.totalVideoMinutes = value;
    }
    /**
     * Sets the video_file_count property value. The video_file_count property
     * @param value Value to set for the video_file_count property.
     */
    public void setVideoFileCount(@jakarta.annotation.Nullable final Integer value) {
        this.videoFileCount = value;
    }
    /**
     * Sets the video_storage_bytes property value. The video_storage_bytes property
     * @param value Value to set for the video_storage_bytes property.
     */
    public void setVideoStorageBytes(@jakarta.annotation.Nullable final Integer value) {
        this.videoStorageBytes = value;
    }
}
