package com.rixl.sdk.analytics.v1.dashboards.item.export;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.analytics.v1.ExportFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportPostRequestBody implements Parsable {
    /**
     * The format property
     */
    private ExportFormat format;
    /**
     * The time_end property
     */
    private String timeEnd;
    /**
     * The time_start property
     */
    private String timeStart;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExportPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ExportPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportPostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("format", (n) -> { this.setFormat(n.getEnumValue(ExportFormat::forValue)); });
        deserializerMap.put("time_end", (n) -> { this.setTimeEnd(n.getStringValue()); });
        deserializerMap.put("time_start", (n) -> { this.setTimeStart(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The format property
     * @return a {@link ExportFormat}
     */
    @jakarta.annotation.Nullable
    public ExportFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the time_end property value. The time_end property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeEnd() {
        return this.timeEnd;
    }
    /**
     * Gets the time_start property value. The time_start property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeStart() {
        return this.timeStart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("format", this.getFormat());
        writer.writeStringValue("time_end", this.getTimeEnd());
        writer.writeStringValue("time_start", this.getTimeStart());
    }
    /**
     * Sets the format property value. The format property
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final ExportFormat value) {
        this.format = value;
    }
    /**
     * Sets the time_end property value. The time_end property
     * @param value Value to set for the time_end property.
     */
    public void setTimeEnd(@jakarta.annotation.Nullable final String value) {
        this.timeEnd = value;
    }
    /**
     * Sets the time_start property value. The time_start property
     * @param value Value to set for the time_start property.
     */
    public void setTimeStart(@jakarta.annotation.Nullable final String value) {
        this.timeStart = value;
    }
}
