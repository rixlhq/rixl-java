package com.rixl.sdk.auth.v1.organizations.item.transferownership;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.MembershipRole;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransferOwnershipPostRequestBody implements Parsable {
    /**
     * Omit to keep the current owner as a co-owner.
     */
    private MembershipRole demoteTo;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TransferOwnershipPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static TransferOwnershipPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TransferOwnershipPostRequestBody();
    }
    /**
     * Gets the demote_to property value. Omit to keep the current owner as a co-owner.
     * @return a {@link MembershipRole}
     */
    @jakarta.annotation.Nullable
    public MembershipRole getDemoteTo() {
        return this.demoteTo;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("demote_to", (n) -> { this.setDemoteTo(n.getEnumValue(MembershipRole::forValue)); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("demote_to", this.getDemoteTo());
        writer.writeStringValue("user_id", this.getUserId());
    }
    /**
     * Sets the demote_to property value. Omit to keep the current owner as a co-owner.
     * @param value Value to set for the demote_to property.
     */
    public void setDemoteTo(@jakarta.annotation.Nullable final MembershipRole value) {
        this.demoteTo = value;
    }
    /**
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
