package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DashboardPoint implements Parsable {
    /**
     * The timestamp property
     */
    private String timestamp;
    /**
     * The uniqueUsers property
     */
    private UntypedNode uniqueUsers;
    /**
     * The views property
     */
    private UntypedNode views;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getStringValue()); });
        deserializerMap.put("uniqueUsers", (n) -> { this.setUniqueUsers(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("views", (n) -> { this.setViews(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
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
     * Gets the uniqueUsers property value. The uniqueUsers property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getUniqueUsers() {
        return this.uniqueUsers;
    }
    /**
     * Gets the views property value. The views property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getViews() {
        return this.views;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("timestamp", this.getTimestamp());
        writer.writeObjectValue("uniqueUsers", this.getUniqueUsers());
        writer.writeObjectValue("views", this.getViews());
    }
    /**
     * Sets the timestamp property value. The timestamp property
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final String value) {
        this.timestamp = value;
    }
    /**
     * Sets the uniqueUsers property value. The uniqueUsers property
     * @param value Value to set for the uniqueUsers property.
     */
    public void setUniqueUsers(@jakarta.annotation.Nullable final UntypedNode value) {
        this.uniqueUsers = value;
    }
    /**
     * Sets the views property value. The views property
     * @param value Value to set for the views property.
     */
    public void setViews(@jakarta.annotation.Nullable final UntypedNode value) {
        this.views = value;
    }
}
