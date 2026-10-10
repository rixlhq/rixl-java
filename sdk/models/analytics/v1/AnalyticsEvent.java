package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.ParseNodeHelper;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Composed type wrapper for classes {@link AnalyticsEventMember1}, {@link AnalyticsEventMember2}, {@link AnalyticsEventMember3}, {@link AnalyticsEventMember4}, {@link AnalyticsEventMember5}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyticsEvent implements ComposedTypeWrapper, Parsable {
    /**
     * Composed type representation for type {@link AnalyticsEventMember1}
     */
    private AnalyticsEventMember1 analyticsEventMember1;
    /**
     * Composed type representation for type {@link AnalyticsEventMember2}
     */
    private AnalyticsEventMember2 analyticsEventMember2;
    /**
     * Composed type representation for type {@link AnalyticsEventMember3}
     */
    private AnalyticsEventMember3 analyticsEventMember3;
    /**
     * Composed type representation for type {@link AnalyticsEventMember4}
     */
    private AnalyticsEventMember4 analyticsEventMember4;
    /**
     * Composed type representation for type {@link AnalyticsEventMember5}
     */
    private AnalyticsEventMember5 analyticsEventMember5;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyticsEvent}
     */
    @jakarta.annotation.Nonnull
    public static AnalyticsEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final AnalyticsEvent result = new AnalyticsEvent();
        result.setAnalyticsEventMember1(new AnalyticsEventMember1());
        result.setAnalyticsEventMember2(new AnalyticsEventMember2());
        result.setAnalyticsEventMember3(new AnalyticsEventMember3());
        result.setAnalyticsEventMember4(new AnalyticsEventMember4());
        result.setAnalyticsEventMember5(new AnalyticsEventMember5());
        return result;
    }
    /**
     * Gets the AnalyticsEventMember1 property value. Composed type representation for type {@link AnalyticsEventMember1}
     * @return a {@link AnalyticsEventMember1}
     */
    @jakarta.annotation.Nullable
    public AnalyticsEventMember1 getAnalyticsEventMember1() {
        return this.analyticsEventMember1;
    }
    /**
     * Gets the AnalyticsEventMember2 property value. Composed type representation for type {@link AnalyticsEventMember2}
     * @return a {@link AnalyticsEventMember2}
     */
    @jakarta.annotation.Nullable
    public AnalyticsEventMember2 getAnalyticsEventMember2() {
        return this.analyticsEventMember2;
    }
    /**
     * Gets the AnalyticsEventMember3 property value. Composed type representation for type {@link AnalyticsEventMember3}
     * @return a {@link AnalyticsEventMember3}
     */
    @jakarta.annotation.Nullable
    public AnalyticsEventMember3 getAnalyticsEventMember3() {
        return this.analyticsEventMember3;
    }
    /**
     * Gets the AnalyticsEventMember4 property value. Composed type representation for type {@link AnalyticsEventMember4}
     * @return a {@link AnalyticsEventMember4}
     */
    @jakarta.annotation.Nullable
    public AnalyticsEventMember4 getAnalyticsEventMember4() {
        return this.analyticsEventMember4;
    }
    /**
     * Gets the AnalyticsEventMember5 property value. Composed type representation for type {@link AnalyticsEventMember5}
     * @return a {@link AnalyticsEventMember5}
     */
    @jakarta.annotation.Nullable
    public AnalyticsEventMember5 getAnalyticsEventMember5() {
        return this.analyticsEventMember5;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        if (this.getAnalyticsEventMember1() != null || this.getAnalyticsEventMember2() != null || this.getAnalyticsEventMember3() != null || this.getAnalyticsEventMember4() != null || this.getAnalyticsEventMember5() != null) {
            return ParseNodeHelper.mergeDeserializersForIntersectionWrapper(this.getAnalyticsEventMember1(), this.getAnalyticsEventMember2(), this.getAnalyticsEventMember3(), this.getAnalyticsEventMember4(), this.getAnalyticsEventMember5());
        }
        return new HashMap<String, java.util.function.Consumer<ParseNode>>();
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue(null, this.getAnalyticsEventMember1(), this.getAnalyticsEventMember2(), this.getAnalyticsEventMember3(), this.getAnalyticsEventMember4(), this.getAnalyticsEventMember5());
    }
    /**
     * Sets the AnalyticsEventMember1 property value. Composed type representation for type {@link AnalyticsEventMember1}
     * @param value Value to set for the AnalyticsEventMember1 property.
     */
    public void setAnalyticsEventMember1(@jakarta.annotation.Nullable final AnalyticsEventMember1 value) {
        this.analyticsEventMember1 = value;
    }
    /**
     * Sets the AnalyticsEventMember2 property value. Composed type representation for type {@link AnalyticsEventMember2}
     * @param value Value to set for the AnalyticsEventMember2 property.
     */
    public void setAnalyticsEventMember2(@jakarta.annotation.Nullable final AnalyticsEventMember2 value) {
        this.analyticsEventMember2 = value;
    }
    /**
     * Sets the AnalyticsEventMember3 property value. Composed type representation for type {@link AnalyticsEventMember3}
     * @param value Value to set for the AnalyticsEventMember3 property.
     */
    public void setAnalyticsEventMember3(@jakarta.annotation.Nullable final AnalyticsEventMember3 value) {
        this.analyticsEventMember3 = value;
    }
    /**
     * Sets the AnalyticsEventMember4 property value. Composed type representation for type {@link AnalyticsEventMember4}
     * @param value Value to set for the AnalyticsEventMember4 property.
     */
    public void setAnalyticsEventMember4(@jakarta.annotation.Nullable final AnalyticsEventMember4 value) {
        this.analyticsEventMember4 = value;
    }
    /**
     * Sets the AnalyticsEventMember5 property value. Composed type representation for type {@link AnalyticsEventMember5}
     * @param value Value to set for the AnalyticsEventMember5 property.
     */
    public void setAnalyticsEventMember5(@jakarta.annotation.Nullable final AnalyticsEventMember5 value) {
        this.analyticsEventMember5 = value;
    }
}
