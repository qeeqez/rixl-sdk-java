package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WidgetPatch implements Parsable {
    /**
     * The chart_type property
     */
    private String chartType;
    /**
     * The dataset property
     */
    private String dataset;
    /**
     * The filters property
     */
    private Filters filters;
    /**
     * The group_by property
     */
    private GroupBy groupBy;
    /**
     * The interval property
     */
    private String interval;
    /**
     * The limit property
     */
    private Integer limit;
    /**
     * The metric property
     */
    private String metric;
    /**
     * The title property
     */
    private String title;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WidgetPatch}
     */
    @jakarta.annotation.Nonnull
    public static WidgetPatch createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WidgetPatch();
    }
    /**
     * Gets the chart_type property value. The chart_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChartType() {
        return this.chartType;
    }
    /**
     * Gets the dataset property value. The dataset property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataset() {
        return this.dataset;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("chart_type", (n) -> { this.setChartType(n.getStringValue()); });
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getStringValue()); });
        deserializerMap.put("filters", (n) -> { this.setFilters(n.getObjectValue(Filters::createFromDiscriminatorValue)); });
        deserializerMap.put("group_by", (n) -> { this.setGroupBy(n.getObjectValue(GroupBy::createFromDiscriminatorValue)); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("metric", (n) -> { this.setMetric(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filters property value. The filters property
     * @return a {@link Filters}
     */
    @jakarta.annotation.Nullable
    public Filters getFilters() {
        return this.filters;
    }
    /**
     * Gets the group_by property value. The group_by property
     * @return a {@link GroupBy}
     */
    @jakarta.annotation.Nullable
    public GroupBy getGroupBy() {
        return this.groupBy;
    }
    /**
     * Gets the interval property value. The interval property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInterval() {
        return this.interval;
    }
    /**
     * Gets the limit property value. The limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the metric property value. The metric property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetric() {
        return this.metric;
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
        writer.writeStringValue("chart_type", this.getChartType());
        writer.writeStringValue("dataset", this.getDataset());
        writer.writeObjectValue("filters", this.getFilters());
        writer.writeObjectValue("group_by", this.getGroupBy());
        writer.writeStringValue("interval", this.getInterval());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("metric", this.getMetric());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the chart_type property value. The chart_type property
     * @param value Value to set for the chart_type property.
     */
    public void setChartType(@jakarta.annotation.Nullable final String value) {
        this.chartType = value;
    }
    /**
     * Sets the dataset property value. The dataset property
     * @param value Value to set for the dataset property.
     */
    public void setDataset(@jakarta.annotation.Nullable final String value) {
        this.dataset = value;
    }
    /**
     * Sets the filters property value. The filters property
     * @param value Value to set for the filters property.
     */
    public void setFilters(@jakarta.annotation.Nullable final Filters value) {
        this.filters = value;
    }
    /**
     * Sets the group_by property value. The group_by property
     * @param value Value to set for the group_by property.
     */
    public void setGroupBy(@jakarta.annotation.Nullable final GroupBy value) {
        this.groupBy = value;
    }
    /**
     * Sets the interval property value. The interval property
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final String value) {
        this.interval = value;
    }
    /**
     * Sets the limit property value. The limit property
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the metric property value. The metric property
     * @param value Value to set for the metric property.
     */
    public void setMetric(@jakarta.annotation.Nullable final String value) {
        this.metric = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
