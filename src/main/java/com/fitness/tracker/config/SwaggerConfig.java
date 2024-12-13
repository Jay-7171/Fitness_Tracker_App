package com.fitness.tracker.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
@OpenAPI30
public class SwaggerConfig {


    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("My API")
                        .version("1.0")
                        .description("This is the API documentation for my project.")
                );
    }
}
