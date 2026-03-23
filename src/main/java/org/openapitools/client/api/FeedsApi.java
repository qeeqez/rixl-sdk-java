package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import org.openapitools.client.model.GithubComQeeqezApiInternalErrorsErrorResponse;
import org.openapitools.client.model.PaginationPaginatedResponsePost;
import org.openapitools.client.model.Post;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-03-20T18:57:54.849542+01:00[Africa/Lagos]", comments = "Generator version: 7.20.0")
public class FeedsApi extends BaseApi {

    public FeedsApi() {
        super(new ApiClient());
    }

    public FeedsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * List posts in a feed
     * Retrieve posts in a feed, with pagination.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid feed ID or query parameters
     * <p><b>500</b> - Internal server error
     * @param feedId Feed ID (required)
     * @param limit Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; (optional, default to 25)
     * @param offset Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; (optional, default to 0)
     * @return PaginationPaginatedResponsePost
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginationPaginatedResponsePost getFeedsFeedId(String feedId, Integer limit, Integer offset) throws RestClientException {
        return getFeedsFeedIdWithHttpInfo(feedId, limit, offset).getBody();
    }

    /**
     * List posts in a feed
     * Retrieve posts in a feed, with pagination.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid feed ID or query parameters
     * <p><b>500</b> - Internal server error
     * @param feedId Feed ID (required)
     * @param limit Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; (optional, default to 25)
     * @param offset Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; (optional, default to 0)
     * @return ResponseEntity&lt;PaginationPaginatedResponsePost&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaginationPaginatedResponsePost> getFeedsFeedIdWithHttpInfo(String feedId, Integer limit, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'feedId' is set
        if (feedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'feedId' when calling getFeedsFeedId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("feedId", feedId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PaginationPaginatedResponsePost> localReturnType = new ParameterizedTypeReference<PaginationPaginatedResponsePost>() {};
        return apiClient.invokeAPI("/feeds/{feedId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List posts by creator
     * Retrieve posts in a feed by a specific creator, with pagination.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid feed ID, creator ID, or query parameters
     * <p><b>500</b> - Internal server error
     * @param feedId Feed ID (required)
     * @param creatorId Creator ID (required)
     * @param limit Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; (optional, default to 25)
     * @param offset Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; (optional, default to 0)
     * @return PaginationPaginatedResponsePost
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginationPaginatedResponsePost getFeedsFeedIdCreatorsCreatorId(String feedId, String creatorId, Integer limit, Integer offset) throws RestClientException {
        return getFeedsFeedIdCreatorsCreatorIdWithHttpInfo(feedId, creatorId, limit, offset).getBody();
    }

    /**
     * List posts by creator
     * Retrieve posts in a feed by a specific creator, with pagination.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid feed ID, creator ID, or query parameters
     * <p><b>500</b> - Internal server error
     * @param feedId Feed ID (required)
     * @param creatorId Creator ID (required)
     * @param limit Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; (optional, default to 25)
     * @param offset Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; (optional, default to 0)
     * @return ResponseEntity&lt;PaginationPaginatedResponsePost&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaginationPaginatedResponsePost> getFeedsFeedIdCreatorsCreatorIdWithHttpInfo(String feedId, String creatorId, Integer limit, Integer offset) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'feedId' is set
        if (feedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'feedId' when calling getFeedsFeedIdCreatorsCreatorId");
        }
        
        // verify the required parameter 'creatorId' is set
        if (creatorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creatorId' when calling getFeedsFeedIdCreatorsCreatorId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("feedId", feedId);
        uriVariables.put("creatorId", creatorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PaginationPaginatedResponsePost> localReturnType = new ParameterizedTypeReference<PaginationPaginatedResponsePost>() {};
        return apiClient.invokeAPI("/feeds/{feedId}/creators/{creatorId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a post
     * Retrieve a post from feed by its ID
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param feedId Feed ID (required)
     * @param postId Post ID (required)
     * @return Post
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Post getFeedsFeedIdPostId(String feedId, String postId) throws RestClientException {
        return getFeedsFeedIdPostIdWithHttpInfo(feedId, postId).getBody();
    }

    /**
     * Get a post
     * Retrieve a post from feed by its ID
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param feedId Feed ID (required)
     * @param postId Post ID (required)
     * @return ResponseEntity&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Post> getFeedsFeedIdPostIdWithHttpInfo(String feedId, String postId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'feedId' is set
        if (feedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'feedId' when calling getFeedsFeedIdPostId");
        }
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling getFeedsFeedIdPostId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("feedId", feedId);
        uriVariables.put("postId", postId);

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

        ParameterizedTypeReference<Post> localReturnType = new ParameterizedTypeReference<Post>() {};
        return apiClient.invokeAPI("/feeds/{feedId}/{postId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
