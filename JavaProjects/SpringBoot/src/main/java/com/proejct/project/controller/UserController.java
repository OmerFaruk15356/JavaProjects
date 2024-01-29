package com.proejct.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proejct.project.entity.User;
import com.proejct.project.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @GetMapping
    public List<User> getUsers()
    {
        return userService.getUsers();
    }
    @PostMapping
        public User registerUser(@RequestBody User user)
    {
        return userService.registerUser(user);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    @DeleteMapping("/{id}")
    public void removeUserById(@PathVariable Long id) {
        userService.removeUserById(id);
    }
}
