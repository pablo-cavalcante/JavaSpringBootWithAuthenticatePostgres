package com.designerpatterns.app;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Designer Patterns APP",
                version = "1.0.0",
                description = "API de exemplo com Spring Boot 4 e Swagger",
                contact = @Contact(
                        name = "Equipe Backend",
                        email = "backend@exemplo.com"
                )
        )
)
public class OpenApiConfig {
}
