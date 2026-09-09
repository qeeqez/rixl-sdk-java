package com.rixl.sdk.posts.v1.projects.item.feeds.item.posts.upload;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.common.v1.MediaType;
import com.rixl.sdk.models.common.v1.VideoQuality;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadPostRequestBody implements Parsable {
    /**
     * The content_type property
     */
    private MediaType contentType;
    /**
     * The creator_id property
     */
    private String creatorId;
    /**
     * The description property
     */
    private String description;
    /**
     * The file_name property
     */
    private String fileName;
    /**
     * The org_id property
     */
    private String orgId;
    /**
     * The video_quality property
     */
    private VideoQuality videoQuality;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UploadPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UploadPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadPostRequestBody();
    }
    /**
     * Gets the content_type property value. The content_type property
     * @return a {@link MediaType}
     */
    @jakarta.annotation.Nullable
    public MediaType getContentType() {
        return this.contentType;
    }
    /**
     * Gets the creator_id property value. The creator_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatorId() {
        return this.creatorId;
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("content_type", (n) -> { this.setContentType(n.getEnumValue(MediaType::forValue)); });
        deserializerMap.put("creator_id", (n) -> { this.setCreatorId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("file_name", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("org_id", (n) -> { this.setOrgId(n.getStringValue()); });
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
     * Gets the org_id property value. The org_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgId() {
        return this.orgId;
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
        writer.writeEnumValue("content_type", this.getContentType());
        writer.writeStringValue("creator_id", this.getCreatorId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("file_name", this.getFileName());
        writer.writeStringValue("org_id", this.getOrgId());
        writer.writeEnumValue("video_quality", this.getVideoQuality());
    }
    /**
     * Sets the content_type property value. The content_type property
     * @param value Value to set for the content_type property.
     */
    public void setContentType(@jakarta.annotation.Nullable final MediaType value) {
        this.contentType = value;
    }
    /**
     * Sets the creator_id property value. The creator_id property
     * @param value Value to set for the creator_id property.
     */
    public void setCreatorId(@jakarta.annotation.Nullable final String value) {
        this.creatorId = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the file_name property value. The file_name property
     * @param value Value to set for the file_name property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the org_id property value. The org_id property
     * @param value Value to set for the org_id property.
     */
    public void setOrgId(@jakarta.annotation.Nullable final String value) {
        this.orgId = value;
    }
    /**
     * Sets the video_quality property value. The video_quality property
     * @param value Value to set for the video_quality property.
     */
    public void setVideoQuality(@jakarta.annotation.Nullable final VideoQuality value) {
        this.videoQuality = value;
    }
}
