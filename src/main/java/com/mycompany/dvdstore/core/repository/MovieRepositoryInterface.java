package com.mycompany.dvdstore.core.repository;

import com.mycompany.dvdstore.core.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepositoryInterface extends CrudRepository<Movie, Long> {
    /*Movie add(Movie movie);
    List<Movie> list();
    Movie getById(Long id);
*/
}


