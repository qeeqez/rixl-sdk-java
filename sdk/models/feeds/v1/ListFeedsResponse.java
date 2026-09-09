package com.rixl.sdk.models.feeds.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListFeedsResponse implements Parsable {
    /**
     * The feeds property
     */
    private java.util.List<Feed> feeds;
    /**
     * The total property
     */
    private Long total;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListFeedsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListFeedsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListFeedsResponse();
    }
    /**
     * Gets the feeds property value. The feeds property
     * @return a {@link java.util.List<Feed>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Feed> getFeeds() {
        return this.feeds;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("feeds", (n) -> { this.setFeeds(n.getCollectionOfObjectValues(Feed::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("feeds", this.getFeeds());
        writer.writeLongValue("total", this.getTotal());
    }
    /**
     * Sets the feeds property value. The feeds property
     * @param value Value to set for the feeds property.
     */
    public void setFeeds(@jakarta.annotation.Nullable final java.util.List<Feed> value) {
        this.feeds = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.total = value;
    }
}
