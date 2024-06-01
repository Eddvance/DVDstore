package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;

public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    Iterable<Movie> getMovieList();
    Movie getMovieById(Long idMovie);
}
