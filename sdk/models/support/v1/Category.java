package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Category implements Parsable {
    /**
     * The description property
     */
    private String description;
    /**
     * The icon property
     */
    private String icon;
    /**
     * The id property
     */
    private String id;
    /**
     * The name property
     */
    private String name;
    /**
     * The slug property
     */
    private String slug;
    /**
     * The sort_order property
     */
    private Integer sortOrder;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Category}
     */
    @jakarta.annotation.Nonnull
    public static Category createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Category();
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("icon", (n) -> { this.setIcon(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        deserializerMap.put("sort_order", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the icon property value. The icon property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIcon() {
        return this.icon;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the slug property value. The slug property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Gets the sort_order property value. The sort_order property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("icon", this.getIcon());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeIntegerValue("sort_order", this.getSortOrder());
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the icon property value. The icon property
     * @param value Value to set for the icon property.
     */
    public void setIcon(@jakarta.annotation.Nullable final String value) {
        this.icon = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the slug property value. The slug property
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the sort_order property value. The sort_order property
     * @param value Value to set for the sort_order property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.sortOrder = value;
    }
}
