package com.rixl.sdk.models.images.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListImagesResponse implements Parsable {
    /**
     * The images property
     */
    private java.util.List<ImageSummary> images;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListImagesResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListImagesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListImagesResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("images", (n) -> { this.setImages(n.getCollectionOfObjectValues(ImageSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the images property value. The images property
     * @return a {@link java.util.List<ImageSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImageSummary> getImages() {
        return this.images;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("images", this.getImages());
    }
    /**
     * Sets the images property value. The images property
     * @param value Value to set for the images property.
     */
    public void setImages(@jakarta.annotation.Nullable final java.util.List<ImageSummary> value) {
        this.images = value;
    }
}
