package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutoJoinSetting implements Parsable {
    /**
     * The enabled property
     */
    private Boolean enabled;
    /**
     * The present property
     */
    private Boolean present;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutoJoinSetting}
     */
    @jakarta.annotation.Nonnull
    public static AutoJoinSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutoJoinSetting();
    }
    /**
     * Gets the enabled property value. The enabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("present", (n) -> { this.setPresent(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the present property value. The present property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPresent() {
        return this.present;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeBooleanValue("present", this.getPresent());
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the present property value. The present property
     * @param value Value to set for the present property.
     */
    public void setPresent(@jakarta.annotation.Nullable final Boolean value) {
        this.present = value;
    }
}
