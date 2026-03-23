# ImagesApi

All URIs are relative to *https://api.rixl.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteImagesImageId**](ImagesApi.md#deleteImagesImageId) | **DELETE** /images/{imageId} | Delete image |
| [**getImages**](ImagesApi.md#getImages) | **GET** /images | List images for a project |
| [**getImagesImageId**](ImagesApi.md#getImagesImageId) | **GET** /images/{imageId} | Get image |
| [**postImagesUploadComplete**](ImagesApi.md#postImagesUploadComplete) | **POST** /images/upload/complete | Upload: Mark as complete |
| [**postImagesUploadInit**](ImagesApi.md#postImagesUploadInit) | **POST** /images/upload/init | Upload: Init |



## deleteImagesImageId

> deleteImagesImageId(imageId)

Delete image

delete an image by marking it as deleted

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String imageId = "imageId_example"; // String | Image ID
        try {
            apiInstance.deleteImagesImageId(imageId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#deleteImagesImageId");
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
| **imageId** | **String**| Image ID | |

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
| **204** | Image deleted successfully |  -  |
| **400** | Invalid project ID or image ID |  -  |
| **401** | Unauthorized |  -  |
| **403** | Access denied |  -  |
| **404** | Image not found |  -  |
| **500** | Failed to delete image |  -  |


## getImages

> PaginationPaginatedResponseImage getImages(limit, offset, sort, order)

List images for a project

Retrieve all images for a specific project, with pagination and sorting.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        Integer limit = 25; // Integer | Maximum number of items to return in a single request. <br> **Default:** `25`
        Integer offset = 0; // Integer | Starting point of the result set. <br>To get page 2 with a limit of 25, set `offset` to `25`. <br> **Default:** `0`
        String sort = "sort_example"; // String | Field to sort by (created_at, name, size, updated_at)
        String order = "order_example"; // String | Sort order (asc, desc)
        try {
            PaginationPaginatedResponseImage result = apiInstance.getImages(limit, offset, sort, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImages");
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
| **sort** | **String**| Field to sort by (created_at, name, size, updated_at) | [optional] |
| **order** | **String**| Sort order (asc, desc) | [optional] |

### Return type

[**PaginationPaginatedResponseImage**](PaginationPaginatedResponseImage.md)

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


## getImagesImageId

> Image getImagesImageId(imageId)

Get image

Retrieve an image by its ID for a specific project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        String imageId = "imageId_example"; // String | Image ID
        try {
            Image result = apiInstance.getImagesImageId(imageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImagesImageId");
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
| **imageId** | **String**| Image ID | |

### Return type

[**Image**](Image.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid image ID |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Image not found |  -  |
| **500** | Internal server error |  -  |


## postImagesUploadComplete

> Image postImagesUploadComplete(request)

Upload: Mark as complete

Complete the upload process and create the image record using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        InternalImagesHandlerCompleteRequest request = new InternalImagesHandlerCompleteRequest(); // InternalImagesHandlerCompleteRequest | Upload completion request
        try {
            Image result = apiInstance.postImagesUploadComplete(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesUploadComplete");
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
| **request** | [**InternalImagesHandlerCompleteRequest**](InternalImagesHandlerCompleteRequest.md)| Upload completion request | |

### Return type

[**Image**](Image.md)

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
| **500** | Failed to complete upload or create image |  -  |


## postImagesUploadInit

> InternalImagesHandlerInitResponse postImagesUploadInit(request)

Upload: Init

Initialize a presigned URL upload for an image file using API key authentication

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ImagesApi apiInstance = new ImagesApi(defaultClient);
        InternalImagesHandlerUploadInitRequest request = new InternalImagesHandlerUploadInitRequest(); // InternalImagesHandlerUploadInitRequest | Upload initialization request
        try {
            InternalImagesHandlerInitResponse result = apiInstance.postImagesUploadInit(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#postImagesUploadInit");
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
| **request** | [**InternalImagesHandlerUploadInitRequest**](InternalImagesHandlerUploadInitRequest.md)| Upload initialization request | |

### Return type

[**InternalImagesHandlerInitResponse**](InternalImagesHandlerInitResponse.md)

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

