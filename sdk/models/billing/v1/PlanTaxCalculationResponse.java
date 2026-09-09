package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlanTaxCalculationResponse implements Parsable {
    /**
     * The amount_total property
     */
    private Long amountTotal;
    /**
     * The base_amount property
     */
    private Long baseAmount;
    /**
     * The billing_address property
     */
    private BillingAddress billingAddress;
    /**
     * The billing_cycle property
     */
    private BillingCycle billingCycle;
    /**
     * A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     */
    private OffsetDateTime calculatedAt;
    /**
     * The calculation_id property
     */
    private String calculationId;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The plan_id property
     */
    private String planId;
    /**
     * The plan_name property
     */
    private String planName;
    /**
     * The tax_amount_exclusive property
     */
    private Long taxAmountExclusive;
    /**
     * The tax_amount_inclusive property
     */
    private Long taxAmountInclusive;
    /**
     * The tax_percentage property
     */
    private Double taxPercentage;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlanTaxCalculationResponse}
     */
    @jakarta.annotation.Nonnull
    public static PlanTaxCalculationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlanTaxCalculationResponse();
    }
    /**
     * Gets the amount_total property value. The amount_total property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAmountTotal() {
        return this.amountTotal;
    }
    /**
     * Gets the base_amount property value. The base_amount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getBaseAmount() {
        return this.baseAmount;
    }
    /**
     * Gets the billing_address property value. The billing_address property
     * @return a {@link BillingAddress}
     */
    @jakarta.annotation.Nullable
    public BillingAddress getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * Gets the billing_cycle property value. The billing_cycle property
     * @return a {@link BillingCycle}
     */
    @jakarta.annotation.Nullable
    public BillingCycle getBillingCycle() {
        return this.billingCycle;
    }
    /**
     * Gets the calculated_at property value. A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCalculatedAt() {
        return this.calculatedAt;
    }
    /**
     * Gets the calculation_id property value. The calculation_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCalculationId() {
        return this.calculationId;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("amount_total", (n) -> { this.setAmountTotal(n.getLongValue()); });
        deserializerMap.put("base_amount", (n) -> { this.setBaseAmount(n.getLongValue()); });
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("billing_cycle", (n) -> { this.setBillingCycle(n.getEnumValue(BillingCycle::forValue)); });
        deserializerMap.put("calculated_at", (n) -> { this.setCalculatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("calculation_id", (n) -> { this.setCalculationId(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("plan_name", (n) -> { this.setPlanName(n.getStringValue()); });
        deserializerMap.put("tax_amount_exclusive", (n) -> { this.setTaxAmountExclusive(n.getLongValue()); });
        deserializerMap.put("tax_amount_inclusive", (n) -> { this.setTaxAmountInclusive(n.getLongValue()); });
        deserializerMap.put("tax_percentage", (n) -> { this.setTaxPercentage(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the plan_id property value. The plan_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Gets the plan_name property value. The plan_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanName() {
        return this.planName;
    }
    /**
     * Gets the tax_amount_exclusive property value. The tax_amount_exclusive property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTaxAmountExclusive() {
        return this.taxAmountExclusive;
    }
    /**
     * Gets the tax_amount_inclusive property value. The tax_amount_inclusive property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTaxAmountInclusive() {
        return this.taxAmountInclusive;
    }
    /**
     * Gets the tax_percentage property value. The tax_percentage property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTaxPercentage() {
        return this.taxPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("amount_total", this.getAmountTotal());
        writer.writeLongValue("base_amount", this.getBaseAmount());
        writer.writeObjectValue("billing_address", this.getBillingAddress());
        writer.writeEnumValue("billing_cycle", this.getBillingCycle());
        writer.writeOffsetDateTimeValue("calculated_at", this.getCalculatedAt());
        writer.writeStringValue("calculation_id", this.getCalculationId());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("plan_id", this.getPlanId());
        writer.writeStringValue("plan_name", this.getPlanName());
        writer.writeLongValue("tax_amount_exclusive", this.getTaxAmountExclusive());
        writer.writeLongValue("tax_amount_inclusive", this.getTaxAmountInclusive());
        writer.writeDoubleValue("tax_percentage", this.getTaxPercentage());
    }
    /**
     * Sets the amount_total property value. The amount_total property
     * @param value Value to set for the amount_total property.
     */
    public void setAmountTotal(@jakarta.annotation.Nullable final Long value) {
        this.amountTotal = value;
    }
    /**
     * Sets the base_amount property value. The base_amount property
     * @param value Value to set for the base_amount property.
     */
    public void setBaseAmount(@jakarta.annotation.Nullable final Long value) {
        this.baseAmount = value;
    }
    /**
     * Sets the billing_address property value. The billing_address property
     * @param value Value to set for the billing_address property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final BillingAddress value) {
        this.billingAddress = value;
    }
    /**
     * Sets the billing_cycle property value. The billing_cycle property
     * @param value Value to set for the billing_cycle property.
     */
    public void setBillingCycle(@jakarta.annotation.Nullable final BillingCycle value) {
        this.billingCycle = value;
    }
    /**
     * Sets the calculated_at property value. A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are &quot;smeared&quot; so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings. # Examples Example 1: Compute Timestamp from POSIX `time()`.     Timestamp timestamp;     timestamp.set_seconds(time(NULL));     timestamp.set_nanos(0); Example 2: Compute Timestamp from POSIX `gettimeofday()`.     struct timeval tv;     gettimeofday(&amp;tv, NULL);     Timestamp timestamp;     timestamp.set_seconds(tv.tv_sec);     timestamp.set_nanos(tv.tv_usec * 1000); Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.     FILETIME ft;     GetSystemTimeAsFileTime(&amp;ft);     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.     Timestamp timestamp;     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100)); Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.     long millis = System.currentTimeMillis();     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)         .setNanos((int) ((millis % 1000) * 1000000)).build(); Example 5: Compute Timestamp from Java `Instant.now()`.     Instant now = Instant.now();     Timestamp timestamp =         Timestamp.newBuilder().setSeconds(now.getEpochSecond())             .setNanos(now.getNano()).build(); Example 6: Compute Timestamp from current time in Python.     timestamp = Timestamp()     timestamp.GetCurrentTime() # JSON Mapping In JSON format, the Timestamp type is encoded as a string in the [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the format is &quot;{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z&quot; where {year} is always expressed using four digits while {month}, {day}, {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution), are optional. The &quot;Z&quot; suffix indicates the timezone (&quot;UTC&quot;); the timezone is required. A proto3 JSON serializer should always use UTC (as indicated by &quot;Z&quot;) when printing the Timestamp type and a proto3 JSON parser should be able to accept both UTC and other timezones (as indicated by an offset). For example, &quot;2017-01-15T01:30:15.01Z&quot; encodes 15.01 seconds past 01:30 UTC on January 15, 2017. In JavaScript, one can convert a Date object to this format using the standard [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString) method. In Python, a standard `datetime.datetime` object can be converted to this format using [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with the time format spec &apos;%Y-%m-%dT%H:%M:%S.%fZ&apos;. Likewise, in Java, one can use the Joda Time&apos;s [`ISODateTimeFormat.dateTime()`]( http://joda-time.sourceforge.net/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime() ) to obtain a formatter capable of generating timestamps in this format.
     * @param value Value to set for the calculated_at property.
     */
    public void setCalculatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.calculatedAt = value;
    }
    /**
     * Sets the calculation_id property value. The calculation_id property
     * @param value Value to set for the calculation_id property.
     */
    public void setCalculationId(@jakarta.annotation.Nullable final String value) {
        this.calculationId = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the plan_id property value. The plan_id property
     * @param value Value to set for the plan_id property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.planId = value;
    }
    /**
     * Sets the plan_name property value. The plan_name property
     * @param value Value to set for the plan_name property.
     */
    public void setPlanName(@jakarta.annotation.Nullable final String value) {
        this.planName = value;
    }
    /**
     * Sets the tax_amount_exclusive property value. The tax_amount_exclusive property
     * @param value Value to set for the tax_amount_exclusive property.
     */
    public void setTaxAmountExclusive(@jakarta.annotation.Nullable final Long value) {
        this.taxAmountExclusive = value;
    }
    /**
     * Sets the tax_amount_inclusive property value. The tax_amount_inclusive property
     * @param value Value to set for the tax_amount_inclusive property.
     */
    public void setTaxAmountInclusive(@jakarta.annotation.Nullable final Long value) {
        this.taxAmountInclusive = value;
    }
    /**
     * Sets the tax_percentage property value. The tax_percentage property
     * @param value Value to set for the tax_percentage property.
     */
    public void setTaxPercentage(@jakarta.annotation.Nullable final Double value) {
        this.taxPercentage = value;
    }
}
