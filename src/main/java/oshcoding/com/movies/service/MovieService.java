package oshcoding.com.movies.service;

import org.springframework.stereotype.Service;
import oshcoding.com.movies.entity.Movie;
import oshcoding.com.movies.exception.MovieNotFoundException;
import oshcoding.com.movies.jsonFileReader.MainDataClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class MovieService {
    MainDataClass mn = new MainDataClass();
    List<Movie> movieList = new ArrayList<>();


    public List<Movie> getAllMovie() {

        movieList = mn.getAllMovies();

        List<Movie> newMoviesList = new ArrayList<>();
        for (Movie s : movieList) {
            newMoviesList.add(s);
        }
        if (newMoviesList.isEmpty()) {
            throw new MovieNotFoundException("Requested movie is not exist");

        }

        return newMoviesList;
    }

    public List<Movie> getByTitle(String movieTitle) {

        //MainDataClass mn = new MainDataClass();
        movieList = mn.getAllMovies();


        List<Movie> newTitleMovies = new ArrayList<>();
        for (Movie s : movieList) {
            String title = s.getTitle();
            String titleCovert = title.toLowerCase();
            String inputTitleConvert = movieTitle.trim().toLowerCase();

            if (titleCovert.contains(inputTitleConvert)) {

                newTitleMovies.add(s);

            }
        }
        if (newTitleMovies.isEmpty()) {
            throw new MovieNotFoundException("Requested movie does not exist");

        }
        // newMovies = movieList.stream().filter(title -> title.equals(movieTitle)).collect(Collectors.toList());


        return newTitleMovies;

    }

    public List<Movie> getByYear(String movieYear) {
        int parsInt = Integer.parseInt(movieYear.trim());
        //MainDataClass mn = new MainDataClass();
        movieList = mn.getAllMovies();
        List<Movie> newYearMovies = new ArrayList<>();
        for (Movie s : movieList) {
            int year = s.getYear();
            if (year == parsInt) {
                newYearMovies.add(s);
            }
        }
        if (newYearMovies.isEmpty()) {
            throw new MovieNotFoundException("Requested movie is not exist");

        }
        return newYearMovies;
    }

    public List<Movie> getByGenre(String movieGenre) {

        MainDataClass mn = new MainDataClass();
        movieList = mn.getAllMovies();
        List<Movie> newGenreMovies = new ArrayList<>();
        for (Movie s : movieList) {
            String[] genre = s.getGenres();
            for (String t : genre) {
                if (t.equals(movieGenre.trim())) {
                    newGenreMovies.add(s);
                }

            }

        }
        if (newGenreMovies.isEmpty()) {
            throw new MovieNotFoundException("Requested movie is not exist");

        }
        return newGenreMovies;

    }


}
