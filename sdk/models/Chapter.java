package com.qeeqez.rixl.sdk.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Chapter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The duration_label property
     */
    private String durationLabel;
    /**
     * The end_time_sec property
     */
    private Double endTimeSec;
    /**
     * The start_time_sec property
     */
    private Double startTimeSec;
    /**
     * The title property
     */
    private String title;
    /**
     * Instantiates a new {@link Chapter} and sets the default values.
     */
    public Chapter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Chapter}
     */
    @jakarta.annotation.Nonnull
    public static Chapter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Chapter();
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
     * Gets the duration_label property value. The duration_label property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDurationLabel() {
        return this.durationLabel;
    }
    /**
     * Gets the end_time_sec property value. The end_time_sec property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getEndTimeSec() {
        return this.endTimeSec;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("duration_label", (n) -> { this.setDurationLabel(n.getStringValue()); });
        deserializerMap.put("end_time_sec", (n) -> { this.setEndTimeSec(n.getDoubleValue()); });
        deserializerMap.put("start_time_sec", (n) -> { this.setStartTimeSec(n.getDoubleValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the start_time_sec property value. The start_time_sec property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getStartTimeSec() {
        return this.startTimeSec;
    }
    /**
     * Gets the title property value. The title property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("duration_label", this.getDurationLabel());
        writer.writeDoubleValue("end_time_sec", this.getEndTimeSec());
        writer.writeDoubleValue("start_time_sec", this.getStartTimeSec());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the duration_label property value. The duration_label property
     * @param value Value to set for the duration_label property.
     */
    public void setDurationLabel(@jakarta.annotation.Nullable final String value) {
        this.durationLabel = value;
    }
    /**
     * Sets the end_time_sec property value. The end_time_sec property
     * @param value Value to set for the end_time_sec property.
     */
    public void setEndTimeSec(@jakarta.annotation.Nullable final Double value) {
        this.endTimeSec = value;
    }
    /**
     * Sets the start_time_sec property value. The start_time_sec property
     * @param value Value to set for the start_time_sec property.
     */
    public void setStartTimeSec(@jakarta.annotation.Nullable final Double value) {
        this.startTimeSec = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
