package com.matheusandrade.webserviceproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.matheusandrade.webserviceproject.entities.User;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/users") //resource path name

public class UserResource {

    /**
     * endpoint to access users
     */
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Anakin", "anakin@gmail.com", "99999999", "chosenone");
        return ResponseEntity.ok().body(u);
    }
    
}
