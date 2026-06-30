package com.rixl.sdk.media.v1.projects.item.videos.item.subtitles.language;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.media.v1.projects.item.videos.item.subtitles.language.item.WithLangItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /media/v1/projects/{projectId}/videos/{videoId}/subtitles/language
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LanguageRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.media.v1.projects.item.videos.item.subtitles.language.item collection
     * @param lang Language code
     * @return a {@link WithLangItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLangItemRequestBuilder byLang(@jakarta.annotation.Nonnull final String lang) {
        Objects.requireNonNull(lang);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("lang", lang);
        return new WithLangItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LanguageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LanguageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/subtitles/language", pathParameters);
    }
    /**
     * Instantiates a new {@link LanguageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LanguageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/media/v1/projects/{projectId}/videos/{videoId}/subtitles/language", rawUrl);
    }
}
