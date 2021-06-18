package com.example.Movie.Catalog.Service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalog")
class MovieCatalogResource {

    @GetMapping("/user")
    fun getCatalog():String{
        return "Hi,this is movies Catalog";
    }
}