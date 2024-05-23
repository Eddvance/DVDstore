package com.mycompany.dvdstore.core.entity;

public class Movie {

    private String title;
    private String genre;
    private Long id;
    private String summary;

    public Movie(String title, String genre, Long id, String summary) {
        this.title = title;
        this.genre = genre;
        this.id = id;
        this.summary = summary;
    }

    public Movie(String title, String genre, Long id) {
        this.title = title;
        this.genre = genre;
        this.id = id;
    }

    public Movie(long id, String title, String genre, String description) {}


    public String getSummary() {return summary;}

    public void setSummary(String summary) {this.summary = summary;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}