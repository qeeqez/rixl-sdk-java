package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalculateGenericTaxRequest implements Parsable {
    /**
     * The amount property
     */
    private Long amount;
    /**
     * The billing_address property
     */
    private BillingAddress billingAddress;
    /**
     * The currency property
     */
    private String currency;
    /**
     * The line_items property
     */
    private java.util.List<TaxLineItem> lineItems;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CalculateGenericTaxRequest}
     */
    @jakarta.annotation.Nonnull
    public static CalculateGenericTaxRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculateGenericTaxRequest();
    }
    /**
     * Gets the amount property value. The amount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAmount() {
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getLongValue()); });
        deserializerMap.put("billing_address", (n) -> { this.setBillingAddress(n.getObjectValue(BillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("line_items", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(TaxLineItem::createFromDiscriminatorValue)); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("amount", this.getAmount());
        writer.writeObjectValue("billing_address", this.getBillingAddress());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeCollectionOfObjectValues("line_items", this.getLineItems());
        writer.writeStringValue("org_id", this.getOrgId());
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Long value) {
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
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the line_items property value. The line_items property
     * @param value Value to set for the line_items property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<TaxLineItem> value) {
        this.lineItems = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
}
