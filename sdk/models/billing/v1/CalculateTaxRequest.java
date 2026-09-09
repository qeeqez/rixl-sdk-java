package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalculateTaxRequest implements Parsable {
    /**
     * The amount property
     */
    private Double amount;
    /**
     * The billing_address property
     */
    private BillingAddress billingAddress;
    /**
     * The billing_cycle property
     */
    private BillingCycle billingCycle;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The interval_count property
     */
    private Long intervalCount;
    /**
     * The line_items property
     */
    private java.util.List<TaxLineItem> lineItems;
    /**
     * The metadata property
     */
    private CalculateTaxRequestMetadata metadata;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The plan_id property
     */
    private String planId;
    /**
     * The plan_name property
     */
    private String planName;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CalculateTaxRequest}
     */
    @jakarta.annotation.Nonnull
    public static CalculateTaxRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculateTaxRequest();
    }
    /**
     * Gets the amount property value. The amount property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAmount() {
        return this.amount;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getDoubleValue()); });
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("billing_cycle", (n) -> { this.setBillingCycle(n.getEnumValue(BillingCycle::forValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("interval_count", (n) -> { this.setIntervalCount(n.getLongValue()); });
        deserializerMap.put("line_items", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(TaxLineItem::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(CalculateTaxRequestMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("plan_id", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("plan_name", (n) -> { this.setPlanName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the interval_count property value. The interval_count property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getIntervalCount() {
        return this.intervalCount;
    }
    /**
     * Gets the line_items property value. The line_items property
     * @return a {@link java.util.List<TaxLineItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaxLineItem> getLineItems() {
        return this.lineItems;
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a {@link CalculateTaxRequestMetadata}
     */
    @jakarta.annotation.Nullable
    public CalculateTaxRequestMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("amount", this.getAmount());
        writer.writeObjectValue("billing_address", this.getBillingAddress());
        writer.writeEnumValue("billing_cycle", this.getBillingCycle());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeLongValue("interval_count", this.getIntervalCount());
        writer.writeCollectionOfObjectValues("line_items", this.getLineItems());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeStringValue("plan_id", this.getPlanId());
        writer.writeStringValue("plan_name", this.getPlanName());
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Double value) {
        this.amount = value;
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
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the interval_count property value. The interval_count property
     * @param value Value to set for the interval_count property.
     */
    public void setIntervalCount(@jakarta.annotation.Nullable final Long value) {
        this.intervalCount = value;
    }
    /**
     * Sets the line_items property value. The line_items property
     * @param value Value to set for the line_items property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<TaxLineItem> value) {
        this.lineItems = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final CalculateTaxRequestMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
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
}
