package com.api.backend.controllers;

import com.api.backend.models.User;
import com.api.backend.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PostMapping(value = "create_user", headers = "Accept=application/json")
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        userServiceImpl.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(value = "get_all_users", headers = "Accept=application/json")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userServiceImpl.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping(value = "get_user/{id}", headers = "Accept=application/json")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        Optional<User> user = userServiceImpl.getUserById(id);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "update_user", headers = "Accept=application/json")
    public ResponseEntity<Void> updateUser(@RequestBody User user) {
        userServiceImpl.updateUser(user);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "delete_user/{id}", headers = "Accept=application/json")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userServiceImpl.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "get_user/", headers = "Accept=application/json", params = "identificationType")
    public ResponseEntity<List<User>> findByIdentificationType(@RequestParam("identificationType") String identificationType) {
        List<User> users = userServiceImpl.getAllUserByIdentificationType(identificationType);
        return ResponseEntity.ok(users);
    }

    @GetMapping(value = "get_user", headers = "Accept=application/json", params = "userIdentificationNumber")
    public ResponseEntity<List<User>> findByUserIdentificationNumber(@RequestParam("userIdentificationNumber") Integer userIdentificationNumber) {
        List<User> users = userServiceImpl.getUserByUserIdentificationNumber(userIdentificationNumber);
        return ResponseEntity.ok(users);
    }

}
