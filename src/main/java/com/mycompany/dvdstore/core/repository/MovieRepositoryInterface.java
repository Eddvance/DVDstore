package com.mycompany.dvdstore.core.repository;

import com.mycompany.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {
    void add(Movie movie);
    List<Movie>list();
    Movie getById(Long id);
}
