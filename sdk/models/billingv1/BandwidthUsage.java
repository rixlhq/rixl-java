package com.rixl.sdk.models.billingv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BandwidthUsage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The data_source property
     */
    private String dataSource;
    /**
     * The image_bandwidth_bytes property
     */
    private Integer imageBandwidthBytes;
    /**
     * The image_requests property
     */
    private Integer imageRequests;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The snapshot_date property
     */
    private String snapshotDate;
    /**
     * The snapshot_type property
     */
    private String snapshotType;
    /**
     * The total_bandwidth_bytes property
     */
    private Integer totalBandwidthBytes;
    /**
     * The total_requests property
     */
    private Integer totalRequests;
    /**
     * The unique_visitors property
     */
    private Integer uniqueVisitors;
    /**
     * The video_bandwidth_bytes property
     */
    private Integer videoBandwidthBytes;
    /**
     * The video_requests property
     */
    private Integer videoRequests;
    /**
     * Instantiates a new {@link BandwidthUsage} and sets the default values.
     */
    public BandwidthUsage() {
        this.setAdditionalData(new HashMap<>());
    }
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the data_source property value. The data_source property
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
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("data_source", (n) -> { this.setDataSource(n.getStringValue()); });
        deserializerMap.put("image_bandwidth_bytes", (n) -> { this.setImageBandwidthBytes(n.getIntegerValue()); });
        deserializerMap.put("image_requests", (n) -> { this.setImageRequests(n.getIntegerValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("snapshot_date", (n) -> { this.setSnapshotDate(n.getStringValue()); });
        deserializerMap.put("snapshot_type", (n) -> { this.setSnapshotType(n.getStringValue()); });
        deserializerMap.put("total_bandwidth_bytes", (n) -> { this.setTotalBandwidthBytes(n.getIntegerValue()); });
        deserializerMap.put("total_requests", (n) -> { this.setTotalRequests(n.getIntegerValue()); });
        deserializerMap.put("unique_visitors", (n) -> { this.setUniqueVisitors(n.getIntegerValue()); });
        deserializerMap.put("video_bandwidth_bytes", (n) -> { this.setVideoBandwidthBytes(n.getIntegerValue()); });
        deserializerMap.put("video_requests", (n) -> { this.setVideoRequests(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the image_bandwidth_bytes property value. The image_bandwidth_bytes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getImageBandwidthBytes() {
        return this.imageBandwidthBytes;
    }
    /**
     * Gets the image_requests property value. The image_requests property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getImageRequests() {
        return this.imageRequests;
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
     * Gets the snapshot_date property value. The snapshot_date property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSnapshotDate() {
        return this.snapshotDate;
    }
    /**
     * Gets the snapshot_type property value. The snapshot_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSnapshotType() {
        return this.snapshotType;
    }
    /**
     * Gets the total_bandwidth_bytes property value. The total_bandwidth_bytes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalBandwidthBytes() {
        return this.totalBandwidthBytes;
    }
    /**
     * Gets the total_requests property value. The total_requests property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalRequests() {
        return this.totalRequests;
    }
    /**
     * Gets the unique_visitors property value. The unique_visitors property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUniqueVisitors() {
        return this.uniqueVisitors;
    }
    /**
     * Gets the video_bandwidth_bytes property value. The video_bandwidth_bytes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVideoBandwidthBytes() {
        return this.videoBandwidthBytes;
    }
    /**
     * Gets the video_requests property value. The video_requests property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVideoRequests() {
        return this.videoRequests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("data_source", this.getDataSource());
        writer.writeIntegerValue("image_bandwidth_bytes", this.getImageBandwidthBytes());
        writer.writeIntegerValue("image_requests", this.getImageRequests());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("snapshot_date", this.getSnapshotDate());
        writer.writeStringValue("snapshot_type", this.getSnapshotType());
        writer.writeIntegerValue("total_bandwidth_bytes", this.getTotalBandwidthBytes());
        writer.writeIntegerValue("total_requests", this.getTotalRequests());
        writer.writeIntegerValue("unique_visitors", this.getUniqueVisitors());
        writer.writeIntegerValue("video_bandwidth_bytes", this.getVideoBandwidthBytes());
        writer.writeIntegerValue("video_requests", this.getVideoRequests());
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
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the data_source property value. The data_source property
     * @param value Value to set for the data_source property.
     */
    public void setDataSource(@jakarta.annotation.Nullable final String value) {
        this.dataSource = value;
    }
    /**
     * Sets the image_bandwidth_bytes property value. The image_bandwidth_bytes property
     * @param value Value to set for the image_bandwidth_bytes property.
     */
    public void setImageBandwidthBytes(@jakarta.annotation.Nullable final Integer value) {
        this.imageBandwidthBytes = value;
    }
    /**
     * Sets the image_requests property value. The image_requests property
     * @param value Value to set for the image_requests property.
     */
    public void setImageRequests(@jakarta.annotation.Nullable final Integer value) {
        this.imageRequests = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the snapshot_date property value. The snapshot_date property
     * @param value Value to set for the snapshot_date property.
     */
    public void setSnapshotDate(@jakarta.annotation.Nullable final String value) {
        this.snapshotDate = value;
    }
    /**
     * Sets the snapshot_type property value. The snapshot_type property
     * @param value Value to set for the snapshot_type property.
     */
    public void setSnapshotType(@jakarta.annotation.Nullable final String value) {
        this.snapshotType = value;
    }
    /**
     * Sets the total_bandwidth_bytes property value. The total_bandwidth_bytes property
     * @param value Value to set for the total_bandwidth_bytes property.
     */
    public void setTotalBandwidthBytes(@jakarta.annotation.Nullable final Integer value) {
        this.totalBandwidthBytes = value;
    }
    /**
     * Sets the total_requests property value. The total_requests property
     * @param value Value to set for the total_requests property.
     */
    public void setTotalRequests(@jakarta.annotation.Nullable final Integer value) {
        this.totalRequests = value;
    }
    /**
     * Sets the unique_visitors property value. The unique_visitors property
     * @param value Value to set for the unique_visitors property.
     */
    public void setUniqueVisitors(@jakarta.annotation.Nullable final Integer value) {
        this.uniqueVisitors = value;
    }
    /**
     * Sets the video_bandwidth_bytes property value. The video_bandwidth_bytes property
     * @param value Value to set for the video_bandwidth_bytes property.
     */
    public void setVideoBandwidthBytes(@jakarta.annotation.Nullable final Integer value) {
        this.videoBandwidthBytes = value;
    }
    /**
     * Sets the video_requests property value. The video_requests property
     * @param value Value to set for the video_requests property.
     */
    public void setVideoRequests(@jakarta.annotation.Nullable final Integer value) {
        this.videoRequests = value;
    }
}
