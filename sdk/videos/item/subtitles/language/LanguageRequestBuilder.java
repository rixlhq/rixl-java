package com.rixl.sdk.videos.item.subtitles.language;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.videos.item.subtitles.language.item.WithLangCodeItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /videos/{videoId}/subtitles/language
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LanguageRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.rixl.sdk.videos.item.subtitles.language.item collection
     * @param lang_code Language Code (BCP 47)
     * @return a {@link WithLangCodeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLangCodeItemRequestBuilder byLang_code(@jakarta.annotation.Nonnull final String lang_code) {
        Objects.requireNonNull(lang_code);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("lang_code", lang_code);
        return new WithLangCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LanguageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LanguageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videos/{videoId}/subtitles/language", pathParameters);
    }
    /**
     * Instantiates a new {@link LanguageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LanguageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/videos/{videoId}/subtitles/language", rawUrl);
    }
}
