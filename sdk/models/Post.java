package com.qeeqez.rixl.sdk.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_db_sqlc.PlanType;
import com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_internal_videos.VideoResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Post implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The created_at property
     */
    private String createdAt;
    /**
     * The creator_id property
     */
    private String creatorId;
    /**
     * The description property
     */
    private String description;
    /**
     * The feed_id property
     */
    private String feedId;
    /**
     * The id property
     */
    private String id;
    /**
     * The image property
     */
    private Image image;
    /**
     * The plan_type property
     */
    private PlanType planType;
    /**
     * The type property
     */
    private PostType type;
    /**
     * The updated_at property
     */
    private String updatedAt;
    /**
     * The video property
     */
    private VideoResponse video;
    /**
     * Instantiates a new {@link Post} and sets the default values.
     */
    public Post() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Post}
     */
    @jakarta.annotation.Nonnull
    public static Post createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Post();
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
     * Gets the created_at property value. The created_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
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
     * Gets the feed_id property value. The feed_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeedId() {
        return this.feedId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("creator_id", (n) -> { this.setCreatorId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("feed_id", (n) -> { this.setFeedId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("plan_type", (n) -> { this.setPlanType(n.getEnumValue(PlanType::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PostType::forValue)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getStringValue()); });
        deserializerMap.put("video", (n) -> { this.setVideo(n.getObjectValue(VideoResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the image property value. The image property
     * @return a {@link Image}
     */
    @jakarta.annotation.Nullable
    public Image getImage() {
        return this.image;
    }
    /**
     * Gets the plan_type property value. The plan_type property
     * @return a {@link PlanType}
     */
    @jakarta.annotation.Nullable
    public PlanType getPlanType() {
        return this.planType;
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link PostType}
     */
    @jakarta.annotation.Nullable
    public PostType getType() {
        return this.type;
    }
    /**
     * Gets the updated_at property value. The updated_at property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the video property value. The video property
     * @return a {@link VideoResponse}
     */
    @jakarta.annotation.Nullable
    public VideoResponse getVideo() {
        return this.video;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeStringValue("creator_id", this.getCreatorId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("feed_id", this.getFeedId());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("image", this.getImage());
        writer.writeEnumValue("plan_type", this.getPlanType());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("updated_at", this.getUpdatedAt());
        writer.writeObjectValue("video", this.getVideo());
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
     * Sets the created_at property value. The created_at property
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
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
     * Sets the feed_id property value. The feed_id property
     * @param value Value to set for the feed_id property.
     */
    public void setFeedId(@jakarta.annotation.Nullable final String value) {
        this.feedId = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the image property value. The image property
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final Image value) {
        this.image = value;
    }
    /**
     * Sets the plan_type property value. The plan_type property
     * @param value Value to set for the plan_type property.
     */
    public void setPlanType(@jakarta.annotation.Nullable final PlanType value) {
        this.planType = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final PostType value) {
        this.type = value;
    }
    /**
     * Sets the updated_at property value. The updated_at property
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final String value) {
        this.updatedAt = value;
    }
    /**
     * Sets the video property value. The video property
     * @param value Value to set for the video property.
     */
    public void setVideo(@jakarta.annotation.Nullable final VideoResponse value) {
        this.video = value;
    }
}
