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
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
         userRepository.deleteById(userId);
    }

    @Override
    public Optional <User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // in-class methods

    //identificationType;
    @Override
    public List<User> getAllUserByIdentificationType(String identificationType){
        return userRepository.findByIdentificationType(identificationType);
    }

   // userIdentificationNumber;
    @Override
   public List<User> getUserByUserIdentificationNumber(Integer userIdentificationNumber){
       return userRepository.findByuserIdentificationNumber(userIdentificationNumber);
   }


}
