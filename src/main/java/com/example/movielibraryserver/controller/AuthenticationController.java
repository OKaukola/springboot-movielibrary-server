/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.movielibraryserver.controller;

import com.example.movielibraryserver.UserRepository;
import com.example.movielibraryserver.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Olli Kaukola
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AuthenticationController {
    
    @Autowired
    UserRepository userRepository;
    
    @RequestMapping(value="auth/login", method=RequestMethod.GET)
    public User loginUser() {
        
        return userRepository;
    }
    
}
