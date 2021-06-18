package com.example.Movie.Info.Service

import com.example.Movie.Info.Service.models.Movie
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class MovieResource {
    @RequestMapping("/{movieId}")
    fun getMovieInfo(@PathVariable movieId:String): Movie {
        return Movie(movieId,"Test Name");
    }
}