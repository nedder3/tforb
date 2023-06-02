package com.api.backend.services;

import com.api.backend.models.User;
import com.api.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{

    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public Optional <User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    // in-class methods

    //identificationType;
    @Override
    public List<User> getAllUserByIdentificationType(String identificationType){
        return null;
    }

   // userIdentificationNumber;
    @Override
   public List<User> getUserByUserIdentificationNumber(String identificationType){
       return null;
   }


}
