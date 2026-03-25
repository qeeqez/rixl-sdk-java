package com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_internal_videos;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.qeeqez.rixl.sdk.models.Chapter;
import com.qeeqez.rixl.sdk.models.File;
import com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_db_sqlc.PlanType;
import com.qeeqez.rixl.sdk.models.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bitrate property
     */
    private Integer bitrate;
    /**
     * The chapters property
     */
    private java.util.List<Chapter> chapters;
    /**
     * The codec property
     */
    private String codec;
    /**
     * The duration property
     */
    private Double duration;
    /**
     * The file property
     */
    private File file;
    /**
     * The framerate property
     */
    private String framerate;
    /**
     * The hdr property
     */
    private Boolean hdr;
    /**
     * The height property
     */
    private Integer height;
    /**
     * The id property
     */
    private String id;
    /**
     * The plan_type property
     */
    private PlanType planType;
    /**
     * The poster property
     */
    private Image poster;
    /**
     * The width property
     */
    private Integer width;
    /**
     * Instantiates a new {@link VideoResponse} and sets the default values.
     */
    public VideoResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoResponse}
     */
    @jakarta.annotation.Nonnull
    public static VideoResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoResponse();
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
     * Gets the bitrate property value. The bitrate property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBitrate() {
        return this.bitrate;
    }
    /**
     * Gets the chapters property value. The chapters property
     * @return a {@link java.util.List<Chapter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Chapter> getChapters() {
        return this.chapters;
    }
    /**
     * Gets the codec property value. The codec property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCodec() {
        return this.codec;
    }
    /**
     * Gets the duration property value. The duration property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getDuration() {
        return this.duration;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("bitrate", (n) -> { this.setBitrate(n.getIntegerValue()); });
        deserializerMap.put("chapters", (n) -> { this.setChapters(n.getCollectionOfObjectValues(Chapter::createFromDiscriminatorValue)); });
        deserializerMap.put("codec", (n) -> { this.setCodec(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getDoubleValue()); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getObjectValue(File::createFromDiscriminatorValue)); });
        deserializerMap.put("framerate", (n) -> { this.setFramerate(n.getStringValue()); });
        deserializerMap.put("hdr", (n) -> { this.setHdr(n.getBooleanValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("plan_type", (n) -> { this.setPlanType(n.getEnumValue(PlanType::forValue)); });
        deserializerMap.put("poster", (n) -> { this.setPoster(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. The file property
     * @return a {@link File}
     */
    @jakarta.annotation.Nullable
    public File getFile() {
        return this.file;
    }
    /**
     * Gets the framerate property value. The framerate property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFramerate() {
        return this.framerate;
    }
    /**
     * Gets the hdr property value. The hdr property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHdr() {
        return this.hdr;
    }
    /**
     * Gets the height property value. The height property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
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
     * Gets the plan_type property value. The plan_type property
     * @return a {@link PlanType}
     */
    @jakarta.annotation.Nullable
    public PlanType getPlanType() {
        return this.planType;
    }
    /**
     * Gets the poster property value. The poster property
     * @return a {@link Image}
     */
    @jakarta.annotation.Nullable
    public Image getPoster() {
        return this.poster;
    }
    /**
     * Gets the width property value. The width property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bitrate", this.getBitrate());
        writer.writeCollectionOfObjectValues("chapters", this.getChapters());
        writer.writeStringValue("codec", this.getCodec());
        writer.writeDoubleValue("duration", this.getDuration());
        writer.writeObjectValue("file", this.getFile());
        writer.writeStringValue("framerate", this.getFramerate());
        writer.writeBooleanValue("hdr", this.getHdr());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("plan_type", this.getPlanType());
        writer.writeObjectValue("poster", this.getPoster());
        writer.writeIntegerValue("width", this.getWidth());
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
     * Sets the bitrate property value. The bitrate property
     * @param value Value to set for the bitrate property.
     */
    public void setBitrate(@jakarta.annotation.Nullable final Integer value) {
        this.bitrate = value;
    }
    /**
     * Sets the chapters property value. The chapters property
     * @param value Value to set for the chapters property.
     */
    public void setChapters(@jakarta.annotation.Nullable final java.util.List<Chapter> value) {
        this.chapters = value;
    }
    /**
     * Sets the codec property value. The codec property
     * @param value Value to set for the codec property.
     */
    public void setCodec(@jakarta.annotation.Nullable final String value) {
        this.codec = value;
    }
    /**
     * Sets the duration property value. The duration property
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Double value) {
        this.duration = value;
    }
    /**
     * Sets the file property value. The file property
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final File value) {
        this.file = value;
    }
    /**
     * Sets the framerate property value. The framerate property
     * @param value Value to set for the framerate property.
     */
    public void setFramerate(@jakarta.annotation.Nullable final String value) {
        this.framerate = value;
    }
    /**
     * Sets the hdr property value. The hdr property
     * @param value Value to set for the hdr property.
     */
    public void setHdr(@jakarta.annotation.Nullable final Boolean value) {
        this.hdr = value;
    }
    /**
     * Sets the height property value. The height property
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the plan_type property value. The plan_type property
     * @param value Value to set for the plan_type property.
     */
    public void setPlanType(@jakarta.annotation.Nullable final PlanType value) {
        this.planType = value;
    }
    /**
     * Sets the poster property value. The poster property
     * @param value Value to set for the poster property.
     */
    public void setPoster(@jakarta.annotation.Nullable final Image value) {
        this.poster = value;
    }
    /**
     * Sets the width property value. The width property
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}
