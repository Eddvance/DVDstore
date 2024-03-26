package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {


        MovieController movieController=new MovieController();
        GoLiveMovieRepository movieRepository=new GoLiveMovieRepository();
        MovieService movieService=new MovieService();
        movieController.setMovieService(movieService);
        movieService.setMovieRepository(movieRepository);


        movieController.addUsingConsole();

    }
}