package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListDashboardsResponse implements Parsable {
    /**
     * The dashboards property
     */
    private java.util.List<Dashboard> dashboards;
    /**
     * The page property
     */
    private Integer page;
    /**
     * The page_size property
     */
    private Integer pageSize;
    /**
     * The total property
     */
    private Long total;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListDashboardsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListDashboardsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListDashboardsResponse();
    }
    /**
     * Gets the dashboards property value. The dashboards property
     * @return a {@link java.util.List<Dashboard>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Dashboard> getDashboards() {
        return this.dashboards;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dashboards", (n) -> { this.setDashboards(n.getCollectionOfObjectValues(Dashboard::createFromDiscriminatorValue)); });
        deserializerMap.put("page", (n) -> { this.setPage(n.getIntegerValue()); });
        deserializerMap.put("page_size", (n) -> { this.setPageSize(n.getIntegerValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the page property value. The page property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPage() {
        return this.page;
    }
    /**
     * Gets the page_size property value. The page_size property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPageSize() {
        return this.pageSize;
    }
    /**
     * Gets the total property value. The total property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dashboards", this.getDashboards());
        writer.writeIntegerValue("page", this.getPage());
        writer.writeIntegerValue("page_size", this.getPageSize());
        writer.writeLongValue("total", this.getTotal());
    }
    /**
     * Sets the dashboards property value. The dashboards property
     * @param value Value to set for the dashboards property.
     */
    public void setDashboards(@jakarta.annotation.Nullable final java.util.List<Dashboard> value) {
        this.dashboards = value;
    }
    /**
     * Sets the page property value. The page property
     * @param value Value to set for the page property.
     */
    public void setPage(@jakarta.annotation.Nullable final Integer value) {
        this.page = value;
    }
    /**
     * Sets the page_size property value. The page_size property
     * @param value Value to set for the page_size property.
     */
    public void setPageSize(@jakarta.annotation.Nullable final Integer value) {
        this.pageSize = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.total = value;
    }
}
