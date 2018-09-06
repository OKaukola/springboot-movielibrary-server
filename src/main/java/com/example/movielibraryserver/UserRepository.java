/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.movielibraryserver;

import com.example.movielibraryserver.model.User;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Olli Kaukola
 */  
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
    

