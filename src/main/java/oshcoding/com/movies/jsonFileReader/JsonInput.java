//package oshcoding.com.movies.jsonFileReader;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import oshcoding.com.movies.entity.Movie;
//
//import java.io.InputStream;
//import java.util.List;
//
//@Component
//public class JsonInput implements CommandLineRunner {
//    private final String MOVIES_JSON = "/jsondata/movies.json";
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        try {
//            TypeReference<List<Movie>> typerefrence = new TypeReference<List<Movie>>() {
//            };
//            InputStream inputStream = TypeReference.class.getResourceAsStream(MOVIES_JSON);
//            List<Movie> movies = new ObjectMapper().readValue(inputStream, typerefrence);
//        //    System.out.println("Movies"+ movies);
//            System.out.println("before  loop");
////
////            System.out.println("after loop");
////            for (Movie s : movies) {
////
////                String[] genre = s.getGenres();
////
////            }
//
//
//        } catch (Exception ex) {
//            System.out.println(ex);
//
//        }
//    }
//}
