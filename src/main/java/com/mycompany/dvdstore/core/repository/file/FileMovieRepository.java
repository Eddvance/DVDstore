package com.mycompany.dvdstore.core.repository.file;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    public void add(Movie movie) {

        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(movie.getTitle() + ";" + movie.getGenre());
            writer.write("\n");
            writer.close();
            //writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The movie " + movie.getTitle() + " has been added.");
    }

    @Override
    public List<Movie> list() {
        List<Movie> movies=new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                final Movie movie=new Movie();
                final String[] titreEtGenre = line.split("\\;");
                movie.setTitle(titreEtGenre[0]);
                if(titreEtGenre.length>1) {
                    movie.setGenre(titreEtGenre[1]);
                } else{
                    movie.setGenre("");
                }
                movies.add(movie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }    }
