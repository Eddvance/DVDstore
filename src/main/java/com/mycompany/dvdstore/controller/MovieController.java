package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    MovieService movieService = new MovieService();


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
            //entry.nextLine();
            System.out.println("What is the genre ?");
            String genre = entry.nextLine();
            movie.setGenre(genre);

            movieService.registerMovie(movie);
        }
    }
}