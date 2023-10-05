package com.victorhugo.userhandler.controllers;

import com.victorhugo.userhandler.entities.User;
import com.victorhugo.userhandler.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")

public class UserController {

    //substitutable for final and AllArgsConstructor
    final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> findAllUsers(){
        var response = userRepository.findAll();
        return response;
    }

    //uso do ResponseEntity somente em casos de necessidade de maior granularidade de controle sobre os cabeçalhos, além do uso de tratamento de erros e outros
    @GetMapping(value = "/{id}")
    public User findUserById(@PathVariable Long id){
        try {
            User response = userRepository.findById(id).get();
            return response;
        } catch (NoSuchElementException e){
            throw new RuntimeException("O elemento com o ID " + id + " não foi encontrado.");
        }
    }

    @PostMapping
    public User insertUser(@RequestBody User user){
        User response = userRepository.save(user);
        return response;
    }
}
