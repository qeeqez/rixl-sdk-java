package com.qeeqez.rixl.sdk.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PostType implements ValuedEnum {
    Image("image"),
    Video("video");
    public final String value;
    PostType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PostType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "image": return Image;
            case "video": return Video;
            default: return null;
        }
    }
}
