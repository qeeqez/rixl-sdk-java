package com.qeeqez.rixl.sdk.images.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_internal_errors.ErrorResponse;
import com.qeeqez.rixl.sdk.models.Image;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /images/{imageId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithImageItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithImageItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithImageItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/images/{imageId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithImageItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithImageItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/images/{imageId}", rawUrl);
    }
    /**
     * delete an image by marking it as deleted
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * delete an image by marking it as deleted
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("401", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("403", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve an image by its ID for a specific project.
     * @return a {@link Image}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Image get() {
        return get(null);
    }
    /**
     * Retrieve an image by its ID for a specific project.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Image}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Image get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("401", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("403", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Image::createFromDiscriminatorValue);
    }
    /**
     * delete an image by marking it as deleted
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * delete an image by marking it as deleted
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve an image by its ID for a specific project.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve an image by its ID for a specific project.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithImageItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithImageItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithImageItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
