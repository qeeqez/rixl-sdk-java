package com.qeeqez.rixl.sdk.models.internal_images_handler;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InitResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The image_id property
     */
    private String imageId;
    /**
     * The presigned_url property
     */
    private String presignedUrl;
    /**
     * The upload_expires property
     */
    private Integer uploadExpires;
    /**
     * Instantiates a new {@link InitResponse} and sets the default values.
     */
    public InitResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InitResponse}
     */
    @jakarta.annotation.Nonnull
    public static InitResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InitResponse();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("image_id", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("presigned_url", (n) -> { this.setPresignedUrl(n.getStringValue()); });
        deserializerMap.put("upload_expires", (n) -> { this.setUploadExpires(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the image_id property value. The image_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageId() {
        return this.imageId;
    }
    /**
     * Gets the presigned_url property value. The presigned_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPresignedUrl() {
        return this.presignedUrl;
    }
    /**
     * Gets the upload_expires property value. The upload_expires property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUploadExpires() {
        return this.uploadExpires;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("image_id", this.getImageId());
        writer.writeStringValue("presigned_url", this.getPresignedUrl());
        writer.writeIntegerValue("upload_expires", this.getUploadExpires());
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
     * Sets the image_id property value. The image_id property
     * @param value Value to set for the image_id property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.imageId = value;
    }
    /**
     * Sets the presigned_url property value. The presigned_url property
     * @param value Value to set for the presigned_url property.
     */
    public void setPresignedUrl(@jakarta.annotation.Nullable final String value) {
        this.presignedUrl = value;
    }
    /**
     * Sets the upload_expires property value. The upload_expires property
     * @param value Value to set for the upload_expires property.
     */
    public void setUploadExpires(@jakarta.annotation.Nullable final Integer value) {
        this.uploadExpires = value;
    }
}
