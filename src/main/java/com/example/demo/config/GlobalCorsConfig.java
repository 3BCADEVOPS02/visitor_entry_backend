package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Global CORS configuration for Spring MVC.
 *
 * - Applies to all endpoints using "/**"
 * - Allows all origins (for testing) using allowedOrigins("*")
 * - Allows all standard HTTP methods including OPTIONS
 * - Allows all headers
 *
 * To lock down in production, set allowed origins to a fixed list in properties
 * and/or remove wildcard origin.
 */
@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(false)
                .maxAge(3600);
    }
}
