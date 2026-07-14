package com.rixl.sdk.media.v1.projects.item.videos.item.audiotracks.language;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.media.v1.projects.item.videos.item.audiotracks.language.item.WithLanguageCodeItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{project_id}/videos/{video_id}/audio-tracks/language
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LanguageRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.media.v1.projects.item.videos.item.audioTracks.language.item collection
     * @param language_code Unique identifier of the item
     * @return a {@link WithLanguageCodeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLanguageCodeItemRequestBuilder byLanguage_code(@jakarta.annotation.Nonnull final String language_code) {
        Objects.requireNonNull(language_code);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("language_code", language_code);
        return new WithLanguageCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LanguageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LanguageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{project_id}/videos/{video_id}/audio-tracks/language", pathParameters);
    }
    /**
     * Instantiates a new {@link LanguageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LanguageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{project_id}/videos/{video_id}/audio-tracks/language", rawUrl);
    }
}
