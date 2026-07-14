package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DashboardStatsResponse implements Parsable {
    /**
     * The points property
     */
    private java.util.List<DashboardPoint> points;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DashboardStatsResponse}
     */
    @jakarta.annotation.Nonnull
    public static DashboardStatsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DashboardStatsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("points", (n) -> { this.setPoints(n.getCollectionOfObjectValues(DashboardPoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the points property value. The points property
     * @return a {@link java.util.List<DashboardPoint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DashboardPoint> getPoints() {
        return this.points;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("points", this.getPoints());
    }
    /**
     * Sets the points property value. The points property
     * @param value Value to set for the points property.
     */
    public void setPoints(@jakarta.annotation.Nullable final java.util.List<DashboardPoint> value) {
        this.points = value;
    }
}
