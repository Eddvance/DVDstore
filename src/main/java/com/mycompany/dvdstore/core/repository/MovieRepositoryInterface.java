package com.mycompany.dvdstore.core.repository;

import com.mycompany.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {
    Movie add(Movie movie);
    List<Movie>list();
    Movie getById(Long id);
}
