package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetPostStatsResponse implements Parsable {
    /**
     * The post_id property
     */
    private String postId;
    /**
     * The total_views property
     */
    private Long totalViews;
    /**
     * The unique_viewers property
     */
    private Long uniqueViewers;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetPostStatsResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetPostStatsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetPostStatsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("post_id", (n) -> { this.setPostId(n.getStringValue()); });
        deserializerMap.put("total_views", (n) -> { this.setTotalViews(n.getLongValue()); });
        deserializerMap.put("unique_viewers", (n) -> { this.setUniqueViewers(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the post_id property value. The post_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostId() {
        return this.postId;
    }
    /**
     * Gets the total_views property value. The total_views property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalViews() {
        return this.totalViews;
    }
    /**
     * Gets the unique_viewers property value. The unique_viewers property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUniqueViewers() {
        return this.uniqueViewers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("post_id", this.getPostId());
        writer.writeLongValue("total_views", this.getTotalViews());
        writer.writeLongValue("unique_viewers", this.getUniqueViewers());
    }
    /**
     * Sets the post_id property value. The post_id property
     * @param value Value to set for the post_id property.
     */
    public void setPostId(@jakarta.annotation.Nullable final String value) {
        this.postId = value;
    }
    /**
     * Sets the total_views property value. The total_views property
     * @param value Value to set for the total_views property.
     */
    public void setTotalViews(@jakarta.annotation.Nullable final Long value) {
        this.totalViews = value;
    }
    /**
     * Sets the unique_viewers property value. The unique_viewers property
     * @param value Value to set for the unique_viewers property.
     */
    public void setUniqueViewers(@jakarta.annotation.Nullable final Long value) {
        this.uniqueViewers = value;
    }
}
