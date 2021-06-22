package com.example.Rating.Data.Service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class RatingDataServiceApplication

fun main(args: Array<String>) {
	runApplication<RatingDataServiceApplication>(*args)
}
