package com.example;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@SecurityScheme(name = "Open Id Connect",
        type = SecuritySchemeType.OAUTH2,
        scheme = "bearer",
        bearerFormat = "jwt",
        flows = @OAuthFlows(
                authorizationCode = @OAuthFlow(
                        authorizationUrl = "https://dev-6271510.okta.com/oauth2/default/v1/authorize",
                        tokenUrl = "https://dev-6271510.okta.com/oauth2/default/v1/token",
                        refreshUrl = "",
                        scopes = @OAuthScope(name = "openid")
//                                @OAuthScope(name = "profile"),
//                                @OAuthScope(name = "email"),
//                                @OAuthScope(name = "address"),
//                                @OAuthScope(name = "phone"),
//                                @OAuthScope(name = "offline_access")
                        ))
)
@OpenAPIDefinition(
        info = @Info(
                title = "API service",
                version = "0.0",
                description = "My API",

                license = @License(name = "Apache 2.0", url = "https://foo.bar"),
                contact = @Contact(url = "https://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
