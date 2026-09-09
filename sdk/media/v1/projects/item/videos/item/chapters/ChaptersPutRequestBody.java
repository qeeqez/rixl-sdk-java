package com.rixl.sdk.media.v1.projects.item.videos.item.chapters;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.rixl.sdk.models.videos.v1.Chapter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChaptersPutRequestBody implements Parsable {
    /**
     * The chapters property
     */
    private java.util.List<Chapter> chapters;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChaptersPutRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ChaptersPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChaptersPutRequestBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("chapters", (n) -> { this.setChapters(n.getCollectionOfObjectValues(Chapter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("chapters", this.getChapters());
    }
    /**
     * Sets the chapters property value. The chapters property
     * @param value Value to set for the chapters property.
     */
    public void setChapters(@jakarta.annotation.Nullable final java.util.List<Chapter> value) {
        this.chapters = value;
    }
}
