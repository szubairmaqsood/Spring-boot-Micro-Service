package com.example.Movie.Catalog.Service

import com.example.Movie.Catalog.Service.models.CatalogItem
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalog")
class MovieCatalogResource {

    @GetMapping("/{userId}")
    fun getCatalog(@PathVariable userId:String):List<CatalogItem>{
       val  movies = listOf<CatalogItem>(CatalogItem("Transformers","Test",5));
        return movies;
    }
}