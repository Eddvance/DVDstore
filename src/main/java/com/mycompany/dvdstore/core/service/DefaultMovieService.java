package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    private final MovieRepositoryInterface movieRepository;

    public DefaultMovieService(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    @Override
    public Movie registerMovie(Movie movie) {
        movieRepository.add(movie);
        return movie;
    }

    @Override
    public List<Movie> getMovieList() {
        return movieRepository.list();
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.getById(id);
    }
}
