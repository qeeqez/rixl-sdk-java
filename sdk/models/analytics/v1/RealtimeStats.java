package com.rixl.sdk.models.analytics.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RealtimeStats implements Parsable {
    /**
     * The active_users property
     */
    private Long activeUsers;
    /**
     * The events_per_minute property
     */
    private Long eventsPerMinute;
    /**
     * The recent_events property
     */
    private java.util.List<RecentEvent> recentEvents;
    /**
     * The timestamp property
     */
    private String timestamp;
    /**
     * The top_countries property
     */
    private java.util.List<CountryCount> topCountries;
    /**
     * The top_events property
     */
    private java.util.List<EventCount> topEvents;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RealtimeStats}
     */
    @jakarta.annotation.Nonnull
    public static RealtimeStats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RealtimeStats();
    }
    /**
     * Gets the active_users property value. The active_users property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getActiveUsers() {
        return this.activeUsers;
    }
    /**
     * Gets the events_per_minute property value. The events_per_minute property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getEventsPerMinute() {
        return this.eventsPerMinute;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("active_users", (n) -> { this.setActiveUsers(n.getLongValue()); });
        deserializerMap.put("events_per_minute", (n) -> { this.setEventsPerMinute(n.getLongValue()); });
        deserializerMap.put("recent_events", (n) -> { this.setRecentEvents(n.getCollectionOfObjectValues(RecentEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getStringValue()); });
        deserializerMap.put("top_countries", (n) -> { this.setTopCountries(n.getCollectionOfObjectValues(CountryCount::createFromDiscriminatorValue)); });
        deserializerMap.put("top_events", (n) -> { this.setTopEvents(n.getCollectionOfObjectValues(EventCount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recent_events property value. The recent_events property
     * @return a {@link java.util.List<RecentEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecentEvent> getRecentEvents() {
        return this.recentEvents;
    }
    /**
     * Gets the timestamp property value. The timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the top_countries property value. The top_countries property
     * @return a {@link java.util.List<CountryCount>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CountryCount> getTopCountries() {
        return this.topCountries;
    }
    /**
     * Gets the top_events property value. The top_events property
     * @return a {@link java.util.List<EventCount>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EventCount> getTopEvents() {
        return this.topEvents;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("active_users", this.getActiveUsers());
        writer.writeLongValue("events_per_minute", this.getEventsPerMinute());
        writer.writeCollectionOfObjectValues("recent_events", this.getRecentEvents());
        writer.writeStringValue("timestamp", this.getTimestamp());
        writer.writeCollectionOfObjectValues("top_countries", this.getTopCountries());
        writer.writeCollectionOfObjectValues("top_events", this.getTopEvents());
    }
    /**
     * Sets the active_users property value. The active_users property
     * @param value Value to set for the active_users property.
     */
    public void setActiveUsers(@jakarta.annotation.Nullable final Long value) {
        this.activeUsers = value;
    }
    /**
     * Sets the events_per_minute property value. The events_per_minute property
     * @param value Value to set for the events_per_minute property.
     */
    public void setEventsPerMinute(@jakarta.annotation.Nullable final Long value) {
        this.eventsPerMinute = value;
    }
    /**
     * Sets the recent_events property value. The recent_events property
     * @param value Value to set for the recent_events property.
     */
    public void setRecentEvents(@jakarta.annotation.Nullable final java.util.List<RecentEvent> value) {
        this.recentEvents = value;
    }
    /**
     * Sets the timestamp property value. The timestamp property
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final String value) {
        this.timestamp = value;
    }
    /**
     * Sets the top_countries property value. The top_countries property
     * @param value Value to set for the top_countries property.
     */
    public void setTopCountries(@jakarta.annotation.Nullable final java.util.List<CountryCount> value) {
        this.topCountries = value;
    }
    /**
     * Sets the top_events property value. The top_events property
     * @param value Value to set for the top_events property.
     */
    public void setTopEvents(@jakarta.annotation.Nullable final java.util.List<EventCount> value) {
        this.topEvents = value;
    }
}
