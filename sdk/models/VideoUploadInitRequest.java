package com.qeeqez.rixl.sdk.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_db_sqlc.VideoQuality;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Video upload initialization request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoUploadInitRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The file_name property
     */
    private String fileName;
    /**
     * The image_format property
     */
    private String imageFormat;
    /**
     * The video_quality property
     */
    private VideoQuality videoQuality;
    /**
     * Instantiates a new {@link VideoUploadInitRequest} and sets the default values.
     */
    public VideoUploadInitRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoUploadInitRequest}
     */
    @jakarta.annotation.Nonnull
    public static VideoUploadInitRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoUploadInitRequest();
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
        deserializerMap.put("file_name", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("image_format", (n) -> { this.setImageFormat(n.getStringValue()); });
        deserializerMap.put("video_quality", (n) -> { this.setVideoQuality(n.getEnumValue(VideoQuality::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the file_name property value. The file_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the image_format property value. The image_format property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageFormat() {
        return this.imageFormat;
    }
    /**
     * Gets the video_quality property value. The video_quality property
     * @return a {@link VideoQuality}
     */
    @jakarta.annotation.Nullable
    public VideoQuality getVideoQuality() {
        return this.videoQuality;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("file_name", this.getFileName());
        writer.writeStringValue("image_format", this.getImageFormat());
        writer.writeEnumValue("video_quality", this.getVideoQuality());
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
     * Sets the file_name property value. The file_name property
     * @param value Value to set for the file_name property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the image_format property value. The image_format property
     * @param value Value to set for the image_format property.
     */
    public void setImageFormat(@jakarta.annotation.Nullable final String value) {
        this.imageFormat = value;
    }
    /**
     * Sets the video_quality property value. The video_quality property
     * @param value Value to set for the video_quality property.
     */
    public void setVideoQuality(@jakarta.annotation.Nullable final VideoQuality value) {
        this.videoQuality = value;
    }
}
