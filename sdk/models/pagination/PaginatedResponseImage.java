package com.qeeqez.rixl.sdk.models.pagination;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.qeeqez.rixl.sdk.models.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaginatedResponseImage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Data contains the slice of items for the current request.
     */
    private java.util.List<Image> data;
    /**
     * Pagination data for the request.
     */
    private Pagination pagination;
    /**
     * Instantiates a new {@link PaginatedResponseImage} and sets the default values.
     */
    public PaginatedResponseImage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaginatedResponseImage}
     */
    @jakarta.annotation.Nonnull
    public static PaginatedResponseImage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaginatedResponseImage();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the data property value. Data contains the slice of items for the current request.
     * @return a {@link java.util.List<Image>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Image> getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("data", (n) -> { this.setData(n.getCollectionOfObjectValues(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("pagination", (n) -> { this.setPagination(n.getObjectValue(Pagination::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pagination property value. Pagination data for the request.
     * @return a {@link Pagination}
     */
    @jakarta.annotation.Nullable
    public Pagination getPagination() {
        return this.pagination;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("data", this.getData());
        writer.writeObjectValue("pagination", this.getPagination());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the data property value. Data contains the slice of items for the current request.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final java.util.List<Image> value) {
        this.data = value;
    }
    /**
     * Sets the pagination property value. Pagination data for the request.
     * @param value Value to set for the pagination property.
     */
    public void setPagination(@jakarta.annotation.Nullable final Pagination value) {
        this.pagination = value;
    }
}
