package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
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