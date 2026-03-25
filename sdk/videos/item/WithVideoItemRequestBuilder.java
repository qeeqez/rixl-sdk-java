package com.qeeqez.rixl.sdk.videos.item;

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
import com.qeeqez.rixl.sdk.videos.item.audiotracks.AudioTracksRequestBuilder;
import com.qeeqez.rixl.sdk.videos.item.chapters.ChaptersRequestBuilder;
import com.qeeqez.rixl.sdk.videos.item.delete.DeleteRequestBuilder;
import com.qeeqez.rixl.sdk.videos.item.subtitles.SubtitlesRequestBuilder;
import com.qeeqez.rixl.sdk.videos.item.thumbnail.ThumbnailRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /videos/{videoId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithVideoItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The audioTracks property
     * @return a {@link AudioTracksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AudioTracksRequestBuilder audioTracks() {
        return new AudioTracksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The chapters property
     * @return a {@link ChaptersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChaptersRequestBuilder chapters() {
        return new ChaptersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The deletePath property
     * @return a {@link DeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteRequestBuilder deletePath() {
        return new DeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The subtitles property
     * @return a {@link SubtitlesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubtitlesRequestBuilder subtitles() {
        return new SubtitlesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The thumbnail property
     * @return a {@link ThumbnailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThumbnailRequestBuilder thumbnail() {
        return new ThumbnailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videos/{videoId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithVideoItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videos/{videoId}", rawUrl);
    }
    /**
     * Retrieve a video by its ID for a specific project.
     * @return a {@link Video}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Video get() {
        return get(null);
    }
    /**
     * Retrieve a video by its ID for a specific project.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Video}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Video get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("401", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("403", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Video::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a video by its ID for a specific project.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a video by its ID for a specific project.
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
     * @return a {@link WithVideoItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithVideoItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
