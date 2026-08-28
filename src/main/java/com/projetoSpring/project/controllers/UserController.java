package com.projetoSpring.project.controllers;

import com.projetoSpring.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Kayk", "Kayk@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
