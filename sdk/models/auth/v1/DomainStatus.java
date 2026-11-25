package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * At most one of `verified`, `pending` may be set.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainStatus implements Parsable {
    /**
     * The pending property
     */
    private PendingDomain pending;
    /**
     * The suggest_join property
     */
    private Boolean suggestJoin;
    /**
     * The verified property
     */
    private VerifiedDomain verified;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DomainStatus}
     */
    @jakarta.annotation.Nonnull
    public static DomainStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("pending", (n) -> { this.setPending(n.getObjectValue(PendingDomain::createFromDiscriminatorValue)); });
        deserializerMap.put("suggest_join", (n) -> { this.setSuggestJoin(n.getBooleanValue()); });
        deserializerMap.put("verified", (n) -> { this.setVerified(n.getObjectValue(VerifiedDomain::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pending property value. The pending property
     * @return a {@link PendingDomain}
     */
    @jakarta.annotation.Nullable
    public PendingDomain getPending() {
        return this.pending;
    }
    /**
     * Gets the suggest_join property value. The suggest_join property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSuggestJoin() {
        return this.suggestJoin;
    }
    /**
     * Gets the verified property value. The verified property
     * @return a {@link VerifiedDomain}
     */
    @jakarta.annotation.Nullable
    public VerifiedDomain getVerified() {
        return this.verified;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("pending", this.getPending());
        writer.writeBooleanValue("suggest_join", this.getSuggestJoin());
        writer.writeObjectValue("verified", this.getVerified());
    }
    /**
     * Sets the pending property value. The pending property
     * @param value Value to set for the pending property.
     */
    public void setPending(@jakarta.annotation.Nullable final PendingDomain value) {
        this.pending = value;
    }
    /**
     * Sets the suggest_join property value. The suggest_join property
     * @param value Value to set for the suggest_join property.
     */
    public void setSuggestJoin(@jakarta.annotation.Nullable final Boolean value) {
        this.suggestJoin = value;
    }
    /**
     * Sets the verified property value. The verified property
     * @param value Value to set for the verified property.
     */
    public void setVerified(@jakarta.annotation.Nullable final VerifiedDomain value) {
        this.verified = value;
    }
}
