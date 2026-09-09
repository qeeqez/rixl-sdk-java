package com.rixl.sdk.models.videos.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListVideosResponse implements Parsable {
    /**
     * Maximum number of items returned.
     */
    private Integer limit;
    /**
     * Number of items skipped before this page.
     */
    private Integer offset;
    /**
     * The sort_direction property
     */
    private String sortDirection;
    /**
     * The sort_field property
     */
    private String sortField;
    /**
     * The total property
     */
    private Long total;
    /**
     * The videos property
     */
    private java.util.List<Video> videos;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListVideosResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListVideosResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListVideosResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("sort_direction", (n) -> { this.setSortDirection(n.getStringValue()); });
        deserializerMap.put("sort_field", (n) -> { this.setSortField(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        deserializerMap.put("videos", (n) -> { this.setVideos(n.getCollectionOfObjectValues(Video::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. Maximum number of items returned.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. Number of items skipped before this page.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the sort_direction property value. The sort_direction property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSortDirection() {
        return this.sortDirection;
    }
    /**
     * Gets the sort_field property value. The sort_field property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSortField() {
        return this.sortField;
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
     * Gets the videos property value. The videos property
     * @return a {@link java.util.List<Video>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Video> getVideos() {
        return this.videos;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("sort_direction", this.getSortDirection());
        writer.writeStringValue("sort_field", this.getSortField());
        writer.writeLongValue("total", this.getTotal());
        writer.writeCollectionOfObjectValues("videos", this.getVideos());
    }
    /**
     * Sets the limit property value. Maximum number of items returned.
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. Number of items skipped before this page.
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the sort_direction property value. The sort_direction property
     * @param value Value to set for the sort_direction property.
     */
    public void setSortDirection(@jakarta.annotation.Nullable final String value) {
        this.sortDirection = value;
    }
    /**
     * Sets the sort_field property value. The sort_field property
     * @param value Value to set for the sort_field property.
     */
    public void setSortField(@jakarta.annotation.Nullable final String value) {
        this.sortField = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.total = value;
    }
    /**
     * Sets the videos property value. The videos property
     * @param value Value to set for the videos property.
     */
    public void setVideos(@jakarta.annotation.Nullable final java.util.List<Video> value) {
        this.videos = value;
    }
}
