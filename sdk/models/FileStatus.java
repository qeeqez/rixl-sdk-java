package com.qeeqez.rixl.sdk.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileStatus implements ValuedEnum {
    Uploading("uploading"),
    Uploaded("uploaded"),
    Processing("processing"),
    Preparing("preparing"),
    Ready("ready"),
    Error("error");
    public final String value;
    FileStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "uploading": return Uploading;
            case "uploaded": return Uploaded;
            case "processing": return Processing;
            case "preparing": return Preparing;
            case "ready": return Ready;
            case "error": return Error;
            default: return null;
        }
    }
}
