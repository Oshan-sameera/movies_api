package oshcoding.com.movies.jsonFileReader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import oshcoding.com.movies.entity.Movie;

import java.io.InputStream;
import java.util.List;

public class MainDataClass {
    private final String MOVIES_JSON = "/jsondata/movies.json";


    public List<Movie> getAllMovies() {

        List<Movie> movies = null;

        try {
            TypeReference<List<Movie>> typerefrence = new TypeReference<List<Movie>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(MOVIES_JSON);
            movies = new ObjectMapper().readValue(inputStream, typerefrence);
            return movies;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return movies;
    }


}
