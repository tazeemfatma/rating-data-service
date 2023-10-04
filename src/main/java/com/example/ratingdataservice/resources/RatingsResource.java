package com.example.ratingdataservice.resources;

import com.example.ratingdataservice.model.Ratings;
import com.example.ratingdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    @RequestMapping("/{movieId}")
    public Ratings getRatings(@PathVariable("movieId") String movieId){
        return new Ratings(movieId,4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Ratings> userRating= Arrays.asList(new Ratings("1234",4),
                new Ratings("4372", 3));
        UserRating rating=new UserRating();
        rating.setUserRating(userRating);
        return rating;
    }

}
