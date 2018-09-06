/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.movielibraryserver;

import com.example.movielibraryserver.model.Movie;
//import com.example.movielibraryserver.MovieRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//import java.util.List;

/**
 *
 * @author Olli Kaukola
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    
    //public List<Movie> findByName(String name);
    
}
