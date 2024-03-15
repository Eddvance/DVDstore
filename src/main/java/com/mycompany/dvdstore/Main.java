package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entry=new Scanner(System.in);
        System.out.println("What is the title ?");
        String titre1= entry.nextLine();
        System.out.println("What is the genre ?");
        String genre1= entry.nextLine();

        Movie movie1= new Movie(titre1,genre1);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie1);
    }
}