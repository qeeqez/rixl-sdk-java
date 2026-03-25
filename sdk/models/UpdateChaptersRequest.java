package com.qeeqez.rixl.sdk.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_internal_videos_types.ChapterInput;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Chapters array
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateChaptersRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The chapters property
     */
    private java.util.List<ChapterInput> chapters;
    /**
     * Instantiates a new {@link UpdateChaptersRequest} and sets the default values.
     */
    public UpdateChaptersRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateChaptersRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateChaptersRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateChaptersRequest();
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
     * Gets the chapters property value. The chapters property
     * @return a {@link java.util.List<ChapterInput>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChapterInput> getChapters() {
        return this.chapters;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("chapters", (n) -> { this.setChapters(n.getCollectionOfObjectValues(ChapterInput::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("chapters", this.getChapters());
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
     * Sets the chapters property value. The chapters property
     * @param value Value to set for the chapters property.
     */
    public void setChapters(@jakarta.annotation.Nullable final java.util.List<ChapterInput> value) {
        this.chapters = value;
    }
}
