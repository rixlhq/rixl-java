package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetFilterOptionsRequest implements Parsable {
    /**
     * The dataset property
     */
    private String dataset;
    /**
     * The field property
     */
    private String field;
    /**
     * The limit property
     */
    private Integer limit;
    /**
     * The time_end property
     */
    private String timeEnd;
    /**
     * The time_start property
     */
    private String timeStart;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetFilterOptionsRequest}
     */
    @jakarta.annotation.Nonnull
    public static GetFilterOptionsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetFilterOptionsRequest();
    }
    /**
     * Gets the dataset property value. The dataset property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataset() {
        return this.dataset;
    }
    /**
     * Gets the field property value. The field property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getField() {
        return this.field;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getStringValue()); });
        deserializerMap.put("field", (n) -> { this.setField(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("time_end", (n) -> { this.setTimeEnd(n.getStringValue()); });
        deserializerMap.put("time_start", (n) -> { this.setTimeStart(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. The limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the time_end property value. The time_end property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeEnd() {
        return this.timeEnd;
    }
    /**
     * Gets the time_start property value. The time_start property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeStart() {
        return this.timeStart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataset", this.getDataset());
        writer.writeStringValue("field", this.getField());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("time_end", this.getTimeEnd());
        writer.writeStringValue("time_start", this.getTimeStart());
    }
    /**
     * Sets the dataset property value. The dataset property
     * @param value Value to set for the dataset property.
     */
    public void setDataset(@jakarta.annotation.Nullable final String value) {
        this.dataset = value;
    }
    /**
     * Sets the field property value. The field property
     * @param value Value to set for the field property.
     */
    public void setField(@jakarta.annotation.Nullable final String value) {
        this.field = value;
    }
    /**
     * Sets the limit property value. The limit property
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the time_end property value. The time_end property
     * @param value Value to set for the time_end property.
     */
    public void setTimeEnd(@jakarta.annotation.Nullable final String value) {
        this.timeEnd = value;
    }
    /**
     * Sets the time_start property value. The time_start property
     * @param value Value to set for the time_start property.
     */
    public void setTimeStart(@jakarta.annotation.Nullable final String value) {
        this.timeStart = value;
    }
}
