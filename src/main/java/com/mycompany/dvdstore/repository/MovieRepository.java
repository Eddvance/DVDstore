package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private static List<Movie> movies = new ArrayList<>();
    GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + ";" +movie.getGenre()+ " has been added.");
        goLiveMovieRepository.add(movie);
    }
}
