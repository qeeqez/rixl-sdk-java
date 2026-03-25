package com.qeeqez.rixl.sdk.feeds.item.creators.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import com.qeeqez.rixl.sdk.models.github_com_qeeqez_api_internal_errors.ErrorResponse;
import com.qeeqez.rixl.sdk.models.pagination.PaginatedResponsePost;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /feeds/{feedId}/creators/{creatorId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCreatorItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithCreatorItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCreatorItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds/{feedId}/creators/{creatorId}{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCreatorItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCreatorItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds/{feedId}/creators/{creatorId}{?limit*,offset*}", rawUrl);
    }
    /**
     * Retrieve posts in a feed by a specific creator, with pagination.
     * @return a {@link PaginatedResponsePost}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PaginatedResponsePost get() {
        return get(null);
    }
    /**
     * Retrieve posts in a feed by a specific creator, with pagination.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PaginatedResponsePost}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PaginatedResponsePost get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PaginatedResponsePost::createFromDiscriminatorValue);
    }
    /**
     * Retrieve posts in a feed by a specific creator, with pagination.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve posts in a feed by a specific creator, with pagination.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithCreatorItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCreatorItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCreatorItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve posts in a feed by a specific creator, with pagination.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Maximum number of items to return in a single request. &lt;br&gt; **Default:** `25`
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Starting point of the result set. &lt;br&gt;To get page 2 with a limit of 25, set `offset` to `25`. &lt;br&gt; **Default:** `0`
         */
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
