package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {

        MovieController movieController = new MovieController();
        movieController.addUsingConsole();
    }
}