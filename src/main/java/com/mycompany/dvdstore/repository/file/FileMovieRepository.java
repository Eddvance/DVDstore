package com.mycompany.dvdstore.repository.file;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {

    @Value("${movies.file.location}")
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void add(Movie movie){

        try {
            FileWriter writer= new FileWriter (file,true);
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
