package com.rixl.sdk.analytics.v1.dashboards.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DashboardPatchRequestBody implements Parsable {
    /**
     * The expected_revision property
     */
    private Integer expectedRevision;
    /**
     * The name property
     */
    private String name;
    /**
     * The visibility property
     */
    private DashboardPatchRequestBodyVisibility visibility;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DashboardPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static DashboardPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DashboardPatchRequestBody();
    }
    /**
     * Gets the expected_revision property value. The expected_revision property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpectedRevision() {
        return this.expectedRevision;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("expected_revision", (n) -> { this.setExpectedRevision(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumValue(DashboardPatchRequestBodyVisibility::forValue)); });
        return deserializerMap;
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
     * Gets the visibility property value. The visibility property
     * @return a {@link DashboardPatchRequestBodyVisibility}
     */
    @jakarta.annotation.Nullable
    public DashboardPatchRequestBodyVisibility getVisibility() {
        return this.visibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("expected_revision", this.getExpectedRevision());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("visibility", this.getVisibility());
    }
    /**
     * Sets the expected_revision property value. The expected_revision property
     * @param value Value to set for the expected_revision property.
     */
    public void setExpectedRevision(@jakarta.annotation.Nullable final Integer value) {
        this.expectedRevision = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the visibility property value. The visibility property
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final DashboardPatchRequestBodyVisibility value) {
        this.visibility = value;
    }
}
