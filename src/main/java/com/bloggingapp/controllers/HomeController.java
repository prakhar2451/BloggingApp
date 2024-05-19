package com.bloggingapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/home")
public class HomeController {


//    http://localhost:8081/home/users
    @GetMapping("/users")
    public String getUser() {
        System.out.println("getting users");
        return "Users";

    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}
