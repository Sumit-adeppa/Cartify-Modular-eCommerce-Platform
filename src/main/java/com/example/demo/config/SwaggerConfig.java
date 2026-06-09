package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI cartifyOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Cartify Modular eCommerce Platform")
                        .description("Cartify E-Commerce Backend REST APIs")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Cartify4U Team")
                                .email("support@cartify4u.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("Cartify4U Documentation"));
    }
}
