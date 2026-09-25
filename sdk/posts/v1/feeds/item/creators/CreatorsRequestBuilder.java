package com.rixl.sdk.posts.v1.feeds.item.creators;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.posts.v1.feeds.item.creators.item.WithCreatorItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /posts/v1/feeds/{feed_id}/creators
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreatorsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.posts.v1.feeds.item.creators.item collection
     * @param creator_id Unique identifier of the item
     * @return a {@link WithCreatorItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCreatorItemRequestBuilder byCreator_id(@jakarta.annotation.Nonnull final String creator_id) {
        Objects.requireNonNull(creator_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("creator_id", creator_id);
        return new WithCreatorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CreatorsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreatorsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/feeds/{feed_id}/creators", pathParameters);
    }
    /**
     * Instantiates a new {@link CreatorsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreatorsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/posts/v1/feeds/{feed_id}/creators", rawUrl);
    }
}
