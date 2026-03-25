package com.qeeqez.rixl.sdk.videos.item.thumbnail;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_internal_errors.ErrorResponse;
import com.qeeqez.rixl.sdk.models.Video;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /videos/{videoId}/thumbnail
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThumbnailRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ThumbnailRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ThumbnailRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videos/{videoId}/thumbnail", pathParameters);
    }
    /**
     * Instantiates a new {@link ThumbnailRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ThumbnailRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videos/{videoId}/thumbnail", rawUrl);
    }
    /**
     * Update the thumbnail image for an existing video using API key authentication
     * @param body The request body
     * @return a {@link Video}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Video put(@jakarta.annotation.Nonnull final ThumbnailPutRequestBody body) {
        return put(body, null);
    }
    /**
     * Update the thumbnail image for an existing video using API key authentication
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Video}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Video put(@jakarta.annotation.Nonnull final ThumbnailPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("401", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("403", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Video::createFromDiscriminatorValue);
    }
    /**
     * Update the thumbnail image for an existing video using API key authentication
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ThumbnailPutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update the thumbnail image for an existing video using API key authentication
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ThumbnailPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/x-www-form-urlencoded", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ThumbnailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThumbnailRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ThumbnailRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
