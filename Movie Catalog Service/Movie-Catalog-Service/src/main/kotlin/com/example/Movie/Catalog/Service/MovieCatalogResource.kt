package com.example.Movie.Catalog.Service

import com.example.Movie.Catalog.Service.models.CatalogItem
import com.example.Movie.Catalog.Service.models.Movie
import com.example.Movie.Catalog.Service.models.Rating
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.util.ArrayList
import java.util.stream.Collectors

@RestController
@RequestMapping("/catalog")
class MovieCatalogResource {

    @GetMapping("/{userId}")
    fun getCatalog(@PathVariable userId:String):List<CatalogItem>{

        // rest template is used to call other API
        var restTemplate:RestTemplate = RestTemplate();



       // First we make a temparory array of ratings
       var ratings:ArrayList<Rating> = ArrayList<Rating>();
        ratings.add(Rating("1234",4));
        ratings.add(Rating("5678",3));

        // using a stream to make a out put of sequence of functions
        return ratings.stream().map{
                rating  ->

            var movie: Movie? = restTemplate.getForObject("http://localhost:8081/movies/" + rating.movieId, Movie::class.java);
            var movieName = "";
            if(movie!=null){
                movieName = movie.name;
            }

             CatalogItem(movieName ,"desc",rating.rating);
        }.collect(Collectors.toList())

        //val  movies = listOf<CatalogItem>(CatalogItem("Transformers","Test",5));
        //return movies;
    }
}