package com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_db_sqlc;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VideoQuality implements ValuedEnum {
    Basic("basic"),
    Shorts("shorts"),
    Pro("pro");
    public final String value;
    VideoQuality(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VideoQuality forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basic": return Basic;
            case "shorts": return Shorts;
            case "pro": return Pro;
            default: return null;
        }
    }
}
