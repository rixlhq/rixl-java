package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Credentials
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegisterBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The email property
     */
    private String email;
    /**
     * The password property
     */
    private String password;
    /**
     * The subscribe_to_blog property
     */
    private Boolean subscribeToBlog;
    /**
     * Instantiates a new {@link RegisterBody} and sets the default values.
     */
    public RegisterBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RegisterBody}
     */
    @jakarta.annotation.Nonnull
    public static RegisterBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegisterBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("subscribe_to_blog", (n) -> { this.setSubscribeToBlog(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the password property value. The password property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the subscribe_to_blog property value. The subscribe_to_blog property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubscribeToBlog() {
        return this.subscribeToBlog;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("password", this.getPassword());
        writer.writeBooleanValue("subscribe_to_blog", this.getSubscribeToBlog());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the subscribe_to_blog property value. The subscribe_to_blog property
     * @param value Value to set for the subscribe_to_blog property.
     */
    public void setSubscribeToBlog(@jakarta.annotation.Nullable final Boolean value) {
        this.subscribeToBlog = value;
    }
}
