package io.rixl.sdk.videos.api;

import io.rixl.sdk.videos.client.ApiClient;
import io.rixl.sdk.videos.client.BaseApi;

import io.rixl.sdk.videos.model.AudioTrack;
import io.rixl.sdk.videos.model.AudioTrackDelete;
import java.io.File;
import io.rixl.sdk.videos.model.GithubComQeeqezApiInternalErrorsErrorResponse;
import io.rixl.sdk.videos.model.GithubComQeeqezApiInternalVideosHandlerUploadCompleteRequest;
import io.rixl.sdk.videos.model.GithubComQeeqezApiInternalVideosHandlerUploadInitResponse;
import io.rixl.sdk.videos.model.InternalVideosHandlerSubtitlesLanguageResponse;
import io.rixl.sdk.videos.model.PaginationPaginatedResponseVideo;
import io.rixl.sdk.videos.model.Subtitle;
import io.rixl.sdk.videos.model.SubtitleDelete;
import io.rixl.sdk.videos.model.UpdateChaptersRequest;
import io.rixl.sdk.videos.model.UpdateChaptersResponse;
import io.rixl.sdk.videos.model.Video;
import io.rixl.sdk.videos.model.VideoUploadInitRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-03-23T11:50:49.332099+01:00[Africa/Lagos]", comments = "Generator version: 7.20.0")
public class VideosApi extends BaseApi {

    public VideosApi() {
        super(new ApiClient());
    }

    public VideosApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Delete all audio tracks
     * Remove all additional audio tracks from a video using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @return AudioTrackDelete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AudioTrackDelete deleteVideosVideoIdAudioTracks(String videoId) throws RestClientException {
        return deleteVideosVideoIdAudioTracksWithHttpInfo(videoId).getBody();
    }

    /**
     * Delete all audio tracks
     * Remove all additional audio tracks from a video using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @return ResponseEntity&lt;AudioTrackDelete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AudioTrackDelete> deleteVideosVideoIdAudioTracksWithHttpInfo(String videoId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideosVideoIdAudioTracks");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<AudioTrackDelete> localReturnType = new ParameterizedTypeReference<AudioTrackDelete>() {};
        return apiClient.invokeAPI("/videos/{videoId}/audio-tracks", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete audio track by language
     * Remove an audio track for a specific language using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param langCode Language Code (BCP 47) (required)
     * @return AudioTrackDelete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AudioTrackDelete deleteVideosVideoIdAudioTracksLangCode(String videoId, String langCode) throws RestClientException {
        return deleteVideosVideoIdAudioTracksLangCodeWithHttpInfo(videoId, langCode).getBody();
    }

    /**
     * Delete audio track by language
     * Remove an audio track for a specific language using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param langCode Language Code (BCP 47) (required)
     * @return ResponseEntity&lt;AudioTrackDelete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AudioTrackDelete> deleteVideosVideoIdAudioTracksLangCodeWithHttpInfo(String videoId, String langCode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideosVideoIdAudioTracksLangCode");
        }
        
        // verify the required parameter 'langCode' is set
        if (langCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'langCode' when calling deleteVideosVideoIdAudioTracksLangCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);
        uriVariables.put("lang_code", langCode);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<AudioTrackDelete> localReturnType = new ParameterizedTypeReference<AudioTrackDelete>() {};
        return apiClient.invokeAPI("/videos/{videoId}/audio-tracks/{lang_code}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete audio track
     * Remove an additional audio track from a video using API key authentication
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param videoId Video ID (required)
     * @param trackId Audio Track ID (required)
     * @return AudioTrackDelete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AudioTrackDelete deleteVideosVideoIdAudioTracksTrackId(String videoId, String trackId) throws RestClientException {
        return deleteVideosVideoIdAudioTracksTrackIdWithHttpInfo(videoId, trackId).getBody();
    }

    /**
     * Delete audio track
     * Remove an additional audio track from a video using API key authentication
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param videoId Video ID (required)
     * @param trackId Audio Track ID (required)
     * @return ResponseEntity&lt;AudioTrackDelete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AudioTrackDelete> deleteVideosVideoIdAudioTracksTrackIdWithHttpInfo(String videoId, String trackId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideosVideoIdAudioTracksTrackId");
        }
        
        // verify the required parameter 'trackId' is set
        if (trackId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'trackId' when calling deleteVideosVideoIdAudioTracksTrackId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);
        uriVariables.put("trackId", trackId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<AudioTrackDelete> localReturnType = new ParameterizedTypeReference<AudioTrackDelete>() {};
        return apiClient.invokeAPI("/videos/{videoId}/audio-tracks/{trackId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete video chapters
     * Remove all chapters from a video using API key authentication
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Failed to delete chapters
     * @param videoId Video ID (required)
     * @return UpdateChaptersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateChaptersResponse deleteVideosVideoIdChapters(String videoId) throws RestClientException {
        return deleteVideosVideoIdChaptersWithHttpInfo(videoId).getBody();
    }

    /**
     * Delete video chapters
     * Remove all chapters from a video using API key authentication
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Failed to delete chapters
     * @param videoId Video ID (required)
     * @return ResponseEntity&lt;UpdateChaptersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateChaptersResponse> deleteVideosVideoIdChaptersWithHttpInfo(String videoId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideosVideoIdChapters");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<UpdateChaptersResponse> localReturnType = new ParameterizedTypeReference<UpdateChaptersResponse>() {};
        return apiClient.invokeAPI("/videos/{videoId}/chapters", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete video
     * Delete a video by its ID within a project
     * <p><b>204</b> - Video deleted successfully
     * <p><b>400</b> - Invalid project ID or video ID
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Failed to delete video
     * @param videoId Video ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVideosVideoIdDelete(String videoId) throws RestClientException {
        deleteVideosVideoIdDeleteWithHttpInfo(videoId);
    }

    /**
     * Delete video
     * Delete a video by its ID within a project
     * <p><b>204</b> - Video deleted successfully
     * <p><b>400</b> - Invalid project ID or video ID
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Failed to delete video
     * @param videoId Video ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteVideosVideoIdDeleteWithHttpInfo(String videoId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideosVideoIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/videos/{videoId}/delete", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete all subtitles
     * Remove all subtitles from a video using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @return SubtitleDelete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubtitleDelete deleteVideosVideoIdSubtitles(String videoId) throws RestClientException {
        return deleteVideosVideoIdSubtitlesWithHttpInfo(videoId).getBody();
    }

    /**
     * Delete all subtitles
     * Remove all subtitles from a video using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @return ResponseEntity&lt;SubtitleDelete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubtitleDelete> deleteVideosVideoIdSubtitlesWithHttpInfo(String videoId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideosVideoIdSubtitles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<SubtitleDelete> localReturnType = new ParameterizedTypeReference<SubtitleDelete>() {};
        return apiClient.invokeAPI("/videos/{videoId}/subtitles", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete subtitle by language
     * Remove a subtitle for a specific language using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param langCode Language Code (BCP 47) (required)
     * @return SubtitleDelete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubtitleDelete deleteVideosVideoIdSubtitlesLangCode(String videoId, String langCode) throws RestClientException {
        return deleteVideosVideoIdSubtitlesLangCodeWithHttpInfo(videoId, langCode).getBody();
    }

    /**
     * Delete subtitle by language
     * Remove a subtitle for a specific language using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param langCode Language Code (BCP 47) (required)
     * @return ResponseEntity&lt;SubtitleDelete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubtitleDelete> deleteVideosVideoIdSubtitlesLangCodeWithHttpInfo(String videoId, String langCode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideosVideoIdSubtitlesLangCode");
        }
        
        // verify the required parameter 'langCode' is set
        if (langCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'langCode' when calling deleteVideosVideoIdSubtitlesLangCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);
        uriVariables.put("lang_code", langCode);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<SubtitleDelete> localReturnType = new ParameterizedTypeReference<SubtitleDelete>() {};
        return apiClient.invokeAPI("/videos/{videoId}/subtitles/{lang_code}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete subtitle
     * Remove a subtitle from a video using API key authentication
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param videoId Video ID (required)
     * @param subtitleId Subtitle ID (required)
     * @return SubtitleDelete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubtitleDelete deleteVideosVideoIdSubtitlesSubtitleId(String videoId, String subtitleId) throws RestClientException {
        return deleteVideosVideoIdSubtitlesSubtitleIdWithHttpInfo(videoId, subtitleId).getBody();
    }

    /**
     * Delete subtitle
     * Remove a subtitle from a video using API key authentication
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param videoId Video ID (required)
     * @param subtitleId Subtitle ID (required)
     * @return ResponseEntity&lt;SubtitleDelete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubtitleDelete> deleteVideosVideoIdSubtitlesSubtitleIdWithHttpInfo(String videoId, String subtitleId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling deleteVideosVideoIdSubtitlesSubtitleId");
        }
        
        // verify the required parameter 'subtitleId' is set
        if (subtitleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subtitleId' when calling deleteVideosVideoIdSubtitlesSubtitleId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);
        uriVariables.put("subtitleId", subtitleId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<SubtitleDelete> localReturnType = new ParameterizedTypeReference<SubtitleDelete>() {};
        return apiClient.invokeAPI("/videos/{videoId}/subtitles/{subtitleId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List videos for a project
     * Retrieve all videos for a specific project, with pagination and sorting.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid query parameters
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param limit Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; (optional, default to 25)
     * @param offset Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; (optional, default to 0)
     * @param sort Field to sort by (created_at, name, size, updated_at, duration) (optional)
     * @param order Sort order (asc, desc) (optional)
     * @return PaginationPaginatedResponseVideo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginationPaginatedResponseVideo getVideos(Integer limit, Integer offset, String sort, String order) throws RestClientException {
        return getVideosWithHttpInfo(limit, offset, sort, order).getBody();
    }

    /**
     * List videos for a project
     * Retrieve all videos for a specific project, with pagination and sorting.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid query parameters
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param limit Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; (optional, default to 25)
     * @param offset Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; (optional, default to 0)
     * @param sort Field to sort by (created_at, name, size, updated_at, duration) (optional)
     * @param order Sort order (asc, desc) (optional)
     * @return ResponseEntity&lt;PaginationPaginatedResponseVideo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaginationPaginatedResponseVideo> getVideosWithHttpInfo(Integer limit, Integer offset, String sort, String order) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PaginationPaginatedResponseVideo> localReturnType = new ParameterizedTypeReference<PaginationPaginatedResponseVideo>() {};
        return apiClient.invokeAPI("/videos", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List available subtitle languages
     * Get list of supported languages for subtitles
     * <p><b>200</b> - OK
     * @return List&lt;InternalVideosHandlerSubtitlesLanguageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InternalVideosHandlerSubtitlesLanguageResponse> getVideosLanguages() throws RestClientException {
        return getVideosLanguagesWithHttpInfo().getBody();
    }

    /**
     * List available subtitle languages
     * Get list of supported languages for subtitles
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;InternalVideosHandlerSubtitlesLanguageResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<InternalVideosHandlerSubtitlesLanguageResponse>> getVideosLanguagesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<InternalVideosHandlerSubtitlesLanguageResponse>> localReturnType = new ParameterizedTypeReference<List<InternalVideosHandlerSubtitlesLanguageResponse>>() {};
        return apiClient.invokeAPI("/videos/languages", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a video
     * Retrieve a video by its ID for a specific project.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid video ID
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Internal server error
     * @param videoId Video ID (required)
     * @return Video
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Video getVideosVideoId(String videoId) throws RestClientException {
        return getVideosVideoIdWithHttpInfo(videoId).getBody();
    }

    /**
     * Get a video
     * Retrieve a video by its ID for a specific project.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid video ID
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Internal server error
     * @param videoId Video ID (required)
     * @return ResponseEntity&lt;Video&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Video> getVideosVideoIdWithHttpInfo(String videoId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling getVideosVideoId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Video> localReturnType = new ParameterizedTypeReference<Video>() {};
        return apiClient.invokeAPI("/videos/{videoId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload: Mark as complete
     * Mark a video upload as complete after successful upload to storage using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - File not found
     * <p><b>500</b> - Failed to complete upload
     * @param request Video upload completion request (required)
     * @return Video
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Video postVideosUploadComplete(GithubComQeeqezApiInternalVideosHandlerUploadCompleteRequest request) throws RestClientException {
        return postVideosUploadCompleteWithHttpInfo(request).getBody();
    }

    /**
     * Upload: Mark as complete
     * Mark a video upload as complete after successful upload to storage using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - File not found
     * <p><b>500</b> - Failed to complete upload
     * @param request Video upload completion request (required)
     * @return ResponseEntity&lt;Video&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Video> postVideosUploadCompleteWithHttpInfo(GithubComQeeqezApiInternalVideosHandlerUploadCompleteRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling postVideosUploadComplete");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Video> localReturnType = new ParameterizedTypeReference<Video>() {};
        return apiClient.invokeAPI("/videos/upload/complete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload: Init
     * Initialize a video upload and get presigned URLs for video and poster using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>500</b> - Failed to initialize upload
     * @param request Video upload initialization request (required)
     * @return GithubComQeeqezApiInternalVideosHandlerUploadInitResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GithubComQeeqezApiInternalVideosHandlerUploadInitResponse postVideosUploadInit(VideoUploadInitRequest request) throws RestClientException {
        return postVideosUploadInitWithHttpInfo(request).getBody();
    }

    /**
     * Upload: Init
     * Initialize a video upload and get presigned URLs for video and poster using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>500</b> - Failed to initialize upload
     * @param request Video upload initialization request (required)
     * @return ResponseEntity&lt;GithubComQeeqezApiInternalVideosHandlerUploadInitResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GithubComQeeqezApiInternalVideosHandlerUploadInitResponse> postVideosUploadInitWithHttpInfo(VideoUploadInitRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling postVideosUploadInit");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<GithubComQeeqezApiInternalVideosHandlerUploadInitResponse> localReturnType = new ParameterizedTypeReference<GithubComQeeqezApiInternalVideosHandlerUploadInitResponse>() {};
        return apiClient.invokeAPI("/videos/upload/init", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Bulk upsert video audio tracks
     * Replace all audio tracks with the provided ones using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param files Audio files (.mp3, .opus, .flac, .wav, .ac3, .m4a, .aac) (required)
     * @param languageCodes Comma-separated language codes (required)
     * @param labels Comma-separated labels (required)
     * @return List&lt;AudioTrack&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AudioTrack> postVideosVideoIdAudioTracks(String videoId, List<File> files, String languageCodes, String labels) throws RestClientException {
        return postVideosVideoIdAudioTracksWithHttpInfo(videoId, files, languageCodes, labels).getBody();
    }

    /**
     * Bulk upsert video audio tracks
     * Replace all audio tracks with the provided ones using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param files Audio files (.mp3, .opus, .flac, .wav, .ac3, .m4a, .aac) (required)
     * @param languageCodes Comma-separated language codes (required)
     * @param labels Comma-separated labels (required)
     * @return ResponseEntity&lt;List&lt;AudioTrack&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AudioTrack>> postVideosVideoIdAudioTracksWithHttpInfo(String videoId, List<File> files, String languageCodes, String labels) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling postVideosVideoIdAudioTracks");
        }
        
        // verify the required parameter 'files' is set
        if (files == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'files' when calling postVideosVideoIdAudioTracks");
        }
        
        // verify the required parameter 'languageCodes' is set
        if (languageCodes == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'languageCodes' when calling postVideosVideoIdAudioTracks");
        }
        
        // verify the required parameter 'labels' is set
        if (labels == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'labels' when calling postVideosVideoIdAudioTracks");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (files != null)
            localVarFormParams.addAll("files", files.stream().map(FileSystemResource::new).collect(Collectors.toList()));
        if (languageCodes != null)
            localVarFormParams.add("language_codes", languageCodes);
        if (labels != null)
            localVarFormParams.add("labels", labels);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<List<AudioTrack>> localReturnType = new ParameterizedTypeReference<List<AudioTrack>>() {};
        return apiClient.invokeAPI("/videos/{videoId}/audio-tracks", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Bulk upsert video subtitles
     * Replace all subtitles with the provided ones using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param files Subtitle files (.srt or .vtt) (required)
     * @param languageCodes Comma-separated language codes (required)
     * @param labels Comma-separated labels (required)
     * @return List&lt;Subtitle&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Subtitle> postVideosVideoIdSubtitles(String videoId, List<File> files, String languageCodes, String labels) throws RestClientException {
        return postVideosVideoIdSubtitlesWithHttpInfo(videoId, files, languageCodes, labels).getBody();
    }

    /**
     * Bulk upsert video subtitles
     * Replace all subtitles with the provided ones using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param files Subtitle files (.srt or .vtt) (required)
     * @param languageCodes Comma-separated language codes (required)
     * @param labels Comma-separated labels (required)
     * @return ResponseEntity&lt;List&lt;Subtitle&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Subtitle>> postVideosVideoIdSubtitlesWithHttpInfo(String videoId, List<File> files, String languageCodes, String labels) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling postVideosVideoIdSubtitles");
        }
        
        // verify the required parameter 'files' is set
        if (files == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'files' when calling postVideosVideoIdSubtitles");
        }
        
        // verify the required parameter 'languageCodes' is set
        if (languageCodes == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'languageCodes' when calling postVideosVideoIdSubtitles");
        }
        
        // verify the required parameter 'labels' is set
        if (labels == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'labels' when calling postVideosVideoIdSubtitles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (files != null)
            localVarFormParams.addAll("files", files.stream().map(FileSystemResource::new).collect(Collectors.toList()));
        if (languageCodes != null)
            localVarFormParams.add("language_codes", languageCodes);
        if (labels != null)
            localVarFormParams.add("labels", labels);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<List<Subtitle>> localReturnType = new ParameterizedTypeReference<List<Subtitle>>() {};
        return apiClient.invokeAPI("/videos/{videoId}/subtitles", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upsert video audio track
     * Add or replace an audio track for a specific language using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param langCode Language Code (BCP 47) (required)
     * @param _file Audio file (.mp3, .opus, .flac, .wav, .ac3, .m4a, .aac) (required)
     * @param label Label (e.g. English) (optional)
     * @return AudioTrack
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AudioTrack putVideosVideoIdAudioTracksLangCode(String videoId, String langCode, File _file, String label) throws RestClientException {
        return putVideosVideoIdAudioTracksLangCodeWithHttpInfo(videoId, langCode, _file, label).getBody();
    }

    /**
     * Upsert video audio track
     * Add or replace an audio track for a specific language using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param langCode Language Code (BCP 47) (required)
     * @param _file Audio file (.mp3, .opus, .flac, .wav, .ac3, .m4a, .aac) (required)
     * @param label Label (e.g. English) (optional)
     * @return ResponseEntity&lt;AudioTrack&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AudioTrack> putVideosVideoIdAudioTracksLangCodeWithHttpInfo(String videoId, String langCode, File _file, String label) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling putVideosVideoIdAudioTracksLangCode");
        }
        
        // verify the required parameter 'langCode' is set
        if (langCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'langCode' when calling putVideosVideoIdAudioTracksLangCode");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling putVideosVideoIdAudioTracksLangCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);
        uriVariables.put("lang_code", langCode);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (_file != null)
            localVarFormParams.add("file", new FileSystemResource(_file));
        if (label != null)
            localVarFormParams.add("label", label);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<AudioTrack> localReturnType = new ParameterizedTypeReference<AudioTrack>() {};
        return apiClient.invokeAPI("/videos/{videoId}/audio-tracks/{lang_code}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update video chapters
     * Replace all chapters for a video (atomic PUT operation) using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body or video duration not available
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Failed to update chapters
     * @param videoId Video ID (required)
     * @param request Chapters array (required)
     * @return UpdateChaptersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateChaptersResponse putVideosVideoIdChapters(String videoId, UpdateChaptersRequest request) throws RestClientException {
        return putVideosVideoIdChaptersWithHttpInfo(videoId, request).getBody();
    }

    /**
     * Update video chapters
     * Replace all chapters for a video (atomic PUT operation) using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body or video duration not available
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Failed to update chapters
     * @param videoId Video ID (required)
     * @param request Chapters array (required)
     * @return ResponseEntity&lt;UpdateChaptersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateChaptersResponse> putVideosVideoIdChaptersWithHttpInfo(String videoId, UpdateChaptersRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling putVideosVideoIdChapters");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling putVideosVideoIdChapters");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<UpdateChaptersResponse> localReturnType = new ParameterizedTypeReference<UpdateChaptersResponse>() {};
        return apiClient.invokeAPI("/videos/{videoId}/chapters", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upsert video subtitle
     * Add or replace a subtitle for a specific language using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param langCode Language Code (BCP 47) (required)
     * @param _file Subtitle file (.srt or .vtt) (required)
     * @param label Label (e.g. English) (optional)
     * @return Subtitle
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Subtitle putVideosVideoIdSubtitlesLangCode(String videoId, String langCode, File _file, String label) throws RestClientException {
        return putVideosVideoIdSubtitlesLangCodeWithHttpInfo(videoId, langCode, _file, label).getBody();
    }

    /**
     * Upsert video subtitle
     * Add or replace a subtitle for a specific language using API key authentication
     * <p><b>200</b> - OK
     * @param videoId Video ID (required)
     * @param langCode Language Code (BCP 47) (required)
     * @param _file Subtitle file (.srt or .vtt) (required)
     * @param label Label (e.g. English) (optional)
     * @return ResponseEntity&lt;Subtitle&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Subtitle> putVideosVideoIdSubtitlesLangCodeWithHttpInfo(String videoId, String langCode, File _file, String label) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling putVideosVideoIdSubtitlesLangCode");
        }
        
        // verify the required parameter 'langCode' is set
        if (langCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'langCode' when calling putVideosVideoIdSubtitlesLangCode");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling putVideosVideoIdSubtitlesLangCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);
        uriVariables.put("lang_code", langCode);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (_file != null)
            localVarFormParams.add("file", new FileSystemResource(_file));
        if (label != null)
            localVarFormParams.add("label", label);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Subtitle> localReturnType = new ParameterizedTypeReference<Subtitle>() {};
        return apiClient.invokeAPI("/videos/{videoId}/subtitles/{lang_code}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update video thumbnail
     * Update the thumbnail image for an existing video
     * <p><b>200</b> - Video with updated thumbnail
     * <p><b>400</b> - Invalid file or request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Upload or update failed
     * @param videoId Video ID (required)
     * @param thumbnail Thumbnail image file (max 5MB, image/_*) (required)
     * @return Video
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Video putVideosVideoIdThumbnail(String videoId, File thumbnail) throws RestClientException {
        return putVideosVideoIdThumbnailWithHttpInfo(videoId, thumbnail).getBody();
    }

    /**
     * Update video thumbnail
     * Update the thumbnail image for an existing video
     * <p><b>200</b> - Video with updated thumbnail
     * <p><b>400</b> - Invalid file or request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Video not found
     * <p><b>500</b> - Upload or update failed
     * @param videoId Video ID (required)
     * @param thumbnail Thumbnail image file (max 5MB, image/_*) (required)
     * @return ResponseEntity&lt;Video&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Video> putVideosVideoIdThumbnailWithHttpInfo(String videoId, File thumbnail) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'videoId' when calling putVideosVideoIdThumbnail");
        }
        
        // verify the required parameter 'thumbnail' is set
        if (thumbnail == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'thumbnail' when calling putVideosVideoIdThumbnail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("videoId", videoId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (thumbnail != null)
            localVarFormParams.add("thumbnail", new FileSystemResource(thumbnail));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Video> localReturnType = new ParameterizedTypeReference<Video>() {};
        return apiClient.invokeAPI("/videos/{videoId}/thumbnail", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
