package com.example.ErukaServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ErukaServerApplication

fun main(args: Array<String>) {
	runApplication<ErukaServerApplication>(*args)
}
