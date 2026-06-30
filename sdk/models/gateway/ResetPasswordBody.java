package com.rixl.sdk.models.gateway;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Reset token and new password
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResetPasswordBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The new_password property
     */
    private String newPassword;
    /**
     * The token property
     */
    private String token;
    /**
     * Instantiates a new {@link ResetPasswordBody} and sets the default values.
     */
    public ResetPasswordBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResetPasswordBody}
     */
    @jakarta.annotation.Nonnull
    public static ResetPasswordBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResetPasswordBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("new_password", (n) -> { this.setNewPassword(n.getStringValue()); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the new_password property value. The new_password property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewPassword() {
        return this.newPassword;
    }
    /**
     * Gets the token property value. The token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("new_password", this.getNewPassword());
        writer.writeStringValue("token", this.getToken());
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
     * Sets the new_password property value. The new_password property
     * @param value Value to set for the new_password property.
     */
    public void setNewPassword(@jakarta.annotation.Nullable final String value) {
        this.newPassword = value;
    }
    /**
     * Sets the token property value. The token property
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
}
