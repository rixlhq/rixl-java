package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListDomainJoinSuggestionsResponse implements Parsable {
    /**
     * The next_page_token property
     */
    private String nextPageToken;
    /**
     * The organizations property
     */
    private java.util.List<Organization> organizations;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListDomainJoinSuggestionsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListDomainJoinSuggestionsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListDomainJoinSuggestionsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("next_page_token", (n) -> { this.setNextPageToken(n.getStringValue()); });
        deserializerMap.put("organizations", (n) -> { this.setOrganizations(n.getCollectionOfObjectValues(Organization::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the next_page_token property value. The next_page_token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNextPageToken() {
        return this.nextPageToken;
    }
    /**
     * Gets the organizations property value. The organizations property
     * @return a {@link java.util.List<Organization>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Organization> getOrganizations() {
        return this.organizations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("next_page_token", this.getNextPageToken());
        writer.writeCollectionOfObjectValues("organizations", this.getOrganizations());
    }
    /**
     * Sets the next_page_token property value. The next_page_token property
     * @param value Value to set for the next_page_token property.
     */
    public void setNextPageToken(@jakarta.annotation.Nullable final String value) {
        this.nextPageToken = value;
    }
    /**
     * Sets the organizations property value. The organizations property
     * @param value Value to set for the organizations property.
     */
    public void setOrganizations(@jakarta.annotation.Nullable final java.util.List<Organization> value) {
        this.organizations = value;
    }
}
