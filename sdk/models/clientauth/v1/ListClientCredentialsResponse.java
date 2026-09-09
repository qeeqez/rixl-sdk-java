package com.rixl.sdk.models.clientauth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListClientCredentialsResponse implements Parsable {
    /**
     * The credentials property
     */
    private java.util.List<ClientCredential> credentials;
    /**
     * The total property
     */
    private Long total;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListClientCredentialsResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListClientCredentialsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListClientCredentialsResponse();
    }
    /**
     * Gets the credentials property value. The credentials property
     * @return a {@link java.util.List<ClientCredential>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClientCredential> getCredentials() {
        return this.credentials;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("credentials", (n) -> { this.setCredentials(n.getCollectionOfObjectValues(ClientCredential::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("credentials", this.getCredentials());
        writer.writeLongValue("total", this.getTotal());
    }
    /**
     * Sets the credentials property value. The credentials property
     * @param value Value to set for the credentials property.
     */
    public void setCredentials(@jakarta.annotation.Nullable final java.util.List<ClientCredential> value) {
        this.credentials = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.total = value;
    }
}
