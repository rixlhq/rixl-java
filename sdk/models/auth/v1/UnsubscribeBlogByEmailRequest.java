package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnsubscribeBlogByEmailRequest implements Parsable {
    /**
     * The email property
     */
    private String email;
    /**
     * The user property
     */
    private UserRequest user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnsubscribeBlogByEmailRequest}
     */
    @jakarta.annotation.Nonnull
    public static UnsubscribeBlogByEmailRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnsubscribeBlogByEmailRequest();
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(UserRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the user property value. The user property
     * @return a {@link UserRequest}
     */
    @jakarta.annotation.Nullable
    public UserRequest getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final UserRequest value) {
        this.user = value;
    }
}
