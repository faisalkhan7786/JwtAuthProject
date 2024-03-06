package com.jwt.controller;

import com.jwt.entity.User;
import com.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/current-user")
    public String getLogedInUser(Principal principal){
        return principal.getName();
    }


}
