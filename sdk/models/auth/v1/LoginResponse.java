package com.rixl.sdk.models.auth.v1;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoginResponse implements Parsable {
    /**
     * The access_token property
     */
    private String accessToken;
    /**
     * authentication lists the 2FA methods the user has configured when status is &quot;2fa_required&quot;. The public API renders these as lowercase strings: &quot;passkey&quot;, &quot;totp&quot;.
     */
    private java.util.List<AuthMethod> authentication;
    /**
     * The email property
     */
    private String email;
    /**
     * The expires_in property
     */
    private Long expiresIn;
    /**
     * passkey_options is the WebAuthn PublicKeyCredentialRequestOptions as JSON, present only when &quot;passkey&quot; is one of the authentication methods.
     */
    private byte[] passkeyOptions;
    /**
     * The refresh_token property
     */
    private String refreshToken;
    /**
     * The requires_action property
     */
    private String requiresAction;
    /**
     * The session_id property
     */
    private String sessionId;
    /**
     * &quot;ok&quot; | &quot;2fa_required&quot; | &quot;email_not_verified&quot;
     */
    private String status;
    /**
     * The token_type property
     */
    private String tokenType;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LoginResponse}
     */
    @jakarta.annotation.Nonnull
    public static LoginResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoginResponse();
    }
    /**
     * Gets the access_token property value. The access_token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessToken() {
        return this.accessToken;
    }
    /**
     * Gets the authentication property value. authentication lists the 2FA methods the user has configured when status is &quot;2fa_required&quot;. The public API renders these as lowercase strings: &quot;passkey&quot;, &quot;totp&quot;.
     * @return a {@link java.util.List<AuthMethod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthMethod> getAuthentication() {
        return this.authentication;
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the expires_in property value. The expires_in property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getExpiresIn() {
        return this.expiresIn;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("access_token", (n) -> { this.setAccessToken(n.getStringValue()); });
        deserializerMap.put("authentication", (n) -> { this.setAuthentication(n.getCollectionOfEnumValues(AuthMethod::forValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("expires_in", (n) -> { this.setExpiresIn(n.getLongValue()); });
        deserializerMap.put("passkey_options", (n) -> { this.setPasskeyOptions(n.getByteArrayValue()); });
        deserializerMap.put("refresh_token", (n) -> { this.setRefreshToken(n.getStringValue()); });
        deserializerMap.put("requires_action", (n) -> { this.setRequiresAction(n.getStringValue()); });
        deserializerMap.put("session_id", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("token_type", (n) -> { this.setTokenType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passkey_options property value. passkey_options is the WebAuthn PublicKeyCredentialRequestOptions as JSON, present only when &quot;passkey&quot; is one of the authentication methods.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getPasskeyOptions() {
        return this.passkeyOptions;
    }
    /**
     * Gets the refresh_token property value. The refresh_token property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefreshToken() {
        return this.refreshToken;
    }
    /**
     * Gets the requires_action property value. The requires_action property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequiresAction() {
        return this.requiresAction;
    }
    /**
     * Gets the session_id property value. The session_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Gets the status property value. &quot;ok&quot; | &quot;2fa_required&quot; | &quot;email_not_verified&quot;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the token_type property value. The token_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTokenType() {
        return this.tokenType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("access_token", this.getAccessToken());
        writer.writeCollectionOfEnumValues("authentication", this.getAuthentication());
        writer.writeStringValue("email", this.getEmail());
        writer.writeLongValue("expires_in", this.getExpiresIn());
        writer.writeByteArrayValue("passkey_options", this.getPasskeyOptions());
        writer.writeStringValue("refresh_token", this.getRefreshToken());
        writer.writeStringValue("requires_action", this.getRequiresAction());
        writer.writeStringValue("session_id", this.getSessionId());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("token_type", this.getTokenType());
    }
    /**
     * Sets the access_token property value. The access_token property
     * @param value Value to set for the access_token property.
     */
    public void setAccessToken(@jakarta.annotation.Nullable final String value) {
        this.accessToken = value;
    }
    /**
     * Sets the authentication property value. authentication lists the 2FA methods the user has configured when status is &quot;2fa_required&quot;. The public API renders these as lowercase strings: &quot;passkey&quot;, &quot;totp&quot;.
     * @param value Value to set for the authentication property.
     */
    public void setAuthentication(@jakarta.annotation.Nullable final java.util.List<AuthMethod> value) {
        this.authentication = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the expires_in property value. The expires_in property
     * @param value Value to set for the expires_in property.
     */
    public void setExpiresIn(@jakarta.annotation.Nullable final Long value) {
        this.expiresIn = value;
    }
    /**
     * Sets the passkey_options property value. passkey_options is the WebAuthn PublicKeyCredentialRequestOptions as JSON, present only when &quot;passkey&quot; is one of the authentication methods.
     * @param value Value to set for the passkey_options property.
     */
    public void setPasskeyOptions(@jakarta.annotation.Nullable final byte[] value) {
        this.passkeyOptions = value;
    }
    /**
     * Sets the refresh_token property value. The refresh_token property
     * @param value Value to set for the refresh_token property.
     */
    public void setRefreshToken(@jakarta.annotation.Nullable final String value) {
        this.refreshToken = value;
    }
    /**
     * Sets the requires_action property value. The requires_action property
     * @param value Value to set for the requires_action property.
     */
    public void setRequiresAction(@jakarta.annotation.Nullable final String value) {
        this.requiresAction = value;
    }
    /**
     * Sets the session_id property value. The session_id property
     * @param value Value to set for the session_id property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
    /**
     * Sets the status property value. &quot;ok&quot; | &quot;2fa_required&quot; | &quot;email_not_verified&quot;
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the token_type property value. The token_type property
     * @param value Value to set for the token_type property.
     */
    public void setTokenType(@jakarta.annotation.Nullable final String value) {
        this.tokenType = value;
    }
}
