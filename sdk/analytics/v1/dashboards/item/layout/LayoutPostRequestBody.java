package com.rixl.sdk.analytics.v1.dashboards.item.layout;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.analytics.v1.WidgetPosition;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LayoutPostRequestBody implements Parsable {
    /**
     * The expected_revision property
     */
    private Integer expectedRevision;
    /**
     * The positions property
     */
    private java.util.List<WidgetPosition> positions;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LayoutPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static LayoutPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LayoutPostRequestBody();
    }
    /**
     * Gets the expected_revision property value. The expected_revision property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpectedRevision() {
        return this.expectedRevision;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("expected_revision", (n) -> { this.setExpectedRevision(n.getIntegerValue()); });
        deserializerMap.put("positions", (n) -> { this.setPositions(n.getCollectionOfObjectValues(WidgetPosition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the positions property value. The positions property
     * @return a {@link java.util.List<WidgetPosition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WidgetPosition> getPositions() {
        return this.positions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("expected_revision", this.getExpectedRevision());
        writer.writeCollectionOfObjectValues("positions", this.getPositions());
    }
    /**
     * Sets the expected_revision property value. The expected_revision property
     * @param value Value to set for the expected_revision property.
     */
    public void setExpectedRevision(@jakarta.annotation.Nullable final Integer value) {
        this.expectedRevision = value;
    }
    /**
     * Sets the positions property value. The positions property
     * @param value Value to set for the positions property.
     */
    public void setPositions(@jakarta.annotation.Nullable final java.util.List<WidgetPosition> value) {
        this.positions = value;
    }
}
