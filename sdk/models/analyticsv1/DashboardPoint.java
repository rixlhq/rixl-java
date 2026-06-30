package com.rixl.sdk.models.analyticsv1;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DashboardPoint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The timestamp property
     */
    private String timestamp;
    /**
     * The unique_users property
     */
    private Integer uniqueUsers;
    /**
     * The views property
     */
    private Integer views;
    /**
     * Instantiates a new {@link DashboardPoint} and sets the default values.
     */
    public DashboardPoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DashboardPoint}
     */
    @jakarta.annotation.Nonnull
    public static DashboardPoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DashboardPoint();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getStringValue()); });
        deserializerMap.put("unique_users", (n) -> { this.setUniqueUsers(n.getIntegerValue()); });
        deserializerMap.put("views", (n) -> { this.setViews(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the timestamp property value. The timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the unique_users property value. The unique_users property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUniqueUsers() {
        return this.uniqueUsers;
    }
    /**
     * Gets the views property value. The views property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getViews() {
        return this.views;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("timestamp", this.getTimestamp());
        writer.writeIntegerValue("unique_users", this.getUniqueUsers());
        writer.writeIntegerValue("views", this.getViews());
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
     * Sets the timestamp property value. The timestamp property
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final String value) {
        this.timestamp = value;
    }
    /**
     * Sets the unique_users property value. The unique_users property
     * @param value Value to set for the unique_users property.
     */
    public void setUniqueUsers(@jakarta.annotation.Nullable final Integer value) {
        this.uniqueUsers = value;
    }
    /**
     * Sets the views property value. The views property
     * @param value Value to set for the views property.
     */
    public void setViews(@jakarta.annotation.Nullable final Integer value) {
        this.views = value;
    }
}
