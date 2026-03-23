# VideosApi

All URIs are relative to *https://api.rixl.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteVideosVideoIdAudioTracks**](VideosApi.md#deleteVideosVideoIdAudioTracks) | **DELETE** /videos/{videoId}/audio-tracks | Delete all audio tracks |
| [**deleteVideosVideoIdAudioTracksLangCode**](VideosApi.md#deleteVideosVideoIdAudioTracksLangCode) | **DELETE** /videos/{videoId}/audio-tracks/{lang_code} | Delete audio track by language |
| [**deleteVideosVideoIdAudioTracksTrackId**](VideosApi.md#deleteVideosVideoIdAudioTracksTrackId) | **DELETE** /videos/{videoId}/audio-tracks/{trackId} | Delete audio track |
| [**deleteVideosVideoIdChapters**](VideosApi.md#deleteVideosVideoIdChapters) | **DELETE** /videos/{videoId}/chapters | Delete video chapters |
| [**deleteVideosVideoIdDelete**](VideosApi.md#deleteVideosVideoIdDelete) | **DELETE** /videos/{videoId}/delete | Delete video |
| [**deleteVideosVideoIdSubtitles**](VideosApi.md#deleteVideosVideoIdSubtitles) | **DELETE** /videos/{videoId}/subtitles | Delete all subtitles |
| [**deleteVideosVideoIdSubtitlesLangCode**](VideosApi.md#deleteVideosVideoIdSubtitlesLangCode) | **DELETE** /videos/{videoId}/subtitles/{lang_code} | Delete subtitle by language |
| [**deleteVideosVideoIdSubtitlesSubtitleId**](VideosApi.md#deleteVideosVideoIdSubtitlesSubtitleId) | **DELETE** /videos/{videoId}/subtitles/{subtitleId} | Delete subtitle |
| [**getVideos**](VideosApi.md#getVideos) | **GET** /videos | List videos for a project |
| [**getVideosLanguages**](VideosApi.md#getVideosLanguages) | **GET** /videos/languages | List available subtitle languages |
| [**getVideosVideoId**](VideosApi.md#getVideosVideoId) | **GET** /videos/{videoId} | Get a video |
| [**postVideosUploadComplete**](VideosApi.md#postVideosUploadComplete) | **POST** /videos/upload/complete | Upload: Mark as complete |
| [**postVideosUploadInit**](VideosApi.md#postVideosUploadInit) | **POST** /videos/upload/init | Upload: Init |
| [**postVideosVideoIdAudioTracks**](VideosApi.md#postVideosVideoIdAudioTracks) | **POST** /videos/{videoId}/audio-tracks | Bulk upsert video audio tracks |
| [**postVideosVideoIdSubtitles**](VideosApi.md#postVideosVideoIdSubtitles) | **POST** /videos/{videoId}/subtitles | Bulk upsert video subtitles |
| [**putVideosVideoIdAudioTracksLangCode**](VideosApi.md#putVideosVideoIdAudioTracksLangCode) | **PUT** /videos/{videoId}/audio-tracks/{lang_code} | Upsert video audio track |
| [**putVideosVideoIdChapters**](VideosApi.md#putVideosVideoIdChapters) | **PUT** /videos/{videoId}/chapters | Update video chapters |
| [**putVideosVideoIdSubtitlesLangCode**](VideosApi.md#putVideosVideoIdSubtitlesLangCode) | **PUT** /videos/{videoId}/subtitles/{lang_code} | Upsert video subtitle |
| [**putVideosVideoIdThumbnail**](VideosApi.md#putVideosVideoIdThumbnail) | **PUT** /videos/{videoId}/thumbnail | Update video thumbnail |



## deleteVideosVideoIdAudioTracks

> AudioTrackDelete deleteVideosVideoIdAudioTracks(videoId)

Delete all audio tracks

Remove all additional audio tracks from a video using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        try {
            AudioTrackDelete result = apiInstance.deleteVideosVideoIdAudioTracks(videoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#deleteVideosVideoIdAudioTracks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |

### Return type

[**AudioTrackDelete**](AudioTrackDelete.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteVideosVideoIdAudioTracksLangCode

> AudioTrackDelete deleteVideosVideoIdAudioTracksLangCode(videoId, langCode)

Delete audio track by language

Remove an audio track for a specific language using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        String langCode = "langCode_example"; // String | Language Code (BCP 47)
        try {
            AudioTrackDelete result = apiInstance.deleteVideosVideoIdAudioTracksLangCode(videoId, langCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#deleteVideosVideoIdAudioTracksLangCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **langCode** | **String**| Language Code (BCP 47) | |

### Return type

[**AudioTrackDelete**](AudioTrackDelete.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteVideosVideoIdAudioTracksTrackId

> AudioTrackDelete deleteVideosVideoIdAudioTracksTrackId(videoId, trackId)

Delete audio track

Remove an additional audio track from a video using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        String trackId = "trackId_example"; // String | Audio Track ID
        try {
            AudioTrackDelete result = apiInstance.deleteVideosVideoIdAudioTracksTrackId(videoId, trackId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#deleteVideosVideoIdAudioTracksTrackId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **trackId** | **String**| Audio Track ID | |

### Return type

[**AudioTrackDelete**](AudioTrackDelete.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## deleteVideosVideoIdChapters

> UpdateChaptersResponse deleteVideosVideoIdChapters(videoId)

Delete video chapters

Remove all chapters from a video using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        try {
            UpdateChaptersResponse result = apiInstance.deleteVideosVideoIdChapters(videoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#deleteVideosVideoIdChapters");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |

### Return type

[**UpdateChaptersResponse**](UpdateChaptersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **403** | Access denied |  -  |
| **404** | Video not found |  -  |
| **500** | Failed to delete chapters |  -  |


## deleteVideosVideoIdDelete

> deleteVideosVideoIdDelete(videoId)

Delete video

Delete a video by its ID within a project

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        try {
            apiInstance.deleteVideosVideoIdDelete(videoId);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#deleteVideosVideoIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Video deleted successfully |  -  |
| **400** | Invalid project ID or video ID |  -  |
| **401** | Unauthorized |  -  |
| **403** | Access denied |  -  |
| **404** | Video not found |  -  |
| **500** | Failed to delete video |  -  |


## deleteVideosVideoIdSubtitles

> SubtitleDelete deleteVideosVideoIdSubtitles(videoId)

Delete all subtitles

Remove all subtitles from a video using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        try {
            SubtitleDelete result = apiInstance.deleteVideosVideoIdSubtitles(videoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#deleteVideosVideoIdSubtitles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |

### Return type

[**SubtitleDelete**](SubtitleDelete.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteVideosVideoIdSubtitlesLangCode

> SubtitleDelete deleteVideosVideoIdSubtitlesLangCode(videoId, langCode)

Delete subtitle by language

Remove a subtitle for a specific language using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        String langCode = "langCode_example"; // String | Language Code (BCP 47)
        try {
            SubtitleDelete result = apiInstance.deleteVideosVideoIdSubtitlesLangCode(videoId, langCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#deleteVideosVideoIdSubtitlesLangCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **langCode** | **String**| Language Code (BCP 47) | |

### Return type

[**SubtitleDelete**](SubtitleDelete.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteVideosVideoIdSubtitlesSubtitleId

> SubtitleDelete deleteVideosVideoIdSubtitlesSubtitleId(videoId, subtitleId)

Delete subtitle

Remove a subtitle from a video using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        String subtitleId = "subtitleId_example"; // String | Subtitle ID
        try {
            SubtitleDelete result = apiInstance.deleteVideosVideoIdSubtitlesSubtitleId(videoId, subtitleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#deleteVideosVideoIdSubtitlesSubtitleId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **subtitleId** | **String**| Subtitle ID | |

### Return type

[**SubtitleDelete**](SubtitleDelete.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## getVideos

> PaginationPaginatedResponseVideo getVideos(limit, offset, sort, order)

List videos for a project

Retrieve all videos for a specific project, with pagination and sorting.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        Integer limit = 25; // Integer | Maximum number of items to return in a single request. <br> **Default:** `25`
        Integer offset = 0; // Integer | Starting point of the result set. <br>To get page 2 with a limit of 25, set `offset` to `25`. <br> **Default:** `0`
        String sort = "sort_example"; // String | Field to sort by (created_at, name, size, updated_at, duration)
        String order = "order_example"; // String | Sort order (asc, desc)
        try {
            PaginationPaginatedResponseVideo result = apiInstance.getVideos(limit, offset, sort, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#getVideos");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; | [optional] [default to 25] |
| **offset** | **Integer**| Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; | [optional] [default to 0] |
| **sort** | **String**| Field to sort by (created_at, name, size, updated_at, duration) | [optional] |
| **order** | **String**| Sort order (asc, desc) | [optional] |

### Return type

[**PaginationPaginatedResponseVideo**](PaginationPaginatedResponseVideo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid query parameters |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |


## getVideosLanguages

> List&lt;InternalVideosHandlerSubtitlesLanguageResponse&gt; getVideosLanguages()

List available subtitle languages

Get list of supported languages for subtitles

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");

        VideosApi apiInstance = new VideosApi(defaultClient);
        try {
            List<InternalVideosHandlerSubtitlesLanguageResponse> result = apiInstance.getVideosLanguages();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#getVideosLanguages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;InternalVideosHandlerSubtitlesLanguageResponse&gt;**](InternalVideosHandlerSubtitlesLanguageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVideosVideoId

> Video getVideosVideoId(videoId)

Get a video

Retrieve a video by its ID for a specific project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        try {
            Video result = apiInstance.getVideosVideoId(videoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#getVideosVideoId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |

### Return type

[**Video**](Video.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid video ID |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Video not found |  -  |
| **500** | Internal server error |  -  |


## postVideosUploadComplete

> Video postVideosUploadComplete(request)

Upload: Mark as complete

Mark a video upload as complete after successful upload to storage using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        GithubComQeeqezApiInternalVideosHandlerUploadCompleteRequest request = new GithubComQeeqezApiInternalVideosHandlerUploadCompleteRequest(); // GithubComQeeqezApiInternalVideosHandlerUploadCompleteRequest | Video upload completion request
        try {
            Video result = apiInstance.postVideosUploadComplete(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#postVideosUploadComplete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **request** | [**GithubComQeeqezApiInternalVideosHandlerUploadCompleteRequest**](GithubComQeeqezApiInternalVideosHandlerUploadCompleteRequest.md)| Video upload completion request | |

### Return type

[**Video**](Video.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request body |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **403** | Access denied |  -  |
| **404** | File not found |  -  |
| **500** | Failed to complete upload |  -  |


## postVideosUploadInit

> GithubComQeeqezApiInternalVideosHandlerUploadInitResponse postVideosUploadInit(request)

Upload: Init

Initialize a video upload and get presigned URLs for video and poster using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        VideoUploadInitRequest request = new VideoUploadInitRequest(); // VideoUploadInitRequest | Video upload initialization request
        try {
            GithubComQeeqezApiInternalVideosHandlerUploadInitResponse result = apiInstance.postVideosUploadInit(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#postVideosUploadInit");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **request** | [**VideoUploadInitRequest**](VideoUploadInitRequest.md)| Video upload initialization request | |

### Return type

[**GithubComQeeqezApiInternalVideosHandlerUploadInitResponse**](GithubComQeeqezApiInternalVideosHandlerUploadInitResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request body |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **403** | Access denied |  -  |
| **500** | Failed to initialize upload |  -  |


## postVideosVideoIdAudioTracks

> List&lt;AudioTrack&gt; postVideosVideoIdAudioTracks(videoId, files, languageCodes, labels)

Bulk upsert video audio tracks

Replace all audio tracks with the provided ones using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        List<File> files = Arrays.asList(); // List<File> | Audio files (.mp3, .opus, .flac, .wav, .ac3, .m4a, .aac)
        String languageCodes = "languageCodes_example"; // String | Comma-separated language codes
        String labels = "labels_example"; // String | Comma-separated labels
        try {
            List<AudioTrack> result = apiInstance.postVideosVideoIdAudioTracks(videoId, files, languageCodes, labels);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#postVideosVideoIdAudioTracks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **files** | **List&lt;File&gt;**| Audio files (.mp3, .opus, .flac, .wav, .ac3, .m4a, .aac) | |
| **languageCodes** | **String**| Comma-separated language codes | |
| **labels** | **String**| Comma-separated labels | |

### Return type

[**List&lt;AudioTrack&gt;**](AudioTrack.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postVideosVideoIdSubtitles

> List&lt;Subtitle&gt; postVideosVideoIdSubtitles(videoId, files, languageCodes, labels)

Bulk upsert video subtitles

Replace all subtitles with the provided ones using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        List<File> files = Arrays.asList(); // List<File> | Subtitle files (.srt or .vtt)
        String languageCodes = "languageCodes_example"; // String | Comma-separated language codes
        String labels = "labels_example"; // String | Comma-separated labels
        try {
            List<Subtitle> result = apiInstance.postVideosVideoIdSubtitles(videoId, files, languageCodes, labels);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#postVideosVideoIdSubtitles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **files** | **List&lt;File&gt;**| Subtitle files (.srt or .vtt) | |
| **languageCodes** | **String**| Comma-separated language codes | |
| **labels** | **String**| Comma-separated labels | |

### Return type

[**List&lt;Subtitle&gt;**](Subtitle.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putVideosVideoIdAudioTracksLangCode

> AudioTrack putVideosVideoIdAudioTracksLangCode(videoId, langCode, _file, label)

Upsert video audio track

Add or replace an audio track for a specific language using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        String langCode = "langCode_example"; // String | Language Code (BCP 47)
        File _file = new File("/path/to/file"); // File | Audio file (.mp3, .opus, .flac, .wav, .ac3, .m4a, .aac)
        String label = "label_example"; // String | Label (e.g. English)
        try {
            AudioTrack result = apiInstance.putVideosVideoIdAudioTracksLangCode(videoId, langCode, _file, label);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#putVideosVideoIdAudioTracksLangCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **langCode** | **String**| Language Code (BCP 47) | |
| **_file** | **File**| Audio file (.mp3, .opus, .flac, .wav, .ac3, .m4a, .aac) | |
| **label** | **String**| Label (e.g. English) | [optional] |

### Return type

[**AudioTrack**](AudioTrack.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putVideosVideoIdChapters

> UpdateChaptersResponse putVideosVideoIdChapters(videoId, request)

Update video chapters

Replace all chapters for a video (atomic PUT operation) using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        UpdateChaptersRequest request = new UpdateChaptersRequest(); // UpdateChaptersRequest | Chapters array
        try {
            UpdateChaptersResponse result = apiInstance.putVideosVideoIdChapters(videoId, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#putVideosVideoIdChapters");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **request** | [**UpdateChaptersRequest**](UpdateChaptersRequest.md)| Chapters array | |

### Return type

[**UpdateChaptersResponse**](UpdateChaptersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request body or video duration not available |  -  |
| **401** | Unauthorized - Invalid API key |  -  |
| **403** | Access denied |  -  |
| **404** | Video not found |  -  |
| **500** | Failed to update chapters |  -  |


## putVideosVideoIdSubtitlesLangCode

> Subtitle putVideosVideoIdSubtitlesLangCode(videoId, langCode, _file, label)

Upsert video subtitle

Add or replace a subtitle for a specific language using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        String langCode = "langCode_example"; // String | Language Code (BCP 47)
        File _file = new File("/path/to/file"); // File | Subtitle file (.srt or .vtt)
        String label = "label_example"; // String | Label (e.g. English)
        try {
            Subtitle result = apiInstance.putVideosVideoIdSubtitlesLangCode(videoId, langCode, _file, label);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#putVideosVideoIdSubtitlesLangCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **langCode** | **String**| Language Code (BCP 47) | |
| **_file** | **File**| Subtitle file (.srt or .vtt) | |
| **label** | **String**| Label (e.g. English) | [optional] |

### Return type

[**Subtitle**](Subtitle.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putVideosVideoIdThumbnail

> Video putVideosVideoIdThumbnail(videoId, thumbnail)

Update video thumbnail

Update the thumbnail image for an existing video

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");

        VideosApi apiInstance = new VideosApi(defaultClient);
        String videoId = "videoId_example"; // String | Video ID
        File thumbnail = new File("/path/to/file"); // File | Thumbnail image file (max 5MB, image/_*)
        try {
            Video result = apiInstance.putVideosVideoIdThumbnail(videoId, thumbnail);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideosApi#putVideosVideoIdThumbnail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Video ID | |
| **thumbnail** | **File**| Thumbnail image file (max 5MB, image/_*) | |

### Return type

[**Video**](Video.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Video with updated thumbnail |  -  |
| **400** | Invalid file or request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Access denied |  -  |
| **404** | Video not found |  -  |
| **500** | Upload or update failed |  -  |

