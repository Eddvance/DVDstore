package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

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
        movieRepository.save(movie);
        return movie;
    }

    @Override
    public Iterable<Movie> getMovieList() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if(optionalMovie.isEmpty()){
            throw new NoSuchElementException("Movie not found");
        }
        Movie movie = optionalMovie.get();
        //Initialise proxys
        movie.getMainActor().getFirstName();
        movie.getReviews().forEach(review -> {
            review.getMark();
            review.setMovie(null);
        });
        return movie;
    }
}