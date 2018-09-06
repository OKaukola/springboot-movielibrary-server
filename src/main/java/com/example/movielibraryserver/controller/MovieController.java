/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.movielibraryserver.controller;

import javax.validation.Valid;
import com.example.movielibraryserver.model.Movie;
import com.example.movielibraryserver.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *
 * @author Olli Kaukola
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MovieController {
    
    @Autowired
    MovieRepository movieRepository;
    
    public MovieController() {

    } 
    
    @RequestMapping(value="movies/get-movies", method=RequestMethod.GET)
    public List<Movie> getAllMovies() {
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        return movieRepository.findAll(sortByCreatedAtDesc);
    }
    
    @RequestMapping(value="movies/create-new-movie", method=RequestMethod.POST)
    public Movie createMovie(@Valid @RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
    
    @RequestMapping(value="movies/delete-movie/{id}", method=RequestMethod.POST)
    public ResponseEntity<?> deleteMovie(@PathVariable("id") String id) {
        movieRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
   
}
