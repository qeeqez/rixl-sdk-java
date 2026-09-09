package com.rixl.sdk.models.support.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListTicketsResponse implements Parsable {
    /**
     * Maximum number of items returned.
     */
    private Integer limit;
    /**
     * Number of items skipped before this page.
     */
    private Integer offset;
    /**
     * The tickets property
     */
    private java.util.List<Ticket> tickets;
    /**
     * The total property
     */
    private Long total;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListTicketsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListTicketsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListTicketsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("tickets", (n) -> { this.setTickets(n.getCollectionOfObjectValues(Ticket::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
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
     * Gets the tickets property value. The tickets property
     * @return a {@link java.util.List<Ticket>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Ticket> getTickets() {
        return this.tickets;
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
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeCollectionOfObjectValues("tickets", this.getTickets());
        writer.writeLongValue("total", this.getTotal());
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
     * Sets the tickets property value. The tickets property
     * @param value Value to set for the tickets property.
     */
    public void setTickets(@jakarta.annotation.Nullable final java.util.List<Ticket> value) {
        this.tickets = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.total = value;
    }
}
