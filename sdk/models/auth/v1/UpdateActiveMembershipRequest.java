package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateActiveMembershipRequest implements Parsable {
    /**
     * The membership_id property
     */
    private String membershipId;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The user property
     */
    private UserOrgRequest user;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateActiveMembershipRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateActiveMembershipRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateActiveMembershipRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("membership_id", (n) -> { this.setMembershipId(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(UserOrgRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the membership_id property value. The membership_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipId() {
        return this.membershipId;
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
     * Gets the user property value. The user property
     * @return a {@link UserOrgRequest}
     */
    @jakarta.annotation.Nullable
    public UserOrgRequest getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("membership_id", this.getMembershipId());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the membership_id property value. The membership_id property
     * @param value Value to set for the membership_id property.
     */
    public void setMembershipId(@jakarta.annotation.Nullable final String value) {
        this.membershipId = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final UserOrgRequest value) {
        this.user = value;
    }
}
