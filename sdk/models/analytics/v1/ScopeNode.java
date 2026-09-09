package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScopeNode implements Parsable {
    /**
     * The filters property
     */
    private java.util.List<ChartFilter> filters;
    /**
     * The has_children property
     */
    private Boolean hasChildren;
    /**
     * The id property
     */
    private String id;
    /**
     * The kind property
     */
    private String kind;
    /**
     * The label property
     */
    private String label;
    /**
     * The views property
     */
    private Long views;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ScopeNode}
     */
    @jakarta.annotation.Nonnull
    public static ScopeNode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScopeNode();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getCollectionOfObjectValues(ChartFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("has_children", (n) -> { this.setHasChildren(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("views", (n) -> { this.setViews(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filters property value. The filters property
     * @return a {@link java.util.List<ChartFilter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChartFilter> getFilters() {
        return this.filters;
    }
    /**
     * Gets the has_children property value. The has_children property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasChildren() {
        return this.hasChildren;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the kind property value. The kind property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKind() {
        return this.kind;
    }
    /**
     * Gets the label property value. The label property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the views property value. The views property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getViews() {
        return this.views;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("filters", this.getFilters());
        writer.writeBooleanValue("has_children", this.getHasChildren());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("kind", this.getKind());
        writer.writeStringValue("label", this.getLabel());
        writer.writeLongValue("views", this.getViews());
    }
    /**
     * Sets the filters property value. The filters property
     * @param value Value to set for the filters property.
     */
    public void setFilters(@jakarta.annotation.Nullable final java.util.List<ChartFilter> value) {
        this.filters = value;
    }
    /**
     * Sets the has_children property value. The has_children property
     * @param value Value to set for the has_children property.
     */
    public void setHasChildren(@jakarta.annotation.Nullable final Boolean value) {
        this.hasChildren = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the kind property value. The kind property
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final String value) {
        this.kind = value;
    }
    /**
     * Sets the label property value. The label property
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the views property value. The views property
     * @param value Value to set for the views property.
     */
    public void setViews(@jakarta.annotation.Nullable final Long value) {
        this.views = value;
    }
}
