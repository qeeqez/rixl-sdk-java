package io.rixl.sdk.images.api;

import io.rixl.sdk.images.client.ApiClient;
import io.rixl.sdk.images.client.BaseApi;

import io.rixl.sdk.images.model.GithubComQeeqezApiInternalErrorsErrorResponse;
import io.rixl.sdk.images.model.Image;
import io.rixl.sdk.images.model.InternalImagesHandlerCompleteRequest;
import io.rixl.sdk.images.model.InternalImagesHandlerInitResponse;
import io.rixl.sdk.images.model.InternalImagesHandlerUploadInitRequest;
import io.rixl.sdk.images.model.PaginationPaginatedResponseImage;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-03-23T11:50:51.501971+01:00[Africa/Lagos]", comments = "Generator version: 7.20.0")
public class ImagesApi extends BaseApi {

    public ImagesApi() {
        super(new ApiClient());
    }

    public ImagesApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Delete image
     * delete an image by marking it as deleted
     * <p><b>204</b> - Image deleted successfully
     * <p><b>400</b> - Invalid project ID or image ID
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Image not found
     * <p><b>500</b> - Failed to delete image
     * @param imageId Image ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteImagesImageId(String imageId) throws RestClientException {
        deleteImagesImageIdWithHttpInfo(imageId);
    }

    /**
     * Delete image
     * delete an image by marking it as deleted
     * <p><b>204</b> - Image deleted successfully
     * <p><b>400</b> - Invalid project ID or image ID
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Image not found
     * <p><b>500</b> - Failed to delete image
     * @param imageId Image ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteImagesImageIdWithHttpInfo(String imageId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling deleteImagesImageId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("imageId", imageId);

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
        return apiClient.invokeAPI("/images/{imageId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List images for a project
     * Retrieve all images for a specific project, with pagination and sorting.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid query parameters
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param limit Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; (optional, default to 25)
     * @param offset Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; (optional, default to 0)
     * @param sort Field to sort by (created_at, name, size, updated_at) (optional)
     * @param order Sort order (asc, desc) (optional)
     * @return PaginationPaginatedResponseImage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginationPaginatedResponseImage getImages(Integer limit, Integer offset, String sort, String order) throws RestClientException {
        return getImagesWithHttpInfo(limit, offset, sort, order).getBody();
    }

    /**
     * List images for a project
     * Retrieve all images for a specific project, with pagination and sorting.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid query parameters
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal server error
     * @param limit Maximum number of items to return in a single request. &lt;br&gt; **Default:** &#x60;25&#x60; (optional, default to 25)
     * @param offset Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set &#x60;offset&#x60; to &#x60;25&#x60;. &lt;br&gt; **Default:** &#x60;0&#x60; (optional, default to 0)
     * @param sort Field to sort by (created_at, name, size, updated_at) (optional)
     * @param order Sort order (asc, desc) (optional)
     * @return ResponseEntity&lt;PaginationPaginatedResponseImage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaginationPaginatedResponseImage> getImagesWithHttpInfo(Integer limit, Integer offset, String sort, String order) throws RestClientException {
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

        ParameterizedTypeReference<PaginationPaginatedResponseImage> localReturnType = new ParameterizedTypeReference<PaginationPaginatedResponseImage>() {};
        return apiClient.invokeAPI("/images", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get image
     * Retrieve an image by its ID for a specific project.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid image ID
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Image not found
     * <p><b>500</b> - Internal server error
     * @param imageId Image ID (required)
     * @return Image
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Image getImagesImageId(String imageId) throws RestClientException {
        return getImagesImageIdWithHttpInfo(imageId).getBody();
    }

    /**
     * Get image
     * Retrieve an image by its ID for a specific project.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid image ID
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Image not found
     * <p><b>500</b> - Internal server error
     * @param imageId Image ID (required)
     * @return ResponseEntity&lt;Image&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Image> getImagesImageIdWithHttpInfo(String imageId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling getImagesImageId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("imageId", imageId);

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

        ParameterizedTypeReference<Image> localReturnType = new ParameterizedTypeReference<Image>() {};
        return apiClient.invokeAPI("/images/{imageId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload: Mark as complete
     * Complete the upload process and create the image record using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - File not found
     * <p><b>500</b> - Failed to complete upload or create image
     * @param request Upload completion request (required)
     * @return Image
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Image postImagesUploadComplete(InternalImagesHandlerCompleteRequest request) throws RestClientException {
        return postImagesUploadCompleteWithHttpInfo(request).getBody();
    }

    /**
     * Upload: Mark as complete
     * Complete the upload process and create the image record using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - File not found
     * <p><b>500</b> - Failed to complete upload or create image
     * @param request Upload completion request (required)
     * @return ResponseEntity&lt;Image&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Image> postImagesUploadCompleteWithHttpInfo(InternalImagesHandlerCompleteRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling postImagesUploadComplete");
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

        ParameterizedTypeReference<Image> localReturnType = new ParameterizedTypeReference<Image>() {};
        return apiClient.invokeAPI("/images/upload/complete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload: Init
     * Initialize a presigned URL upload for an image file using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>500</b> - Failed to initialize upload
     * @param request Upload initialization request (required)
     * @return InternalImagesHandlerInitResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InternalImagesHandlerInitResponse postImagesUploadInit(InternalImagesHandlerUploadInitRequest request) throws RestClientException {
        return postImagesUploadInitWithHttpInfo(request).getBody();
    }

    /**
     * Upload: Init
     * Initialize a presigned URL upload for an image file using API key authentication
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid request body
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>403</b> - Access denied
     * <p><b>500</b> - Failed to initialize upload
     * @param request Upload initialization request (required)
     * @return ResponseEntity&lt;InternalImagesHandlerInitResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InternalImagesHandlerInitResponse> postImagesUploadInitWithHttpInfo(InternalImagesHandlerUploadInitRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling postImagesUploadInit");
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

        ParameterizedTypeReference<InternalImagesHandlerInitResponse> localReturnType = new ParameterizedTypeReference<InternalImagesHandlerInitResponse>() {};
        return apiClient.invokeAPI("/images/upload/init", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
