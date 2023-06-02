package com.api.backend.services;

import com.api.backend.models.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

        User createUser(User user);
        User updateUser(User user);
        void deleteUser(Long userId);
        User getUserById(Long userId);
        List<User> getAllUsers();


}
