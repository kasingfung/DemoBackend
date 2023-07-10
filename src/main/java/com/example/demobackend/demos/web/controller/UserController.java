package com.example.demobackend.demos.web.controller;

/**
 * ClassName: UserController
 * Package: com.example.demobackend.demos.web
 * Description:
 *
 * @Author 冯嘉声
 * @Create 2023/5/25 11:13
 * @Version 1.0
 */
import com.example.demobackend.demos.web.User;
import com.example.demobackend.demos.web.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping(path = "/users")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping(path = "/users/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        userRepository.findById(id).map(updatedUser -> {
            updatedUser.setName(user.getName());
            updatedUser.setEmail(user.getEmail());
            return userRepository.save(updatedUser);
        }).orElseGet(() -> {
            user.setId(id);
            return userRepository.save(user);
        });
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
