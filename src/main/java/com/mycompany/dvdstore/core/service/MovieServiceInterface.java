package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    List<Movie> getMovieList();
    Movie getMovieById(Long idMovie);
}
