package com.example.Rating.Data.Service

import com.example.Rating.Data.Service.model.Rating
import com.example.Rating.Data.Service.model.UserRating
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.ArrayList

@RestController
@RequestMapping("/ratingsdata")
class RatingResource {
    /*
      Return rating of particular movie
     */
    @RequestMapping("/{movieId}")
    fun getRating(@PathVariable movieId:String): Rating {
        return Rating(movieId,4);
    }

    @RequestMapping("users/{userId}")
    fun getUserRating(@PathVariable userId:String): UserRating {

        var ratings: ArrayList<Rating> = ArrayList<Rating>();
        ratings.add(Rating("1234",4));
        ratings.add(Rating("5678",3));

        return UserRating(ratings);
    }

}