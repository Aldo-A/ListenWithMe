package com.stayready.controller;

import com.stayready.domain.User;
import com.stayready.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public ResponseEntity<Iterable<User>> getAllUsers(){
        Iterable<User> allUsers=userRepository.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public ResponseEntity<Iterable<User>> createUser(@RequestBody User user){
        user=userRepository.save(user);
        HttpHeaders header=new HttpHeaders();
        URI newUserUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{name}").buildAndExpand(user.getName()).toUri();
        header.setLocation(newUserUri);
        return new ResponseEntity<>(header, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users/{name}", method =RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable String name){
        User u=userRepository.findByName(name);
        return new ResponseEntity<>(u,HttpStatus.OK);
    }

}
