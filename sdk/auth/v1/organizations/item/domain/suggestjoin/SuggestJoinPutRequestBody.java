package com.rixl.sdk.auth.v1.organizations.item.domain.suggestjoin;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuggestJoinPutRequestBody implements Parsable {
    /**
     * The enabled property
     */
    private Boolean enabled;
    /**
     * The user property
     */
    private SuggestJoinPutRequestBodyUser user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SuggestJoinPutRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static SuggestJoinPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SuggestJoinPutRequestBody();
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
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(SuggestJoinPutRequestBodyUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the user property value. The user property
     * @return a {@link SuggestJoinPutRequestBodyUser}
     */
    @jakarta.annotation.Nullable
    public SuggestJoinPutRequestBodyUser getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final SuggestJoinPutRequestBodyUser value) {
        this.user = value;
    }
}
