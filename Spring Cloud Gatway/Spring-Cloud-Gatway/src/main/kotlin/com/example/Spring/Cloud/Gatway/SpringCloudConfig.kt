package com.example.Spring.Cloud.Gatway

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringCloudConfig {
    @Bean
    fun myRoutes(builder: RouteLocatorBuilder): RouteLocator? {
        return builder.routes()
            .route { r ->
                r.path("/catalog/**")
                    .uri("http://localhost:8084")
            }

            .route { r ->
                r.path("/movies/**")
                    .uri("http://localhost:8081")
            }
            .route { r ->
                r.path("/ratingsdata/**")
                    .uri("http://localhost:8082")
            }
            .build()
    }
}