# FeedsApi

All URIs are relative to *https://api.rixl.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFeedsFeedId**](FeedsApi.md#getFeedsFeedId) | **GET** /feeds/{feedId} | List posts in a feed |
| [**getFeedsFeedIdCreatorsCreatorId**](FeedsApi.md#getFeedsFeedIdCreatorsCreatorId) | **GET** /feeds/{feedId}/creators/{creatorId} | List posts by creator |
| [**getFeedsFeedIdPostId**](FeedsApi.md#getFeedsFeedIdPostId) | **GET** /feeds/{feedId}/{postId} | Get a post |



## getFeedsFeedId

> PaginationPaginatedResponsePost getFeedsFeedId(feedId, limit, offset)

List posts in a feed

Retrieve posts in a feed, with pagination.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeedsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");

        FeedsApi apiInstance = new FeedsApi(defaultClient);
        String feedId = "feedId_example"; // String | Feed ID
        Integer limit = 25; // Integer | Maximum number of items to return in a single request. <br> **Default:** `25`
        Integer offset = 0; // Integer | Starting point of the result set. <br>To get page 2 with a limit of 25, set `offset` to `25`. <br> **Default:** `0`
        try {
            PaginationPaginatedResponsePost result = apiInstance.getFeedsFeedId(feedId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedsApi#getFeedsFeedId");
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
| **feedId** | **String**| Feed ID | |
| **limit** | **Integer**| Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; | [optional] [default to 25] |
| **offset** | **Integer**| Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; | [optional] [default to 0] |

### Return type

[**PaginationPaginatedResponsePost**](PaginationPaginatedResponsePost.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid feed ID or query parameters |  -  |
| **500** | Internal server error |  -  |


## getFeedsFeedIdCreatorsCreatorId

> PaginationPaginatedResponsePost getFeedsFeedIdCreatorsCreatorId(feedId, creatorId, limit, offset)

List posts by creator

Retrieve posts in a feed by a specific creator, with pagination.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeedsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");

        FeedsApi apiInstance = new FeedsApi(defaultClient);
        String feedId = "feedId_example"; // String | Feed ID
        String creatorId = "creatorId_example"; // String | Creator ID
        Integer limit = 25; // Integer | Maximum number of items to return in a single request. <br> **Default:** `25`
        Integer offset = 0; // Integer | Starting point of the result set. <br>To get page 2 with a limit of 25, set `offset` to `25`. <br> **Default:** `0`
        try {
            PaginationPaginatedResponsePost result = apiInstance.getFeedsFeedIdCreatorsCreatorId(feedId, creatorId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedsApi#getFeedsFeedIdCreatorsCreatorId");
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
| **feedId** | **String**| Feed ID | |
| **creatorId** | **String**| Creator ID | |
| **limit** | **Integer**| Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; | [optional] [default to 25] |
| **offset** | **Integer**| Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; | [optional] [default to 0] |

### Return type

[**PaginationPaginatedResponsePost**](PaginationPaginatedResponsePost.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid feed ID, creator ID, or query parameters |  -  |
| **500** | Internal server error |  -  |


## getFeedsFeedIdPostId

> Post getFeedsFeedIdPostId(feedId, postId)

Get a post

Retrieve a post from feed by its ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeedsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rixl.com");

        FeedsApi apiInstance = new FeedsApi(defaultClient);
        String feedId = "feedId_example"; // String | Feed ID
        String postId = "postId_example"; // String | Post ID
        try {
            Post result = apiInstance.getFeedsFeedIdPostId(feedId, postId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedsApi#getFeedsFeedIdPostId");
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
| **feedId** | **String**| Feed ID | |
| **postId** | **String**| Post ID | |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

