package com.rixl.sdk.models.project.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListProjectsResponse implements Parsable {
    /**
     * The projects property
     */
    private java.util.List<Project> projects;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListProjectsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListProjectsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListProjectsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("projects", (n) -> { this.setProjects(n.getCollectionOfObjectValues(Project::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the projects property value. The projects property
     * @return a {@link java.util.List<Project>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Project> getProjects() {
        return this.projects;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("projects", this.getProjects());
    }
    /**
     * Sets the projects property value. The projects property
     * @param value Value to set for the projects property.
     */
    public void setProjects(@jakarta.annotation.Nullable final java.util.List<Project> value) {
        this.projects = value;
    }
}
