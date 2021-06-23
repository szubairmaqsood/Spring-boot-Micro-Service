package com.example.Movie.Catalog.Service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@Configuration
@EnableEurekaClient
class MovieCatalogServiceApplication


@Bean
@LoadBalanced
fun getNewRestTemplate():RestTemplate{
	return RestTemplate();
}

fun main(args: Array<String>) {
	runApplication<MovieCatalogServiceApplication>(*args)
}