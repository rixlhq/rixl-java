package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationPreference implements Parsable {
    /**
     * always_sent lists the notices in this category the caller receives even with email disabled.
     */
    private java.util.List<String> alwaysSent;
    /**
     * The category property
     */
    private NotificationCategory category;
    /**
     * The email_enabled property
     */
    private Boolean emailEnabled;
    /**
     * locked is true when the caller&apos;s role cannot disable the category.
     */
    private Boolean locked;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NotificationPreference}
     */
    @jakarta.annotation.Nonnull
    public static NotificationPreference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotificationPreference();
    }
    /**
     * Gets the always_sent property value. always_sent lists the notices in this category the caller receives even with email disabled.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlwaysSent() {
        return this.alwaysSent;
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link NotificationCategory}
     */
    @jakarta.annotation.Nullable
    public NotificationCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the email_enabled property value. The email_enabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailEnabled() {
        return this.emailEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("always_sent", (n) -> { this.setAlwaysSent(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(NotificationCategory::forValue)); });
        deserializerMap.put("email_enabled", (n) -> { this.setEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("locked", (n) -> { this.setLocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locked property value. locked is true when the caller&apos;s role cannot disable the category.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocked() {
        return this.locked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("always_sent", this.getAlwaysSent());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeBooleanValue("email_enabled", this.getEmailEnabled());
        writer.writeBooleanValue("locked", this.getLocked());
    }
    /**
     * Sets the always_sent property value. always_sent lists the notices in this category the caller receives even with email disabled.
     * @param value Value to set for the always_sent property.
     */
    public void setAlwaysSent(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.alwaysSent = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final NotificationCategory value) {
        this.category = value;
    }
    /**
     * Sets the email_enabled property value. The email_enabled property
     * @param value Value to set for the email_enabled property.
     */
    public void setEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.emailEnabled = value;
    }
    /**
     * Sets the locked property value. locked is true when the caller&apos;s role cannot disable the category.
     * @param value Value to set for the locked property.
     */
    public void setLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.locked = value;
    }
}
