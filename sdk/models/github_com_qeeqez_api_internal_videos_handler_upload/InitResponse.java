package com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_internal_videos_handler_upload;

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
     * The poster_id property
     */
    private String posterId;
    /**
     * The poster_presigned_url property
     */
    private String posterPresignedUrl;
    /**
     * The upload_expires property
     */
    private Integer uploadExpires;
    /**
     * The video_id property
     */
    private String videoId;
    /**
     * The video_presigned_url property
     */
    private String videoPresignedUrl;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("poster_id", (n) -> { this.setPosterId(n.getStringValue()); });
        deserializerMap.put("poster_presigned_url", (n) -> { this.setPosterPresignedUrl(n.getStringValue()); });
        deserializerMap.put("upload_expires", (n) -> { this.setUploadExpires(n.getIntegerValue()); });
        deserializerMap.put("video_id", (n) -> { this.setVideoId(n.getStringValue()); });
        deserializerMap.put("video_presigned_url", (n) -> { this.setVideoPresignedUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the poster_id property value. The poster_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPosterId() {
        return this.posterId;
    }
    /**
     * Gets the poster_presigned_url property value. The poster_presigned_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPosterPresignedUrl() {
        return this.posterPresignedUrl;
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
     * Gets the video_id property value. The video_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoId() {
        return this.videoId;
    }
    /**
     * Gets the video_presigned_url property value. The video_presigned_url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoPresignedUrl() {
        return this.videoPresignedUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("poster_id", this.getPosterId());
        writer.writeStringValue("poster_presigned_url", this.getPosterPresignedUrl());
        writer.writeIntegerValue("upload_expires", this.getUploadExpires());
        writer.writeStringValue("video_id", this.getVideoId());
        writer.writeStringValue("video_presigned_url", this.getVideoPresignedUrl());
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
     * Sets the poster_id property value. The poster_id property
     * @param value Value to set for the poster_id property.
     */
    public void setPosterId(@jakarta.annotation.Nullable final String value) {
        this.posterId = value;
    }
    /**
     * Sets the poster_presigned_url property value. The poster_presigned_url property
     * @param value Value to set for the poster_presigned_url property.
     */
    public void setPosterPresignedUrl(@jakarta.annotation.Nullable final String value) {
        this.posterPresignedUrl = value;
    }
    /**
     * Sets the upload_expires property value. The upload_expires property
     * @param value Value to set for the upload_expires property.
     */
    public void setUploadExpires(@jakarta.annotation.Nullable final Integer value) {
        this.uploadExpires = value;
    }
    /**
     * Sets the video_id property value. The video_id property
     * @param value Value to set for the video_id property.
     */
    public void setVideoId(@jakarta.annotation.Nullable final String value) {
        this.videoId = value;
    }
    /**
     * Sets the video_presigned_url property value. The video_presigned_url property
     * @param value Value to set for the video_presigned_url property.
     */
    public void setVideoPresignedUrl(@jakarta.annotation.Nullable final String value) {
        this.videoPresignedUrl = value;
    }
}
