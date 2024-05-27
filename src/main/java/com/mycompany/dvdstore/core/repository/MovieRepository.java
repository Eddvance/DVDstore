package com.mycompany.dvdstore.core.repository;
/*

import com.mycompany.dvdstore.core.entity.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;

@Repository
public class MovieRepository implements MovieRepositoryInterface {

    private final JdbcTemplate jdbcTemplate;

    public MovieRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Override
    public Movie add(Movie movie) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement pstm = connection.prepareStatement("INSERT INTO MOVIE(TITLE,GENRE,DESCRIPTION) VALUES (?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            pstm.setString(1, movie.getTitle());
            pstm.setString(2, movie.getGenre());
            pstm.setString(3, movie.getDescription());
            return pstm;
        }, keyHolder);
        movie.setId(keyHolder.getKey().longValue());
        return movie;
    }

    @Override
    public List<Movie> list() {
        return jdbcTemplate.query("SELECT ID,TITLE,GENRE FROM MOVIE",
                (rs, rowNum) -> new Movie(rs.getLong("ID"),
                        rs.getString("TITLE"),
                        rs.getString("GENRE")));
    }

    @Override
    public Movie getById(Long id) {
        return jdbcTemplate.queryForObject("SELECT ID,TITLE,GENRE,DESCRIPTION FROM MOVIE WHERE ID=?",
                new Object[]{id}, (rs, rowNum) -> new Movie(rs.getLong("ID"),
                        rs.getString("TITLE"),
                        rs.getString("GENRE"),
                        rs.getString("DESCRIPTION")));
    }
}
 */