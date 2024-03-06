package com.jwt.service;

import com.jwt.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Faisal","faisal@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Jerin","jerin@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Aditya","aditya@gmail.com"));
    }

   public List<User> getAllUsers(){
        return this.store;
    }

}
