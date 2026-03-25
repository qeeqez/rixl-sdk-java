package com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_db_sqlc;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlanType implements ValuedEnum {
    Free("free"),
    Pro("pro"),
    Custom("custom"),
    Pay_as_you_go("pay_as_you_go");
    public final String value;
    PlanType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlanType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "free": return Free;
            case "pro": return Pro;
            case "custom": return Custom;
            case "pay_as_you_go": return Pay_as_you_go;
            default: return null;
        }
    }
}
