package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SessionStartEvent implements Parsable {
    /**
     * The browser property
     */
    private String browser;
    /**
     * The color_depth property
     */
    private Double colorDepth;
    /**
     * The country property
     */
    private String country;
    /**
     * The language property
     */
    private String language;
    /**
     * The platform property
     */
    private String platform;
    /**
     * The screen_resolution property
     */
    private String screenResolution;
    /**
     * The tg_platform property
     */
    private String tgPlatform;
    /**
     * The tg_version property
     */
    private String tgVersion;
    /**
     * The timezone property
     */
    private String timezone;
    /**
     * The timezone_offset property
     */
    private Double timezoneOffset;
    /**
     * The touch_support property
     */
    private Boolean touchSupport;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * The utm_campaign property
     */
    private String utmCampaign;
    /**
     * The utm_source property
     */
    private String utmSource;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SessionStartEvent}
     */
    @jakarta.annotation.Nonnull
    public static SessionStartEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SessionStartEvent();
    }
    /**
     * Gets the browser property value. The browser property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.browser;
    }
    /**
     * Gets the color_depth property value. The color_depth property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getColorDepth() {
        return this.colorDepth;
    }
    /**
     * Gets the country property value. The country property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("color_depth", (n) -> { this.setColorDepth(n.getDoubleValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getStringValue()); });
        deserializerMap.put("screen_resolution", (n) -> { this.setScreenResolution(n.getStringValue()); });
        deserializerMap.put("tg_platform", (n) -> { this.setTgPlatform(n.getStringValue()); });
        deserializerMap.put("tg_version", (n) -> { this.setTgVersion(n.getStringValue()); });
        deserializerMap.put("timezone", (n) -> { this.setTimezone(n.getStringValue()); });
        deserializerMap.put("timezone_offset", (n) -> { this.setTimezoneOffset(n.getDoubleValue()); });
        deserializerMap.put("touch_support", (n) -> { this.setTouchSupport(n.getBooleanValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("utm_campaign", (n) -> { this.setUtmCampaign(n.getStringValue()); });
        deserializerMap.put("utm_source", (n) -> { this.setUtmSource(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the language property value. The language property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.language;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatform() {
        return this.platform;
    }
    /**
     * Gets the screen_resolution property value. The screen_resolution property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScreenResolution() {
        return this.screenResolution;
    }
    /**
     * Gets the tg_platform property value. The tg_platform property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTgPlatform() {
        return this.tgPlatform;
    }
    /**
     * Gets the tg_version property value. The tg_version property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTgVersion() {
        return this.tgVersion;
    }
    /**
     * Gets the timezone property value. The timezone property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimezone() {
        return this.timezone;
    }
    /**
     * Gets the timezone_offset property value. The timezone_offset property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTimezoneOffset() {
        return this.timezoneOffset;
    }
    /**
     * Gets the touch_support property value. The touch_support property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTouchSupport() {
        return this.touchSupport;
    }
    /**
     * Gets the user_id property value. The user_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the utm_campaign property value. The utm_campaign property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmCampaign() {
        return this.utmCampaign;
    }
    /**
     * Gets the utm_source property value. The utm_source property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmSource() {
        return this.utmSource;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeDoubleValue("color_depth", this.getColorDepth());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("platform", this.getPlatform());
        writer.writeStringValue("screen_resolution", this.getScreenResolution());
        writer.writeStringValue("tg_platform", this.getTgPlatform());
        writer.writeStringValue("tg_version", this.getTgVersion());
        writer.writeStringValue("timezone", this.getTimezone());
        writer.writeDoubleValue("timezone_offset", this.getTimezoneOffset());
        writer.writeBooleanValue("touch_support", this.getTouchSupport());
        writer.writeStringValue("user_id", this.getUserId());
        writer.writeStringValue("utm_campaign", this.getUtmCampaign());
        writer.writeStringValue("utm_source", this.getUtmSource());
    }
    /**
     * Sets the browser property value. The browser property
     * @param value Value to set for the browser property.
     */
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.browser = value;
    }
    /**
     * Sets the color_depth property value. The color_depth property
     * @param value Value to set for the color_depth property.
     */
    public void setColorDepth(@jakarta.annotation.Nullable final Double value) {
        this.colorDepth = value;
    }
    /**
     * Sets the country property value. The country property
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the language property value. The language property
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.language = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final String value) {
        this.platform = value;
    }
    /**
     * Sets the screen_resolution property value. The screen_resolution property
     * @param value Value to set for the screen_resolution property.
     */
    public void setScreenResolution(@jakarta.annotation.Nullable final String value) {
        this.screenResolution = value;
    }
    /**
     * Sets the tg_platform property value. The tg_platform property
     * @param value Value to set for the tg_platform property.
     */
    public void setTgPlatform(@jakarta.annotation.Nullable final String value) {
        this.tgPlatform = value;
    }
    /**
     * Sets the tg_version property value. The tg_version property
     * @param value Value to set for the tg_version property.
     */
    public void setTgVersion(@jakarta.annotation.Nullable final String value) {
        this.tgVersion = value;
    }
    /**
     * Sets the timezone property value. The timezone property
     * @param value Value to set for the timezone property.
     */
    public void setTimezone(@jakarta.annotation.Nullable final String value) {
        this.timezone = value;
    }
    /**
     * Sets the timezone_offset property value. The timezone_offset property
     * @param value Value to set for the timezone_offset property.
     */
    public void setTimezoneOffset(@jakarta.annotation.Nullable final Double value) {
        this.timezoneOffset = value;
    }
    /**
     * Sets the touch_support property value. The touch_support property
     * @param value Value to set for the touch_support property.
     */
    public void setTouchSupport(@jakarta.annotation.Nullable final Boolean value) {
        this.touchSupport = value;
    }
    /**
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the utm_campaign property value. The utm_campaign property
     * @param value Value to set for the utm_campaign property.
     */
    public void setUtmCampaign(@jakarta.annotation.Nullable final String value) {
        this.utmCampaign = value;
    }
    /**
     * Sets the utm_source property value. The utm_source property
     * @param value Value to set for the utm_source property.
     */
    public void setUtmSource(@jakarta.annotation.Nullable final String value) {
        this.utmSource = value;
    }
}
