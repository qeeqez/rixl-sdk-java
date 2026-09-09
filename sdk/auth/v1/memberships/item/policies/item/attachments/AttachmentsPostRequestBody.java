package com.rixl.sdk.auth.v1.memberships.item.policies.item.attachments;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.auth.v1.PolicyIdentityType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttachmentsPostRequestBody implements Parsable {
    /**
     * The identity_id property
     */
    private String identityId;
    /**
     * The identity_type property
     */
    private PolicyIdentityType identityType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttachmentsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static AttachmentsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentsPostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("identity_id", (n) -> { this.setIdentityId(n.getStringValue()); });
        deserializerMap.put("identity_type", (n) -> { this.setIdentityType(n.getEnumValue(PolicyIdentityType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identity_id property value. The identity_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityId() {
        return this.identityId;
    }
    /**
     * Gets the identity_type property value. The identity_type property
     * @return a {@link PolicyIdentityType}
     */
    @jakarta.annotation.Nullable
    public PolicyIdentityType getIdentityType() {
        return this.identityType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("identity_id", this.getIdentityId());
        writer.writeEnumValue("identity_type", this.getIdentityType());
    }
    /**
     * Sets the identity_id property value. The identity_id property
     * @param value Value to set for the identity_id property.
     */
    public void setIdentityId(@jakarta.annotation.Nullable final String value) {
        this.identityId = value;
    }
    /**
     * Sets the identity_type property value. The identity_type property
     * @param value Value to set for the identity_type property.
     */
    public void setIdentityType(@jakarta.annotation.Nullable final PolicyIdentityType value) {
        this.identityType = value;
    }
}
