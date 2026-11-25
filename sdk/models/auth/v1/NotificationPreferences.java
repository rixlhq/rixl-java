package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationPreferences implements Parsable {
    /**
     * The preferences property
     */
    private java.util.List<NotificationPreference> preferences;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NotificationPreferences}
     */
    @jakarta.annotation.Nonnull
    public static NotificationPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotificationPreferences();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("preferences", (n) -> { this.setPreferences(n.getCollectionOfObjectValues(NotificationPreference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the preferences property value. The preferences property
     * @return a {@link java.util.List<NotificationPreference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationPreference> getPreferences() {
        return this.preferences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("preferences", this.getPreferences());
    }
    /**
     * Sets the preferences property value. The preferences property
     * @param value Value to set for the preferences property.
     */
    public void setPreferences(@jakarta.annotation.Nullable final java.util.List<NotificationPreference> value) {
        this.preferences = value;
    }
}
