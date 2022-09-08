package oshcoding.com.movies.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import oshcoding.com.movies.entity.Movie;
import oshcoding.com.movies.service.MovieService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/movies")
public class MovieController {

    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {

//        System.out.println("loading index page");
//        logger.trace("loading index page logger");
//        logger.error("FATAL ERROR");
        return movieService.getAllMovie();
    }


    @GetMapping("/title")
    public List<Movie> getByTitle(@RequestParam(name = "title") String movieTitle) {
        return movieService.getByTitle(movieTitle);
    }

    @GetMapping("/year")
    public List<Movie> getByYear(@RequestParam(name = "year") String movieYear) {
        return movieService.getByYear(movieYear);
    }

    @GetMapping("/genre")
    public List<Movie> getByGenre(@RequestParam(name = "genre") String movieGenre) {

        return movieService.getByGenre(movieGenre);
    }
}