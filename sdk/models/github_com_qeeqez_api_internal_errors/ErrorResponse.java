package com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_internal_errors;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Standard error response returned by the API
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ErrorResponse extends ApiException implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * HTTP status code
     */
    private Integer code;
    /**
     * Optional details about the error
     */
    private String details;
    /**
     * Error message describing what went wrong
     */
    private String error;
    /**
     * Instantiates a new {@link ErrorResponse} and sets the default values.
     */
    public ErrorResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ErrorResponse}
     */
    @jakarta.annotation.Nonnull
    public static ErrorResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ErrorResponse();
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
     * Gets the code property value. HTTP status code
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCode() {
        return this.code;
    }
    /**
     * Gets the details property value. Optional details about the error
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetails() {
        return this.details;
    }
    /**
     * Gets the error property value. Error message describing what went wrong
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("code", (n) -> { this.setCode(n.getIntegerValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getStringValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * The primary error message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nonnull
    @Override
    public String getMessage() {
        return super.getMessage();
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("code", this.getCode());
        writer.writeStringValue("details", this.getDetails());
        writer.writeStringValue("error", this.getError());
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
     * Sets the code property value. HTTP status code
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final Integer value) {
        this.code = value;
    }
    /**
     * Sets the details property value. Optional details about the error
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final String value) {
        this.details = value;
    }
    /**
     * Sets the error property value. Error message describing what went wrong
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
}
