package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface{

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void add(Movie movie){
// writer=new FileWriter("/Users/eddbea/IdeaProjects/DVDstore/Movies.txt",true);
//new FileWriter(file,true);
        try {
            FileWriter writer= new FileWriter (file,true);
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
