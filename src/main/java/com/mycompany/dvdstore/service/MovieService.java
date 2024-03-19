package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface{

    private MovieRepositoryInterface movieRepositoryInterface;

    @Override
    public void registerMovie(Movie movie){
      movieRepositoryInterface.add(movie);
    }
}
