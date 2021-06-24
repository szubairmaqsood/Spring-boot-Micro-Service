package com.example.Spring.Cloud.Gatway

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringCloudConfig {

    @Value("\${movie.Path}")
    var movie: String?=null;

    @Value("\${ratings.Path}")
     var rating: String?=null;

    @Value("\${catalog.Path}")
    var catalog:String? =null;


    @Bean
    fun myRoutes(builder: RouteLocatorBuilder): RouteLocator? {
        return builder.routes()
            .route { r ->
                r.path("/catalog/**")
                    .uri(catalog)
            }

            .route { r ->
                r.path("/movies/**")
                    .uri(movie)
            }
            .route { r ->
                r.path("/ratingsdata/**")
                    .uri(rating)
            }
            .build()
    }
}