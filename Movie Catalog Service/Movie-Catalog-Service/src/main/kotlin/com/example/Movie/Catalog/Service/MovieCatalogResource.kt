package com.example.Movie.Catalog.Service

import com.example.Movie.Catalog.Service.models.CatalogItem
import com.example.Movie.Catalog.Service.models.Movie
import com.example.Movie.Catalog.Service.models.Rating
import com.example.Movie.Catalog.Service.models.UserRating
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
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


    var restTemplate:RestTemplate;




    constructor(){
        restTemplate = RestTemplate();
    }





    @GetMapping("/{userId}")
    fun getCatalog(@PathVariable userId:String):MutableList<CatalogItem>?{

        var ratings:UserRating? = this.restTemplate.getForObject("http://localhost:8082/ratingsdata/users/" + userId, UserRating::class.java);




        // using a stream to make a out put of sequence of functions
        return ratings?.userRating?.stream()?.map{
                rating  ->
            // For each movie Id, call move info service and get details
            var movie: Movie? = this.restTemplate.getForObject("http://localhost:8081/movies/"  + rating.movieId, Movie::class.java);
            /*
            var movie: Movie = this.webClientBuilder.build()
                               .get()
                               .uri("http://localhost:8081/movies/" + rating.movieId)
                               .retriver()
                               .bodyToMono( Movie::class.java)
                               .block();

             */

            var movieName = "";
            if(movie!=null){
                movieName = movie.name;
            }

             CatalogItem(movieName ,"desc",rating.rating);
        }?.collect(Collectors.toList())

        //val  movies = listOf<CatalogItem>(CatalogItem("Transformers","Test",5));
        //return movies;
    }
}