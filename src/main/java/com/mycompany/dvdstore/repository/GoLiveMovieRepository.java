package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository implements MovieRepositoryInterface{


    @Override
    public void add(Movie movie){

        FileWriter writer;
        try{
            writer=new FileWriter("/Users/eddbea/IdeaProjects/DVDstore/Movies.txt",true);
            //writer.write("test ecriture33");
            writer.write(movie.getTitle()+";"+movie.getGenre());
            writer.write("\n");
            writer.close();
            //writer.flush();
        }

        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
