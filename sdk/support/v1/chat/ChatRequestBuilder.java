package com.rixl.sdk.support.v1.chat;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.support.v1.chat.messages.MessagesRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /support/v1/chat
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatRequestBuilder extends BaseRequestBuilder {
    /**
     * The messages property
     * @return a {@link MessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ChatRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/chat", pathParameters);
    }
    /**
     * Instantiates a new {@link ChatRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/support/v1/chat", rawUrl);
    }
}
