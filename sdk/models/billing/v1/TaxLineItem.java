package com.rixl.sdk.models.billing.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaxLineItem implements Parsable {
    /**
     * The amount property
     */
    private Long amount;
    /**
     * The reference property
     */
    private String reference;
    /**
     * The tax_code property
     */
    private String taxCode;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TaxLineItem}
     */
    @jakarta.annotation.Nonnull
    public static TaxLineItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaxLineItem();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getLongValue()); });
        deserializerMap.put("reference", (n) -> { this.setReference(n.getStringValue()); });
        deserializerMap.put("tax_code", (n) -> { this.setTaxCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reference property value. The reference property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReference() {
        return this.reference;
    }
    /**
     * Gets the tax_code property value. The tax_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxCode() {
        return this.taxCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("amount", this.getAmount());
        writer.writeStringValue("reference", this.getReference());
        writer.writeStringValue("tax_code", this.getTaxCode());
    }
    /**
     * Sets the amount property value. The amount property
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Long value) {
        this.amount = value;
    }
    /**
     * Sets the reference property value. The reference property
     * @param value Value to set for the reference property.
     */
    public void setReference(@jakarta.annotation.Nullable final String value) {
        this.reference = value;
    }
    /**
     * Sets the tax_code property value. The tax_code property
     * @param value Value to set for the tax_code property.
     */
    public void setTaxCode(@jakarta.annotation.Nullable final String value) {
        this.taxCode = value;
    }
}
