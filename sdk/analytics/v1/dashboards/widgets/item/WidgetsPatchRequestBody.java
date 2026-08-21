package com.rixl.sdk.analytics.v1.dashboards.widgets.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.analytics.v1.WidgetPatch;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WidgetsPatchRequestBody implements Parsable {
    /**
     * The expected_revision property
     */
    private Integer expectedRevision;
    /**
     * The patch property
     */
    private WidgetPatch patch;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WidgetsPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static WidgetsPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WidgetsPatchRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("expected_revision", (n) -> { this.setExpectedRevision(n.getIntegerValue()); });
        deserializerMap.put("patch", (n) -> { this.setPatch(n.getObjectValue(WidgetPatch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the patch property value. The patch property
     * @return a {@link WidgetPatch}
     */
    @jakarta.annotation.Nullable
    public WidgetPatch getPatch() {
        return this.patch;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("expected_revision", this.getExpectedRevision());
        writer.writeObjectValue("patch", this.getPatch());
    }
    /**
     * Sets the expected_revision property value. The expected_revision property
     * @param value Value to set for the expected_revision property.
     */
    public void setExpectedRevision(@jakarta.annotation.Nullable final Integer value) {
        this.expectedRevision = value;
    }
    /**
     * Sets the patch property value. The patch property
     * @param value Value to set for the patch property.
     */
    public void setPatch(@jakarta.annotation.Nullable final WidgetPatch value) {
        this.patch = value;
    }
}
