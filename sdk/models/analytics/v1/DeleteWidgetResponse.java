package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeleteWidgetResponse implements Parsable {
    /**
     * The dashboard_revision property
     */
    private Integer dashboardRevision;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeleteWidgetResponse}
     */
    @jakarta.annotation.Nonnull
    public static DeleteWidgetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeleteWidgetResponse();
    }
    /**
     * Gets the dashboard_revision property value. The dashboard_revision property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDashboardRevision() {
        return this.dashboardRevision;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("dashboard_revision", (n) -> { this.setDashboardRevision(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("dashboard_revision", this.getDashboardRevision());
    }
    /**
     * Sets the dashboard_revision property value. The dashboard_revision property
     * @param value Value to set for the dashboard_revision property.
     */
    public void setDashboardRevision(@jakarta.annotation.Nullable final Integer value) {
        this.dashboardRevision = value;
    }
}
