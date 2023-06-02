package com.api.backend.services;

import com.api.backend.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

        User createUser(User user);
        User updateUser(User user);
        void deleteUser(Long userId);
       Optional<User> getUserById(Long userId);
        List<User> getAllUsers();



}
