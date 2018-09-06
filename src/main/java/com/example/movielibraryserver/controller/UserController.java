/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.movielibraryserver.controller;

import com.example.movielibraryserver.UserRepository;
import com.example.movielibraryserver.model.User;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Olli Kaukola
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {
    
    @Autowired
    UserRepository userRepository;
    
    public UserController() {

    } 
    
    @RequestMapping(value="auth/register", method=RequestMethod.POST)
    public User registerUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
    
    @RequestMapping(value="auth/login", method=RequestMethod.POST)
    public ResponseEntity<?> loginUser(@Valid @RequestBody User user) {
        return ResponseEntity.ok().build();
    }
    
}
