package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListPlansResponse implements Parsable {
    /**
     * The plans property
     */
    private java.util.List<Plan> plans;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListPlansResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListPlansResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListPlansResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(Plan::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the plans property value. The plans property
     * @return a {@link java.util.List<Plan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Plan> getPlans() {
        return this.plans;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
    }
    /**
     * Sets the plans property value. The plans property
     * @param value Value to set for the plans property.
     */
    public void setPlans(@jakarta.annotation.Nullable final java.util.List<Plan> value) {
        this.plans = value;
    }
}
