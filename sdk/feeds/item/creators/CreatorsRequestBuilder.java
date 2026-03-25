package com.qeeqez.rixl.sdk.feeds.item.creators;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.qeeqez.rixl.sdk.feeds.item.creators.item.WithCreatorItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /feeds/{feedId}/creators
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreatorsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.qeeqez.rixl.sdk.feeds.item.creators.item collection
     * @param creatorId Creator ID
     * @return a {@link WithCreatorItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCreatorItemRequestBuilder byCreatorId(@jakarta.annotation.Nonnull final String creatorId) {
        Objects.requireNonNull(creatorId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("creatorId", creatorId);
        return new WithCreatorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CreatorsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreatorsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds/{feedId}/creators", pathParameters);
    }
    /**
     * Instantiates a new {@link CreatorsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreatorsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/feeds/{feedId}/creators", rawUrl);
    }
}
