package com.qeeqez.rixl.sdk.models.internal_images_handler;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Upload completion request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompleteRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The attached_to_video property
     */
    private Boolean attachedToVideo;
    /**
     * The image_id property
     */
    private String imageId;
    /**
     * Instantiates a new {@link CompleteRequest} and sets the default values.
     */
    public CompleteRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CompleteRequest}
     */
    @jakarta.annotation.Nonnull
    public static CompleteRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompleteRequest();
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
     * Gets the attached_to_video property value. The attached_to_video property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAttachedToVideo() {
        return this.attachedToVideo;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("attached_to_video", (n) -> { this.setAttachedToVideo(n.getBooleanValue()); });
        deserializerMap.put("image_id", (n) -> { this.setImageId(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("attached_to_video", this.getAttachedToVideo());
        writer.writeStringValue("image_id", this.getImageId());
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
     * Sets the attached_to_video property value. The attached_to_video property
     * @param value Value to set for the attached_to_video property.
     */
    public void setAttachedToVideo(@jakarta.annotation.Nullable final Boolean value) {
        this.attachedToVideo = value;
    }
    /**
     * Sets the image_id property value. The image_id property
     * @param value Value to set for the image_id property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.imageId = value;
    }
}
