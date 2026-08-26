package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListCategoriesResponse implements Parsable {
    /**
     * The categories property
     */
    private java.util.List<Category> categories;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListCategoriesResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListCategoriesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListCategoriesResponse();
    }
    /**
     * Gets the categories property value. The categories property
     * @return a {@link java.util.List<Category>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Category> getCategories() {
        return this.categories;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(Category::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
    }
    /**
     * Sets the categories property value. The categories property
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<Category> value) {
        this.categories = value;
    }
}
