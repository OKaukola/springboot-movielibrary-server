/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.movielibraryserver.model;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Olli Kaukola
 */
@Document(collection="movies")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Movie {
    @Id
    private String id;
    
    @NotBlank
    @Size(max=100)
    @Indexed(unique=true)
    private String name;
    private String year;
    private String imdb;

    private Boolean completed = false;

    private Date createdAt = new Date();

    public Movie() {
        super();
    }
    
    public Movie(String name) {
        this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public Movie(String name, String year, String imdb) {
        this.name = name;
        this.year = year;
        this.imdb = imdb;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Movie[id=%s, name='%s', year='%s', imdb='%s']",
                id, name, year, imdb);
    }
}
