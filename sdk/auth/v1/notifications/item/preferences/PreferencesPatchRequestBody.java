package com.rixl.sdk.auth.v1.notifications.item.preferences;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.NotificationCategory;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PreferencesPatchRequestBody implements Parsable {
    /**
     * The category property
     */
    private NotificationCategory category;
    /**
     * The email_enabled property
     */
    private Boolean emailEnabled;
    /**
     * The user property
     */
    private PreferencesPatchRequestBodyUser user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PreferencesPatchRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static PreferencesPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PreferencesPatchRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(NotificationCategory::forValue)); });
        deserializerMap.put("email_enabled", (n) -> { this.setEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(PreferencesPatchRequestBodyUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the user property value. The user property
     * @return a {@link PreferencesPatchRequestBodyUser}
     */
    @jakarta.annotation.Nullable
    public PreferencesPatchRequestBodyUser getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeBooleanValue("email_enabled", this.getEmailEnabled());
        writer.writeObjectValue("user", this.getUser());
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
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final PreferencesPatchRequestBodyUser value) {
        this.user = value;
    }
}
