package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetScopeTreeRequest implements Parsable {
    /**
     * Which level to expand. Empty returns the projects at the root.
     */
    private GetScopeTreeRequestLevel level;
    /**
     * The limit property
     */
    private Integer limit;
    /**
     * The project_id property
     */
    private String projectId;
    /**
     * The resource_type property
     */
    private GetScopeTreeRequestResourceType resourceType;
    /**
     * The search property
     */
    private String search;
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
     * @return a {@link GetScopeTreeRequest}
     */
    @jakarta.annotation.Nonnull
    public static GetScopeTreeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetScopeTreeRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("level", (n) -> { this.setLevel(n.getEnumValue(GetScopeTreeRequestLevel::forValue)); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("project_id", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("resource_type", (n) -> { this.setResourceType(n.getEnumValue(GetScopeTreeRequestResourceType::forValue)); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getStringValue()); });
        deserializerMap.put("time_end", (n) -> { this.setTimeEnd(n.getStringValue()); });
        deserializerMap.put("time_start", (n) -> { this.setTimeStart(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the level property value. Which level to expand. Empty returns the projects at the root.
     * @return a {@link GetScopeTreeRequestLevel}
     */
    @jakarta.annotation.Nullable
    public GetScopeTreeRequestLevel getLevel() {
        return this.level;
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
     * Gets the project_id property value. The project_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Gets the resource_type property value. The resource_type property
     * @return a {@link GetScopeTreeRequestResourceType}
     */
    @jakarta.annotation.Nullable
    public GetScopeTreeRequestResourceType getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the search property value. The search property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSearch() {
        return this.search;
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
        writer.writeEnumValue("level", this.getLevel());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("project_id", this.getProjectId());
        writer.writeEnumValue("resource_type", this.getResourceType());
        writer.writeStringValue("search", this.getSearch());
        writer.writeStringValue("time_end", this.getTimeEnd());
        writer.writeStringValue("time_start", this.getTimeStart());
    }
    /**
     * Sets the level property value. Which level to expand. Empty returns the projects at the root.
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final GetScopeTreeRequestLevel value) {
        this.level = value;
    }
    /**
     * Sets the limit property value. The limit property
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the project_id property value. The project_id property
     * @param value Value to set for the project_id property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the resource_type property value. The resource_type property
     * @param value Value to set for the resource_type property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final GetScopeTreeRequestResourceType value) {
        this.resourceType = value;
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     */
    public void setSearch(@jakarta.annotation.Nullable final String value) {
        this.search = value;
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
