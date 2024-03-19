package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

   MovieService movieService=new MovieService();
    Scanner entry=new Scanner(System.in);

    public void addUsingConsole(){

        Movie movie = new Movie();
        System.out.println("How many movie(s) have to add ?");
        int nbMovies=entry.nextInt();

        for(int i=0;i<nbMovies;i++) {

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