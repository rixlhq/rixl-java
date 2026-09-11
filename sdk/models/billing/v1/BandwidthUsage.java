package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BandwidthUsage implements Parsable {
    /**
     * The created_at property
     */
    private OffsetDateTime createdAt;
    /**
     * The data_source property
     */
    private String dataSource;
    /**
     * The image_bandwidth_bytes property
     */
    private String imageBandwidthBytes;
    /**
     * The image_requests property
     */
    private String imageRequests;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The snapshot_date property
     */
    private OffsetDateTime snapshotDate;
    /**
     * The snapshot_type property
     */
    private String snapshotType;
    /**
     * The total_bandwidth_bytes property
     */
    private String totalBandwidthBytes;
    /**
     * The total_requests property
     */
    private String totalRequests;
    /**
     * The unique_visitors property
     */
    private String uniqueVisitors;
    /**
     * The video_bandwidth_bytes property
     */
    private String videoBandwidthBytes;
    /**
     * The video_requests property
     */
    private String videoRequests;
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
     * Gets the created_at property value. The created_at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
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
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("data_source", (n) -> { this.setDataSource(n.getStringValue()); });
        deserializerMap.put("image_bandwidth_bytes", (n) -> { this.setImageBandwidthBytes(n.getStringValue()); });
        deserializerMap.put("image_requests", (n) -> { this.setImageRequests(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("snapshot_date", (n) -> { this.setSnapshotDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("snapshot_type", (n) -> { this.setSnapshotType(n.getStringValue()); });
        deserializerMap.put("total_bandwidth_bytes", (n) -> { this.setTotalBandwidthBytes(n.getStringValue()); });
        deserializerMap.put("total_requests", (n) -> { this.setTotalRequests(n.getStringValue()); });
        deserializerMap.put("unique_visitors", (n) -> { this.setUniqueVisitors(n.getStringValue()); });
        deserializerMap.put("video_bandwidth_bytes", (n) -> { this.setVideoBandwidthBytes(n.getStringValue()); });
        deserializerMap.put("video_requests", (n) -> { this.setVideoRequests(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the image_bandwidth_bytes property value. The image_bandwidth_bytes property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageBandwidthBytes() {
        return this.imageBandwidthBytes;
    }
    /**
     * Gets the image_requests property value. The image_requests property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageRequests() {
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
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSnapshotDate() {
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTotalBandwidthBytes() {
        return this.totalBandwidthBytes;
    }
    /**
     * Gets the total_requests property value. The total_requests property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTotalRequests() {
        return this.totalRequests;
    }
    /**
     * Gets the unique_visitors property value. The unique_visitors property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueVisitors() {
        return this.uniqueVisitors;
    }
    /**
     * Gets the video_bandwidth_bytes property value. The video_bandwidth_bytes property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoBandwidthBytes() {
        return this.videoBandwidthBytes;
    }
    /**
     * Gets the video_requests property value. The video_requests property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoRequests() {
        return this.videoRequests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("created_at", this.getCreatedAt());
        writer.writeStringValue("data_source", this.getDataSource());
        writer.writeStringValue("image_bandwidth_bytes", this.getImageBandwidthBytes());
        writer.writeStringValue("image_requests", this.getImageRequests());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeOffsetDateTimeValue("snapshot_date", this.getSnapshotDate());
        writer.writeStringValue("snapshot_type", this.getSnapshotType());
        writer.writeStringValue("total_bandwidth_bytes", this.getTotalBandwidthBytes());
        writer.writeStringValue("total_requests", this.getTotalRequests());
        writer.writeStringValue("unique_visitors", this.getUniqueVisitors());
        writer.writeStringValue("video_bandwidth_bytes", this.getVideoBandwidthBytes());
        writer.writeStringValue("video_requests", this.getVideoRequests());
    }
    /**
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
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
    public void setImageBandwidthBytes(@jakarta.annotation.Nullable final String value) {
        this.imageBandwidthBytes = value;
    }
    /**
     * Sets the image_requests property value. The image_requests property
     * @param value Value to set for the image_requests property.
     */
    public void setImageRequests(@jakarta.annotation.Nullable final String value) {
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
    public void setSnapshotDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
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
    public void setTotalBandwidthBytes(@jakarta.annotation.Nullable final String value) {
        this.totalBandwidthBytes = value;
    }
    /**
     * Sets the total_requests property value. The total_requests property
     * @param value Value to set for the total_requests property.
     */
    public void setTotalRequests(@jakarta.annotation.Nullable final String value) {
        this.totalRequests = value;
    }
    /**
     * Sets the unique_visitors property value. The unique_visitors property
     * @param value Value to set for the unique_visitors property.
     */
    public void setUniqueVisitors(@jakarta.annotation.Nullable final String value) {
        this.uniqueVisitors = value;
    }
    /**
     * Sets the video_bandwidth_bytes property value. The video_bandwidth_bytes property
     * @param value Value to set for the video_bandwidth_bytes property.
     */
    public void setVideoBandwidthBytes(@jakarta.annotation.Nullable final String value) {
        this.videoBandwidthBytes = value;
    }
    /**
     * Sets the video_requests property value. The video_requests property
     * @param value Value to set for the video_requests property.
     */
    public void setVideoRequests(@jakarta.annotation.Nullable final String value) {
        this.videoRequests = value;
    }
}
