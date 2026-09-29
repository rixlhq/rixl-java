package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.ParseNodeHelper;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Composed type wrapper for classes {@link DomainStatusMember1}, {@link DomainStatusMember2}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainStatus implements ComposedTypeWrapper, Parsable {
    /**
     * Composed type representation for type {@link DomainStatusMember1}
     */
    private DomainStatusMember1 domainStatusMember1;
    /**
     * Composed type representation for type {@link DomainStatusMember2}
     */
    private DomainStatusMember2 domainStatusMember2;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DomainStatus}
     */
    @jakarta.annotation.Nonnull
    public static DomainStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final DomainStatus result = new DomainStatus();
        result.setDomainStatusMember1(new DomainStatusMember1());
        result.setDomainStatusMember2(new DomainStatusMember2());
        return result;
    }
    /**
     * Gets the DomainStatusMember1 property value. Composed type representation for type {@link DomainStatusMember1}
     * @return a {@link DomainStatusMember1}
     */
    @jakarta.annotation.Nullable
    public DomainStatusMember1 getDomainStatusMember1() {
        return this.domainStatusMember1;
    }
    /**
     * Gets the DomainStatusMember2 property value. Composed type representation for type {@link DomainStatusMember2}
     * @return a {@link DomainStatusMember2}
     */
    @jakarta.annotation.Nullable
    public DomainStatusMember2 getDomainStatusMember2() {
        return this.domainStatusMember2;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        if (this.getDomainStatusMember1() != null || this.getDomainStatusMember2() != null) {
            return ParseNodeHelper.mergeDeserializersForIntersectionWrapper(this.getDomainStatusMember1(), this.getDomainStatusMember2());
        }
        return new HashMap<String, java.util.function.Consumer<ParseNode>>();
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue(null, this.getDomainStatusMember1(), this.getDomainStatusMember2());
    }
    /**
     * Sets the DomainStatusMember1 property value. Composed type representation for type {@link DomainStatusMember1}
     * @param value Value to set for the DomainStatusMember1 property.
     */
    public void setDomainStatusMember1(@jakarta.annotation.Nullable final DomainStatusMember1 value) {
        this.domainStatusMember1 = value;
    }
    /**
     * Sets the DomainStatusMember2 property value. Composed type representation for type {@link DomainStatusMember2}
     * @param value Value to set for the DomainStatusMember2 property.
     */
    public void setDomainStatusMember2(@jakarta.annotation.Nullable final DomainStatusMember2 value) {
        this.domainStatusMember2 = value;
    }
}
