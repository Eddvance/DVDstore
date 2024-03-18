package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

   MovieService movieService=new MovieService();
    Scanner entry=new Scanner(System.in);

    public void addUsingConsole(){

        Movie movie1 = new Movie();
        System.out.println("What is the title ?");
        String titre1= entry.nextLine();
        System.out.println("What is the genre ?");
        String genre1= entry.nextLine();
        movie1.setTitle(titre1);movie1.setGenre(genre1);

        movieService.registerMovie(movie1);
    }
}
