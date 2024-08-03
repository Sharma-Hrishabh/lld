package org.lld.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<String, List<Movie>> moviesMap;

    public MovieController() {
        this.moviesMap = new HashMap<>();
    }

    public MovieController(Map<String, List<Movie>> moviesMap) {
        this.moviesMap = moviesMap;
    }

    public List<Movie> getMovies(String city) {
        return moviesMap.get(city);
    }

    public  void addMovie(String city, Movie movie) {
        List<Movie> movies = moviesMap.get(city);
        if (movies == null) {
            movies = new ArrayList<>();
        }
        movies.add(movie);
        moviesMap.put(city, movies);
    }
}
