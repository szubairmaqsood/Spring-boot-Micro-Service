package com.example.Movie.Catalog.Service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@Configuration
class MovieCatalogServiceApplication

@Bean
fun getRestTemplate():RestTemplate{
	return RestTemplate();
}
fun main(args: Array<String>) {
	runApplication<MovieCatalogServiceApplication>(*args)
}