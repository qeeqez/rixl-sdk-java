package com.qeeqez.rixl.sdk.videos.item.audiotracks;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.qeeqez.rixl.sdk.models.AudioTrackDelete;
import com.qeeqez.rixl.sdk.videos.item.audiotracks.item.WithLangCodeItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /videos/{videoId}/audio-tracks
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AudioTracksRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.qeeqez.rixl.sdk.videos.item.audioTracks.item collection
     * @param lang_code Language Code (BCP 47)
     * @return a {@link WithLangCodeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLangCodeItemRequestBuilder byLang_code(@jakarta.annotation.Nonnull final String lang_code) {
        Objects.requireNonNull(lang_code);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("lang_code", lang_code);
        return new WithLangCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AudioTracksRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudioTracksRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videos/{videoId}/audio-tracks", pathParameters);
    }
    /**
     * Instantiates a new {@link AudioTracksRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudioTracksRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videos/{videoId}/audio-tracks", rawUrl);
    }
    /**
     * Remove all additional audio tracks from a video using API key authentication
     * @return a {@link AudioTrackDelete}
     */
    @jakarta.annotation.Nullable
    public AudioTrackDelete delete() {
        return delete(null);
    }
    /**
     * Remove all additional audio tracks from a video using API key authentication
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AudioTrackDelete}
     */
    @jakarta.annotation.Nullable
    public AudioTrackDelete delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AudioTrackDelete::createFromDiscriminatorValue);
    }
    /**
     * Remove all additional audio tracks from a video using API key authentication
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Remove all additional audio tracks from a video using API key authentication
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AudioTracksRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AudioTracksRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AudioTracksRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
}
