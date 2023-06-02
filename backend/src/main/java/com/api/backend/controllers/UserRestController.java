package com.api.backend.controllers;

import com.api.backend.models.User;
import com.api.backend.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private UserServiceImpl userServiceImpl;

    @Autowired
    public UserRestController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping(value="create_user",headers = "Accept=application/json")
    public void createUser(@RequestBody User user){
        userServiceImpl.createUser(user);
    }
    @GetMapping(value="get_all_users",headers = "Accept=application/json")
    public List<User> getAllUsers(){
     return userServiceImpl.getAllUsers();
    }

    @GetMapping(value="get_user/{id}",headers = "Accept=application/json")
    public Optional<User> findById(@PathVariable Long id){
        return userServiceImpl.getUserById(id);
    }

}
