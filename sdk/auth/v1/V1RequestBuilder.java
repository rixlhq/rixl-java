package com.rixl.sdk.auth.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.auth.v1.blog.BlogRequestBuilder;
import com.rixl.sdk.auth.v1.email.EmailRequestBuilder;
import com.rixl.sdk.auth.v1.invitations.InvitationsRequestBuilder;
import com.rixl.sdk.auth.v1.login.LoginRequestBuilder;
import com.rixl.sdk.auth.v1.logout.LogoutRequestBuilder;
import com.rixl.sdk.auth.v1.memberships.MembershipsRequestBuilder;
import com.rixl.sdk.auth.v1.passkey.PasskeyRequestBuilder;
import com.rixl.sdk.auth.v1.password.PasswordRequestBuilder;
import com.rixl.sdk.auth.v1.policies.PoliciesRequestBuilder;
import com.rixl.sdk.auth.v1.providers.ProvidersRequestBuilder;
import com.rixl.sdk.auth.v1.register.RegisterRequestBuilder;
import com.rixl.sdk.auth.v1.token.TokenRequestBuilder;
import com.rixl.sdk.auth.v1.userinfo.UserinfoRequestBuilder;
import com.rixl.sdk.auth.v1.users.UsersRequestBuilder;
import com.rixl.sdk.auth.v1.verifypasskey.VerifyPasskeyRequestBuilder;
import com.rixl.sdk.auth.v1.verifytotp.VerifyTotpRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /auth/v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The blog property
     * @return a {@link BlogRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BlogRequestBuilder blog() {
        return new BlogRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The email property
     * @return a {@link EmailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailRequestBuilder email() {
        return new EmailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The invitations property
     * @return a {@link InvitationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The login property
     * @return a {@link LoginRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LoginRequestBuilder login() {
        return new LoginRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The logout property
     * @return a {@link LogoutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogoutRequestBuilder logout() {
        return new LogoutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The memberships property
     * @return a {@link MembershipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembershipsRequestBuilder memberships() {
        return new MembershipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The passkey property
     * @return a {@link PasskeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PasskeyRequestBuilder passkey() {
        return new PasskeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The password property
     * @return a {@link PasswordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PasswordRequestBuilder password() {
        return new PasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The policies property
     * @return a {@link PoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PoliciesRequestBuilder policies() {
        return new PoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The providers property
     * @return a {@link ProvidersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvidersRequestBuilder providers() {
        return new ProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The register property
     * @return a {@link RegisterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegisterRequestBuilder register() {
        return new RegisterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The token property
     * @return a {@link TokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokenRequestBuilder token() {
        return new TokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The userinfo property
     * @return a {@link UserinfoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserinfoRequestBuilder userinfo() {
        return new UserinfoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The users property
     * @return a {@link UsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verifyPasskey property
     * @return a {@link VerifyPasskeyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifyPasskeyRequestBuilder verifyPasskey() {
        return new VerifyPasskeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verifyTotp property
     * @return a {@link VerifyTotpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifyTotpRequestBuilder verifyTotp() {
        return new VerifyTotpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auth/v1", rawUrl);
    }
}
