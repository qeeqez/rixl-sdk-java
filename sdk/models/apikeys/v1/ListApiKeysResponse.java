package com.rixl.sdk.models.apikeys.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListApiKeysResponse implements Parsable {
    /**
     * The api_keys property
     */
    private java.util.List<ApiKey> apiKeys;
    /**
     * The total property
     */
    private Long total;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListApiKeysResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListApiKeysResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListApiKeysResponse();
    }
    /**
     * Gets the api_keys property value. The api_keys property
     * @return a {@link java.util.List<ApiKey>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApiKey> getApiKeys() {
        return this.apiKeys;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("api_keys", (n) -> { this.setApiKeys(n.getCollectionOfObjectValues(ApiKey::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("api_keys", this.getApiKeys());
        writer.writeLongValue("total", this.getTotal());
    }
    /**
     * Sets the api_keys property value. The api_keys property
     * @param value Value to set for the api_keys property.
     */
    public void setApiKeys(@jakarta.annotation.Nullable final java.util.List<ApiKey> value) {
        this.apiKeys = value;
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.total = value;
    }
}
