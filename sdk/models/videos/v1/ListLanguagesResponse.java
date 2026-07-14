package com.rixl.sdk.models.videos.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListLanguagesResponse implements Parsable {
    /**
     * The languages property
     */
    private java.util.List<Language> languages;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListLanguagesResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListLanguagesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListLanguagesResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("languages", (n) -> { this.setLanguages(n.getCollectionOfObjectValues(Language::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the languages property value. The languages property
     * @return a {@link java.util.List<Language>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Language> getLanguages() {
        return this.languages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("languages", this.getLanguages());
    }
    /**
     * Sets the languages property value. The languages property
     * @param value Value to set for the languages property.
     */
    public void setLanguages(@jakarta.annotation.Nullable final java.util.List<Language> value) {
        this.languages = value;
    }
}
