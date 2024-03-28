package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {

    public MovieController(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    private final MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void addUsingConsole() {

        Scanner entry = new Scanner(System.in);
        System.out.println("How many movie(s) have to add ?");
        int nbMovies = entry.nextInt();
        entry.nextLine();

        for (int i = 0; i < nbMovies; i++) {
            Movie movie = new Movie();
            System.out.println("What is the title ?");
            String titre = entry.nextLine();
            movie.setTitle(titre);
            System.out.println("What is the genre ?");
            String genre = entry.nextLine();
            movie.setGenre(genre);

            movieService.registerMovie(movie);
        }
    }
}