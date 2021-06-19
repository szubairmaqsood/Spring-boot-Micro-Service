package com.example.Rating.Data.Service

import com.example.Rating.Data.Service.model.Rating
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ratingsdata")
class RatingResource {
    @RequestMapping("/{movieId}")
    fun getRating(@PathVariable movieId:String): Rating {
        return Rating(movieId,4);
    }
}