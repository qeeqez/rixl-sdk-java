package com.qeeqez.rixl.sdk.feeds;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.qeeqez.rixl.sdk.feeds.item.WithFeedItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /feeds
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.qeeqez.rixl.sdk.feeds.item collection
     * @param feedId Feed ID
     * @return a {@link WithFeedItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithFeedItemRequestBuilder byFeedId(@jakarta.annotation.Nonnull final String feedId) {
        Objects.requireNonNull(feedId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("feedId", feedId);
        return new WithFeedItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link FeedsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds", pathParameters);
    }
    /**
     * Instantiates a new {@link FeedsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FeedsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds", rawUrl);
    }
}
